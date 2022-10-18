package typings.babylonjs.materialsTexturesIndexMod

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
    * @param internalTexture Define the internalTexture to wrap
    */
  def this(internalTexture: Nullable[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture]) = this()
}
