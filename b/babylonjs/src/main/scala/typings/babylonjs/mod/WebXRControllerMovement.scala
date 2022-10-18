package typings.babylonjs.mod

import typings.babylonjs.xRFeaturesWebXRControllerMovementMod.IWebXRControllerMovementOptions
import typings.babylonjs.xRFeaturesWebXRControllerMovementMod.WebXRControllerMovementRegistrationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRControllerMovement")
@js.native
open class WebXRControllerMovement protected ()
  extends typings.babylonjs.legacyLegacyMod.WebXRControllerMovement {
  /**
    * constructs a new movement controller system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options configuration object for this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    options: IWebXRControllerMovementOptions
  ) = this()
}
/* static members */
object WebXRControllerMovement {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs", "WebXRControllerMovement.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * Standard controller configurations.
    */
  @JSImport("babylonjs", "WebXRControllerMovement.REGISTRATIONS")
  @js.native
  val REGISTRATIONS: org.scalablytyped.runtime.StringDictionary[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs", "WebXRControllerMovement.Version")
  @js.native
  val Version: Double = js.native
}
