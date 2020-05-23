package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NullEngineOptions")
@js.native
class NullEngineOptions ()
  extends typings.babylonjs.BABYLON.NullEngineOptions {
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  /* CompleteClass */
  override var deterministicLockstep: Boolean = js.native
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  /* CompleteClass */
  override var lockstepMaxSteps: Double = js.native
  /**
    * Render height (Default: 256)
    */
  /* CompleteClass */
  override var renderHeight: Double = js.native
  /**
    * Render width (Default: 512)
    */
  /* CompleteClass */
  override var renderWidth: Double = js.native
  /**
    * Texture size (Default: 512)
    */
  /* CompleteClass */
  override var textureSize: Double = js.native
}

