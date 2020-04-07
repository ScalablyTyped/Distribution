package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EffectWrapper")
@js.native
class EffectWrapper protected () extends js.Object {
  /**
    * Creates an effect to be renderer
    * @param creationOptions options to create the effect
    */
  def this(creationOptions: EffectWrapperCreationOptions) = this()
  /**
    * The underlying effect
    */
  var effect: Effect = js.native
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object] = js.native
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit = js.native
}

