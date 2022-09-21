package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassDescriptor
import typings.babylonjs.GPURenderPassEncoder
import typings.babylonjs.GPUTextureFormat
import typings.babylonjs.GPUTextureViewDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPURenderPassWrapper extends StObject {
  
  var colorAttachmentGPUTextures: js.Array[WebGPUHardwareTexture | Null] = js.native
  
  var colorAttachmentViewDescriptor: Nullable[GPUTextureViewDescriptor] = js.native
  
  var depthAttachmentViewDescriptor: Nullable[GPUTextureViewDescriptor] = js.native
  
  var depthTextureFormat: js.UndefOr[GPUTextureFormat] = js.native
  
  var renderPass: Nullable[GPURenderPassEncoder] = js.native
  
  var renderPassDescriptor: Nullable[GPURenderPassDescriptor] = js.native
  
  def reset(): Unit = js.native
  def reset(fullReset: Boolean): Unit = js.native
}
