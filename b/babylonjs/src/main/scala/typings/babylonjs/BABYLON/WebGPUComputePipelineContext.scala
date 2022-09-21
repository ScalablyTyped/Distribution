package typings.babylonjs.BABYLON

import typings.babylonjs.GPUComputePipeline
import typings.babylonjs.GPUProgrammableStage
import typings.babylonjs.anon.Compute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUComputePipelineContext
  extends StObject
     with IComputePipelineContext {
  
  /** @hidden */
  @JSName("_name")
  var _name_WebGPUComputePipelineContext: String = js.native
  
  var computePipeline: GPUComputePipeline = js.native
  
  var engine: WebGPUEngine = js.native
  
  @JSName("isAsync")
  def isAsync_MWebGPUComputePipelineContext: Boolean = js.native
  
  @JSName("isReady")
  def isReady_MWebGPUComputePipelineContext: Boolean = js.native
  
  var sources: Compute = js.native
  
  var stage: Nullable[GPUProgrammableStage] = js.native
}
