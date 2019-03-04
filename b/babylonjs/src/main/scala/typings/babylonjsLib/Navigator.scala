package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
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

object Navigator {
  @scala.inline
  def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: js.Function0[js.Promise[js.Array[VRDisplay]]],
    mozGetUserMedia: js.Function3[
      stdLib.MediaStreamConstraints, 
      stdLib.NavigatorUserMediaSuccessCallback, 
      stdLib.NavigatorUserMediaErrorCallback, 
      scala.Unit
    ],
    mozGetVRDevices: js.Function1[js.Any, js.Any],
    msGetGamepads: js.Function0[js.Array[Gamepad]],
    msGetUserMedia: js.Function3[
      stdLib.MediaStreamConstraints, 
      stdLib.NavigatorUserMediaSuccessCallback, 
      stdLib.NavigatorUserMediaErrorCallback, 
      scala.Unit
    ],
    webkitGamepads: js.Function0[js.Array[Gamepad]],
    webkitGetGamepads: js.Function0[js.Array[Gamepad]],
    webkitGetUserMedia: js.Function3[
      stdLib.MediaStreamConstraints, 
      stdLib.NavigatorUserMediaSuccessCallback, 
      stdLib.NavigatorUserMediaErrorCallback, 
      scala.Unit
    ]
  ): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays, getVRDisplays = getVRDisplays, mozGetUserMedia = mozGetUserMedia, mozGetVRDevices = mozGetVRDevices, msGetGamepads = msGetGamepads, msGetUserMedia = msGetUserMedia, webkitGamepads = webkitGamepads, webkitGetGamepads = webkitGetGamepads, webkitGetUserMedia = webkitGetUserMedia)
  
    __obj.asInstanceOf[Navigator]
  }
}

