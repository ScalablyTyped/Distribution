package typings.babylonjs.materialsTexturesIndexMod

import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "ThinTexture")
@js.native
open class ThinTexture protected ()
  extends typings.babylonjs.materialsTexturesThinTextureMod.ThinTexture {
  /**
    * Instantiates a new ThinTexture.
    * Base class of all the textures in babylon.
    * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache
    * @param internalTexture Define the internalTexture to wrap. You can also pass a RenderTargetWrapper, in which case the texture will be the render target's texture
    */
  def this(internalTexture: Nullable[
        typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture | RenderTargetWrapper
      ]) = this()
}
/* static members */
object ThinTexture {
  
  @JSImport("babylonjs/Materials/Textures/index", "ThinTexture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Materials/Textures/index", "ThinTexture._IsRenderTargetWrapper")
  @js.native
  def _IsRenderTargetWrapper: Any = js.native
  inline def _IsRenderTargetWrapper_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetWrapper")(x.asInstanceOf[js.Any])
}
