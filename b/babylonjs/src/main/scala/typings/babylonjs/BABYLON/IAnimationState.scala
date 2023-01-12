package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationState extends StObject {
  
  var highLimitValue: js.UndefOr[Any] = js.undefined
  
  var key: Double
  
  var loopMode: js.UndefOr[Double] = js.undefined
  
  var offsetValue: js.UndefOr[Any] = js.undefined
  
  var repeatCount: Double
  
  var workValue: js.UndefOr[Any] = js.undefined
}
object IAnimationState {
  
  inline def apply(key: Double, repeatCount: Double): IAnimationState = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnimationState] (val x: Self) extends AnyVal {
    
    inline def setHighLimitValue(value: Any): Self = StObject.set(x, "highLimitValue", value.asInstanceOf[js.Any])
    
    inline def setHighLimitValueUndefined: Self = StObject.set(x, "highLimitValue", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoopMode(value: Double): Self = StObject.set(x, "loopMode", value.asInstanceOf[js.Any])
    
    inline def setLoopModeUndefined: Self = StObject.set(x, "loopMode", js.undefined)
    
    inline def setOffsetValue(value: Any): Self = StObject.set(x, "offsetValue", value.asInstanceOf[js.Any])
    
    inline def setOffsetValueUndefined: Self = StObject.set(x, "offsetValue", js.undefined)
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setWorkValue(value: Any): Self = StObject.set(x, "workValue", value.asInstanceOf[js.Any])
    
    inline def setWorkValueUndefined: Self = StObject.set(x, "workValue", js.undefined)
  }
}
