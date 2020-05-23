package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KhronosTextureContainer2 extends js.Object {
  var _determineTranscodeFormat: js.Any
  def uploadAsync(data: ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit]
}

object KhronosTextureContainer2 {
  @scala.inline
  def apply(
    _determineTranscodeFormat: js.Any,
    uploadAsync: (ArrayBufferView, InternalTexture) => js.Promise[Unit]
  ): KhronosTextureContainer2 = {
    val __obj = js.Dynamic.literal(_determineTranscodeFormat = _determineTranscodeFormat.asInstanceOf[js.Any], uploadAsync = js.Any.fromFunction2(uploadAsync))
    __obj.asInstanceOf[KhronosTextureContainer2]
  }
}

