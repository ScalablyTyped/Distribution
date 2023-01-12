package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDecimationOptions extends StObject {
  
  var enabled: Boolean
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object BaseDecimationOptions {
  
  inline def apply(enabled: Boolean): BaseDecimationOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDecimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDecimationOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
