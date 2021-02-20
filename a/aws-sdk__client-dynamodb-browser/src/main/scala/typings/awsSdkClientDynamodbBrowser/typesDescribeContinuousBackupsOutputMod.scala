package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsDescriptionMod.UnmarshalledContinuousBackupsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeContinuousBackupsOutputMod {
  
  @js.native
  trait DescribeContinuousBackupsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
      */
    var ContinuousBackupsDescription: js.UndefOr[UnmarshalledContinuousBackupsDescription] = js.native
  }
  object DescribeContinuousBackupsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeContinuousBackupsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContinuousBackupsOutput]
    }
    
    @scala.inline
    implicit class DescribeContinuousBackupsOutputMutableBuilder[Self <: DescribeContinuousBackupsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousBackupsDescription(value: UnmarshalledContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
    }
  }
}
