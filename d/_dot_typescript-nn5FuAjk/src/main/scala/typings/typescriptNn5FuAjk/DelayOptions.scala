package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayOptions
  extends StObject
     with AudioNodeOptions {
  
  var delayTime: js.UndefOr[Double] = js.undefined
  
  var maxDelayTime: js.UndefOr[Double] = js.undefined
}
object DelayOptions {
  
  inline def apply(): DelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayOptions]
  }
  
  extension [Self <: DelayOptions](x: Self) {
    
    inline def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
    
    inline def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
    
    inline def setMaxDelayTime(value: Double): Self = StObject.set(x, "maxDelayTime", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayTimeUndefined: Self = StObject.set(x, "maxDelayTime", js.undefined)
  }
}
