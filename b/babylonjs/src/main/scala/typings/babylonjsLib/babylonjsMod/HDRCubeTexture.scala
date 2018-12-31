package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a texture coming from an HDR input.
  *
  * The only supported format is currently panorama picture stored in RGBE format.
  * Example of such files can be found on HDRLib: http://hdrlib.com/
  */
@JSImport("babylonjs", "HDRCubeTexture")
@js.native
class HDRCubeTexture protected ()
  extends babylonjsLib.BABYLONNs.HDRCubeTexture {
  /**
    * Instantiates an HDRTexture from the following parameters.
    *
    * @param url The location of the HDR raw data (Panorama stored in RGBE format)
    * @param scene The scene the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
    * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * @param reserved Reserved flag for internal use.
    */
  def this(url: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, size: scala.Double, noMipmap: js.UndefOr[scala.Boolean], generateHarmonics: js.UndefOr[scala.Boolean], gammaSpace: js.UndefOr[scala.Boolean], reserved: js.UndefOr[scala.Boolean], onLoad: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ]) = this()
}

/**
  * This represents a texture coming from an HDR input.
  *
  * The only supported format is currently panorama picture stored in RGBE format.
  * Example of such files can be found on HDRLib: http://hdrlib.com/
  */
@JSImport("babylonjs", "HDRCubeTexture")
@js.native
object HDRCubeTexture extends js.Object {
  var _facesMapping: js.Any = js.native
  /**
    * Parses a JSON representation of an HDR Texture in order to create the texture
    * @param parsedTexture Define the JSON representation
    * @param scene Define the scene the texture should be created in
    * @param rootUrl Define the root url in case we need to load relative dependencies
    * @returns the newly created texture after parsing
    */
  def Parse(parsedTexture: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.HDRCubeTexture] = js.native
}

