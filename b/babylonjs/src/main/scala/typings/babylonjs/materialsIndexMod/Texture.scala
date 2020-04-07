package typings.babylonjs.materialsIndexMod

import typings.babylonjs.ImageBitmap
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "Texture")
@js.native
class Texture protected ()
  extends typings.babylonjs.texturesIndexMod.Texture {
  /**
    * Instantiates a new texture.
    * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
    * @see http://doc.babylonjs.com/babylon101/materials#texture
    * @param url defines the url of the picture to load as a texture
    * @param scene defines the scene or engine the texture will belong to
    * @param noMipmap defines if the texture will require mip maps or not
    * @param invertY defines if the texture needs to be inverted on the y axis during loading
    * @param samplingMode defines the sampling mode we want for the texture while fectching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad defines a callback triggered when the texture has been loaded
    * @param onError defines a callback triggered when an error occurred during the loading session
    * @param buffer defines the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param deleteBuffer defines if the buffer we are loading the texture from should be deleted after load
    * @param format defines the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @param mimeType defines an optional mime type information
    */
  def this(
    url: Nullable[String],
    sceneOrEngine: Nullable[Scene | ThinEngine],
    noMipmap: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
      ],
    buffer: js.UndefOr[
        Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap]
      ],
    deleteBuffer: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    mimeType: js.UndefOr[String]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "Texture")
@js.native
object Texture extends js.Object {
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val BILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val CLAMP_ADDRESSMODE: Double = js.native
  /** Cubic coordinates mode */
  val CUBIC_MODE: Double = js.native
  /** Equirectangular coordinates mode */
  val EQUIRECTANGULAR_MODE: Double = js.native
  /** Explicit coordinates mode */
  val EXPLICIT_MODE: Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  /** Inverse Cubic coordinates mode */
  val INVCUBIC_MODE: Double = js.native
  /** mag = linear and min = linear and mip = none */
  val LINEAR_LINEAR: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val LINEAR_LINEAR_MIPLINEAR: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val LINEAR_LINEAR_MIPNEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val LINEAR_NEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val LINEAR_NEAREST_MIPLINEAR: Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val LINEAR_NEAREST_MIPNEAREST: Double = js.native
  /** Texture is repeating and mirrored */
  val MIRROR_ADDRESSMODE: Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val NEAREST_LINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val NEAREST_LINEAR_MIPLINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val NEAREST_LINEAR_MIPNEAREST: Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val NEAREST_NEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val NEAREST_NEAREST_MIPLINEAR: Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val NEAREST_NEAREST_MIPNEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val NEAREST_SAMPLINGMODE: Double = js.native
  /** Planar coordinates mode */
  val PLANAR_MODE: Double = js.native
  /** Projection coordinates mode */
  val PROJECTION_MODE: Double = js.native
  /** Inverse Cubic coordinates mode */
  val SKYBOX_MODE: Double = js.native
  /** Spherical coordinates mode */
  val SPHERICAL_MODE: Double = js.native
  /**
    * Gets or sets a general boolean used to indicate that textures containing direct data (buffers) must be saved as part of the serialization process
    */
  var SerializeBuffers: Boolean = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TRILINEAR_SAMPLINGMODE: Double = js.native
  /**
    * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
    */
  var UseSerializedUrlIfAny: Boolean = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val WRAP_ADDRESSMODE: Double = js.native
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
    data: String,
    name: String,
    scene: Scene,
    noMipmap: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[Nullable[js.Function0[Unit]]],
    format: js.UndefOr[Double]
  ): typings.babylonjs.textureMod.Texture = js.native
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
    name: String,
    buffer: js.Any,
    scene: Scene,
    deleteBuffer: js.UndefOr[Boolean],
    noMipmap: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    format: js.UndefOr[Double]
  ): typings.babylonjs.textureMod.Texture = js.native
  /**
    * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
    * @param parsedTexture Define the JSON representation of the texture
    * @param scene Define the scene the parsed texture should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed texture if successful
    */
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.baseTextureMod.BaseTexture] = js.native
  /** @hidden */
  def _CreateMirror(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): typings.babylonjs.mirrorTextureMod.MirrorTexture = js.native
  /** @hidden */
  def _CreateRenderTargetTexture(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): typings.babylonjs.renderTargetTextureMod.RenderTargetTexture = js.native
  /** @hidden */
  def _CubeTextureParser(jsonTexture: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
}

