package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRControllerMovementOptions
import typings.babylonjs.BABYLON.WebXRControllerMovementRegistrationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerMovement")
@js.native
open class WebXRControllerMovement protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRControllerMovement {
  /**
    * constructs a new movement controller system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options configuration object for this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    options: IWebXRControllerMovementOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRControllerMovement {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRControllerMovement.Name")
  @js.native
  val Name: /* "xr-controller-movement" */ String = js.native
  
  /**
    * Standard controller configurations.
    */
  @JSGlobal("BABYLON.WebXRControllerMovement.REGISTRATIONS")
  @js.native
  val REGISTRATIONS: org.scalablytyped.runtime.StringDictionary[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSGlobal("BABYLON.WebXRControllerMovement.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
