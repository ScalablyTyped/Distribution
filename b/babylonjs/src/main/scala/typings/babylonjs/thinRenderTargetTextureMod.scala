package typings.babylonjs

import typings.babylonjs.renderTargetWrapperMod.IRenderTargetTexture
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.textureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.thinTextureMod.ThinTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinRenderTargetTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/thinRenderTargetTexture", "ThinRenderTargetTexture")
  @js.native
  open class ThinRenderTargetTexture protected ()
    extends ThinTexture
       with IRenderTargetTexture {
    /**
      * Instantiates a new ThinRenderTargetTexture.
      * Tiny helper class to wrap a RenderTargetWrapper in a texture.
      * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache and to hold on the associated RTT
      * @param engine Define the internalTexture to wrap
      * @param size Define the size of the RTT to create
      * @param options Define rendertarget options
      */
    def this(engine: ThinEngine, size: TextureSize, options: RenderTargetCreationOptions) = this()
    
    /* private */ var _renderTarget: Any = js.native
    
    /* private */ val _renderTargetOptions: Any = js.native
    
    /* private */ var _size: Any = js.native
    
    def dispose(disposeOnlyFramebuffers: Boolean): Unit = js.native
    
    /**
      * Entry point to access the wrapper on a texture.
      */
    /* CompleteClass */
    var renderTarget: Nullable[RenderTargetWrapper] = js.native
    /**
      * Gets the render target wrapper associated with this render target
      */
    @JSName("renderTarget")
    def renderTarget_MThinRenderTargetTexture: Nullable[RenderTargetWrapper] = js.native
    
    /**
      * Resize the texture to a new desired size.
      * Be careful as it will recreate all the data in the new texture.
      * @param size Define the new size. It can be:
      *   - a number for squared texture,
      *   - an object containing { width: number, height: number }
      */
    def resize(size: TextureSize): Unit = js.native
  }
}
