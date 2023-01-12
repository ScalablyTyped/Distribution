package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUProgrammableStage extends StObject {
  
  var constants: js.UndefOr[StringDictionary[GPUPipelineConstantValue]] = js.undefined
  
  var entryPoint: String | js.typedarray.Uint32Array
  
  var module: GPUShaderModule
}
object GPUProgrammableStage {
  
  inline def apply(entryPoint: String | js.typedarray.Uint32Array, module: GPUShaderModule): GPUProgrammableStage = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUProgrammableStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUProgrammableStage] (val x: Self) extends AnyVal {
    
    inline def setConstants(value: StringDictionary[GPUPipelineConstantValue]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    
    inline def setEntryPoint(value: String | js.typedarray.Uint32Array): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setModule(value: GPUShaderModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
