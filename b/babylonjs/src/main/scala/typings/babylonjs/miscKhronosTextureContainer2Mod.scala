package typings.babylonjs

import typings.babylonjs.anon.JsDecoderModule
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesKtx2decoderTypesMod.IDecodedData
import typings.babylonjs.materialsTexturesKtx2decoderTypesMod.IKTX2DecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscKhronosTextureContainer2Mod {
  
  @JSImport("babylonjs/Misc/khronosTextureContainer2", "DefaultKTX2DecoderOptions")
  @js.native
  open class DefaultKTX2DecoderOptions () extends StObject {
    
    /* private */ var _bypassTranscoders: Any = js.native
    
    /* private */ var _forceR8: Any = js.native
    
    /* private */ var _forceRG8: Any = js.native
    
    /* private */ var _forceRGBA: Any = js.native
    
    /** @internal */
    def _getKTX2DecoderOptions(): IKTX2DecoderOptions = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /* private */ var _ktx2DecoderOptions: Any = js.native
    
    /* private */ var _useRGBAIfASTCBC7NotAvailableWhenUASTC: Any = js.native
    
    /* private */ var _useRGBAIfOnlyBC1BC3AvailableWhenUASTC: Any = js.native
    
    /**
      * list of transcoders to bypass when looking for a suitable transcoder. The available transcoders are:
      *      UniversalTranscoder_UASTC_ASTC
      *      UniversalTranscoder_UASTC_BC7
      *      UniversalTranscoder_UASTC_RGBA_UNORM
      *      UniversalTranscoder_UASTC_RGBA_SRGB
      *      UniversalTranscoder_UASTC_R8_UNORM
      *      UniversalTranscoder_UASTC_RG8_UNORM
      *      MSCTranscoder
      */
    def bypassTranscoders: js.UndefOr[js.Array[String]] = js.native
    def bypassTranscoders_=(value: js.UndefOr[js.Array[String]]): Unit = js.native
    
    /**
      * force to always use (uncompressed) R8 for transcoded format
      */
    def forceR8: js.UndefOr[Boolean] = js.native
    def forceR8_=(value: js.UndefOr[Boolean]): Unit = js.native
    
    /**
      * force to always use (uncompressed) RG8 for transcoded format
      */
    def forceRG8: js.UndefOr[Boolean] = js.native
    def forceRG8_=(value: js.UndefOr[Boolean]): Unit = js.native
    
    /**
      * force to always use (uncompressed) RGBA for transcoded format
      */
    def forceRGBA: js.UndefOr[Boolean] = js.native
    def forceRGBA_=(value: js.UndefOr[Boolean]): Unit = js.native
    
    /**
      * Gets the dirty flag
      */
    def isDirty: Boolean = js.native
    
    /**
      * force a (uncompressed) RGBA transcoded format if transcoding a UASTC source format and ASTC + BC7 are not available as a compressed transcoded format
      */
    def useRGBAIfASTCBC7NotAvailableWhenUASTC: js.UndefOr[Boolean] = js.native
    def useRGBAIfASTCBC7NotAvailableWhenUASTC_=(value: js.UndefOr[Boolean]): Unit = js.native
    
    /**
      * force a (uncompressed) RGBA transcoded format if transcoding a UASTC source format and only BC1 or BC3 are available as a compressed transcoded format.
      * This property is true by default to favor speed over memory, because currently transcoding from UASTC to BC1/3 is slow because the transcoder transcodes
      * to uncompressed and then recompresses the texture
      */
    def useRGBAIfOnlyBC1BC3AvailableWhenUASTC: js.UndefOr[Boolean] = js.native
    def useRGBAIfOnlyBC1BC3AvailableWhenUASTC_=(value: js.UndefOr[Boolean]): Unit = js.native
  }
  
  @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2")
  @js.native
  open class KhronosTextureContainer2 protected () extends StObject {
    /**
      * Constructor
      * @param engine The engine to use
      * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, numWorkers: Double) = this()
    
    /* protected */ def _createTexture(data: IDecodedData, internalTexture: InternalTexture): Unit = js.native
    /* protected */ def _createTexture(data: IDecodedData, internalTexture: InternalTexture, options: IKTX2DecoderOptions & IDecodedData): Unit = js.native
    
    /* private */ var _engine: Any = js.native
    
    /**
      * @internal
      */
    def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
    def uploadAsync(
      data: js.typedarray.ArrayBufferView,
      internalTexture: InternalTexture,
      options: IKTX2DecoderOptions & IDecodedData
    ): js.Promise[Unit] = js.native
  }
  /* static members */
  object KhronosTextureContainer2 {
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default configuration for the KTX2 decoder.
      * The options defined in this way have priority over those passed when creating a KTX2 texture with new Texture(...).
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.DefaultDecoderOptions")
    @js.native
    def DefaultDecoderOptions: DefaultKTX2DecoderOptions = js.native
    inline def DefaultDecoderOptions_=(x: DefaultKTX2DecoderOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDecoderOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Default number of workers used to handle data decoding
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.DefaultNumWorkers")
    @js.native
    def DefaultNumWorkers: Double = js.native
    inline def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.GetDefaultNumWorkers")
    @js.native
    def GetDefaultNumWorkers: Any = js.native
    inline def GetDefaultNumWorkers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if the given data starts with a KTX2 file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX2 file or false otherwise
      */
    inline def IsValid(data: js.typedarray.ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * URLs to use when loading the KTX2 decoder module as well as its dependencies
      * If a url is null, the default url is used (pointing to https://preview.babylonjs.com)
      * Note that jsDecoderModule can't be null and that the other dependencies will only be loaded if necessary
      * Urls you can change:
      *     URLConfig.jsDecoderModule
      *     URLConfig.wasmUASTCToASTC
      *     URLConfig.wasmUASTCToBC7
      *     URLConfig.wasmUASTCToRGBA_UNORM
      *     URLConfig.wasmUASTCToRGBA_SRGB
      *     URLConfig.wasmUASTCToR8_UNORM
      *     URLConfig.wasmUASTCToRG8_UNORM
      *     URLConfig.jsMSCTranscoder
      *     URLConfig.wasmMSCTranscoder
      *     URLConfig.wasmZSTDDecoder
      * You can see their default values in this PG: https://playground.babylonjs.com/#EIJH8L#29
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.URLConfig")
    @js.native
    def URLConfig: JsDecoderModule = js.native
    inline def URLConfig_=(x: JsDecoderModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._DecoderModulePromise")
    @js.native
    def _DecoderModulePromise: Any = js.native
    inline def _DecoderModulePromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DecoderModulePromise")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._Initialize")
    @js.native
    def _Initialize: Any = js.native
    inline def _Initialize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Initialize")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._WorkerPoolPromise")
    @js.native
    def _WorkerPoolPromise: Any = js.native
    inline def _WorkerPoolPromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPoolPromise")(x.asInstanceOf[js.Any])
  }
}
