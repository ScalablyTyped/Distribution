package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullEngineOptions extends js.Object {
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: Boolean
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var lockstepMaxSteps: Double
  /**
    * Render height (Default: 256)
    */
  var renderHeight: Double
  /**
    * Render width (Default: 512)
    */
  var renderWidth: Double
  /**
    * Texture size (Default: 512)
    */
  var textureSize: Double
}

object NullEngineOptions {
  @scala.inline
  def apply(
    deterministicLockstep: Boolean,
    lockstepMaxSteps: Double,
    renderHeight: Double,
    renderWidth: Double,
    textureSize: Double
  ): NullEngineOptions = {
    val __obj = js.Dynamic.literal(deterministicLockstep = deterministicLockstep.asInstanceOf[js.Any], lockstepMaxSteps = lockstepMaxSteps.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any], textureSize = textureSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEngineOptions]
  }
}

