package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// May represent WGSL’s bool, f32, i32, u32, and f16 if enabled.
trait GPUComputePipeline
  extends StObject
     with GPUObjectBase
     with GPUPipelineBase
object GPUComputePipeline {
  
  inline def apply(getBindGroupLayout: Double => GPUBindGroupLayout): GPUComputePipeline = {
    val __obj = js.Dynamic.literal(getBindGroupLayout = js.Any.fromFunction1(getBindGroupLayout))
    __obj.asInstanceOf[GPUComputePipeline]
  }
}
