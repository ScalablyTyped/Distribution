package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListDeadLetterSourceQueuesOutputMod {
  
  trait ListDeadLetterSourceQueuesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of source queue URLs that have the <code>RedrivePolicy</code> queue attribute configured with a dead-letter queue.</p>
      */
    var queueUrls: js.Array[String]
  }
  object ListDeadLetterSourceQueuesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, queueUrls: js.Array[String]): ListDeadLetterSourceQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDeadLetterSourceQueuesOutput]
    }
    
    @scala.inline
    implicit class ListDeadLetterSourceQueuesOutputMutableBuilder[Self <: ListDeadLetterSourceQueuesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrls(value: js.Array[String]): Self = StObject.set(x, "queueUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "queueUrls", js.Array(value :_*))
    }
  }
}
