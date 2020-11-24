package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.BABYLON.BRDFTextureTools
/* static members */
@JSGlobal("BABYLON.BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.BaseTexture = js.native
  
  var _environmentBRDFBase64Texture: js.Any = js.native
  
  /**
    * Prevents texture cache collision
    */
  var _instanceNumber: js.Any = js.native
}
