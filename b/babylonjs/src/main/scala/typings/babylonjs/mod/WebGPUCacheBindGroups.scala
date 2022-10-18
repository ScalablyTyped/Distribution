package typings.babylonjs.mod

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebGPUCacheBindGroups")
@js.native
open class WebGPUCacheBindGroups protected ()
  extends typings.babylonjs.legacyLegacyMod.WebGPUCacheBindGroups {
  def this(
    device: GPUDevice,
    cacheSampler: typings.babylonjs.enginesWebGPUWebgpuCacheSamplerMod.WebGPUCacheSampler,
    engine: typings.babylonjs.enginesWebgpuEngineMod.WebGPUEngine
  ) = this()
}
/* static members */
object WebGPUCacheBindGroups {
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups.NumBindGroupsCreatedLastFrame")
  @js.native
  def NumBindGroupsCreatedLastFrame: Double = js.native
  inline def NumBindGroupsCreatedLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedLastFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups.NumBindGroupsCreatedTotal")
  @js.native
  def NumBindGroupsCreatedTotal: Double = js.native
  inline def NumBindGroupsCreatedTotal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsCreatedTotal")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups.NumBindGroupsLookupLastFrame")
  @js.native
  def NumBindGroupsLookupLastFrame: Double = js.native
  inline def NumBindGroupsLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsLookupLastFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups.NumBindGroupsNoLookupLastFrame")
  @js.native
  def NumBindGroupsNoLookupLastFrame: Double = js.native
  inline def NumBindGroupsNoLookupLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumBindGroupsNoLookupLastFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups._Cache")
  @js.native
  def _Cache: Any = js.native
  inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups._NumBindGroupsCreatedCurrentFrame")
  @js.native
  def _NumBindGroupsCreatedCurrentFrame: Any = js.native
  inline def _NumBindGroupsCreatedCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsCreatedCurrentFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups._NumBindGroupsLookupCurrentFrame")
  @js.native
  def _NumBindGroupsLookupCurrentFrame: Any = js.native
  inline def _NumBindGroupsLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsLookupCurrentFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "WebGPUCacheBindGroups._NumBindGroupsNoLookupCurrentFrame")
  @js.native
  def _NumBindGroupsNoLookupCurrentFrame: Any = js.native
  inline def _NumBindGroupsNoLookupCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumBindGroupsNoLookupCurrentFrame")(x.asInstanceOf[js.Any])
}
