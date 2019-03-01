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

object EngineOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[stdLib.GLboolean] = js.undefined,
    antialias: js.UndefOr[stdLib.GLboolean] = js.undefined,
    audioEngine: js.UndefOr[scala.Boolean] = js.undefined,
    autoEnableWebVR: js.UndefOr[scala.Boolean] = js.undefined,
    depth: js.UndefOr[stdLib.GLboolean] = js.undefined,
    deterministicLockstep: js.UndefOr[scala.Boolean] = js.undefined,
    disableWebGL2Support: js.UndefOr[scala.Boolean] = js.undefined,
    doNotHandleContextLost: js.UndefOr[scala.Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    limitDeviceRatio: scala.Int | scala.Double = null,
    lockstepMaxSteps: scala.Int | scala.Double = null,
    powerPreference: stdLib.WebGLPowerPreference = null,
    premultipliedAlpha: js.UndefOr[stdLib.GLboolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[stdLib.GLboolean] = js.undefined,
    stencil: js.UndefOr[stdLib.GLboolean] = js.undefined
  ): EngineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(audioEngine)) __obj.updateDynamic("audioEngine")(audioEngine)
    if (!js.isUndefined(autoEnableWebVR)) __obj.updateDynamic("autoEnableWebVR")(autoEnableWebVR)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(deterministicLockstep)) __obj.updateDynamic("deterministicLockstep")(deterministicLockstep)
    if (!js.isUndefined(disableWebGL2Support)) __obj.updateDynamic("disableWebGL2Support")(disableWebGL2Support)
    if (!js.isUndefined(doNotHandleContextLost)) __obj.updateDynamic("doNotHandleContextLost")(doNotHandleContextLost)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (limitDeviceRatio != null) __obj.updateDynamic("limitDeviceRatio")(limitDeviceRatio.asInstanceOf[js.Any])
    if (lockstepMaxSteps != null) __obj.updateDynamic("lockstepMaxSteps")(lockstepMaxSteps.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[EngineOptions]
  }
}

