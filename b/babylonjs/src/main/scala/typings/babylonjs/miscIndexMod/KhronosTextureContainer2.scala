package typings.babylonjs.miscIndexMod

import typings.babylonjs.anon.JsDecoderModule
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "KhronosTextureContainer2")
@js.native
open class KhronosTextureContainer2 protected ()
  extends typings.babylonjs.miscKhronosTextureContainer2Mod.KhronosTextureContainer2 {
  /**
    * Constructor
    * @param engine The engine to use
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  def this(engine: ThinEngine) = this()
  def this(engine: ThinEngine, numWorkers: Double) = this()
}
/* static members */
object KhronosTextureContainer2 {
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default configuration for the KTX2 decoder.
    * The options defined in this way have priority over those passed when creating a KTX2 texture with new Texture(...).
    */
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2.DefaultDecoderOptions")
  @js.native
  def DefaultDecoderOptions: typings.babylonjs.miscKhronosTextureContainer2Mod.DefaultKTX2DecoderOptions = js.native
  inline def DefaultDecoderOptions_=(x: typings.babylonjs.miscKhronosTextureContainer2Mod.DefaultKTX2DecoderOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDecoderOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Default number of workers used to handle data decoding
    */
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2.DefaultNumWorkers")
  @js.native
  def DefaultNumWorkers: Double = js.native
  inline def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2.GetDefaultNumWorkers")
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
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2.URLConfig")
  @js.native
  def URLConfig: JsDecoderModule = js.native
  inline def URLConfig_=(x: JsDecoderModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLConfig")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2._DecoderModulePromise")
  @js.native
  def _DecoderModulePromise: Any = js.native
  inline def _DecoderModulePromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DecoderModulePromise")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2._Initialize")
  @js.native
  def _Initialize: Any = js.native
  inline def _Initialize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Initialize")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer2._WorkerPoolPromise")
  @js.native
  def _WorkerPoolPromise: Any = js.native
  inline def _WorkerPoolPromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPoolPromise")(x.asInstanceOf[js.Any])
}
