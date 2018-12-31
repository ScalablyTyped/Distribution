package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
  * @see http://doc.babylonjs.com/babylon101/materials#texture
  */
@JSImport("babylonjs", "Texture")
@js.native
class Texture protected ()
  extends babylonjsLib.BABYLONNs.Texture {
  /**
    * Instantiates a new texture.
    * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
    * @see http://doc.babylonjs.com/babylon101/materials#texture
    * @param url define the url of the picture to load as a texture
    * @param scene define the scene the texture will belong to
    * @param noMipmap define if the texture will require mip maps or not
    * @param invertY define if the texture needs to be inverted on the y axis during loading
    * @param samplingMode define the sampling mode we want for the texture while fectching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad define a callback triggered when the texture has been loaded
    * @param onError define a callback triggered when an error occurred during the loading session
    * @param buffer define the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param deleteBuffer define if the buffer we are loading the texture from should be deleted after load
    * @param format define the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    */
  def this(url: babylonjsLib.BABYLONNs.Nullable[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], noMipmap: js.UndefOr[scala.Boolean], invertY: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], onLoad: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ], buffer: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob]
    ], deleteBuffer: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
}

/**
  * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
  * @see http://doc.babylonjs.com/babylon101/materials#texture
  */
@JSImport("babylonjs", "Texture")
@js.native
object Texture extends js.Object {
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val BILINEAR_SAMPLINGMODE: scala.Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val CLAMP_ADDRESSMODE: scala.Double = js.native
  /** Cubic coordinates mode */
  val CUBIC_MODE: scala.Double = js.native
  /** Equirectangular coordinates mode */
  val EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Explicit coordinates mode */
  val EXPLICIT_MODE: scala.Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: scala.Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val FIXED_EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Inverse Cubic coordinates mode */
  val INVCUBIC_MODE: scala.Double = js.native
  /** mag = linear and min = linear and mip = none */
  val LINEAR_LINEAR: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val LINEAR_LINEAR_MIPLINEAR: scala.Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val LINEAR_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val LINEAR_NEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val LINEAR_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val LINEAR_NEAREST_MIPNEAREST: scala.Double = js.native
  /** Texture is repeating and mirrored */
  val MIRROR_ADDRESSMODE: scala.Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val NEAREST_LINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val NEAREST_LINEAR_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val NEAREST_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val NEAREST_NEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val NEAREST_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val NEAREST_NEAREST_MIPNEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val NEAREST_SAMPLINGMODE: scala.Double = js.native
  /** Planar coordinates mode */
  val PLANAR_MODE: scala.Double = js.native
  /** Projection coordinates mode */
  val PROJECTION_MODE: scala.Double = js.native
  /** Inverse Cubic coordinates mode */
  val SKYBOX_MODE: scala.Double = js.native
  /** Spherical coordinates mode */
  val SPHERICAL_MODE: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TRILINEAR_SAMPLINGMODE: scala.Double = js.native
  /**
    * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
    */
  var UseSerializedUrlIfAny: scala.Boolean = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val WRAP_ADDRESSMODE: scala.Double = js.native
  /**
    * Creates a texture from its base 64 representation.
    * @param data Define the base64 payload without the data: prefix
    * @param name Define the name of the texture in the scene useful fo caching purpose for instance
    * @param scene Define the scene the texture should belong to
    * @param noMipmap Forces the texture to not create mip map information if true
    * @param invertY define if the texture needs to be inverted on the y axis during loading
    * @param samplingMode define the sampling mode we want for the texture while fectching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad define a callback triggered when the texture has been loaded
    * @param onError define a callback triggered when an error occurred during the loading session
    * @param format define the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @returns the created texture
    */
  def CreateFromBase64String(
    data: java.lang.String,
    name: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Scene,
    noMipmap: js.UndefOr[scala.Boolean],
    invertY: js.UndefOr[scala.Boolean],
    samplingMode: js.UndefOr[scala.Double],
    onLoad: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]],
    onError: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]],
    format: js.UndefOr[scala.Double]
  ): babylonjsLib.BABYLONNs.Texture = js.native
  /**
    * Creates a texture from its data: representation. (data: will be added in case only the payload has been passed in)
    * @param data Define the base64 payload without the data: prefix
    * @param name Define the name of the texture in the scene useful fo caching purpose for instance
    * @param buffer define the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param scene Define the scene the texture should belong to
    * @param deleteBuffer define if the buffer we are loading the texture from should be deleted after load
    * @param noMipmap Forces the texture to not create mip map information if true
    * @param invertY define if the texture needs to be inverted on the y axis during loading
    * @param samplingMode define the sampling mode we want for the texture while fectching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad define a callback triggered when the texture has been loaded
    * @param onError define a callback triggered when an error occurred during the loading session
    * @param format define the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @returns the created texture
    */
  def LoadFromDataString(
    name: java.lang.String,
    buffer: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    deleteBuffer: js.UndefOr[scala.Boolean],
    noMipmap: js.UndefOr[scala.Boolean],
    invertY: js.UndefOr[scala.Boolean],
    samplingMode: js.UndefOr[scala.Double],
    onLoad: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]],
    onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ],
    format: js.UndefOr[scala.Double]
  ): babylonjsLib.BABYLONNs.Texture = js.native
  /**
    * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
    * @param parsedTexture Define the JSON representation of the texture
    * @param scene Define the scene the parsed texture should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed texture if successful
    */
  def Parse(parsedTexture: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BaseTexture] = js.native
}

