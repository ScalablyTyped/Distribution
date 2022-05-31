package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectWrapper extends StObject {
  
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit
  
  /**
    * The underlying effect
    */
  var effect: Effect
  
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object]
}
object EffectWrapper {
  
  inline def apply(dispose: () => Unit, effect: Effect, onApplyObservable: Observable[js.Object]): EffectWrapper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), effect = effect.asInstanceOf[js.Any], onApplyObservable = onApplyObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapper]
  }
  
  extension [Self <: EffectWrapper](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setEffect(value: Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setOnApplyObservable(value: Observable[js.Object]): Self = StObject.set(x, "onApplyObservable", value.asInstanceOf[js.Any])
  }
}
