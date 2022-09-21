package typings.babylonjs

import typings.babylonjs.webgpuCacheSamplerMod.WebGPUCacheSampler
import typings.babylonjs.webgpuDrawContextMod.WebGPUDrawContext
import typings.babylonjs.webgpuEngineMod.WebGPUEngine
import typings.babylonjs.webgpuMaterialContextMod.WebGPUMaterialContext
import typings.babylonjs.webgpuPipelineContextMod.WebGPUPipelineContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuCacheBindGroupsMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups")
  @js.native
  open class WebGPUCacheBindGroups protected () extends StObject {
    def this(device: GPUDevice, cacheSampler: WebGPUCacheSampler, engine: WebGPUEngine) = this()
    
    /* private */ var _cacheSampler: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    var disabled: Boolean = js.native
    
    def endFrame(): Unit = js.native
    
    /**
      * Cache is currently based on the uniform/storage buffers, samplers and textures used by the binding groups.
      * Note that all uniform buffers have an offset of 0 in Babylon and we don't have a use case where we would have the same buffer used with different capacity values:
      * that means we don't need to factor in the offset/size of the buffer in the cache, only the id
      * @param webgpuPipelineContext
      * @param drawContext
      * @param materialContext
      */
    def getBindGroups(
      webgpuPipelineContext: WebGPUPipelineContext,
      drawContext: WebGPUDrawContext,
      materialContext: WebGPUMaterialContext
    ): js.Array[GPUBindGroup] = js.native
  }
  /* static members */
  object WebGPUCacheBindGroups {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups.NumBindGroupsCreatedLastFrame")
    @js.native
    def NumBindGroupsCreatedLastFrame: Double = js.native
    inline def NumBindGroupsCreatedLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedLastFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups.NumBindGroupsCreatedTotal")
    @js.native
    def NumBindGroupsCreatedTotal: Double = js.native
    inline def NumBindGroupsCreatedTotal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedTotal")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups.NumBindGroupsLookupLastFrame")
    @js.native
    def NumBindGroupsLookupLastFrame: Double = js.native
    inline def NumBindGroupsLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsLookupLastFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups.NumBindGroupsNoLookupLastFrame")
    @js.native
    def NumBindGroupsNoLookupLastFrame: Double = js.native
    inline def NumBindGroupsNoLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsNoLookupLastFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups._Cache")
    @js.native
    def _Cache: Any = js.native
    inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups._NumBindGroupsCreatedCurrentFrame")
    @js.native
    def _NumBindGroupsCreatedCurrentFrame: Any = js.native
    inline def _NumBindGroupsCreatedCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsCreatedCurrentFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups._NumBindGroupsLookupCurrentFrame")
    @js.native
    def _NumBindGroupsLookupCurrentFrame: Any = js.native
    inline def _NumBindGroupsLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsLookupCurrentFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheBindGroups", "WebGPUCacheBindGroups._NumBindGroupsNoLookupCurrentFrame")
    @js.native
    def _NumBindGroupsNoLookupCurrentFrame: Any = js.native
    inline def _NumBindGroupsNoLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsNoLookupCurrentFrame")(x.asInstanceOf[js.Any])
  }
}
