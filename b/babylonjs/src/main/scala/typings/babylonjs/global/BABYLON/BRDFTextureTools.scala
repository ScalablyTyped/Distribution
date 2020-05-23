package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.BABYLON.BRDFTextureTools

/* static members */
@JSGlobal("BABYLON.BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  var _environmentBRDFBase64Texture: js.Any = js.native
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.BaseTexture = js.native
}

