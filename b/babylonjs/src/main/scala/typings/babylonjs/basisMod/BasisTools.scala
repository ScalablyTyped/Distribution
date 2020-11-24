package typings.babylonjs.basisMod

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/basis", "BasisTools")
@js.native
class BasisTools () extends js.Object
/* static members */
@JSImport("babylonjs/Misc/basis", "BasisTools")
@js.native
object BasisTools extends js.Object {
  
  /**
    * Get the internal format to be passed to texImage2D corresponding to the .basis format value
    * @param basisFormat format chosen from GetSupportedTranscodeFormat
    * @returns internal format corresponding to the Basis format
    */
  def GetInternalFormatFromBasisFormat(basisFormat: Double): Double = js.native
  
  /**
    * URL to use when loading the basis transcoder
    */
  var JSModuleURL: String = js.native
  
  /**
    * Loads a texture from the transcode result
    * @param texture texture load to
    * @param transcodeResult the result of transcoding the basis file to load from
    */
  def LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult): Unit = js.native
  
  def TranscodeAsync(data: ArrayBufferView, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = js.native
  /**
    * Transcodes a loaded image file to compressed pixel data
    * @param data image data to transcode
    * @param config configuration options for the transcoding
    * @returns a promise resulting in the transcoded image
    */
  def TranscodeAsync(data: ArrayBuffer, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = js.native
  
  /**
    * URL to use when loading the wasm module for the transcoder
    */
  var WasmModuleURL: String = js.native
  
  var _CreateWorkerAsync: js.Any = js.native
  
  var _IgnoreSupportedFormats: js.Any = js.native
  
  var _Worker: js.Any = js.native
  
  var _WorkerPromise: js.Any = js.native
  
  var _actionId: js.Any = js.native
}
