package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rigModesIndexMod {
  
  @JSImport("babylonjs/Cameras/RigModes/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setStereoscopicAnaglyphRigMode(camera: Camera): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStereoscopicAnaglyphRigMode")(camera.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setStereoscopicRigMode(camera: Camera): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStereoscopicRigMode")(camera.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVRRigMode(camera: Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setWebVRRigMode(camera: Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
