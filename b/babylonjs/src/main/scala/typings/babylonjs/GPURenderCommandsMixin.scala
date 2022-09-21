package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderCommandsMixin extends StObject {
  
  def draw(vertexCount: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: Unit, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: GPUSize32, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: Unit, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: GPUSize32, firstInstance: GPUSize32): Unit = js.native
  
  def drawIndexed(indexCount: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: Unit,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: Unit, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: Unit,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: GPUSize32,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: GPUSize32, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: Unit,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32, firstIndex: Unit, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: Unit,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32, firstIndex: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32
  ): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  
  def drawIndexedIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  def drawIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: Unit, size: GPUSize64): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: GPUSize64): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: GPUSize64, size: GPUSize64): Unit = js.native
  
  def setPipeline(pipeline: GPURenderPipeline): Unit = js.native
  
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: Unit, size: GPUSize64): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: GPUSize64): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: GPUSize64, size: GPUSize64): Unit = js.native
}
