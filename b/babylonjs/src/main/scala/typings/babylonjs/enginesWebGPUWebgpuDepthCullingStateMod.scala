package typings.babylonjs

import typings.babylonjs.enginesWebGPUWebgpuCacheRenderPipelineMod.WebGPUCacheRenderPipeline
import typings.babylonjs.statesDepthCullingStateMod.DepthCullingState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuDepthCullingStateMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuDepthCullingState", "WebGPUDepthCullingState")
  @js.native
  open class WebGPUDepthCullingState protected () extends DepthCullingState {
    /**
      * Initializes the state.
      * @param cache
      */
    def this(cache: WebGPUCacheRenderPipeline) = this()
    
    /* private */ var _cache: Any = js.native
    
    @JSName("apply")
    def apply(): Unit = js.native
  }
}
