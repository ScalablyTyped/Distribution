package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeregisterStreamConsumerInputMod {
  
  trait DeregisterStreamConsumerInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.</p>
      */
    var ConsumerARN: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name that you gave to the consumer.</p>
      */
    var ConsumerName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.</p>
      */
    var StreamARN: js.UndefOr[String] = js.undefined
  }
  object DeregisterStreamConsumerInput {
    
    inline def apply(): DeregisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterStreamConsumerInput]
    }
    
    extension [Self <: DeregisterStreamConsumerInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setConsumerARN(value: String): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
      
      inline def setConsumerARNUndefined: Self = StObject.set(x, "ConsumerARN", js.undefined)
      
      inline def setConsumerName(value: String): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
      
      inline def setConsumerNameUndefined: Self = StObject.set(x, "ConsumerName", js.undefined)
      
      inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
      
      inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    }
  }
}
