package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRTeleportationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRMotionControllerTeleportation")
@js.native
open class WebXRMotionControllerTeleportation protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRMotionControllerTeleportation {
  /**
    * constructs a new teleportation system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRTeleportationOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRMotionControllerTeleportation {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRMotionControllerTeleportation.Name")
  @js.native
  val Name: /* "xr-controller-teleportation" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSGlobal("BABYLON.WebXRMotionControllerTeleportation.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
