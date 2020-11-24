package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationState extends js.Object {
  
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
  implicit class IAnimationStateOps[Self <: IAnimationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCount(value: Double): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighLimitValue(value: js.Any): Self = this.set("highLimitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighLimitValue: Self = this.set("highLimitValue", js.undefined)
    
    @scala.inline
    def setLoopMode(value: Double): Self = this.set("loopMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopMode: Self = this.set("loopMode", js.undefined)
    
    @scala.inline
    def setOffsetValue(value: js.Any): Self = this.set("offsetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetValue: Self = this.set("offsetValue", js.undefined)
    
    @scala.inline
    def setWorkValue(value: js.Any): Self = this.set("workValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkValue: Self = this.set("workValue", js.undefined)
  }
}
