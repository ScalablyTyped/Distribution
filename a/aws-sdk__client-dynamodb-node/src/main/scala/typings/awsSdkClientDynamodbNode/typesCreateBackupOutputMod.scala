package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBackupOutputMod {
  
  trait CreateBackupOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Contains the details of the backup created for the table.</p>
      */
    var BackupDetails: js.UndefOr[UnmarshalledBackupDetails] = js.undefined
  }
  object CreateBackupOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateBackupOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBackupOutput]
    }
    
    extension [Self <: CreateBackupOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBackupDetails(value: UnmarshalledBackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    }
  }
}
