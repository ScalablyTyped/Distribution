package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUComputePassEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin {
  
  def dispatchWorkgroups(workgroupCountX: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: Unit, workgroupCountZ: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: GPUSize32, workgroupCountZ: GPUSize32): Unit = js.native
  
  def dispatchWorkgroupsIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  def end(): Unit = js.native
  
  def setPipeline(pipeline: GPUComputePipeline): Unit = js.native
}
