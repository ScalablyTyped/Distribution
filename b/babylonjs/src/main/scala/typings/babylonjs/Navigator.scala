package typings.babylonjs

import typings.std.MediaStreamConstraints
import typings.std.NavigatorUserMediaErrorCallback
import typings.std.NavigatorUserMediaSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
  
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  
  def mozGetVRDevices(any: js.Any): js.Any = js.native
  
  def msGetGamepads(): js.Array[Gamepad] = js.native
  
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  
  def webkitGamepads(): js.Array[Gamepad] = js.native
  
  def webkitGetGamepads(): js.Array[Gamepad] = js.native
  
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
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
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = this.set("activeVRDisplays", js.Array(value :_*))
    
    @scala.inline
    def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = this.set("activeVRDisplays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = this.set("getVRDisplays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMozGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = this.set("mozGetUserMedia", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMozGetVRDevices(value: js.Any => js.Any): Self = this.set("mozGetVRDevices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsGetGamepads(value: () => js.Array[Gamepad]): Self = this.set("msGetGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMsGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = this.set("msGetUserMedia", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWebkitGamepads(value: () => js.Array[Gamepad]): Self = this.set("webkitGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebkitGetGamepads(value: () => js.Array[Gamepad]): Self = this.set("webkitGetGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebkitGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = this.set("webkitGetUserMedia", js.Any.fromFunction3(value))
  }
}
