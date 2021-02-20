package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationState extends StObject {
  
  var highLimitValue: js.UndefOr[js.Any] = js.native
  
  var key: Double = js.native
  
  var loopMode: js.UndefOr[Double] = js.native
  
  var offsetValue: js.UndefOr[js.Any] = js.native
  
  var repeatCount: Double = js.native
  
  var workValue: js.UndefOr[js.Any] = js.native
}
object IAnimationState {
  
  @scala.inline
  def apply(key: Double, repeatCount: Double): IAnimationState = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationState]
  }
  
  @scala.inline
  implicit class IAnimationStateMutableBuilder[Self <: IAnimationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighLimitValue(value: js.Any): Self = StObject.set(x, "highLimitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighLimitValueUndefined: Self = StObject.set(x, "highLimitValue", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopMode(value: Double): Self = StObject.set(x, "loopMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopModeUndefined: Self = StObject.set(x, "loopMode", js.undefined)
    
    @scala.inline
    def setOffsetValue(value: js.Any): Self = StObject.set(x, "offsetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetValueUndefined: Self = StObject.set(x, "offsetValue", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkValue(value: js.Any): Self = StObject.set(x, "workValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkValueUndefined: Self = StObject.set(x, "workValue", js.undefined)
  }
}
