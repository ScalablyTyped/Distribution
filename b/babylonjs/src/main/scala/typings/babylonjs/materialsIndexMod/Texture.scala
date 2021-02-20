package typings.babylonjs.materialsIndexMod

import typings.babylonjs.ImageBitmap
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "Texture")
@js.native
class Texture protected ()
  extends typings.babylonjs.texturesIndexMod.Texture {
  /**
    * Instantiates a new texture.
    * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
    * @see https://doc.babylonjs.com/babylon101/materials#texture
    * @param url defines the url of the picture to load as a texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param noMipmap defines if the texture will require mip maps or not
    * @param invertY defines if the texture needs to be inverted on the y axis during loading
    * @param samplingMode defines the sampling mode we want for the texture while fectching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad defines a callback triggered when the texture has been loaded
    * @param onError defines a callback triggered when an error occurred during the loading session
    * @param buffer defines the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param deleteBuffer defines if the buffer we are loading the texture from should be deleted after load
    * @param format defines the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @param mimeType defines an optional mime type information
    * @param loaderOptions options to be passed to the loader
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
    mimeType: js.UndefOr[String],
    loaderOptions: js.UndefOr[js.Any]
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("babylonjs/Materials/index", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/Materials/index", "Texture.BILINEAR_SAMPLINGMODE")
  @js.native
  val BILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSImport("babylonjs/Materials/index", "Texture.CLAMP_ADDRESSMODE")
  @js.native
  val CLAMP_ADDRESSMODE: Double = js.native
  
  /** Cubic coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.CUBIC_MODE")
  @js.native
  val CUBIC_MODE: Double = js.native
  
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
  @JSImport("babylonjs/Materials/index", "Texture.CreateFromBase64String")
  @js.native
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
  
  /** Equirectangular coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.EQUIRECTANGULAR_MODE")
  @js.native
  val EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Explicit coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.EXPLICIT_MODE")
  @js.native
  val EXPLICIT_MODE: Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that texture buffers must be saved as part of the serialization process.
    * If no buffer exists, one will be created as base64 string from the internal webgl data.
    */
  @JSImport("babylonjs/Materials/index", "Texture.ForceSerializeBuffers")
  @js.native
  def ForceSerializeBuffers: Boolean = js.native
  @scala.inline
  def ForceSerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceSerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Inverse Cubic coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.INVCUBIC_MODE")
  @js.native
  val INVCUBIC_MODE: Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_LINEAR")
  @js.native
  val LINEAR_LINEAR: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val LINEAR_LINEAR_MIPLINEAR: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val LINEAR_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_NEAREST")
  @js.native
  val LINEAR_NEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val LINEAR_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSImport("babylonjs/Materials/index", "Texture.LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val LINEAR_NEAREST_MIPNEAREST: Double = js.native
  
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
  @JSImport("babylonjs/Materials/index", "Texture.LoadFromDataString")
  @js.native
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
  
  /** Texture is repeating and mirrored */
  @JSImport("babylonjs/Materials/index", "Texture.MIRROR_ADDRESSMODE")
  @js.native
  val MIRROR_ADDRESSMODE: Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_LINEAR")
  @js.native
  val NEAREST_LINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val NEAREST_LINEAR_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val NEAREST_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_NEAREST")
  @js.native
  val NEAREST_NEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val NEAREST_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val NEAREST_NEAREST_MIPNEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.NEAREST_SAMPLINGMODE")
  @js.native
  val NEAREST_SAMPLINGMODE: Double = js.native
  
  /** Planar coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.PLANAR_MODE")
  @js.native
  val PLANAR_MODE: Double = js.native
  
  /** Projection coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.PROJECTION_MODE")
  @js.native
  val PROJECTION_MODE: Double = js.native
  
  /**
    * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
    * @param parsedTexture Define the JSON representation of the texture
    * @param scene Define the scene the parsed texture should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed texture if successful
    */
  @JSImport("babylonjs/Materials/index", "Texture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.baseTextureMod.BaseTexture] = js.native
  
  /** Inverse Cubic coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.SKYBOX_MODE")
  @js.native
  val SKYBOX_MODE: Double = js.native
  
  /** Spherical coordinates mode */
  @JSImport("babylonjs/Materials/index", "Texture.SPHERICAL_MODE")
  @js.native
  val SPHERICAL_MODE: Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that textures containing direct data (buffers) must be saved as part of the serialization process
    */
  @JSImport("babylonjs/Materials/index", "Texture.SerializeBuffers")
  @js.native
  def SerializeBuffers: Boolean = js.native
  @scala.inline
  def SerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/Materials/index", "Texture.TRILINEAR_SAMPLINGMODE")
  @js.native
  val TRILINEAR_SAMPLINGMODE: Double = js.native
  
  /**
    * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
    */
  @JSImport("babylonjs/Materials/index", "Texture.UseSerializedUrlIfAny")
  @js.native
  def UseSerializedUrlIfAny: Boolean = js.native
  @scala.inline
  def UseSerializedUrlIfAny_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseSerializedUrlIfAny")(x.asInstanceOf[js.Any])
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSImport("babylonjs/Materials/index", "Texture.WRAP_ADDRESSMODE")
  @js.native
  val WRAP_ADDRESSMODE: Double = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Materials/index", "Texture._CreateMirror")
  @js.native
  def _CreateMirror(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): typings.babylonjs.mirrorTextureMod.MirrorTexture = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Materials/index", "Texture._CreateRenderTargetTexture")
  @js.native
  def _CreateRenderTargetTexture(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): typings.babylonjs.renderTargetTextureMod.RenderTargetTexture = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Materials/index", "Texture._CubeTextureParser")
  @js.native
  def _CubeTextureParser(jsonTexture: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.cubeTextureMod.CubeTexture = js.native
}
