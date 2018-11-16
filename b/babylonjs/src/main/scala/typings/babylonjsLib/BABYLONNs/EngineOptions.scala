package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface defining initialization parameters for Engine class */

trait EngineOptions
  extends stdLib.WebGLContextAttributes {
  /**
           * Defines if webaudio should be initialized as well
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
           */
  var audioEngine: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines if webvr should be enabled automatically
           * @see http://doc.babylonjs.com/how_to/webvr_camera
           */
  var autoEnableWebVR: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines if animations should run using a deterministic lock step
           * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
           */
  var deterministicLockstep: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines if webgl2 should be turned off even if supported
           * @see http://doc.babylonjs.com/features/webgl2
           */
  var disableWebGL2Support: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines that engine should ignore context lost events
           * If this event happens when this parameter is true, you will have to reload the page to restore rendering
           */
  var doNotHandleContextLost: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines if the engine should no exceed a specified device ratio
           * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
           */
  var limitDeviceRatio: js.UndefOr[scala.Double] = js.undefined
  /** Defines the maximum steps to use with deterministic lock step mode */
  var lockstepMaxSteps: js.UndefOr[scala.Double] = js.undefined
}

