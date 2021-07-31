package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod.UnmarshalledConsumerDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeStreamConsumerOutputMod {
  
  trait DescribeStreamConsumerOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An object that represents the details of the consumer.</p>
      */
    var ConsumerDescription: UnmarshalledConsumerDescription
  }
  object DescribeStreamConsumerOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ConsumerDescription: UnmarshalledConsumerDescription): DescribeStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeStreamConsumerOutput]
    }
    
    @scala.inline
    implicit class DescribeStreamConsumerOutputMutableBuilder[Self <: DescribeStreamConsumerOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerDescription(value: UnmarshalledConsumerDescription): Self = StObject.set(x, "ConsumerDescription", value.asInstanceOf[js.Any])
    }
  }
}
