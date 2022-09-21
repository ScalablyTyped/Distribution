package typings.babylonjs.BABYLON

import typings.babylonjs.GPUDeviceDescriptor
import typings.babylonjs.GPURequestAdapterOptions
import typings.babylonjs.GPUTextureFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUEngineOptions
  extends StObject
     with GPURequestAdapterOptions {
  
  /**
    * Defines whether to adapt to the device's viewport characteristics (default: false)
    */
  var adaptToDeviceRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether MSAA is enabled on the canvas.
    */
  var antialiasing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if webaudio should be initialized as well
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the device descriptor used to create a device.
    */
  var deviceDescriptor: js.UndefOr[GPUDeviceDescriptor] = js.undefined
  
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
    * Defines whether we should generate debug markers in the gpu command lists (can be seen with PIX for eg)
    */
  var enableGPUDebugMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options to load the associated Glslang library
    */
  var glslangOptions: js.UndefOr[GlslangOptions] = js.undefined
  
  /**
    * Defines if the engine should no exceed a specified device ratio
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
    */
  var limitDeviceRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var lockstepMaxSteps: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines whether the canvas should be created in "premultiplied" mode (if false, the canvas is created in the "opaque" mode) (true by default)
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the stencil buffer should be enabled.
    */
  var stencil: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the requested Swap Chain Format.
    */
  var swapChainFormat: js.UndefOr[GPUTextureFormat] = js.undefined
  
  /**
    * Defines the seconds between each deterministic lock step
    */
  var timeStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Options to load the associated Twgsl library
    */
  var twgslOptions: js.UndefOr[TwgslOptions] = js.undefined
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.undefined
}
object WebGPUEngineOptions {
  
  inline def apply(): WebGPUEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGPUEngineOptions]
  }
  
  extension [Self <: WebGPUEngineOptions](x: Self) {
    
    inline def setAdaptToDeviceRatio(value: Boolean): Self = StObject.set(x, "adaptToDeviceRatio", value.asInstanceOf[js.Any])
    
    inline def setAdaptToDeviceRatioUndefined: Self = StObject.set(x, "adaptToDeviceRatio", js.undefined)
    
    inline def setAntialiasing(value: Boolean): Self = StObject.set(x, "antialiasing", value.asInstanceOf[js.Any])
    
    inline def setAntialiasingUndefined: Self = StObject.set(x, "antialiasing", js.undefined)
    
    inline def setAudioEngine(value: Boolean): Self = StObject.set(x, "audioEngine", value.asInstanceOf[js.Any])
    
    inline def setAudioEngineUndefined: Self = StObject.set(x, "audioEngine", js.undefined)
    
    inline def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
    
    inline def setDeterministicLockstepUndefined: Self = StObject.set(x, "deterministicLockstep", js.undefined)
    
    inline def setDeviceDescriptor(value: GPUDeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
    
    inline def setDoNotHandleContextLost(value: Boolean): Self = StObject.set(x, "doNotHandleContextLost", value.asInstanceOf[js.Any])
    
    inline def setDoNotHandleContextLostUndefined: Self = StObject.set(x, "doNotHandleContextLost", js.undefined)
    
    inline def setDoNotHandleTouchAction(value: Boolean): Self = StObject.set(x, "doNotHandleTouchAction", value.asInstanceOf[js.Any])
    
    inline def setDoNotHandleTouchActionUndefined: Self = StObject.set(x, "doNotHandleTouchAction", js.undefined)
    
    inline def setEnableGPUDebugMarkers(value: Boolean): Self = StObject.set(x, "enableGPUDebugMarkers", value.asInstanceOf[js.Any])
    
    inline def setEnableGPUDebugMarkersUndefined: Self = StObject.set(x, "enableGPUDebugMarkers", js.undefined)
    
    inline def setGlslangOptions(value: GlslangOptions): Self = StObject.set(x, "glslangOptions", value.asInstanceOf[js.Any])
    
    inline def setGlslangOptionsUndefined: Self = StObject.set(x, "glslangOptions", js.undefined)
    
    inline def setLimitDeviceRatio(value: Double): Self = StObject.set(x, "limitDeviceRatio", value.asInstanceOf[js.Any])
    
    inline def setLimitDeviceRatioUndefined: Self = StObject.set(x, "limitDeviceRatio", js.undefined)
    
    inline def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    inline def setLockstepMaxStepsUndefined: Self = StObject.set(x, "lockstepMaxSteps", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    
    inline def setSwapChainFormat(value: GPUTextureFormat): Self = StObject.set(x, "swapChainFormat", value.asInstanceOf[js.Any])
    
    inline def setSwapChainFormatUndefined: Self = StObject.set(x, "swapChainFormat", js.undefined)
    
    inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
    
    inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
    
    inline def setTwgslOptions(value: TwgslOptions): Self = StObject.set(x, "twgslOptions", value.asInstanceOf[js.Any])
    
    inline def setTwgslOptionsUndefined: Self = StObject.set(x, "twgslOptions", js.undefined)
    
    inline def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
  }
}
