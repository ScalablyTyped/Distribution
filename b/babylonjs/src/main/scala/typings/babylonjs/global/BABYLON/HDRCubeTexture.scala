package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HDRCubeTexture")
@js.native
class HDRCubeTexture protected ()
  extends typings.babylonjs.BABYLON.HDRCubeTexture {
  /**
    * Instantiates an HDRTexture from the following parameters.
    *
    * @param url The location of the HDR raw data (Panorama stored in RGBE format)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
    * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * @param prefilterOnLoad Prefilters HDR texture to allow use of this texture as a PBR reflection texture.
    */
  def this(
    url: String,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine,
    size: Double,
    noMipmap: js.UndefOr[Boolean],
    generateHarmonics: js.UndefOr[Boolean],
    gammaSpace: js.UndefOr[Boolean],
    prefilterOnLoad: js.UndefOr[Boolean],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
      ]
  ) = this()
}
/* static members */
object HDRCubeTexture {
  
  @JSGlobal("BABYLON.HDRCubeTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON representation of an HDR Texture in order to create the texture
    * @param parsedTexture Define the JSON representation
    * @param scene Define the scene the texture should be created in
    * @param rootUrl Define the root url in case we need to load relative dependencies
    * @returns the newly created texture after parsing
    */
  @JSGlobal("BABYLON.HDRCubeTexture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typings.babylonjs.BABYLON.HDRCubeTexture] = js.native
  
  @JSGlobal("BABYLON.HDRCubeTexture._facesMapping")
  @js.native
  def _facesMapping: js.Any = js.native
  @scala.inline
  def _facesMapping_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_facesMapping")(x.asInstanceOf[js.Any])
}
