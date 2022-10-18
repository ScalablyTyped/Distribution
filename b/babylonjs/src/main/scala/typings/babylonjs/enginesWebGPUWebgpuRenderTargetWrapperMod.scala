package typings.babylonjs

import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuRenderTargetWrapperMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuRenderTargetWrapper", "WebGPURenderTargetWrapper")
  @js.native
  open class WebGPURenderTargetWrapper protected () extends RenderTargetWrapper {
    /**
      * Initializes the render target wrapper
      * @param isMulti true if the wrapper is a multi render target
      * @param isCube true if the wrapper should render to a cube texture
      * @param size size of the render target (width/height/layers)
      * @param engine engine used to create the render target
      */
    def this(isMulti: Boolean, isCube: Boolean, size: TextureSize, engine: ThinEngine) = this()
    
    /** @internal */
    var _defaultAttachments: js.Array[Double] = js.native
  }
}
