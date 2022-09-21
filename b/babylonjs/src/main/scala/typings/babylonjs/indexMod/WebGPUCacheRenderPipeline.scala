package typings.babylonjs.indexMod

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebGPUCacheRenderPipeline")
@js.native
abstract class WebGPUCacheRenderPipeline protected ()
  extends typings.babylonjs.enginesIndexMod.WebGPUCacheRenderPipeline {
  def this(
    device: GPUDevice,
    emptyVertexBuffer: typings.babylonjs.bufferMod.VertexBuffer,
    useTextureStage: Boolean
  ) = this()
}
/* static members */
object WebGPUCacheRenderPipeline {
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline.NumCacheHitWithHash")
  @js.native
  def NumCacheHitWithHash: Double = js.native
  inline def NumCacheHitWithHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithHash")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline.NumCacheHitWithoutHash")
  @js.native
  def NumCacheHitWithoutHash: Double = js.native
  inline def NumCacheHitWithoutHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithoutHash")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline.NumCacheMiss")
  @js.native
  def NumCacheMiss: Double = js.native
  inline def NumCacheMiss_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheMiss")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline.NumPipelineCreationLastFrame")
  @js.native
  def NumPipelineCreationLastFrame: Double = js.native
  inline def NumPipelineCreationLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumPipelineCreationLastFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetAphaBlendFactor")
  @js.native
  def _GetAphaBlendFactor: Any = js.native
  inline def _GetAphaBlendFactor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendFactor")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetAphaBlendOperation")
  @js.native
  def _GetAphaBlendOperation: Any = js.native
  inline def _GetAphaBlendOperation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendOperation")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetCompareFunction")
  @js.native
  def _GetCompareFunction: Any = js.native
  inline def _GetCompareFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetCompareFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetStencilOpFunction")
  @js.native
  def _GetStencilOpFunction: Any = js.native
  inline def _GetStencilOpFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStencilOpFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetTopology")
  @js.native
  def _GetTopology: Any = js.native
  inline def _GetTopology_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetTopology")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._GetVertexInputDescriptorFormat")
  @js.native
  def _GetVertexInputDescriptorFormat: Any = js.native
  inline def _GetVertexInputDescriptorFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetVertexInputDescriptorFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "WebGPUCacheRenderPipeline._NumPipelineCreationCurrentFrame")
  @js.native
  def _NumPipelineCreationCurrentFrame: Any = js.native
  inline def _NumPipelineCreationCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumPipelineCreationCurrentFrame")(x.asInstanceOf[js.Any])
}
