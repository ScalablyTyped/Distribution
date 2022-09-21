package typings.azureCoreHttp

import typings.azureCoreHttp.anon.MaxRetryInterval
import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentialBackoffStrategyMod {
  
  @JSImport("@azure/core-http/types/latest/src/util/exponentialBackoffStrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/util/exponentialBackoffStrategy", "DEFAULT_CLIENT_MAX_RETRY_INTERVAL")
  @js.native
  val DEFAULT_CLIENT_MAX_RETRY_INTERVAL: Double = js.native
  
  @JSImport("@azure/core-http/types/latest/src/util/exponentialBackoffStrategy", "DEFAULT_CLIENT_MIN_RETRY_INTERVAL")
  @js.native
  val DEFAULT_CLIENT_MIN_RETRY_INTERVAL: Double = js.native
  
  @JSImport("@azure/core-http/types/latest/src/util/exponentialBackoffStrategy", "DEFAULT_CLIENT_RETRY_COUNT")
  @js.native
  val DEFAULT_CLIENT_RETRY_COUNT: /* 3 */ Double = js.native
  
  @JSImport("@azure/core-http/types/latest/src/util/exponentialBackoffStrategy", "DEFAULT_CLIENT_RETRY_INTERVAL")
  @js.native
  val DEFAULT_CLIENT_RETRY_INTERVAL: Double = js.native
  
  inline def isNumber(n: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def shouldRetry(
    retryLimit: Double,
    predicate: js.Function2[
      /* response */ js.UndefOr[HttpOperationResponse], 
      /* error */ js.UndefOr[RetryError], 
      Boolean
    ],
    retryData: RetryData
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRetry")(retryLimit.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldRetry(
    retryLimit: Double,
    predicate: js.Function2[
      /* response */ js.UndefOr[HttpOperationResponse], 
      /* error */ js.UndefOr[RetryError], 
      Boolean
    ],
    retryData: RetryData,
    response: Unit,
    error: RetryError
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRetry")(retryLimit.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], response.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldRetry(
    retryLimit: Double,
    predicate: js.Function2[
      /* response */ js.UndefOr[HttpOperationResponse], 
      /* error */ js.UndefOr[RetryError], 
      Boolean
    ],
    retryData: RetryData,
    response: HttpOperationResponse
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRetry")(retryLimit.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldRetry(
    retryLimit: Double,
    predicate: js.Function2[
      /* response */ js.UndefOr[HttpOperationResponse], 
      /* error */ js.UndefOr[RetryError], 
      Boolean
    ],
    retryData: RetryData,
    response: HttpOperationResponse,
    error: RetryError
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRetry")(retryLimit.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], response.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateRetryData(retryOptions: MaxRetryInterval): RetryData = ^.asInstanceOf[js.Dynamic].applyDynamic("updateRetryData")(retryOptions.asInstanceOf[js.Any]).asInstanceOf[RetryData]
  inline def updateRetryData(retryOptions: MaxRetryInterval, retryData: Unit, err: RetryError): RetryData = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRetryData")(retryOptions.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[RetryData]
  inline def updateRetryData(retryOptions: MaxRetryInterval, retryData: RetryData): RetryData = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRetryData")(retryOptions.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any])).asInstanceOf[RetryData]
  inline def updateRetryData(retryOptions: MaxRetryInterval, retryData: RetryData, err: RetryError): RetryData = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRetryData")(retryOptions.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[RetryData]
  
  trait RetryData extends StObject {
    
    var error: js.UndefOr[RetryError] = js.undefined
    
    var retryCount: Double
    
    var retryInterval: Double
  }
  object RetryData {
    
    inline def apply(retryCount: Double, retryInterval: Double): RetryData = {
      val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any], retryInterval = retryInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryData]
    }
    
    extension [Self <: RetryData](x: Self) {
      
      inline def setError(value: RetryError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryError
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
    
    var innerError: js.UndefOr[RetryError] = js.undefined
  }
  object RetryError {
    
    inline def apply(message: String, name: String): RetryError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryError]
    }
    
    extension [Self <: RetryError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setInnerError(value: RetryError): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
      
      inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    }
  }
}
