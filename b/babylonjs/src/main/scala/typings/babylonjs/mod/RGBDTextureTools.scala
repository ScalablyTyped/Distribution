package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RGBDTextureTools")
@js.native
class RGBDTextureTools ()
  extends typings.babylonjs.legacyMod.RGBDTextureTools
/* static members */
@JSImport("babylonjs", "RGBDTextureTools")
@js.native
object RGBDTextureTools extends js.Object {
  
  /**
    * Expand the RGBD Texture from RGBD to Half Float if possible.
    * @param texture the texture to expand.
    */
  def ExpandRGBDTexture(texture: typings.babylonjs.textureMod.Texture): Unit = js.native
}
