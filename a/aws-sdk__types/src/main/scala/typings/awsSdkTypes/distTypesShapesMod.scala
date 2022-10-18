package typings.awsSdkTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.client
import typings.awsSdkTypes.awsSdkTypesStrings.server
import typings.awsSdkTypes.distTypesHttpMod.HttpResponse
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesShapesMod {
  
  type DocumentType = Null | Boolean | Double | String | js.Array[Any] | StringDictionary[Any]
  
  trait RetryableTrait extends StObject {
    
    /**
      * Indicates that the error is a retryable throttling error.
      */
    val throttling: js.UndefOr[Boolean] = js.undefined
  }
  object RetryableTrait {
    
    inline def apply(): RetryableTrait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryableTrait]
    }
    
    extension [Self <: RetryableTrait](x: Self) {
      
      inline def setThrottling(value: Boolean): Self = StObject.set(x, "throttling", value.asInstanceOf[js.Any])
      
      inline def setThrottlingUndefined: Self = StObject.set(x, "throttling", js.undefined)
    }
  }
  
  /* Inlined std.Error & std.Partial<@aws-sdk/types.@aws-sdk/types/dist-types/shapes.SmithyException> & std.Partial<@aws-sdk/types.@aws-sdk/types/dist-types/response.MetadataBearer> */
  trait SdkError extends StObject {
    
    @JSName("$fault")
    var $fault: js.UndefOr[client | server] = js.undefined
    
    @JSName("$metadata")
    var $metadata: js.UndefOr[ResponseMetadata] = js.undefined
    
    @JSName("$response")
    var $response: js.UndefOr[HttpResponse] = js.undefined
    
    @JSName("$retryable")
    var $retryable: js.UndefOr[RetryableTrait] = js.undefined
    
    @JSName("$service")
    var $service: js.UndefOr[String] = js.undefined
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String & js.UndefOr[String]
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object SdkError {
    
    inline def apply(message: String, name: String & js.UndefOr[String]): SdkError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkError]
    }
    
    extension [Self <: SdkError](x: Self) {
      
      inline def set$fault(value: client | server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
      
      inline def set$faultUndefined: Self = StObject.set(x, "$fault", js.undefined)
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def set$metadataUndefined: Self = StObject.set(x, "$metadata", js.undefined)
      
      inline def set$response(value: HttpResponse): Self = StObject.set(x, "$response", value.asInstanceOf[js.Any])
      
      inline def set$responseUndefined: Self = StObject.set(x, "$response", js.undefined)
      
      inline def set$retryable(value: RetryableTrait): Self = StObject.set(x, "$retryable", value.asInstanceOf[js.Any])
      
      inline def set$retryableUndefined: Self = StObject.set(x, "$retryable", js.undefined)
      
      inline def set$service(value: String): Self = StObject.set(x, "$service", value.asInstanceOf[js.Any])
      
      inline def set$serviceUndefined: Self = StObject.set(x, "$service", js.undefined)
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String & js.UndefOr[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait SmithyException extends StObject {
    
    /**
      * Whether the client or server are at fault.
      */
    @JSName("$fault")
    val $fault: client | server
    
    /**
      * Reference to low-level HTTP response object.
      */
    @JSName("$response")
    val $response: js.UndefOr[HttpResponse] = js.undefined
    
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
    
    /**
      * The shape ID name of the exception.
      */
    val name: String
  }
  object SmithyException {
    
    inline def apply($fault: client | server, name: String): SmithyException = {
      val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmithyException]
    }
    
    extension [Self <: SmithyException](x: Self) {
      
      inline def set$fault(value: client | server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
      
      inline def set$response(value: HttpResponse): Self = StObject.set(x, "$response", value.asInstanceOf[js.Any])
      
      inline def set$responseUndefined: Self = StObject.set(x, "$response", js.undefined)
      
      inline def set$retryable(value: RetryableTrait): Self = StObject.set(x, "$retryable", value.asInstanceOf[js.Any])
      
      inline def set$retryableUndefined: Self = StObject.set(x, "$retryable", js.undefined)
      
      inline def set$service(value: String): Self = StObject.set(x, "$service", value.asInstanceOf[js.Any])
      
      inline def set$serviceUndefined: Self = StObject.set(x, "$service", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
