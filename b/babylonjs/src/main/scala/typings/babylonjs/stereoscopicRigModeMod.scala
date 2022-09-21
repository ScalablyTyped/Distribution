package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoscopicRigModeMod {
  
  @JSImport("babylonjs/Cameras/RigModes/stereoscopicRigMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setStereoscopicRigMode(camera: Camera): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStereoscopicRigMode")(camera.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
