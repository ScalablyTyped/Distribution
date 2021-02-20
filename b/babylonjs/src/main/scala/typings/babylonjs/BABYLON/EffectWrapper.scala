package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectWrapper extends StObject {
  
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
  implicit class EffectWrapperMutableBuilder[Self <: EffectWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEffect(value: Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnApplyObservable(value: Observable[js.Object]): Self = StObject.set(x, "onApplyObservable", value.asInstanceOf[js.Any])
  }
}
