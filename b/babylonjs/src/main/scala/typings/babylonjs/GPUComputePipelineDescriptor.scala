package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePipelineDescriptor
  extends StObject
     with GPUPipelineDescriptorBase {
  
  var compute: GPUProgrammableStage
}
object GPUComputePipelineDescriptor {
  
  inline def apply(compute: GPUProgrammableStage): GPUComputePipelineDescriptor = {
    val __obj = js.Dynamic.literal(compute = compute.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUComputePipelineDescriptor]
  }
  
  extension [Self <: GPUComputePipelineDescriptor](x: Self) {
    
    inline def setCompute(value: GPUProgrammableStage): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
  }
}
