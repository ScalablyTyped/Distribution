package typings.babylonjs

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUQueue
  extends StObject
     with GPUObjectBase {
  
  def copyExternalImageToTexture(source: GPUImageCopyExternalImage, destination: GPUImageCopyTextureTagged, copySize: GPUExtent3D): Unit = js.native
  
  def onSubmittedWorkDone(): js.Promise[Unit] = js.native
  
  def submit(commandBuffers: js.Array[GPUCommandBuffer]): Unit = js.native
  
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource, dataOffset: Unit, size: GPUSize64): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource, dataOffset: GPUSize64): Unit = js.native
  def writeBuffer(
    buffer: GPUBuffer,
    bufferOffset: GPUSize64,
    data: BufferSource,
    dataOffset: GPUSize64,
    size: GPUSize64
  ): Unit = js.native
  
  def writeTexture(
    destination: GPUImageCopyTexture,
    data: BufferSource,
    dataLayout: GPUImageDataLayout,
    size: GPUExtent3D
  ): Unit = js.native
}
