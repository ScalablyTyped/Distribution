package typings.babylonjs

import typings.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbdTextureToolsMod {
  
  @JSImport("babylonjs/Misc/rgbdTextureTools", "RGBDTextureTools")
  @js.native
  class RGBDTextureTools () extends StObject
  /* static members */
  object RGBDTextureTools {
    
    /**
      * Expand the RGBD Texture from RGBD to Half Float if possible.
      * @param texture the texture to expand.
      */
    @JSImport("babylonjs/Misc/rgbdTextureTools", "RGBDTextureTools.ExpandRGBDTexture")
    @js.native
    def ExpandRGBDTexture(texture: Texture): Unit = js.native
  }
}
