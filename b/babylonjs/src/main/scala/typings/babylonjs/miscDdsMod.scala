package typings.babylonjs

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscDdsMod {
  
  @JSImport("babylonjs/Misc/dds", "DDSTools")
  @js.native
  open class DDSTools () extends StObject
  /* static members */
  object DDSTools {
    
    @JSImport("babylonjs/Misc/dds", "DDSTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets DDS information from an array buffer
      * @param data defines the array buffer view to read data from
      * @returns the DDS information
      */
    inline def GetDDSInfo(data: js.typedarray.ArrayBufferView): DDSInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDDSInfo")(data.asInstanceOf[js.Any]).asInstanceOf[DDSInfo]
    
    /**
      * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
      */
    @JSImport("babylonjs/Misc/dds", "DDSTools.StoreLODInAlphaChannel")
    @js.native
    def StoreLODInAlphaChannel: Boolean = js.native
    inline def StoreLODInAlphaChannel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoreLODInAlphaChannel")(x.asInstanceOf[js.Any])
    
    /**
      * Uploads DDS Levels to a Babylon Texture
      * @internal
      */
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double,
      currentFace: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double,
      currentFace: Double,
      destTypeMustBeFilterable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Double,
      currentFace: Unit,
      destTypeMustBeFilterable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Unit,
      currentFace: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Unit,
      currentFace: Double,
      destTypeMustBeFilterable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def UploadDDSLevels(
      engine: ThinEngine,
      texture: InternalTexture,
      data: js.typedarray.ArrayBufferView,
      info: DDSInfo,
      loadMipmaps: Boolean,
      faces: Double,
      lodIndex: Unit,
      currentFace: Unit,
      destTypeMustBeFilterable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._ExtractLongWordOrder")
    @js.native
    def _ExtractLongWordOrder: Any = js.native
    inline def _ExtractLongWordOrder_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractLongWordOrder")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetFloatAsHalfFloatRGBAArrayBuffer")
    @js.native
    def _GetFloatAsHalfFloatRGBAArrayBuffer: Any = js.native
    inline def _GetFloatAsHalfFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetFloatAsUIntRGBAArrayBuffer")
    @js.native
    def _GetFloatAsUIntRGBAArrayBuffer: Any = js.native
    inline def _GetFloatAsUIntRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetFloatRGBAArrayBuffer")
    @js.native
    def _GetFloatRGBAArrayBuffer: Any = js.native
    inline def _GetFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatAsFloatRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatAsFloatRGBAArrayBuffer: Any = js.native
    inline def _GetHalfFloatAsFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatAsUIntRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatAsUIntRGBAArrayBuffer: Any = js.native
    inline def _GetHalfFloatAsUIntRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetHalfFloatRGBAArrayBuffer")
    @js.native
    def _GetHalfFloatRGBAArrayBuffer: Any = js.native
    inline def _GetHalfFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetLuminanceArrayBuffer")
    @js.native
    def _GetLuminanceArrayBuffer: Any = js.native
    inline def _GetLuminanceArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetLuminanceArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetRGBAArrayBuffer")
    @js.native
    def _GetRGBAArrayBuffer: Any = js.native
    inline def _GetRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBAArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/dds", "DDSTools._GetRGBArrayBuffer")
    @js.native
    def _GetRGBArrayBuffer: Any = js.native
    inline def _GetRGBArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBArrayBuffer")(x.asInstanceOf[js.Any])
  }
  
  trait DDSInfo extends StObject {
    
    /**
      * The dxgiFormat of the texture
      * @see https://docs.microsoft.com/en-us/windows/desktop/api/dxgiformat/ne-dxgiformat-dxgi_format
      */
    var dxgiFormat: Double
    
    /**
      * Width of the texture
      */
    var height: Double
    
    /**
      * If the texture is a compressed format eg. FOURCC_DXT1
      */
    var isCompressed: Boolean
    
    /**
      * If this is a cube texture
      * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dds-file-layout-for-cubic-environment-maps
      */
    var isCube: Boolean
    
    /**
      * If the textures format is a known fourCC format
      * @see https://www.fourcc.org/
      */
    var isFourCC: Boolean
    
    /**
      * If the texture is a lumincance format
      */
    var isLuminance: Boolean
    
    /**
      * If the texture is an RGB format eg. DXGI_FORMAT_B8G8R8X8_UNORM format
      */
    var isRGB: Boolean
    
    /**
      * Number of Mipmaps for the texture
      * @see https://en.wikipedia.org/wiki/Mipmap
      */
    var mipmapCount: Double
    
    /**
      * Sphericle polynomial created for the dds texture
      */
    var sphericalPolynomial: js.UndefOr[SphericalPolynomial] = js.undefined
    
    /**
      * Texture type eg. Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT
      */
    var textureType: Double
    
    /**
      * Width of the texture
      */
    var width: Double
  }
  object DDSInfo {
    
    inline def apply(
      dxgiFormat: Double,
      height: Double,
      isCompressed: Boolean,
      isCube: Boolean,
      isFourCC: Boolean,
      isLuminance: Boolean,
      isRGB: Boolean,
      mipmapCount: Double,
      textureType: Double,
      width: Double
    ): DDSInfo = {
      val __obj = js.Dynamic.literal(dxgiFormat = dxgiFormat.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any], isCube = isCube.asInstanceOf[js.Any], isFourCC = isFourCC.asInstanceOf[js.Any], isLuminance = isLuminance.asInstanceOf[js.Any], isRGB = isRGB.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], textureType = textureType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DDSInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DDSInfo] (val x: Self) extends AnyVal {
      
      inline def setDxgiFormat(value: Double): Self = StObject.set(x, "dxgiFormat", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
      
      inline def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
      
      inline def setIsFourCC(value: Boolean): Self = StObject.set(x, "isFourCC", value.asInstanceOf[js.Any])
      
      inline def setIsLuminance(value: Boolean): Self = StObject.set(x, "isLuminance", value.asInstanceOf[js.Any])
      
      inline def setIsRGB(value: Boolean): Self = StObject.set(x, "isRGB", value.asInstanceOf[js.Any])
      
      inline def setMipmapCount(value: Double): Self = StObject.set(x, "mipmapCount", value.asInstanceOf[js.Any])
      
      inline def setSphericalPolynomial(value: SphericalPolynomial): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
      
      inline def setSphericalPolynomialUndefined: Self = StObject.set(x, "sphericalPolynomial", js.undefined)
      
      inline def setTextureType(value: Double): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Create a cube texture from prefiltered data (ie. the mipmaps contain ready to use data for PBR reflection)
        * @param rootUrl defines the url where the file to load is located
        * @param scene defines the current scene
        * @param lodScale defines scale to apply to the mip map selection
        * @param lodOffset defines offset to apply to the mip map selection
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials defines wheter or not to create polynomails harmonics for the texture
        * @returns the cube texture as an InternalTexture
        */
      def createPrefilteredCubeTexture(rootUrl: String, scene: Nullable[Scene], lodScale: Double, lodOffset: Double): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Double
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Double,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Double,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Unit,
        format: Unit,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Unit,
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Double
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Double,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Double,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Unit,
        format: Unit,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean
      ): InternalTexture = js.native
      def createPrefilteredCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        lodScale: Double,
        lodOffset: Double,
        onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Unit,
        createPolynomials: Boolean
      ): InternalTexture = js.native
    }
  }
}
