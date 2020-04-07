package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NullEngineOptions")
@js.native
class NullEngineOptions () extends js.Object {
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: Boolean = js.native
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var lockstepMaxSteps: Double = js.native
  /**
    * Render height (Default: 256)
    */
  var renderHeight: Double = js.native
  /**
    * Render width (Default: 512)
    */
  var renderWidth: Double = js.native
  /**
    * Texture size (Default: 512)
    */
  var textureSize: Double = js.native
}

