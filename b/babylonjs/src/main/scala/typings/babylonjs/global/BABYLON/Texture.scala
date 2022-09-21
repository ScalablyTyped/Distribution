package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ITextureCreationOptions
import typings.babylonjs.BABYLON.Nullable
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Texture {
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
    sceneOrEngine: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene | typings.babylonjs.BABYLON.ThinEngine]],
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
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object Texture {
  
  @JSGlobal("BABYLON.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Texture.BILINEAR_SAMPLINGMODE")
  @js.native
  val BILINEAR_SAMPLINGMODE: /* 2 */ Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Texture.CLAMP_ADDRESSMODE")
  @js.native
  val CLAMP_ADDRESSMODE: /* 0 */ Double = js.native
  
  /** Cubic coordinates mode */
  @JSGlobal("BABYLON.Texture.CUBIC_MODE")
  @js.native
  val CUBIC_MODE: /* 3 */ Double = js.native
  
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
    scene: typings.babylonjs.BABYLON.Scene,
    noMipmapOrOptions: js.UndefOr[Boolean | ITextureCreationOptions],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[Nullable[js.Function0[Unit]]],
    format: js.UndefOr[Double],
    creationFlags: js.UndefOr[Double]
  ): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromBase64String")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]
  
  /** Equirectangular coordinates mode */
  @JSGlobal("BABYLON.Texture.EQUIRECTANGULAR_MODE")
  @js.native
  val EQUIRECTANGULAR_MODE: /* 7 */ Double = js.native
  
  /** Explicit coordinates mode */
  @JSGlobal("BABYLON.Texture.EXPLICIT_MODE")
  @js.native
  val EXPLICIT_MODE: /* 0 */ Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSGlobal("BABYLON.Texture.FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: /* 9 */ Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSGlobal("BABYLON.Texture.FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val FIXED_EQUIRECTANGULAR_MODE: /* 8 */ Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that texture buffers must be saved as part of the serialization process.
    * If no buffer exists, one will be created as base64 string from the internal webgl data.
    */
  @JSGlobal("BABYLON.Texture.ForceSerializeBuffers")
  @js.native
  def ForceSerializeBuffers: Boolean = js.native
  inline def ForceSerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceSerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Inverse Cubic coordinates mode */
  @JSGlobal("BABYLON.Texture.INVCUBIC_MODE")
  @js.native
  val INVCUBIC_MODE: /* 6 */ Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSGlobal("BABYLON.Texture.LINEAR_LINEAR")
  @js.native
  val LINEAR_LINEAR: /* 2 */ Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Texture.LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val LINEAR_LINEAR_MIPLINEAR: /* 3 */ Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Texture.LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val LINEAR_LINEAR_MIPNEAREST: /* 11 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSGlobal("BABYLON.Texture.LINEAR_NEAREST")
  @js.native
  val LINEAR_NEAREST: /* 12 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Texture.LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val LINEAR_NEAREST_MIPLINEAR: /* 10 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Texture.LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val LINEAR_NEAREST_MIPNEAREST: /* 9 */ Double = js.native
  
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
    scene: typings.babylonjs.BABYLON.Scene,
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
  ): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFromDataString")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], deleteBuffer.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]
  
  /** Texture is repeating and mirrored */
  @JSGlobal("BABYLON.Texture.MIRROR_ADDRESSMODE")
  @js.native
  val MIRROR_ADDRESSMODE: /* 2 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSGlobal("BABYLON.Texture.NEAREST_LINEAR")
  @js.native
  val NEAREST_LINEAR: /* 7 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSGlobal("BABYLON.Texture.NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val NEAREST_LINEAR_MIPLINEAR: /* 6 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Texture.NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val NEAREST_LINEAR_MIPNEAREST: /* 5 */ Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSGlobal("BABYLON.Texture.NEAREST_NEAREST")
  @js.native
  val NEAREST_NEAREST: /* 1 */ Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Texture.NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val NEAREST_NEAREST_MIPLINEAR: /* 8 */ Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Texture.NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val NEAREST_NEAREST_MIPNEAREST: /* 4 */ Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Texture.NEAREST_SAMPLINGMODE")
  @js.native
  val NEAREST_SAMPLINGMODE: /* 1 */ Double = js.native
  
  /**
    * This observable will notify when any texture had a loading error
    */
  @JSGlobal("BABYLON.Texture.OnTextureLoadErrorObservable")
  @js.native
  def OnTextureLoadErrorObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.BaseTexture] = js.native
  inline def OnTextureLoadErrorObservable_=(x: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.BaseTexture]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnTextureLoadErrorObservable")(x.asInstanceOf[js.Any])
  
  /** Planar coordinates mode */
  @JSGlobal("BABYLON.Texture.PLANAR_MODE")
  @js.native
  val PLANAR_MODE: /* 2 */ Double = js.native
  
  /** Projection coordinates mode */
  @JSGlobal("BABYLON.Texture.PROJECTION_MODE")
  @js.native
  val PROJECTION_MODE: /* 4 */ Double = js.native
  
  /**
    * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
    * @param parsedTexture Define the JSON representation of the texture
    * @param scene Define the scene the parsed texture should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed texture if successful
    */
  inline def Parse(parsedTexture: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typings.babylonjs.BABYLON.BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.BaseTexture]]
  
  /** Inverse Cubic coordinates mode */
  @JSGlobal("BABYLON.Texture.SKYBOX_MODE")
  @js.native
  val SKYBOX_MODE: /* 5 */ Double = js.native
  
  /** Spherical coordinates mode */
  @JSGlobal("BABYLON.Texture.SPHERICAL_MODE")
  @js.native
  val SPHERICAL_MODE: /* 1 */ Double = js.native
  
  /**
    * Gets or sets a general boolean used to indicate that textures containing direct data (buffers) must be saved as part of the serialization process
    */
  @JSGlobal("BABYLON.Texture.SerializeBuffers")
  @js.native
  def SerializeBuffers: Boolean = js.native
  inline def SerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeBuffers")(x.asInstanceOf[js.Any])
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Texture.TRILINEAR_SAMPLINGMODE")
  @js.native
  val TRILINEAR_SAMPLINGMODE: /* 3 */ Double = js.native
  
  /**
    * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
    */
  @JSGlobal("BABYLON.Texture.UseSerializedUrlIfAny")
  @js.native
  def UseSerializedUrlIfAny: Boolean = js.native
  inline def UseSerializedUrlIfAny_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseSerializedUrlIfAny")(x.asInstanceOf[js.Any])
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Texture.WRAP_ADDRESSMODE")
  @js.native
  val WRAP_ADDRESSMODE: /* 1 */ Double = js.native
  
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
    scene: typings.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typings.babylonjs.BABYLON.MirrorTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateMirror")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MirrorTexture]
  
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
    scene: typings.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typings.babylonjs.BABYLON.RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.RenderTargetTexture]
  inline def _CreateRenderTargetTexture(
    name: String,
    renderTargetSize: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    creationFlags: Double
  ): typings.babylonjs.BABYLON.RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.RenderTargetTexture]
  
  /**
    * @param jsonTexture
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _CubeTextureParser(jsonTexture: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CubeTextureParser")(jsonTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.CubeTexture]
}
