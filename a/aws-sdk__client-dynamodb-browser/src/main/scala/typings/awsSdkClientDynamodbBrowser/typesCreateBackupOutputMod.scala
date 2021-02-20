package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBackupOutputMod {
  
  @js.native
  trait CreateBackupOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Contains the details of the backup created for the table.</p>
      */
    var BackupDetails: js.UndefOr[UnmarshalledBackupDetails] = js.native
  }
  object CreateBackupOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateBackupOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBackupOutput]
    }
    
    @scala.inline
    implicit class CreateBackupOutputMutableBuilder[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDetails(value: UnmarshalledBackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    }
  }
}
