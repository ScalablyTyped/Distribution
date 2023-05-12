package typings.contentstack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOptions
  extends StObject
     with /* propName */ StringDictionary[Any] {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var logHandler: js.UndefOr[js.Function2[/* level */ String, /* data */ Any, Unit]] = js.undefined
  
  var retryCondition: js.UndefOr[js.Function1[/* error */ Any, Boolean]] = js.undefined
  
  var retryDelay: js.UndefOr[Double] = js.undefined
  
  var retryDelayOptions: js.UndefOr[RetryDelayOption] = js.undefined
  
  var retryLimit: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object FetchOptions {
  
  inline def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setLogHandler(value: (/* level */ String, /* data */ Any) => Unit): Self = StObject.set(x, "logHandler", js.Any.fromFunction2(value))
    
    inline def setLogHandlerUndefined: Self = StObject.set(x, "logHandler", js.undefined)
    
    inline def setRetryCondition(value: /* error */ Any => Boolean): Self = StObject.set(x, "retryCondition", js.Any.fromFunction1(value))
    
    inline def setRetryConditionUndefined: Self = StObject.set(x, "retryCondition", js.undefined)
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptions(value: RetryDelayOption): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
    
    inline def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
    
    inline def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
