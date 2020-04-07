package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.KhronosTextureContainer2")
@js.native
class KhronosTextureContainer2 protected () extends js.Object {
  def this(engine: ThinEngine) = this()
  var _determineTranscodeFormat: js.Any = js.native
  def uploadAsync(data: ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
}

/* static members */
@JSGlobal("BABYLON.KhronosTextureContainer2")
@js.native
object KhronosTextureContainer2 extends js.Object {
  var _ModulePromise: js.Any = js.native
  var _TranscodeFormat: js.Any = js.native
  /**
    * Checks if the given data starts with a KTX2 file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX2 file or false otherwise
    */
  def IsValid(data: ArrayBufferView): Boolean = js.native
}

