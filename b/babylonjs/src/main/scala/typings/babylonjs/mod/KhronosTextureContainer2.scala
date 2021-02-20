package typings.babylonjs.mod

import typings.babylonjs.anon.JsDecoderModule
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "KhronosTextureContainer2")
@js.native
class KhronosTextureContainer2 protected ()
  extends typings.babylonjs.legacyMod.KhronosTextureContainer2 {
  /**
    * Constructor
    * @param engine The engine to use
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine, numWorkers: Double) = this()
}
/* static members */
object KhronosTextureContainer2 {
  
  @JSImport("babylonjs", "KhronosTextureContainer2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default number of workers used to handle data decoding
    */
  @JSImport("babylonjs", "KhronosTextureContainer2.DefaultNumWorkers")
  @js.native
  def DefaultNumWorkers: Double = js.native
  @scala.inline
  def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer2.GetDefaultNumWorkers")
  @js.native
  def GetDefaultNumWorkers: js.Any = js.native
  @scala.inline
  def GetDefaultNumWorkers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
  
  /**
    * Checks if the given data starts with a KTX2 file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX2 file or false otherwise
    */
  @JSImport("babylonjs", "KhronosTextureContainer2.IsValid")
  @js.native
  def IsValid(data: ArrayBufferView): Boolean = js.native
  
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
    *     URLConfig.jsMSCTranscoder
    *     URLConfig.wasmMSCTranscoder
    * You can see their default values in this PG: https://playground.babylonjs.com/#EIJH8L#9
    */
  @JSImport("babylonjs", "KhronosTextureContainer2.URLConfig")
  @js.native
  def URLConfig: JsDecoderModule = js.native
  @scala.inline
  def URLConfig_=(x: JsDecoderModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLConfig")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer2._CreateWorkerPool")
  @js.native
  def _CreateWorkerPool: js.Any = js.native
  @scala.inline
  def _CreateWorkerPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateWorkerPool")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer2._Initialized")
  @js.native
  def _Initialized: js.Any = js.native
  @scala.inline
  def _Initialized_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Initialized")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer2._Ktx2Decoder")
  @js.native
  def _Ktx2Decoder: js.Any = js.native
  @scala.inline
  def _Ktx2Decoder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Ktx2Decoder")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer2._WorkerPoolPromise")
  @js.native
  def _WorkerPoolPromise: js.Any = js.native
  @scala.inline
  def _WorkerPoolPromise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPoolPromise")(x.asInstanceOf[js.Any])
}
