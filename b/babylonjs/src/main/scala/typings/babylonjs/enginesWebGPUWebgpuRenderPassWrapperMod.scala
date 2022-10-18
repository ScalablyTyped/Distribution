package typings.babylonjs

import typings.babylonjs.enginesWebGPUWebgpuHardwareTextureMod.WebGPUHardwareTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuRenderPassWrapperMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuRenderPassWrapper", "WebGPURenderPassWrapper")
  @js.native
  open class WebGPURenderPassWrapper () extends StObject {
    
    var colorAttachmentGPUTextures: js.Array[WebGPUHardwareTexture | Null] = js.native
    
    var colorAttachmentViewDescriptor: Nullable[GPUTextureViewDescriptor] = js.native
    
    var depthAttachmentViewDescriptor: Nullable[GPUTextureViewDescriptor] = js.native
    
    var depthTextureFormat: js.UndefOr[GPUTextureFormat] = js.native
    
    var renderPass: Nullable[GPURenderPassEncoder] = js.native
    
    var renderPassDescriptor: Nullable[GPURenderPassDescriptor] = js.native
    
    def reset(): Unit = js.native
    def reset(fullReset: Boolean): Unit = js.native
  }
}
