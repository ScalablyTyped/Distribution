package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListQueuesOutputMod {
  
  trait ListQueuesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of queue URLs, up to 1,000 entries.</p>
      */
    var QueueUrls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ListQueuesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListQueuesOutput]
    }
    
    @scala.inline
    implicit class ListQueuesOutputMutableBuilder[Self <: ListQueuesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrls(value: js.Array[String]): Self = StObject.set(x, "QueueUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrlsUndefined: Self = StObject.set(x, "QueueUrls", js.undefined)
      
      @scala.inline
      def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "QueueUrls", js.Array(value :_*))
    }
  }
}
