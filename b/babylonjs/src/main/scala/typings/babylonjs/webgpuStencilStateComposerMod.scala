package typings.babylonjs

import typings.babylonjs.stencilStateComposerMod.StencilStateComposer
import typings.babylonjs.webgpuCacheRenderPipelineMod.WebGPUCacheRenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuStencilStateComposerMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuStencilStateComposer", "WebGPUStencilStateComposer")
  @js.native
  open class WebGPUStencilStateComposer protected () extends StencilStateComposer {
    def this(cache: WebGPUCacheRenderPipeline) = this()
    
    /* private */ var _cache: Any = js.native
  }
}
