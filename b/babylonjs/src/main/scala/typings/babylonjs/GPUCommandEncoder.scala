package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUCommandEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin {
  
  def beginComputePass(): GPUComputePassEncoder = js.native
  def beginComputePass(descriptor: GPUComputePassDescriptor): GPUComputePassEncoder = js.native
  
  def beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder = js.native
  
  def clearBuffer(buffer: GPUBuffer): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: Unit, size: GPUSize64): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: GPUSize64): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: GPUSize64, size: GPUSize64): Unit = js.native
  
  def copyBufferToBuffer(
    source: GPUBuffer,
    sourceOffset: GPUSize64,
    destination: GPUBuffer,
    destinationOffset: GPUSize64,
    size: GPUSize64
  ): Unit = js.native
  
  def copyBufferToTexture(source: GPUImageCopyBuffer, destination: GPUImageCopyTexture, copySize: GPUExtent3D): Unit = js.native
  
  def copyTextureToBuffer(source: GPUImageCopyTexture, destination: GPUImageCopyBuffer, copySize: GPUExtent3D): Unit = js.native
  
  def copyTextureToTexture(source: GPUImageCopyTexture, destination: GPUImageCopyTexture, copySize: GPUExtent3D): Unit = js.native
  
  def finish(): GPUCommandBuffer = js.native
  def finish(descriptor: GPUCommandBufferDescriptor): GPUCommandBuffer = js.native
  
  def resolveQuerySet(
    querySet: GPUQuerySet,
    firstQuery: GPUSize32,
    queryCount: GPUSize32,
    destination: GPUBuffer,
    destinationOffset: GPUSize64
  ): Unit = js.native
  
  def writeTimestamp(querySet: GPUQuerySet, queryIndex: GPUSize32): Unit = js.native
}
