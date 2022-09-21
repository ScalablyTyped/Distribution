package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureBindingLayout extends StObject {
  
  var multisampled: js.UndefOr[Boolean] = js.undefined
  
  var sampleType: js.UndefOr[GPUTextureSampleType] = js.undefined
  
  var viewDimension: js.UndefOr[GPUTextureViewDimension] = js.undefined
}
object GPUTextureBindingLayout {
  
  inline def apply(): GPUTextureBindingLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUTextureBindingLayout]
  }
  
  extension [Self <: GPUTextureBindingLayout](x: Self) {
    
    inline def setMultisampled(value: Boolean): Self = StObject.set(x, "multisampled", value.asInstanceOf[js.Any])
    
    inline def setMultisampledUndefined: Self = StObject.set(x, "multisampled", js.undefined)
    
    inline def setSampleType(value: GPUTextureSampleType): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
    
    inline def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
    
    inline def setViewDimension(value: GPUTextureViewDimension): Self = StObject.set(x, "viewDimension", value.asInstanceOf[js.Any])
    
    inline def setViewDimensionUndefined: Self = StObject.set(x, "viewDimension", js.undefined)
  }
}
