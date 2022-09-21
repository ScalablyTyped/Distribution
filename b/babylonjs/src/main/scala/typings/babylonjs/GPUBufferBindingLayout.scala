package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferBindingLayout extends StObject {
  
  var hasDynamicOffset: js.UndefOr[Boolean] = js.undefined
  
  var minBindingSize: js.UndefOr[GPUSize64] = js.undefined
  
  var `type`: js.UndefOr[GPUBufferBindingType] = js.undefined
}
object GPUBufferBindingLayout {
  
  inline def apply(): GPUBufferBindingLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUBufferBindingLayout]
  }
  
  extension [Self <: GPUBufferBindingLayout](x: Self) {
    
    inline def setHasDynamicOffset(value: Boolean): Self = StObject.set(x, "hasDynamicOffset", value.asInstanceOf[js.Any])
    
    inline def setHasDynamicOffsetUndefined: Self = StObject.set(x, "hasDynamicOffset", js.undefined)
    
    inline def setMinBindingSize(value: GPUSize64): Self = StObject.set(x, "minBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMinBindingSizeUndefined: Self = StObject.set(x, "minBindingSize", js.undefined)
    
    inline def setType(value: GPUBufferBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
