package typings.babylonjs

import typings.std.MediaStreamConstraints
import typings.std.NavigatorUserMediaErrorCallback
import typings.std.NavigatorUserMediaSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit
  def mozGetVRDevices(any: js.Any): js.Any
  def msGetGamepads(): js.Array[Gamepad]
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit
  def webkitGamepads(): js.Array[Gamepad]
  def webkitGetGamepads(): js.Array[Gamepad]
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit
}

object Navigator {
  @scala.inline
  def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: () => js.Promise[js.Array[VRDisplay]],
    mozGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    mozGetVRDevices: js.Any => js.Any,
    msGetGamepads: () => js.Array[Gamepad],
    msGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    webkitGamepads: () => js.Array[Gamepad],
    webkitGetGamepads: () => js.Array[Gamepad],
    webkitGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
  ): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays), mozGetUserMedia = js.Any.fromFunction3(mozGetUserMedia), mozGetVRDevices = js.Any.fromFunction1(mozGetVRDevices), msGetGamepads = js.Any.fromFunction0(msGetGamepads), msGetUserMedia = js.Any.fromFunction3(msGetUserMedia), webkitGamepads = js.Any.fromFunction0(webkitGamepads), webkitGetGamepads = js.Any.fromFunction0(webkitGetGamepads), webkitGetUserMedia = js.Any.fromFunction3(webkitGetUserMedia))
    __obj.asInstanceOf[Navigator]
  }
}

