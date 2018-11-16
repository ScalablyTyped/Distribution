package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
     * @see http://doc.babylonjs.com/babylon101/materials#texture
     */
@JSGlobal("BABYLON.Texture")
@js.native
class Texture protected () extends BaseTexture {
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
  def this(url: Nullable[java.lang.String], scene: Nullable[Scene], noMipmap: js.UndefOr[scala.Boolean], invertY: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], onLoad: js.UndefOr[Nullable[js.Function0[scala.Unit]]], onError: js.UndefOr[
      Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ], buffer: js.UndefOr[
      Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob]
    ], deleteBuffer: js.UndefOr[scala.Boolean], format: js.UndefOr[scala.Double]) = this()
  /** @hidden */
  var _buffer: Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob] = js.native
  var _cachedCoordinatesMode: js.Any = js.native
  var _cachedProjectionMatrixId: js.Any = js.native
  var _cachedTextureMatrix: js.Any = js.native
  var _cachedUAng: js.Any = js.native
  var _cachedUOffset: js.Any = js.native
  var _cachedUScale: js.Any = js.native
  var _cachedVAng: js.Any = js.native
  var _cachedVOffset: js.Any = js.native
  var _cachedVScale: js.Any = js.native
  var _cachedWAng: js.Any = js.native
  var _delayedOnError: js.Any = js.native
  var _delayedOnLoad: js.Any = js.native
  var _deleteBuffer: js.Any = js.native
  var _format: Nullable[scala.Double] = js.native
  /** @hidden */
  var _invertY: scala.Boolean = js.native
  var _isBlocking: scala.Boolean = js.native
  var _noMipmap: js.Any = js.native
  var _prepareRowForTextureGeneration: js.Any = js.native
  var _projectionModeMatrix: js.Any = js.native
  var _rowGenerationMatrix: js.Any = js.native
  /** @hidden */
  var _samplingMode: scala.Double = js.native
  var _t0: js.Any = js.native
  var _t1: js.Any = js.native
  var _t2: js.Any = js.native
  /**
           * Are mip maps generated for this texture or not.
           */
  val noMipmap: scala.Boolean = js.native
  /**
           * Observable triggered once the texture has been loaded.
           */
  var onLoadObservable: Observable[Texture] = js.native
  /**
           * Get the current sampling mode associated with the texture.
           */
  val samplingMode: scala.Double = js.native
  /**
           * Define an offset on the texture to rotate around the u coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials
           */
  var uAng: scala.Double = js.native
  /**
           * Define an offset on the texture to offset the u coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials#offsetting
           */
  var uOffset: scala.Double = js.native
  /**
           * Defines the center of rotation (U)
           */
  var uRotationCenter: scala.Double = js.native
  /**
           * Define an offset on the texture to scale the u coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials#tiling
           */
  var uScale: scala.Double = js.native
  /**
           * Define the url of the texture.
           */
  var url: Nullable[java.lang.String] = js.native
  /**
           * Define an offset on the texture to rotate around the v coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials
           */
  var vAng: scala.Double = js.native
  /**
           * Define an offset on the texture to offset the v coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials#offsetting
           */
  var vOffset: scala.Double = js.native
  /**
           * Defines the center of rotation (V)
           */
  var vRotationCenter: scala.Double = js.native
  /**
           * Define an offset on the texture to scale the v coordinates of the UVs
           * @see http://doc.babylonjs.com/how_to/more_materials#tiling
           */
  var vScale: scala.Double = js.native
  /**
           * Define an offset on the texture to rotate around the w coordinates of the UVs (in case of 3d texture)
           * @see http://doc.babylonjs.com/how_to/more_materials
           */
  var wAng: scala.Double = js.native
  /**
           * Defines the center of rotation (W)
           */
  var wRotationCenter: scala.Double = js.native
  /**
            * Update the sampling mode of the texture.
           * Default is Trilinear mode.
           *
           * | Value | Type               | Description |
           * | ----- | ------------------ | ----------- |
           * | 1     | NEAREST_SAMPLINGMODE or NEAREST_NEAREST_MIPLINEAR  | Nearest is: mag = nearest, min = nearest, mip = linear |
           * | 2     | BILINEAR_SAMPLINGMODE or LINEAR_LINEAR_MIPNEAREST | Bilinear is: mag = linear, min = linear, mip = nearest |
           * | 3     | TRILINEAR_SAMPLINGMODE or LINEAR_LINEAR_MIPLINEAR | Trilinear is: mag = linear, min = linear, mip = linear |
           * | 4     | NEAREST_NEAREST_MIPNEAREST |             |
           * | 5    | NEAREST_LINEAR_MIPNEAREST |             |
           * | 6    | NEAREST_LINEAR_MIPLINEAR |             |
           * | 7    | NEAREST_LINEAR |             |
           * | 8    | NEAREST_NEAREST |             |
           * | 9   | LINEAR_NEAREST_MIPNEAREST |             |
           * | 10   | LINEAR_NEAREST_MIPLINEAR |             |
           * | 11   | LINEAR_LINEAR |             |
           * | 12   | LINEAR_NEAREST |             |
           *
           *    > _mag_: magnification filter (close to the viewer)
           *    > _min_: minification filter (far from the viewer)
           *    > _mip_: filter used between mip map levels
           *@param samplingMode Define the new sampling mode of the texture
           */
  def updateSamplingMode(samplingMode: scala.Double): scala.Unit = js.native
  /**
           * Update the url (and optional buffer) of this texture if url was null during construction.
           * @param url the url of the texture
           * @param buffer the buffer of the texture (defaults to null)
           */
  def updateURL(url: java.lang.String): scala.Unit = js.native
  /**
           * Update the url (and optional buffer) of this texture if url was null during construction.
           * @param url the url of the texture
           * @param buffer the buffer of the texture (defaults to null)
           */
  def updateURL(
    url: java.lang.String,
    buffer: Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob]
  ): scala.Unit = js.native
}

/**
     * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
     * @see http://doc.babylonjs.com/babylon101/materials#texture
     */
@JSGlobal("BABYLON.Texture")
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

