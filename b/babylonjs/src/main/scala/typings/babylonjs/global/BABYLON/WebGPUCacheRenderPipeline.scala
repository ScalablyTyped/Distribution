package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUCacheRenderPipeline")
@js.native
abstract class WebGPUCacheRenderPipeline protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUCacheRenderPipeline {
  def this(
    device: GPUDevice,
    emptyVertexBuffer: typings.babylonjs.BABYLON.VertexBuffer,
    useTextureStage: Boolean
  ) = this()
}
/* static members */
object WebGPUCacheRenderPipeline {
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline.NumCacheHitWithHash")
  @js.native
  def NumCacheHitWithHash: Double = js.native
  inline def NumCacheHitWithHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithHash")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline.NumCacheHitWithoutHash")
  @js.native
  def NumCacheHitWithoutHash: Double = js.native
  inline def NumCacheHitWithoutHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithoutHash")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline.NumCacheMiss")
  @js.native
  def NumCacheMiss: Double = js.native
  inline def NumCacheMiss_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheMiss")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline.NumPipelineCreationLastFrame")
  @js.native
  def NumPipelineCreationLastFrame: Double = js.native
  inline def NumPipelineCreationLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumPipelineCreationLastFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetAphaBlendFactor")
  @js.native
  def _GetAphaBlendFactor: Any = js.native
  inline def _GetAphaBlendFactor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendFactor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetAphaBlendOperation")
  @js.native
  def _GetAphaBlendOperation: Any = js.native
  inline def _GetAphaBlendOperation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendOperation")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetCompareFunction")
  @js.native
  def _GetCompareFunction: Any = js.native
  inline def _GetCompareFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetCompareFunction")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetStencilOpFunction")
  @js.native
  def _GetStencilOpFunction: Any = js.native
  inline def _GetStencilOpFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStencilOpFunction")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetTopology")
  @js.native
  def _GetTopology: Any = js.native
  inline def _GetTopology_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetTopology")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._GetVertexInputDescriptorFormat")
  @js.native
  def _GetVertexInputDescriptorFormat: Any = js.native
  inline def _GetVertexInputDescriptorFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetVertexInputDescriptorFormat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheRenderPipeline._NumPipelineCreationCurrentFrame")
  @js.native
  def _NumPipelineCreationCurrentFrame: Any = js.native
  inline def _NumPipelineCreationCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumPipelineCreationCurrentFrame")(x.asInstanceOf[js.Any])
}
