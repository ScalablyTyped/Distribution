package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnimationOptions extends StObject {
  
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: js.UndefOr[Double] = js.undefined
  
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timingFunction: js.UndefOr[TimingFunction] = js.undefined
  
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: js.UndefOr[String] = js.undefined
}
object CreateAnimationOptions {
  
  inline def apply(): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimingFunction(value: TimingFunction): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
