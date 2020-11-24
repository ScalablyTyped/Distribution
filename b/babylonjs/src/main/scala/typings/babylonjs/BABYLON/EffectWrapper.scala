package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectWrapper extends js.Object {
  
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit = js.native
  
  /**
    * The underlying effect
    */
  var effect: Effect = js.native
  
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object] = js.native
}
object EffectWrapper {
  
  @scala.inline
  def apply(dispose: () => Unit, effect: Effect, onApplyObservable: Observable[js.Object]): EffectWrapper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), effect = effect.asInstanceOf[js.Any], onApplyObservable = onApplyObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapper]
  }
  
  @scala.inline
  implicit class EffectWrapperOps[Self <: EffectWrapper] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEffect(value: Effect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnApplyObservable(value: Observable[js.Object]): Self = this.set("onApplyObservable", value.asInstanceOf[js.Any])
  }
}
