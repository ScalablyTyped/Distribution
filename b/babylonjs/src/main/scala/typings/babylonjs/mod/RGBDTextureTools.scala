package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RGBDTextureTools")
@js.native
open class RGBDTextureTools ()
  extends typings.babylonjs.legacyMod.RGBDTextureTools
/* static members */
object RGBDTextureTools {
  
  @JSImport("babylonjs", "RGBDTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Encode the texture to RGBD if possible.
    * @param internalTexture the texture to encode
    * @param scene the scene hosting the texture
    * @param outputTextureType type of the texture in which the encoding is performed
    * @returns a promise with the internalTexture having its texture replaced by the result of the processing
    */
  inline def EncodeTextureToRGBD(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeTextureToRGBD")(internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  inline def EncodeTextureToRGBD(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    outputTextureType: Double
  ): js.Promise[typings.babylonjs.internalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeTextureToRGBD")(internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], outputTextureType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.internalTextureMod.InternalTexture]]
  
  /**
    * Expand the RGBD Texture from RGBD to Half Float if possible.
    * @param texture the texture to expand.
    */
  inline def ExpandRGBDTexture(texture: typings.babylonjs.textureMod.Texture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExpandRGBDTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
