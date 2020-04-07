package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/brdfTextureTools", JSImport.Namespace)
@js.native
object brdfTextureToolsMod extends js.Object {
  @js.native
  class BRDFTextureTools () extends js.Object
  
  /* static members */
  @js.native
  object BRDFTextureTools extends js.Object {
    var _environmentBRDFBase64Texture: js.Any = js.native
    /**
      * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
      * @param scene defines the hosting scene
      * @returns the environment BRDF texture
      */
    def GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = js.native
  }
  
}

