package typings.babylonjs.BABYLON

import typings.babylonjs.GPUDeviceDescriptor
import typings.babylonjs.GPURequestAdapterOptions
import typings.babylonjs.GPUTextureFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUEngineOptions
  extends StObject
     with ThinEngineOptions
     with GPURequestAdapterOptions {
  
  /**
    * Defines the device descriptor used to create a device once we have retrieved an appropriate adapter
    */
  var deviceDescriptor: js.UndefOr[GPUDeviceDescriptor] = js.undefined
  
  /**
    * When requesting the device, enable all the features supported by the adapter. Default: false
    * Note that this setting is ignored if you explicitely set deviceDescriptor.requiredFeatures
    */
  var enableAllFeatures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether we should generate debug markers in the gpu command lists (can be seen with PIX for eg). Default: false
    */
  var enableGPUDebugMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options to load the associated Glslang library
    */
  var glslangOptions: js.UndefOr[GlslangOptions] = js.undefined
  
  /**
    * When requesting the device, set the required limits to the maximum possible values (the ones from adapter.limits). Default: false
    * Note that this setting is ignored if you explicitely set deviceDescriptor.requiredLimits
    */
  var setMaximumLimits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the requested Swap Chain Format.
    */
  var swapChainFormat: js.UndefOr[GPUTextureFormat] = js.undefined
  
  /**
    * Options to load the associated Twgsl library
    */
  var twgslOptions: js.UndefOr[TwgslOptions] = js.undefined
}
object WebGPUEngineOptions {
  
  inline def apply(): WebGPUEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGPUEngineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPUEngineOptions] (val x: Self) extends AnyVal {
    
    inline def setDeviceDescriptor(value: GPUDeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
    
    inline def setEnableAllFeatures(value: Boolean): Self = StObject.set(x, "enableAllFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnableAllFeaturesUndefined: Self = StObject.set(x, "enableAllFeatures", js.undefined)
    
    inline def setEnableGPUDebugMarkers(value: Boolean): Self = StObject.set(x, "enableGPUDebugMarkers", value.asInstanceOf[js.Any])
    
    inline def setEnableGPUDebugMarkersUndefined: Self = StObject.set(x, "enableGPUDebugMarkers", js.undefined)
    
    inline def setGlslangOptions(value: GlslangOptions): Self = StObject.set(x, "glslangOptions", value.asInstanceOf[js.Any])
    
    inline def setGlslangOptionsUndefined: Self = StObject.set(x, "glslangOptions", js.undefined)
    
    inline def setSetMaximumLimits(value: Boolean): Self = StObject.set(x, "setMaximumLimits", value.asInstanceOf[js.Any])
    
    inline def setSetMaximumLimitsUndefined: Self = StObject.set(x, "setMaximumLimits", js.undefined)
    
    inline def setSwapChainFormat(value: GPUTextureFormat): Self = StObject.set(x, "swapChainFormat", value.asInstanceOf[js.Any])
    
    inline def setSwapChainFormatUndefined: Self = StObject.set(x, "swapChainFormat", js.undefined)
    
    inline def setTwgslOptions(value: TwgslOptions): Self = StObject.set(x, "twgslOptions", value.asInstanceOf[js.Any])
    
    inline def setTwgslOptionsUndefined: Self = StObject.set(x, "twgslOptions", js.undefined)
  }
}
