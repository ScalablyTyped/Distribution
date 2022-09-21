package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineLayoutDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var bindGroupLayouts: js.Array[GPUBindGroupLayout]
}
object GPUPipelineLayoutDescriptor {
  
  inline def apply(bindGroupLayouts: js.Array[GPUBindGroupLayout]): GPUPipelineLayoutDescriptor = {
    val __obj = js.Dynamic.literal(bindGroupLayouts = bindGroupLayouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineLayoutDescriptor]
  }
  
  extension [Self <: GPUPipelineLayoutDescriptor](x: Self) {
    
    inline def setBindGroupLayouts(value: js.Array[GPUBindGroupLayout]): Self = StObject.set(x, "bindGroupLayouts", value.asInstanceOf[js.Any])
    
    inline def setBindGroupLayoutsVarargs(value: GPUBindGroupLayout*): Self = StObject.set(x, "bindGroupLayouts", js.Array(value*))
  }
}
