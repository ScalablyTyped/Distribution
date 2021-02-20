package typings.babylonjs.BABYLON

import typings.std.WebGLContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineOptions extends WebGLContextAttributes {
  
  /**
    * Defines if webaudio should be initialized as well
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if webvr should be enabled automatically
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if animations should run using a deterministic lock step
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see https://doc.babylonjs.com/features/webgl2
    */
  var disableWebGL2Support: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that engine should ignore context lost events
    * If this event happens when this parameter is true, you will have to reload the page to restore rendering
    */
  var doNotHandleContextLost: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that engine should ignore modifying touch action attribute and style
    * If not handle, you might need to set it up on your side for expected touch devices behavior.
    */
  var doNotHandleTouchAction: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if the engine should no exceed a specified device ratio
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
    */
  var limitDeviceRatio: js.UndefOr[Double] = js.native
  
  /** Defines the maximum steps to use with deterministic lock step mode */
  var lockstepMaxSteps: js.UndefOr[Double] = js.native
  
  /** Defines the seconds between each deterministic lock step */
  var timeStep: js.UndefOr[Double] = js.native
  
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.native
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.native
  
  /**
    * Make the canvas XR Compatible for XR sessions
    */
  var xrCompatible: js.UndefOr[Boolean] = js.native
}
object EngineOptions {
  
  @scala.inline
  def apply(): EngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineOptions]
  }
  
  @scala.inline
  implicit class EngineOptionsMutableBuilder[Self <: EngineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEngine(value: Boolean): Self = StObject.set(x, "audioEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEngineUndefined: Self = StObject.set(x, "audioEngine", js.undefined)
    
    @scala.inline
    def setAutoEnableWebVR(value: Boolean): Self = StObject.set(x, "autoEnableWebVR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEnableWebVRUndefined: Self = StObject.set(x, "autoEnableWebVR", js.undefined)
    
    @scala.inline
    def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeterministicLockstepUndefined: Self = StObject.set(x, "deterministicLockstep", js.undefined)
    
    @scala.inline
    def setDisableWebGL2Support(value: Boolean): Self = StObject.set(x, "disableWebGL2Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableWebGL2SupportUndefined: Self = StObject.set(x, "disableWebGL2Support", js.undefined)
    
    @scala.inline
    def setDoNotHandleContextLost(value: Boolean): Self = StObject.set(x, "doNotHandleContextLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotHandleContextLostUndefined: Self = StObject.set(x, "doNotHandleContextLost", js.undefined)
    
    @scala.inline
    def setDoNotHandleTouchAction(value: Boolean): Self = StObject.set(x, "doNotHandleTouchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotHandleTouchActionUndefined: Self = StObject.set(x, "doNotHandleTouchAction", js.undefined)
    
    @scala.inline
    def setLimitDeviceRatio(value: Double): Self = StObject.set(x, "limitDeviceRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitDeviceRatioUndefined: Self = StObject.set(x, "limitDeviceRatio", js.undefined)
    
    @scala.inline
    def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockstepMaxStepsUndefined: Self = StObject.set(x, "lockstepMaxSteps", js.undefined)
    
    @scala.inline
    def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
    
    @scala.inline
    def setUseHighPrecisionFloats(value: Boolean): Self = StObject.set(x, "useHighPrecisionFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHighPrecisionFloatsUndefined: Self = StObject.set(x, "useHighPrecisionFloats", js.undefined)
    
    @scala.inline
    def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
    
    @scala.inline
    def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
  }
}
