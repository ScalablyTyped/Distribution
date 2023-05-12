package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryDelayOption extends StObject {
  
  var base: js.UndefOr[Double] = js.undefined
  
  var customBackoff: js.UndefOr[js.Function2[/* retryCount */ Double, /* error */ js.Error, Double]] = js.undefined
}
object RetryDelayOption {
  
  inline def apply(): RetryDelayOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryDelayOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryDelayOption] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCustomBackoff(value: (/* retryCount */ Double, /* error */ js.Error) => Double): Self = StObject.set(x, "customBackoff", js.Any.fromFunction2(value))
    
    inline def setCustomBackoffUndefined: Self = StObject.set(x, "customBackoff", js.undefined)
  }
}
