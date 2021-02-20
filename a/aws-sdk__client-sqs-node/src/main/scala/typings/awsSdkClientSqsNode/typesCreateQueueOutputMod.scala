package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateQueueOutputMod {
  
  @js.native
  trait CreateQueueOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The URL of the created Amazon SQS queue.</p>
      */
    var QueueUrl: js.UndefOr[String] = js.native
  }
  object CreateQueueOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateQueueOutput]
    }
    
    @scala.inline
    implicit class CreateQueueOutputMutableBuilder[Self <: CreateQueueOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    }
  }
}
