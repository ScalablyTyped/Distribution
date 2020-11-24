package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.miscIndexMod.BRDFTextureTools
/* static members */
@JSImport("babylonjs/index", "BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.baseTextureMod.BaseTexture = js.native
  
  var _environmentBRDFBase64Texture: js.Any = js.native
  
  /**
    * Prevents texture cache collision
    */
  var _instanceNumber: js.Any = js.native
}
