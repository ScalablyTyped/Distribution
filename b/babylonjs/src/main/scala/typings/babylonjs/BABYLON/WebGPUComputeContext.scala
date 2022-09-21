package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroup
import typings.babylonjs.GPUComputePipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUComputeContext
  extends StObject
     with IComputeContext {
  
  /* private */ var _bindGroupEntries: Any = js.native
  
  /* private */ var _bindGroups: Any = js.native
  
  /* private */ var _cacheSampler: Any = js.native
  
  /* private */ var _device: Any = js.native
  
  def getBindGroups(bindings: ComputeBindingList, computePipeline: GPUComputePipeline): js.Array[GPUBindGroup] = js.native
  def getBindGroups(
    bindings: ComputeBindingList,
    computePipeline: GPUComputePipeline,
    bindingsMapping: ComputeBindingMapping
  ): js.Array[GPUBindGroup] = js.native
  
  val uniqueId: Double = js.native
}
