package typings.babylonjs.BABYLON

import typings.std.WebGLContextAttributes
import typings.std.WebGLPowerPreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineOptions extends WebGLContextAttributes {
  /**
    * Defines if webaudio should be initialized as well
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if webvr should be enabled automatically
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if animations should run using a deterministic lock step
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see http://doc.babylonjs.com/features/webgl2
    */
  var disableWebGL2Support: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines that engine should ignore context lost events
    * If this event happens when this parameter is true, you will have to reload the page to restore rendering
    */
  var doNotHandleContextLost: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines that engine should ignore modifying touch action attribute and style
    * If not handle, you might need to set it up on your side for expected touch devices behavior.
    */
  var doNotHandleTouchAction: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines if the engine should no exceed a specified device ratio
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
    */
  var limitDeviceRatio: js.UndefOr[Double] = js.undefined
  /** Defines the maximum steps to use with deterministic lock step mode */
  var lockstepMaxSteps: js.UndefOr[Double] = js.undefined
  /** Defines the seconds between each deterministic lock step */
  var timeStep: js.UndefOr[Double] = js.undefined
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.undefined
}

object EngineOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    antialias: js.UndefOr[Boolean] = js.undefined,
    audioEngine: js.UndefOr[Boolean] = js.undefined,
    autoEnableWebVR: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Boolean] = js.undefined,
    desynchronized: js.UndefOr[Boolean] = js.undefined,
    deterministicLockstep: js.UndefOr[Boolean] = js.undefined,
    disableWebGL2Support: js.UndefOr[Boolean] = js.undefined,
    doNotHandleContextLost: js.UndefOr[Boolean] = js.undefined,
    doNotHandleTouchAction: js.UndefOr[Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined,
    limitDeviceRatio: Int | Double = null,
    lockstepMaxSteps: Int | Double = null,
    powerPreference: WebGLPowerPreference = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined,
    timeStep: Int | Double = null,
    useHighPrecisionFloats: js.UndefOr[Boolean] = js.undefined
  ): EngineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (!js.isUndefined(audioEngine)) __obj.updateDynamic("audioEngine")(audioEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEnableWebVR)) __obj.updateDynamic("autoEnableWebVR")(autoEnableWebVR.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized.asInstanceOf[js.Any])
    if (!js.isUndefined(deterministicLockstep)) __obj.updateDynamic("deterministicLockstep")(deterministicLockstep.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebGL2Support)) __obj.updateDynamic("disableWebGL2Support")(disableWebGL2Support.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotHandleContextLost)) __obj.updateDynamic("doNotHandleContextLost")(doNotHandleContextLost.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotHandleTouchAction)) __obj.updateDynamic("doNotHandleTouchAction")(doNotHandleTouchAction.asInstanceOf[js.Any])
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.asInstanceOf[js.Any])
    if (limitDeviceRatio != null) __obj.updateDynamic("limitDeviceRatio")(limitDeviceRatio.asInstanceOf[js.Any])
    if (lockstepMaxSteps != null) __obj.updateDynamic("lockstepMaxSteps")(lockstepMaxSteps.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.asInstanceOf[js.Any])
    if (timeStep != null) __obj.updateDynamic("timeStep")(timeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(useHighPrecisionFloats)) __obj.updateDynamic("useHighPrecisionFloats")(useHighPrecisionFloats.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineOptions]
  }
}

