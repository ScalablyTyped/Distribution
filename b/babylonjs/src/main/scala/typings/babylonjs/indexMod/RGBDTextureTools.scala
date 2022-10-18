package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "RGBDTextureTools")
@js.native
open class RGBDTextureTools ()
  extends typings.babylonjs.miscIndexMod.RGBDTextureTools
/* static members */
object RGBDTextureTools {
  
  @JSImport("babylonjs/index", "RGBDTextureTools")
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
    internalTexture: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene
  ): js.Promise[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeTextureToRGBD")(internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture]]
  inline def EncodeTextureToRGBD(
    internalTexture: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture,
    scene: typings.babylonjs.sceneMod.Scene,
    outputTextureType: Double
  ): js.Promise[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeTextureToRGBD")(internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], outputTextureType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture]]
  
  /**
    * Expand the RGBD Texture from RGBD to Half Float if possible.
    * @param texture the texture to expand.
    */
  inline def ExpandRGBDTexture(texture: typings.babylonjs.materialsTexturesTextureMod.Texture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExpandRGBDTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
