package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeGlobalTableOutputMod {
  
  trait DescribeGlobalTableOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Contains the details of the global table.</p>
      */
    var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.undefined
  }
  object DescribeGlobalTableOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeGlobalTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableOutput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableOutputMutableBuilder[Self <: DescribeGlobalTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescription(value: UnmarshalledGlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
}
