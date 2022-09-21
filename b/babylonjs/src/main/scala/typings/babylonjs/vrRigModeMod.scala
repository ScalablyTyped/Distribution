package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrRigModeMod {
  
  @JSImport("babylonjs/Cameras/RigModes/vrRigMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVRRigMode(camera: Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
