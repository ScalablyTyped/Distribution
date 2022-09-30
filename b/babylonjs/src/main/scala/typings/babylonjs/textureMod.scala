package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.cubeTextureMod.CubeTexture
import typings.babylonjs.iInspectableMod.IInspectable
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mirrorTextureMod.MirrorTexture
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureMod {
  
  @JSImport("babylonjs/Materials/Textures/texture", "Texture")
  @js.native
  open class Texture protected () extends BaseTexture {
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
      sceneOrEngine: js.UndefOr[Nullable[Scene | ThinEngine]],
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
    
    /** @internal */
    var _buffer: Nullable[
        String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
      ] = js.native
    
    /* private */ var _cachedCoordinatesMode: Any = js.native
    
    /* private */ var _cachedHomogeneousRotationInUVTransform: Any = js.native
    
    /* private */ var _cachedProjectionMatrixId: Any = js.native
    
    /* private */ var _cachedTextureMatrix: Any = js.native
    
    /* private */ var _cachedUAng: Any = js.native
    
    /* private */ var _cachedUOffset: Any = js.native
    
    /* private */ var _cachedURotationCenter: Any = js.native
    
    /* private */ var _cachedUScale: Any = js.native
    
    /* private */ var _cachedVAng: Any = js.native
    
    /* private */ var _cachedVOffset: Any = js.native
    
    /* private */ var _cachedVRotationCenter: Any = js.native
    
    /* private */ var _cachedVScale: Any = js.native
    
    /* private */ var _cachedWAng: Any = js.native
    
    /* private */ var _cachedWRotationCenter: Any = js.native
    
    /* private */ var _creationFlags: Any = js.native
    
    /* private */ var _delayedOnError: Any = js.native
    
    /* private */ var _delayedOnLoad: Any = js.native
    
    /* private */ var _deleteBuffer: Any = js.native
    
    /* private */ var _forcedExtension: Any = js.native
    
    /* protected */ var _format: Nullable[Double] = js.native
    
    /** @internal */
    var _invertY: Boolean = js.native
    
    /* protected */ var _isBlocking: Boolean = js.native
    
    /* private */ var _loaderOptions: Any = js.native
    
    /* private */ var _mimeType: Any = js.native
    
    /* private */ var _noMipmap: Any = js.native
    
    /* private */ var _prepareRowForTextureGeneration: Any = js.native
    
    /* private */ var _projectionModeMatrix: Any = js.native
    
    /* private */ var _rowGenerationMatrix: Any = js.native
    
    /* private */ var _t0: Any = js.native
    
    /* private */ var _t1: Any = js.native
    
    /* private */ var _t2: Any = js.native
    
    /* private */ var _useSRGBBuffer: Any = js.native
    
    /**
      * Checks if the texture has the same transform matrix than another texture
      * @param texture texture to check against
      * @returns true if the transforms are the same, else false
      */
    def checkTransformsAreIdentical(texture: Nullable[Texture]): Boolean = js.native
    
    def getTextureMatrix(uBase: Double): Matrix = js.native
    
    /**
      * Sets this property to true to avoid deformations when rotating the texture with non-uniform scaling
      */
    var homogeneousRotationInUVTransform: Boolean = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
      */
    var inspectableCustomProperties: Nullable[js.Array[IInspectable]] = js.native
    
    /**
      * Gets a boolean indicating if the texture needs to be inverted on the y axis during loading
      */
    def invertY: Boolean = js.native
    
    /**
      * Is the texture preventing material to render while loading.
      * If false, a default texture will be used instead of the loading one during the preparation step.
      */
    def isBlocking_=(value: Boolean): Unit = js.native
    
    /** Returns the texture mime type if it was defined by a loader (undefined else) */
    def mimeType: js.UndefOr[String] = js.native
    
    /**
      * Observable triggered once the texture has been loaded.
      */
    var onLoadObservable: Observable[Texture] = js.native
    
    /**
      * Define an offset on the texture to rotate around the u coordinates of the UVs
      * The angle is defined in radians.
      * @see https://doc.babylonjs.com/how_to/more_materials
      */
    var uAng: Double = js.native
    
    /**
      * Define an offset on the texture to offset the u coordinates of the UVs
      * @see https://doc.babylonjs.com/how_to/more_materials#offsetting
      */
    var uOffset: Double = js.native
    
    /**
      * Defines the center of rotation (U)
      */
    var uRotationCenter: Double = js.native
    
    /**
      * Define an offset on the texture to scale the u coordinates of the UVs
      * @see https://doc.babylonjs.com/how_to/more_materials#tiling
      */
    var uScale: Double = js.native
    
    /**
      * Update the url (and optional buffer) of this texture if url was null during construction.
      * @param url the url of the texture
      * @param buffer the buffer of the texture (defaults to null)
      * @param onLoad callback called when the texture is loaded  (defaults to null)
      * @param forcedExtension defines the extension to use to pick the right loader
      */
    def updateURL(url: String): Unit = js.native
    def updateURL(url: String, buffer: Unit, onLoad: js.Function0[Unit]): Unit = js.native
    def updateURL(url: String, buffer: Unit, onLoad: js.Function0[Unit], forcedExtension: String): Unit = js.native
    def updateURL(url: String, buffer: Unit, onLoad: Unit, forcedExtension: String): Unit = js.native
    def updateURL(
      url: String,
      buffer: Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
        ]
    ): Unit = js.native
    def updateURL(
      url: String,
      buffer: Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
        ],
      onLoad: js.Function0[Unit]
    ): Unit = js.native
    def updateURL(
      url: String,
      buffer: Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
        ],
      onLoad: js.Function0[Unit],
      forcedExtension: String
    ): Unit = js.native
    def updateURL(
      url: String,
      buffer: Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
        ],
      onLoad: Unit,
      forcedExtension: String
    ): Unit = js.native
    
    /**
      * Define the url of the texture.
      */
    var url: Nullable[String] = js.native
    
    /**
      * Define an offset on the texture to rotate around the v coordinates of the UVs
      * The angle is defined in radians.
      * @see https://doc.babylonjs.com/how_to/more_materials
      */
    var vAng: Double = js.native
    
    /**
      * Define an offset on the texture to offset the v coordinates of the UVs
      * @see https://doc.babylonjs.com/how_to/more_materials#offsetting
      */
    var vOffset: Double = js.native
    
    /**
      * Defines the center of rotation (V)
      */
    var vRotationCenter: Double = js.native
    
    /**
      * Define an offset on the texture to scale the v coordinates of the UVs
      * @see https://doc.babylonjs.com/how_to/more_materials#tiling
      */
    var vScale: Double = js.native
    
    /**
      * Define an offset on the texture to rotate around the w coordinates of the UVs (in case of 3d texture)
      * The angle is defined in radians.
      * @see https://doc.babylonjs.com/how_to/more_materials
      */
    var wAng: Double = js.native
    
    /**
      * Defines the center of rotation (W)
      */
    var wRotationCenter: Double = js.native
  }
  /* static members */
  object Texture {
    
    @JSImport("babylonjs/Materials/Textures/texture", "Texture")
    @js.native
    val ^ : js.Any = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.BILINEAR_SAMPLINGMODE")
    @js.native
    val BILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is not repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.CLAMP_ADDRESSMODE")
    @js.native
    val CLAMP_ADDRESSMODE: Double = js.native
    
    /** Cubic coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.CUBIC_MODE")
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
      scene: Scene,
      noMipmapOrOptions: js.UndefOr[Boolean | ITextureCreationOptions],
      invertY: js.UndefOr[Boolean],
      samplingMode: js.UndefOr[Double],
      onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
      onError: js.UndefOr[Nullable[js.Function0[Unit]]],
      format: js.UndefOr[Double],
      creationFlags: js.UndefOr[Double]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromBase64String")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[Texture]
    
    /** Equirectangular coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.EQUIRECTANGULAR_MODE")
    @js.native
    val EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Explicit coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.EXPLICIT_MODE")
    @js.native
    val EXPLICIT_MODE: Double = js.native
    
    /** Equirectangular Fixed Mirrored coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
    @js.native
    val FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
    
    /** Equirectangular Fixed coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.FIXED_EQUIRECTANGULAR_MODE")
    @js.native
    val FIXED_EQUIRECTANGULAR_MODE: Double = js.native
    
    /**
      * Gets or sets a general boolean used to indicate that texture buffers must be saved as part of the serialization process.
      * If no buffer exists, one will be created as base64 string from the internal webgl data.
      */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.ForceSerializeBuffers")
    @js.native
    def ForceSerializeBuffers: Boolean = js.native
    inline def ForceSerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForceSerializeBuffers")(x.asInstanceOf[js.Any])
    
    /** Inverse Cubic coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.INVCUBIC_MODE")
    @js.native
    val INVCUBIC_MODE: Double = js.native
    
    /** mag = linear and min = linear and mip = none */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_LINEAR")
    @js.native
    val LINEAR_LINEAR: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_LINEAR_MIPLINEAR")
    @js.native
    val LINEAR_LINEAR_MIPLINEAR: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_LINEAR_MIPNEAREST")
    @js.native
    val LINEAR_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = none */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_NEAREST")
    @js.native
    val LINEAR_NEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_NEAREST_MIPLINEAR")
    @js.native
    val LINEAR_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = linear and min = nearest and mip = nearest */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.LINEAR_NEAREST_MIPNEAREST")
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
      scene: Scene,
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
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFromDataString")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], deleteBuffer.asInstanceOf[js.Any], noMipmapOrOptions.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], format.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[Texture]
    
    /** Texture is repeating and mirrored */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.MIRROR_ADDRESSMODE")
    @js.native
    val MIRROR_ADDRESSMODE: Double = js.native
    
    /** mag = nearest and min = linear and mip = none */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_LINEAR")
    @js.native
    val NEAREST_LINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_LINEAR_MIPLINEAR")
    @js.native
    val NEAREST_LINEAR_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = nearest */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_LINEAR_MIPNEAREST")
    @js.native
    val NEAREST_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = nearest and min = nearest and mip = none */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_NEAREST")
    @js.native
    val NEAREST_NEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_NEAREST_MIPLINEAR")
    @js.native
    val NEAREST_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = nearest and mip = nearest */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_NEAREST_MIPNEAREST")
    @js.native
    val NEAREST_NEAREST_MIPNEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.NEAREST_SAMPLINGMODE")
    @js.native
    val NEAREST_SAMPLINGMODE: Double = js.native
    
    /**
      * This observable will notify when any texture had a loading error
      */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.OnTextureLoadErrorObservable")
    @js.native
    def OnTextureLoadErrorObservable: Observable[BaseTexture] = js.native
    inline def OnTextureLoadErrorObservable_=(x: Observable[BaseTexture]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnTextureLoadErrorObservable")(x.asInstanceOf[js.Any])
    
    /** Planar coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.PLANAR_MODE")
    @js.native
    val PLANAR_MODE: Double = js.native
    
    /** Projection coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.PROJECTION_MODE")
    @js.native
    val PROJECTION_MODE: Double = js.native
    
    /**
      * Parse the JSON representation of a texture in order to recreate the texture in the given scene.
      * @param parsedTexture Define the JSON representation of the texture
      * @param scene Define the scene the parsed texture should be instantiated in
      * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
      * @returns The parsed texture if successful
      */
    inline def Parse(parsedTexture: Any, scene: Scene, rootUrl: String): Nullable[BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[BaseTexture]]
    
    /** Inverse Cubic coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.SKYBOX_MODE")
    @js.native
    val SKYBOX_MODE: Double = js.native
    
    /** Spherical coordinates mode */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.SPHERICAL_MODE")
    @js.native
    val SPHERICAL_MODE: Double = js.native
    
    /**
      * Gets or sets a general boolean used to indicate that textures containing direct data (buffers) must be saved as part of the serialization process
      */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.SerializeBuffers")
    @js.native
    def SerializeBuffers: Boolean = js.native
    inline def SerializeBuffers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeBuffers")(x.asInstanceOf[js.Any])
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.TRILINEAR_SAMPLINGMODE")
    @js.native
    val TRILINEAR_SAMPLINGMODE: Double = js.native
    
    /**
      * Gets or sets a boolean which defines if the texture url must be build from the serialized URL instead of just using the name and loading them side by side with the scene file
      */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.UseSerializedUrlIfAny")
    @js.native
    def UseSerializedUrlIfAny: Boolean = js.native
    inline def UseSerializedUrlIfAny_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseSerializedUrlIfAny")(x.asInstanceOf[js.Any])
    
    /** Texture is repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Materials/Textures/texture", "Texture.WRAP_ADDRESSMODE")
    @js.native
    val WRAP_ADDRESSMODE: Double = js.native
    
    /**
      * @internal
      */
    inline def _CreateMirror(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): MirrorTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateMirror")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[MirrorTexture]
    
    /**
      * @internal
      */
    inline def _CreateRenderTargetTexture(name: String, renderTargetSize: Double, scene: Scene, generateMipMaps: Boolean): RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any])).asInstanceOf[RenderTargetTexture]
    inline def _CreateRenderTargetTexture(
      name: String,
      renderTargetSize: Double,
      scene: Scene,
      generateMipMaps: Boolean,
      creationFlags: Double
    ): RenderTargetTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateRenderTargetTexture")(name.asInstanceOf[js.Any], renderTargetSize.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], generateMipMaps.asInstanceOf[js.Any], creationFlags.asInstanceOf[js.Any])).asInstanceOf[RenderTargetTexture]
    
    /**
      * @internal
      */
    inline def _CubeTextureParser(jsonTexture: Any, scene: Scene, rootUrl: String): CubeTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("_CubeTextureParser")(jsonTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[CubeTexture]
  }
  
  trait ITextureCreationOptions extends StObject {
    
    /** Defines the buffer to load the texture from in case the texture is loaded from a buffer representation (default: null) */
    var buffer: js.UndefOr[
        Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
        ]
      ] = js.undefined
    
    /** Specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg) (default: undefined) */
    var creationFlags: js.UndefOr[Double] = js.undefined
    
    /** Defines if the buffer we are loading the texture from should be deleted after load (default: false) */
    var deleteBuffer: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...) (default: ) */
    var format: js.UndefOr[Double] = js.undefined
    
    /** Defines the underlying texture from an already existing one */
    var internalTexture: js.UndefOr[InternalTexture] = js.undefined
    
    /** Defines if the texture needs to be inverted on the y axis during loading (default: true) */
    var invertY: js.UndefOr[Boolean] = js.undefined
    
    /** Options to be passed to the loader (default: undefined) */
    var loaderOptions: js.UndefOr[Any] = js.undefined
    
    /** Defines an optional mime type information (default: undefined) */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /** Defines if the texture will require mip maps or not (default: false) */
    var noMipmap: js.UndefOr[Boolean] = js.undefined
    
    /** Defines a callback triggered when an error occurred during the loading session (default: null) */
    var onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
      ] = js.undefined
    
    /** Defines a callback triggered when the texture has been loaded (default: null) */
    var onLoad: js.UndefOr[Nullable[js.Function0[Unit]]] = js.undefined
    
    /** Defines the sampling mode we want for the texture while fetching from it (Texture.NEAREST_SAMPLINGMODE...) (default: Texture.TRILINEAR_SAMPLINGMODE) */
    var samplingMode: js.UndefOr[Double] = js.undefined
    
    /** Defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU) (default: false) */
    var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object ITextureCreationOptions {
    
    inline def apply(): ITextureCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextureCreationOptions]
    }
    
    extension [Self <: ITextureCreationOptions](x: Self) {
      
      inline def setBuffer(
        value: Nullable[
              String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
            ]
      ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferNull: Self = StObject.set(x, "buffer", null)
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
      
      inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
      
      inline def setDeleteBuffer(value: Boolean): Self = StObject.set(x, "deleteBuffer", value.asInstanceOf[js.Any])
      
      inline def setDeleteBufferUndefined: Self = StObject.set(x, "deleteBuffer", js.undefined)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInternalTexture(value: InternalTexture): Self = StObject.set(x, "internalTexture", value.asInstanceOf[js.Any])
      
      inline def setInternalTextureUndefined: Self = StObject.set(x, "internalTexture", js.undefined)
      
      inline def setInvertY(value: Boolean): Self = StObject.set(x, "invertY", value.asInstanceOf[js.Any])
      
      inline def setInvertYUndefined: Self = StObject.set(x, "invertY", js.undefined)
      
      inline def setLoaderOptions(value: Any): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
      
      inline def setLoaderOptionsUndefined: Self = StObject.set(x, "loaderOptions", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setNoMipmap(value: Boolean): Self = StObject.set(x, "noMipmap", value.asInstanceOf[js.Any])
      
      inline def setNoMipmapUndefined: Self = StObject.set(x, "noMipmap", js.undefined)
      
      inline def setOnError(value: (/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadNull: Self = StObject.set(x, "onLoad", null)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
      
      inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
      
      inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
      
      inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
    }
  }
}
