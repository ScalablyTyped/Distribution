package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyToolsMod {
  
  @JSImport("babylonjs/Misc/copyTools", "CopyTools")
  @js.native
  class CopyTools () extends StObject
  /* static members */
  object CopyTools {
    
    @JSImport("babylonjs/Misc/copyTools", "CopyTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reads the pixels stored in the webgl texture and returns them as a base64 string
      * @param texture defines the texture to read pixels from
      * @param faceIndex defines the face of the texture to read (in case of cube texture)
      * @param level defines the LOD level of the texture to read (in case of Mip Maps)
      * @returns The base64 encoded string or null
      */
    inline def GenerateBase64StringFromTexture(texture: BaseTexture): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
    inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
    inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
    inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Unit, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  }
}
