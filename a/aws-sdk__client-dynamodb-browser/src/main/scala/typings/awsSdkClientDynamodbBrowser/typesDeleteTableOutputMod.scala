package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteTableOutputMod {
  
  trait DeleteTableOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the properties of a table.</p>
      */
    var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.undefined
  }
  object DeleteTableOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTableOutput]
    }
    
    @scala.inline
    implicit class DeleteTableOutputMutableBuilder[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescription(value: UnmarshalledTableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
}
