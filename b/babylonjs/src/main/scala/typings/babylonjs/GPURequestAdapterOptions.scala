package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURequestAdapterOptions extends StObject {
  
  var forceFallbackAdapter: js.UndefOr[Boolean] = js.undefined
  
  var powerPreference: js.UndefOr[GPUPowerPreference] = js.undefined
}
object GPURequestAdapterOptions {
  
  inline def apply(): GPURequestAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPURequestAdapterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURequestAdapterOptions] (val x: Self) extends AnyVal {
    
    inline def setForceFallbackAdapter(value: Boolean): Self = StObject.set(x, "forceFallbackAdapter", value.asInstanceOf[js.Any])
    
    inline def setForceFallbackAdapterUndefined: Self = StObject.set(x, "forceFallbackAdapter", js.undefined)
    
    inline def setPowerPreference(value: GPUPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
  }
}
