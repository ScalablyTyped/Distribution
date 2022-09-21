package typings.babylonjs.BABYLON

import typings.std.WebGLContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineOptions
  extends StObject
     with WebGLContextAttributes {
  
  /**
    * Defines whether to adapt to the device's viewport characteristics (default: false)
    */
  var adaptToDeviceRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if webaudio should be initialized as well
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies options for the audio engine
    */
  var audioEngineOptions: js.UndefOr[IAudioEngineOptions] = js.undefined
  
  /**
    * Defines if webvr should be enabled automatically
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if animations should run using a deterministic lock step
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see https://doc.babylonjs.com/features/webgl2
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
    * If sRGB Buffer support is not set during construction, use this value to force a specific state
    * This is added due to an issue when processing textures in chrome/edge/firefox
    * This will not influence NativeEngine and WebGPUEngine which set the behavior to true during construction.
    */
  var forceSRGBBufferSupportState: js.UndefOr[Boolean] = js.undefined
  
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
    * True if the more expensive but exact conversions should be used for transforming colors to and from linear space within shaders.
    * Otherwise, the default is to use a cheaper approximation.
    */
  var useExactSrgbConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Make the canvas XR Compatible for XR sessions
    */
  var xrCompatible: js.UndefOr[Boolean] = js.undefined
}
object EngineOptions {
  
  inline def apply(): EngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineOptions]
  }
  
  extension [Self <: EngineOptions](x: Self) {
    
    inline def setAdaptToDeviceRatio(value: Boolean): Self = StObject.set(x, "adaptToDeviceRatio", value.asInstanceOf[js.Any])
    
    inline def setAdaptToDeviceRatioUndefined: Self = StObject.set(x, "adaptToDeviceRatio", js.undefined)
    
    inline def setAudioEngine(value: Boolean): Self = StObject.set(x, "audioEngine", value.asInstanceOf[js.Any])
    
    inline def setAudioEngineOptions(value: IAudioEngineOptions): Self = StObject.set(x, "audioEngineOptions", value.asInstanceOf[js.Any])
    
    inline def setAudioEngineOptionsUndefined: Self = StObject.set(x, "audioEngineOptions", js.undefined)
    
    inline def setAudioEngineUndefined: Self = StObject.set(x, "audioEngine", js.undefined)
    
    inline def setAutoEnableWebVR(value: Boolean): Self = StObject.set(x, "autoEnableWebVR", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableWebVRUndefined: Self = StObject.set(x, "autoEnableWebVR", js.undefined)
    
    inline def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
    
    inline def setDeterministicLockstepUndefined: Self = StObject.set(x, "deterministicLockstep", js.undefined)
    
    inline def setDisableWebGL2Support(value: Boolean): Self = StObject.set(x, "disableWebGL2Support", value.asInstanceOf[js.Any])
    
    inline def setDisableWebGL2SupportUndefined: Self = StObject.set(x, "disableWebGL2Support", js.undefined)
    
    inline def setDoNotHandleContextLost(value: Boolean): Self = StObject.set(x, "doNotHandleContextLost", value.asInstanceOf[js.Any])
    
    inline def setDoNotHandleContextLostUndefined: Self = StObject.set(x, "doNotHandleContextLost", js.undefined)
    
    inline def setDoNotHandleTouchAction(value: Boolean): Self = StObject.set(x, "doNotHandleTouchAction", value.asInstanceOf[js.Any])
    
    inline def setDoNotHandleTouchActionUndefined: Self = StObject.set(x, "doNotHandleTouchAction", js.undefined)
    
    inline def setForceSRGBBufferSupportState(value: Boolean): Self = StObject.set(x, "forceSRGBBufferSupportState", value.asInstanceOf[js.Any])
    
    inline def setForceSRGBBufferSupportStateUndefined: Self = StObject.set(x, "forceSRGBBufferSupportState", js.undefined)
    
    inline def setLimitDeviceRatio(value: Double): Self = StObject.set(x, "limitDeviceRatio", value.asInstanceOf[js.Any])
    
    inline def setLimitDeviceRatioUndefined: Self = StObject.set(x, "limitDeviceRatio", js.undefined)
    
    inline def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    inline def setLockstepMaxStepsUndefined: Self = StObject.set(x, "lockstepMaxSteps", js.undefined)
    
    inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
    
    inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
    
    inline def setUseExactSrgbConversions(value: Boolean): Self = StObject.set(x, "useExactSrgbConversions", value.asInstanceOf[js.Any])
    
    inline def setUseExactSrgbConversionsUndefined: Self = StObject.set(x, "useExactSrgbConversions", js.undefined)
    
    inline def setUseHighPrecisionFloats(value: Boolean): Self = StObject.set(x, "useHighPrecisionFloats", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionFloatsUndefined: Self = StObject.set(x, "useHighPrecisionFloats", js.undefined)
    
    inline def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
    
    inline def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
    
    inline def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
  }
}
