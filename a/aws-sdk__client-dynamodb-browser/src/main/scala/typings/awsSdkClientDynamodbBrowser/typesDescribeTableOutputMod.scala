package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeTableOutputMod {
  
  trait DescribeTableOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The properties of the table.</p>
      */
    var Table: js.UndefOr[UnmarshalledTableDescription] = js.undefined
  }
  object DescribeTableOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTableOutput]
    }
    
    @scala.inline
    implicit class DescribeTableOutputMutableBuilder[Self <: DescribeTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable(value: UnmarshalledTableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
}
