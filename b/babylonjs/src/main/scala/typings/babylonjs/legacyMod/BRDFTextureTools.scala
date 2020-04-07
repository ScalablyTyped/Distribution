package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.indexMod.BRDFTextureTools

/* static members */
@JSImport("babylonjs/Legacy/legacy", "BRDFTextureTools")
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

