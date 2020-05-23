package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectWrapper extends js.Object {
  /**
    * The underlying effect
    */
  var effect: Effect
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object]
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit
}

object EffectWrapper {
  @scala.inline
  def apply(dispose: () => Unit, effect: Effect, onApplyObservable: Observable[js.Object]): EffectWrapper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), effect = effect.asInstanceOf[js.Any], onApplyObservable = onApplyObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapper]
  }
}

