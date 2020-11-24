package typings.babylonjs.miscIndexMod

import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "RGBDTextureTools")
@js.native
class RGBDTextureTools ()
  extends typings.babylonjs.rgbdTextureToolsMod.RGBDTextureTools
/* static members */
@JSImport("babylonjs/Misc/index", "RGBDTextureTools")
@js.native
object RGBDTextureTools extends js.Object {
  
  /**
    * Expand the RGBD Texture from RGBD to Half Float if possible.
    * @param texture the texture to expand.
    */
  def ExpandRGBDTexture(texture: Texture): Unit = js.native
}
