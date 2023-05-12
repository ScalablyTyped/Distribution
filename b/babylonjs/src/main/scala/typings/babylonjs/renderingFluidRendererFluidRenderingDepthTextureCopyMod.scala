package typings.babylonjs

import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingFluidRendererFluidRenderingDepthTextureCopyMod {
  
  @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderingDepthTextureCopy", "FluidRenderingDepthTextureCopy")
  @js.native
  open class FluidRenderingDepthTextureCopy protected () extends StObject {
    def this(engine: Engine, width: Double, height: Double) = this()
    def this(engine: Engine, width: Double, height: Double, samples: Double) = this()
    
    /* private */ var _copyTextureToTexture: Any = js.native
    
    /* private */ var _depthRTWrapper: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    def copy(source: InternalTexture): Boolean = js.native
    
    def depthRTWrapper: RenderTargetWrapper = js.native
    
    def dispose(): Unit = js.native
  }
}
