package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateQueueOutputMod {
  
  trait CreateQueueOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The URL of the created Amazon SQS queue.</p>
      */
    var QueueUrl: js.UndefOr[String] = js.undefined
  }
  object CreateQueueOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateQueueOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateQueueOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    }
  }
}
