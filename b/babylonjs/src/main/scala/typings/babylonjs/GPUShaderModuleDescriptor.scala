package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModuleDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var code: String | js.typedarray.Uint32Array
  
  var hints: js.UndefOr[StringDictionary[GPUShaderModuleCompilationHint]] = js.undefined
  
  var sourceMap: js.UndefOr[js.Object] = js.undefined
}
object GPUShaderModuleDescriptor {
  
  inline def apply(code: String | js.typedarray.Uint32Array): GPUShaderModuleDescriptor = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUShaderModuleDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUShaderModuleDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String | js.typedarray.Uint32Array): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHints(value: StringDictionary[GPUShaderModuleCompilationHint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setSourceMap(value: js.Object): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
