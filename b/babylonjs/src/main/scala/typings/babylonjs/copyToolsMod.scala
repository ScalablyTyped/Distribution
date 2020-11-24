package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/copyTools", JSImport.Namespace)
@js.native
object copyToolsMod extends js.Object {
  
  @js.native
  class CopyTools () extends js.Object
  /* static members */
  @js.native
  object CopyTools extends js.Object {
    
    /**
      * Reads the pixels stored in the webgl texture and returns them as a base64 string
      * @param texture defines the texture to read pixels from
      * @param faceIndex defines the face of the texture to read (in case of cube texture)
      * @param level defines the LOD level of the texture to read (in case of Mip Maps)
      * @returns The base64 encoded string or null
      */
    def GenerateBase64StringFromTexture(texture: BaseTexture): Nullable[String] = js.native
    def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: js.UndefOr[scala.Nothing], level: Double): Nullable[String] = js.native
    def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double): Nullable[String] = js.native
    def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double, level: Double): Nullable[String] = js.native
  }
}
