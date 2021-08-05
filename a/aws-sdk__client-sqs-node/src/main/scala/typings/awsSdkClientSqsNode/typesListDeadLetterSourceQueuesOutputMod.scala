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
    
    inline def apply($metadata: ResponseMetadata, queueUrls: js.Array[String]): ListDeadLetterSourceQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDeadLetterSourceQueuesOutput]
    }
    
    extension [Self <: ListDeadLetterSourceQueuesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setQueueUrls(value: js.Array[String]): Self = StObject.set(x, "queueUrls", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "queueUrls", js.Array(value :_*))
    }
  }
}
