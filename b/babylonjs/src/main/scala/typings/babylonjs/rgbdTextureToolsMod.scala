package typings.babylonjs

import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/rgbdTextureTools", JSImport.Namespace)
@js.native
object rgbdTextureToolsMod extends js.Object {
  
  @js.native
  class RGBDTextureTools () extends js.Object
  /* static members */
  @js.native
  object RGBDTextureTools extends js.Object {
    
    /**
      * Expand the RGBD Texture from RGBD to Half Float if possible.
      * @param texture the texture to expand.
      */
    def ExpandRGBDTexture(texture: Texture): Unit = js.native
  }
}
