package typings.awsSdkSmithyClient

import typings.awsSdkSmithyClient.awsSdkSmithyClientStrings.client
import typings.awsSdkSmithyClient.awsSdkSmithyClientStrings.server
import typings.awsSdkSmithyClient.retryableTraitMod.RetryableTrait
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkErrorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.awsSdkSmithyClient.exceptionMod.SmithyException because var conflicts: name. Inlined $fault, $service, $retryable */ trait SdkError
    extends StObject
       with Error
       with MetadataBearer {
    
    /**
      * Whether the client or server are at fault.
      */
    @JSName("$fault")
    val $fault: client | server
    
    /**
      * Indicates that an error MAY be retried by the client.
      */
    @JSName("$retryable")
    val $retryable: js.UndefOr[RetryableTrait] = js.undefined
    
    /**
      * The service that encountered the exception.
      */
    @JSName("$service")
    val $service: js.UndefOr[String] = js.undefined
  }
  object SdkError {
    
    @scala.inline
    def apply($fault: client | server, $metadata: ResponseMetadata, message: String, name: String): SdkError = {
      val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkError]
    }
    
    @scala.inline
    implicit class SdkErrorMutableBuilder[Self <: SdkError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$fault(value: client | server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$retryable(value: RetryableTrait): Self = StObject.set(x, "$retryable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$retryableUndefined: Self = StObject.set(x, "$retryable", js.undefined)
      
      @scala.inline
      def set$service(value: String): Self = StObject.set(x, "$service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$serviceUndefined: Self = StObject.set(x, "$service", js.undefined)
    }
  }
}
