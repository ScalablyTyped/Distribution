package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.JsDecoderModule
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.KhronosTextureContainer2")
@js.native
class KhronosTextureContainer2 protected ()
  extends typings.babylonjs.BABYLON.KhronosTextureContainer2 {
  /**
    * Constructor
    * @param engine The engine to use
    * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
    */
  def this(engine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(engine: typings.babylonjs.BABYLON.ThinEngine, numWorkers: Double) = this()
}
/* static members */
@JSGlobal("BABYLON.KhronosTextureContainer2")
@js.native
object KhronosTextureContainer2 extends js.Object {
  
  /**
    * Default number of workers used to handle data decoding
    */
  var DefaultNumWorkers: Double = js.native
  
  var GetDefaultNumWorkers: js.Any = js.native
  
  /**
    * Checks if the given data starts with a KTX2 file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX2 file or false otherwise
    */
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
  var URLConfig: JsDecoderModule = js.native
  
  var _CreateWorkerPool: js.Any = js.native
  
  var _Initialized: js.Any = js.native
  
  var _Ktx2Decoder: js.Any = js.native
  
  var _WorkerPoolPromise: js.Any = js.native
}
