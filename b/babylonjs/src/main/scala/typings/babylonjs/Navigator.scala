package typings.babylonjs

import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val activeVRDisplays: js.Array[VRDisplay]
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
  
  val gpu: js.UndefOr[GPU] = js.undefined
  
  def mozGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
  
  def mozGetVRDevices(any: Any): Any
  
  def msGetGamepads(): js.Array[Gamepad]
  
  def msGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
  
  def webkitGamepads(): js.Array[Gamepad]
  
  def webkitGetGamepads(): js.Array[Gamepad]
  
  def webkitGetUserMedia(constraints: MediaStreamConstraints, successCallback: Any, errorCallback: Any): Unit
}
object Navigator {
  
  inline def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: () => js.Promise[js.Array[VRDisplay]],
    mozGetUserMedia: (MediaStreamConstraints, Any, Any) => Unit,
    mozGetVRDevices: Any => Any,
    msGetGamepads: () => js.Array[Gamepad],
    msGetUserMedia: (MediaStreamConstraints, Any, Any) => Unit,
    webkitGamepads: () => js.Array[Gamepad],
    webkitGetGamepads: () => js.Array[Gamepad],
    webkitGetUserMedia: (MediaStreamConstraints, Any, Any) => Unit
  ): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays), mozGetUserMedia = js.Any.fromFunction3(mozGetUserMedia), mozGetVRDevices = js.Any.fromFunction1(mozGetVRDevices), msGetGamepads = js.Any.fromFunction0(msGetGamepads), msGetUserMedia = js.Any.fromFunction3(msGetUserMedia), webkitGamepads = js.Any.fromFunction0(webkitGamepads), webkitGetGamepads = js.Any.fromFunction0(webkitGetGamepads), webkitGetUserMedia = js.Any.fromFunction3(webkitGetUserMedia))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = StObject.set(x, "activeVRDisplays", value.asInstanceOf[js.Any])
    
    inline def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = StObject.set(x, "activeVRDisplays", js.Array(value*))
    
    inline def setGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = StObject.set(x, "getVRDisplays", js.Any.fromFunction0(value))
    
    inline def setGpu(value: GPU): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
    
    inline def setGpuUndefined: Self = StObject.set(x, "gpu", js.undefined)
    
    inline def setMozGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Unit): Self = StObject.set(x, "mozGetUserMedia", js.Any.fromFunction3(value))
    
    inline def setMozGetVRDevices(value: Any => Any): Self = StObject.set(x, "mozGetVRDevices", js.Any.fromFunction1(value))
    
    inline def setMsGetGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "msGetGamepads", js.Any.fromFunction0(value))
    
    inline def setMsGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Unit): Self = StObject.set(x, "msGetUserMedia", js.Any.fromFunction3(value))
    
    inline def setWebkitGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "webkitGamepads", js.Any.fromFunction0(value))
    
    inline def setWebkitGetGamepads(value: () => js.Array[Gamepad]): Self = StObject.set(x, "webkitGetGamepads", js.Any.fromFunction0(value))
    
    inline def setWebkitGetUserMedia(value: (MediaStreamConstraints, Any, Any) => Unit): Self = StObject.set(x, "webkitGetUserMedia", js.Any.fromFunction3(value))
  }
}
