package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateTableOutputMod {
  
  trait CreateTableOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the properties of the table.</p>
      */
    var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.undefined
  }
  object CreateTableOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTableOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTableOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTableDescription(value: UnmarshalledTableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
}
