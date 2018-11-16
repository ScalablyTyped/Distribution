package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options to create the null engine
     */
@JSGlobal("BABYLON.NullEngineOptions")
@js.native
class NullEngineOptions () extends js.Object {
  /**
           * If delta time between frames should be constant
           * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           */
  var deterministicLockstep: scala.Boolean = js.native
  /**
           * Maximum about of steps between frames (Default: 4)
           * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           */
  var lockstepMaxSteps: scala.Double = js.native
  /**
           * Render height (Default: 256)
           */
  var renderHeight: scala.Double = js.native
  /**
           * Render width (Default: 512)
           */
  var renderWidth: scala.Double = js.native
  /**
           * Texture size (Default: 512)
           */
  var textureSize: scala.Double = js.native
}

