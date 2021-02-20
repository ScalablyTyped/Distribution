package typings.babylonjs

import typings.std.MediaStreamConstraints
import typings.std.NavigatorUserMediaErrorCallback
import typings.std.NavigatorUserMediaSuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
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
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = StObject.set(x, "activeVRDisplays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = StObject.set(x, "activeVRDisplays", js.Array(value :_*))
    
    @scala.inline
    def setGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = StObject.set(x, "getVRDisplays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMozGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = StObject.set(x, "mozGetUserMedia", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMozGetVRDevices(value: js.Any => js.Any): Self = StObject.set(x, "mozGetVRDevices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsGetGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "msGetGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMsGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = StObject.set(x, "msGetUserMedia", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWebkitGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "webkitGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebkitGetGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "webkitGetGamepads", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebkitGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = StObject.set(x, "webkitGetUserMedia", js.Any.fromFunction3(value))
  }
}
