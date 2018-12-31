package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a texture coming from an HDR input.
  *
  * The only supported format is currently panorama picture stored in RGBE format.
  * Example of such files can be found on HDRLib: http://hdrlib.com/
  */
@JSGlobal("BABYLON.HDRCubeTexture")
@js.native
class HDRCubeTexture protected () extends BaseTexture {
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
  def this(url: java.lang.String, scene: Scene, size: scala.Double, noMipmap: js.UndefOr[scala.Boolean], generateHarmonics: js.UndefOr[scala.Boolean], gammaSpace: js.UndefOr[scala.Boolean], reserved: js.UndefOr[scala.Boolean], onLoad: js.UndefOr[Nullable[js.Function0[scala.Unit]]], onError: js.UndefOr[
      Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ]) = this()
  var _boundingBoxSize: js.Any = js.native
  var _generateHarmonics: js.Any = js.native
  var _isBlocking: scala.Boolean = js.native
  var _noMipmap: js.Any = js.native
  var _onError: js.Any = js.native
  var _onLoad: js.Any = js.native
  var _rotationY: scala.Double = js.native
  var _size: js.Any = js.native
  var _textureMatrix: js.Any = js.native
  /**
    * Gets or sets the center of the bounding box associated with the cube texture
    * It must define where the camera used to render the texture was set
    */
  var boundingBoxPosition: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the cube texture
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  var boundingBoxSize: Vector3 = js.native
  /**
    * Occurs when the file is raw .hdr file.
    */
  var loadTexture: js.Any = js.native
  /**
    * Sets texture matrix rotation angle around Y axis in radians.
    */
  /**
    * Gets texture matrix rotation angle around Y axis radians.
    */
  var rotationY: scala.Double = js.native
  /**
    * The texture URL.
    */
  var url: java.lang.String = js.native
  /**
    * Set the texture reflection matrix used to rotate/transform the reflection.
    * @param value Define the reflection matrix to set
    */
  def setReflectionTextureMatrix(value: Matrix): scala.Unit = js.native
}

/**
  * This represents a texture coming from an HDR input.
  *
  * The only supported format is currently panorama picture stored in RGBE format.
  * Example of such files can be found on HDRLib: http://hdrlib.com/
  */
@JSGlobal("BABYLON.HDRCubeTexture")
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

