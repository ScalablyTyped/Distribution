package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.legacyMod.BRDFTextureTools

/* static members */
@JSImport("babylonjs", "BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  var _environmentBRDFBase64Texture: js.Any = js.native
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.baseTextureMod.BaseTexture = js.native
}

