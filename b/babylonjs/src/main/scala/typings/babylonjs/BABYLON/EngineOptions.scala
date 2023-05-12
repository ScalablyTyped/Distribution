package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineOptions
  extends StObject
     with ThinEngineOptions
     with WebGLContextAttributes {
  
  /**
    * Defines if webvr should be enabled automatically
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRCamera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see https://doc.babylonjs.com/setup/support/webGL2
    */
  var disableWebGL2Support: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will prevent the system from falling back to software implementation if a hardware device cannot be created
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If sRGB Buffer support is not set during construction, use this value to force a specific state
    * This is added due to an issue when processing textures in chrome/edge/firefox
    * This will not influence NativeEngine and WebGPUEngine which set the behavior to true during construction.
    */
  var forceSRGBBufferSupportState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.undefined
}
object EngineOptions {
  
  inline def apply(): EngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoEnableWebVR(value: Boolean): Self = StObject.set(x, "autoEnableWebVR", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableWebVRUndefined: Self = StObject.set(x, "autoEnableWebVR", js.undefined)
    
    inline def setDisableWebGL2Support(value: Boolean): Self = StObject.set(x, "disableWebGL2Support", value.asInstanceOf[js.Any])
    
    inline def setDisableWebGL2SupportUndefined: Self = StObject.set(x, "disableWebGL2Support", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setForceSRGBBufferSupportState(value: Boolean): Self = StObject.set(x, "forceSRGBBufferSupportState", value.asInstanceOf[js.Any])
    
    inline def setForceSRGBBufferSupportStateUndefined: Self = StObject.set(x, "forceSRGBBufferSupportState", js.undefined)
    
    inline def setUseHighPrecisionFloats(value: Boolean): Self = StObject.set(x, "useHighPrecisionFloats", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionFloatsUndefined: Self = StObject.set(x, "useHighPrecisionFloats", js.undefined)
  }
}
