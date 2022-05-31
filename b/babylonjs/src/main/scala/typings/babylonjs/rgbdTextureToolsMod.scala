package typings.babylonjs

import typings.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbdTextureToolsMod {
  
  @JSImport("babylonjs/Misc/rgbdTextureTools", "RGBDTextureTools")
  @js.native
  class RGBDTextureTools () extends StObject
  /* static members */
  object RGBDTextureTools {
    
    @JSImport("babylonjs/Misc/rgbdTextureTools", "RGBDTextureTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Expand the RGBD Texture from RGBD to Half Float if possible.
      * @param texture the texture to expand.
      */
    inline def ExpandRGBDTexture(texture: Texture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExpandRGBDTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
