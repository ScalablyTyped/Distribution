package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): stdLib.Promise[js.Array[VRDisplay]]
  def mozGetUserMedia(
    constraints: stdLib.MediaStreamConstraints,
    successCallback: stdLib.NavigatorUserMediaSuccessCallback,
    errorCallback: stdLib.NavigatorUserMediaErrorCallback
  ): scala.Unit
  def mozGetVRDevices(any: js.Any): js.Any
  def msGetGamepads(): js.Array[Gamepad]
  def msGetUserMedia(
    constraints: stdLib.MediaStreamConstraints,
    successCallback: stdLib.NavigatorUserMediaSuccessCallback,
    errorCallback: stdLib.NavigatorUserMediaErrorCallback
  ): scala.Unit
  def webkitGamepads(): js.Array[Gamepad]
  def webkitGetGamepads(): js.Array[Gamepad]
  def webkitGetUserMedia(
    constraints: stdLib.MediaStreamConstraints,
    successCallback: stdLib.NavigatorUserMediaSuccessCallback,
    errorCallback: stdLib.NavigatorUserMediaErrorCallback
  ): scala.Unit
}

