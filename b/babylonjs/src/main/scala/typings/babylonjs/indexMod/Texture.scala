package typings.babylonjs.indexMod

import typings.babylonjs.textureMod.ITextureCreationOptions
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Texture")
@js.native
open class Texture protected ()
  extends typings.babylonjs.materialsIndexMod.Texture {
  /**
    * Instantiates a new texture.
    * This represents a texture in babylon. It can be easily loaded from a network, base64 or html input.
    * @see https://doc.babylonjs.com/babylon101/materials#texture
    * @param url defines the url of the picture to load as a texture
    * @param sceneOrEngine defines the scene or engine the texture will belong to
    * @param noMipmapOrOptions defines if the texture will require mip maps or not or set of all options to create the texture
    * @param invertY defines if the texture needs to be inverted on the y axis during loading
    * @param samplingMode defines the sampling mode we want for the texture while fetching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad defines a callback triggered when the texture has been loaded
    * @param onError defines a callback triggered when an error occurred during the loading session
    * @param buffer defines the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param deleteBuffer defines if the buffer we are loading the texture from should be deleted after load
    * @param format defines the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @param mimeType defines an optional mime type information
    * @param loaderOptions options to be passed to the loader
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @param forcedExtension defines the extension to use to pick the right loader
    */
  def this(
    url: Nullable[String],
    sceneOrEngine: js.UndefOr[
        Nullable[typings.babylonjs.sceneMod.Scene | typings.babylonjs.thinEngineMod.ThinEngine]
      ],
    noMipmapOrOptions: js.UndefOr[Boolean | ITextureCreationOptions],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
      ],
    buffer: js.UndefOr[
        Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
        ]
      ],
    deleteBuffer: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    mimeType: js.UndefOr[String],
    loaderOptions: js.UndefOr[Any],
    creationFlags: js.UndefOr[Double],
    forcedExtension: js.UndefOr[String]
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("babylonjs/index", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/index", "Texture.BILINEAR_SAMPLINGMODE")
  @js.native
  val BILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSImport("babylonjs/index", "Texture.CLAMP_ADDRESSMODE")
  @js.native
  val CLAMP_ADDRESSMODE: Double = js.native
  
  /** Cubic coordinates mode */
  @JSImport("babylonjs/index", "Texture.CUBIC_MODE")
  @js.native
  val CUBIC_MODE: Double = js.native
  
  /**
    * Creates a texture from its base 64 representation.
    * @param data Define the base64 payload without the data: prefix
    * @param name Define the name of the texture in the scene useful fo caching purpose for instance
    * @param scene Define the scene the texture should belong to
    * @param noMipmapOrOptions defines if the texture will require mip maps or not or set of all options to create the texture
    * @param invertY define if the texture needs to be inverted on the y axis during loading
    * @param samplingMode define the sampling mode we want for the texture while fetching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad define a callback triggered when the texture has been loaded
    * @param onError define a callback triggered when an error occurred during the loading session
    * @param format define the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @returns the created texture
    */
  inline def CreateFromBase64String(
    data: String,
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    noMipmapOrOptions: js.UndefOr[Boolean | ITextureCreationOptions],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[Nullable[js.Function0[Unit]]],
    format: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double]
  ): typings.babylonjs.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromBase64String")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.textureMod.Texture]
  
  /** Equirectangular coordinates mode */
  @JSImport("babylonjs/index", "Texture.EQUIRECTANGULAR_MODE")
  @js.native
  val EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Explicit coordinates mode */
  @JSImport("babylonjs/index", "Texture.EXPLICIT_MODE")
  @js.native
  val EXPLICIT_MODE: Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSImport("babylonjs/index", "Texture.FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSImport("babylonjs/index", "Texture.FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that texture buffers must be saved as part of the serialization process.
    * If no buffer exists, one will be created as base64 string from the internal webgl data.
    */
  @JSImport("babylonjs/index", "Texture.ForceSerializeBuffers")
  @js.native
  def ForceSerializeBuffers: Boolean = js.native
  inline def ForceSerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceSerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Inverse Cubic coordinates mode */
  @JSImport("babylonjs/index", "Texture.INVCUBIC_MODE")
  @js.native
  val INVCUBIC_MODE: Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSImport("babylonjs/index", "Texture.LINEAR_LINEAR")
  @js.native
  val LINEAR_LINEAR: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/index", "Texture.LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val LINEAR_LINEAR_MIPLINEAR: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSImport("babylonjs/index", "Texture.LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val LINEAR_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSImport("babylonjs/index", "Texture.LINEAR_NEAREST")
  @js.native
  val LINEAR_NEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSImport("babylonjs/index", "Texture.LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val LINEAR_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSImport("babylonjs/index", "Texture.LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val LINEAR_NEAREST_MIPNEAREST: Double = js.native
  
  /**
    * Creates a texture from its data: representation. (data: will be added in case only the payload has been passed in)
    * @param name Define the name of the texture in the scene useful fo caching purpose for instance
    * @param buffer define the buffer to load the texture from in case the texture is loaded from a buffer representation
    * @param scene Define the scene the texture should belong to
    * @param deleteBuffer define if the buffer we are loading the texture from should be deleted after load
    * @param noMipmapOrOptions defines if the texture will require mip maps or not or set of all options to create the texture
    * @param invertY define if the texture needs to be inverted on the y axis during loading
    * @param samplingMode define the sampling mode we want for the texture while fetching from it (Texture.NEAREST_SAMPLINGMODE...)
    * @param onLoad define a callback triggered when the texture has been loaded
    * @param onError define a callback triggered when an error occurred during the loading session
    * @param format define the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...)
    * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
    * @returns the created texture
    */
  inline def LoadFromDataString(
    name: String,
    buffer: Any,
    scene: typings.babylonjs.sceneMod.Scene,
    deleteBuffer: js.UndefOr[Boolean],
    noMipmapOrOptions: js.UndefOr[Boolean | ITextureCreationOptions],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
    ],
    format: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double]
  ): typings.babylonjs.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFromDataString")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], deleteBuffer.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.textureMod.Texture]
  
  /** Texture is repeating and mirrored */
  @JSImport("babylonjs/index", "Texture.MIRROR_ADDRESSMODE")
  @js.native
  val MIRROR_ADDRESSMODE: Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSImport("babylonjs/index", "Texture.NEAREST_LINEAR")
  @js.native
  val NEAREST_LINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSImport("babylonjs/index", "Texture.NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val NEAREST_LINEAR_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSImport("babylonjs/index", "Texture.NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val NEAREST_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSImport("babylonjs/index", "Texture.NEAREST_NEAREST")
  @js.native
  val NEAREST_NEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSImport("babylonjs/index", "Texture.NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val NEAREST_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSImport("babylonjs/index", "Texture.NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val NEAREST_NEAREST_MIPNEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSImport("babylonjs/index", "Texture.NEAREST_SAMPLINGMODE")
  @js.native
  val NEAREST_SAMPLINGMODE: Double = js.native
  
  /**
    * This observable will notify when any texture had a loading error
    */
  @JSImport("babylonjs/index", "Texture.OnTextureLoadErrorObservable")
  @js.native
  def OnTextureLoadErrorObservable: typings.babylonjs.observableMod.Observable[typings.babylonjs.baseTextureMod.BaseTexture] = js.native
  inline def OnTextureLoadErrorObservable_=(x: typings.babylonjs.observableMod.Observable[typings.babylonjs.baseTextureMod.BaseTexture]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnTextureLoadErrorObservable")(x.asInstanceOf[js.Any])
  
  /** Planar coordinates mode */
  @JSImport("babylonjs/index", "Texture.PLANAR_MODE")
  @js.native
  val PLANAR_MODE: Double = js.native
  
  /** Projection coordinates mode */
  @JSImport("babylonjs/index", "Texture.PROJECTION_MODE")
  @js.native
  val PROJECTION_MODE: Double = js.native
  
  /**
    * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
    * @param parsedTexture Define the JSON representation of the texture
    * @param scene Define the scene the parsed texture should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed texture if successful
    */
  inline def Parse(parsedTexture: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.baseTextureMod.BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.baseTextureMod.BaseTexture]]
  
  /** Inverse Cubic coordinates mode */
  @JSImport("babylonjs/index", "Texture.SKYBOX_MODE")
  @js.native
  val SKYBOX_MODE: Double = js.native
  
  /** Spherical coordinates mode */
  @JSImport("babylonjs/index", "Texture.SPHERICAL_MODE")
  @js.native
  val SPHERICAL_MODE: Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that textures containing direct data (buffers) must be saved as part of the serialization process
    */
  @JSImport("babylonjs/index", "Texture.SerializeBuffers")
  @js.native
  def SerializeBuffers: Boolean = js.native
  inline def SerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSImport("babylonjs/index", "Texture.TRILINEAR_SAMPLINGMODE")
  @js.native
  val TRILINEAR_SAMPLINGMODE: Double = js.native
  
  /**
    * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
    */
  @JSImport("babylonjs/index", "Texture.UseSerializedUrlIfAny")
  @js.native
  def UseSerializedUrlIfAny: Boolean = js.native
  inline def UseSerializedUrlIfAny_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseSerializedUrlIfAny")(x.asInstanceOf[js.Any])
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSImport("babylonjs/index", "Texture.WRAP_ADDRESSMODE")
  @js.native
  val WRAP_ADDRESSMODE: Double = js.native
  
  /**
    * @param name
    * @param renderTargetSize
    * @param scene
    * @param generateMipMaps
    * @hidden
    */
  inline def _CreateMirror(
    name: String,
    renderTargetSize: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean
  ): typings.babylonjs.mirrorTextureMod.MirrorTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateMirror")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mirrorTextureMod.MirrorTexture]
  
  /**
    * @param name
    * @param renderTargetSize
    * @param scene
    * @param generateMipMaps
    * @param creationFlags
    * @hidden
    */
  inline def _CreateRenderTargetTexture(
    name: String,
    renderTargetSize: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean
  ): typings.babylonjs.renderTargetTextureMod.RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture]
  inline def _CreateRenderTargetTexture(
    name: String,
    renderTargetSize: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    creationFlags: Double
  ): typings.babylonjs.renderTargetTextureMod.RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.renderTargetTextureMod.RenderTargetTexture]
  
  /**
    * @param jsonTexture
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _CubeTextureParser(jsonTexture: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.cubeTextureMod.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CubeTextureParser")(jsonTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.cubeTextureMod.CubeTexture]
}
