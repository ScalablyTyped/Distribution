package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUBindGroup
import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUCacheBindGroups")
@js.native
open class WebGPUCacheBindGroups protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUCacheBindGroups {
  def this(
    device: GPUDevice,
    cacheSampler: typings.babylonjs.BABYLON.WebGPUCacheSampler,
    engine: typings.babylonjs.BABYLON.WebGPUEngine
  ) = this()
  
  /* private */ /* CompleteClass */
  var _cacheSampler: Any = js.native
  
  /* private */ /* CompleteClass */
  var _device: Any = js.native
  
  /* private */ /* CompleteClass */
  var _engine: Any = js.native
  
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* CompleteClass */
  override def endFrame(): Unit = js.native
  
  /**
    * Cache is currently based on the uniform/storage buffers, samplers and textures used by the binding groups.
    * Note that all uniform buffers have an offset of 0 in Babylon and we don't have a use case where we would have the same buffer used with different capacity values:
    * that means we don't need to factor in the offset/size of the buffer in the cache, only the id
    * @param webgpuPipelineContext
    * @param drawContext
    * @param materialContext
    */
  /* CompleteClass */
  override def getBindGroups(
    webgpuPipelineContext: typings.babylonjs.BABYLON.WebGPUPipelineContext,
    drawContext: typings.babylonjs.BABYLON.WebGPUDrawContext,
    materialContext: typings.babylonjs.BABYLON.WebGPUMaterialContext
  ): js.Array[GPUBindGroup] = js.native
}
/* static members */
object WebGPUCacheBindGroups {
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups.NumBindGroupsCreatedLastFrame")
  @js.native
  def NumBindGroupsCreatedLastFrame: Double = js.native
  inline def NumBindGroupsCreatedLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedLastFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups.NumBindGroupsCreatedTotal")
  @js.native
  def NumBindGroupsCreatedTotal: Double = js.native
  inline def NumBindGroupsCreatedTotal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedTotal")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups.NumBindGroupsLookupLastFrame")
  @js.native
  def NumBindGroupsLookupLastFrame: Double = js.native
  inline def NumBindGroupsLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsLookupLastFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups.NumBindGroupsNoLookupLastFrame")
  @js.native
  def NumBindGroupsNoLookupLastFrame: Double = js.native
  inline def NumBindGroupsNoLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsNoLookupLastFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups._Cache")
  @js.native
  def _Cache: Any = js.native
  inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups._NumBindGroupsCreatedCurrentFrame")
  @js.native
  def _NumBindGroupsCreatedCurrentFrame: Any = js.native
  inline def _NumBindGroupsCreatedCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsCreatedCurrentFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups._NumBindGroupsLookupCurrentFrame")
  @js.native
  def _NumBindGroupsLookupCurrentFrame: Any = js.native
  inline def _NumBindGroupsLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsLookupCurrentFrame")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheBindGroups._NumBindGroupsNoLookupCurrentFrame")
  @js.native
  def _NumBindGroupsNoLookupCurrentFrame: Any = js.native
  inline def _NumBindGroupsNoLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsNoLookupCurrentFrame")(x.asInstanceOf[js.Any])
}
