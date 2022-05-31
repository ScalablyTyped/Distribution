package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RGBDTextureTools")
@js.native
class RGBDTextureTools ()
  extends typings.babylonjs.legacyMod.RGBDTextureTools
/* static members */
object RGBDTextureTools {
  
  @JSImport("babylonjs", "RGBDTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Expand the RGBD Texture from RGBD to Half Float if possible.
    * @param texture the texture to expand.
    */
  inline def ExpandRGBDTexture(texture: typings.babylonjs.textureMod.Texture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExpandRGBDTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
