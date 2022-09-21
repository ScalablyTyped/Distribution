package typings.babylonjs

import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webgpuEngineMod.WebGPUEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuClearQuadMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuClearQuad", "WebGPUClearQuad")
  @js.native
  open class WebGPUClearQuad protected () extends StObject {
    def this(device: GPUDevice, engine: WebGPUEngine, emptyVertexBuffer: VertexBuffer) = this()
    
    /* private */ var _bindGroups: Any = js.native
    
    /* private */ var _bundleCache: Any = js.native
    
    /* private */ var _cacheRenderPipeline: Any = js.native
    
    /* private */ var _depthTextureFormat: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _effect: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _keyTemp: Any = js.native
    
    def clear(renderPass: Nullable[GPURenderPassEncoder]): Nullable[GPURenderBundle] = js.native
    def clear(renderPass: Nullable[GPURenderPassEncoder], clearColor: Unit, clearDepth: Boolean): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Boolean,
      clearStencil: Boolean
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Boolean,
      clearStencil: Boolean,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Boolean,
      clearStencil: Unit,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Unit,
      clearStencil: Boolean
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Unit,
      clearStencil: Boolean,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Unit,
      clearDepth: Unit,
      clearStencil: Unit,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(renderPass: Nullable[GPURenderPassEncoder], clearColor: Nullable[IColor4Like]): Nullable[GPURenderBundle] = js.native
    def clear(renderPass: Nullable[GPURenderPassEncoder], clearColor: Nullable[IColor4Like], clearDepth: Boolean): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Boolean,
      clearStencil: Boolean
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Boolean,
      clearStencil: Boolean,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Boolean,
      clearStencil: Unit,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Unit,
      clearStencil: Boolean
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Unit,
      clearStencil: Boolean,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    def clear(
      renderPass: Nullable[GPURenderPassEncoder],
      clearColor: Nullable[IColor4Like],
      clearDepth: Unit,
      clearStencil: Unit,
      sampleCount: Double
    ): Nullable[GPURenderBundle] = js.native
    
    def setColorFormat(): Unit = js.native
    def setColorFormat(format: GPUTextureFormat): Unit = js.native
    
    def setDepthStencilFormat(): Unit = js.native
    def setDepthStencilFormat(format: GPUTextureFormat): Unit = js.native
    
    def setMRTAttachments(attachments: js.Array[Double], textureArray: js.Array[InternalTexture], textureCount: Double): Unit = js.native
  }
}
