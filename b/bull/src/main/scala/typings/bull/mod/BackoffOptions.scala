package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackoffOptions extends StObject {
  
  /**
    * Backoff delay, in milliseconds
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Options for custom strategies
    */
  var strategyOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Backoff type, which can be either `fixed` or `exponential`
    */
  var `type`: String
}
object BackoffOptions {
  
  inline def apply(`type`: String): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setStrategyOptions(value: Any): Self = StObject.set(x, "strategyOptions", value.asInstanceOf[js.Any])
    
    inline def setStrategyOptionsUndefined: Self = StObject.set(x, "strategyOptions", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
