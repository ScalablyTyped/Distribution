package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ThinTexture")
@js.native
open class ThinTexture protected ()
  extends typings.babylonjs.legacyLegacyMod.ThinTexture {
  /**
    * Instantiates a new ThinTexture.
    * Base class of all the textures in babylon.
    * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache
    * @param internalTexture Define the internalTexture to wrap. You can also pass a RenderTargetWrapper, in which case the texture will be the render target's texture
    */
  def this(internalTexture: Nullable[
        typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture | typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
      ]) = this()
}
/* static members */
object ThinTexture {
  
  @JSImport("babylonjs", "ThinTexture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "ThinTexture._IsRenderTargetWrapper")
  @js.native
  def _IsRenderTargetWrapper: Any = js.native
  inline def _IsRenderTargetWrapper_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetWrapper")(x.asInstanceOf[js.Any])
}
