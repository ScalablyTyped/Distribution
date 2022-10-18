package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasRigModesWebVRRigModeMod {
  
  @JSImport("babylonjs/Cameras/RigModes/webVRRigMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setWebVRRigMode(camera: Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
