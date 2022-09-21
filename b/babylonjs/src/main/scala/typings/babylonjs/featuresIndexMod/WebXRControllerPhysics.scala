package typings.babylonjs.featuresIndexMod

import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics")
@js.native
open class WebXRControllerPhysics protected ()
  extends typings.babylonjs.webXRControllerPhysicsMod.WebXRControllerPhysics {
  /**
    * Construct a new Controller Physics Feature
    * @param _xrSessionManager the corresponding xr session manager
    * @param _options options to create this feature with
    */
  def this(
    _xrSessionManager: WebXRSessionManager,
    _options: typings.babylonjs.webXRControllerPhysicsMod.IWebXRControllerPhysicsOptions
  ) = this()
}
/* static members */
object WebXRControllerPhysics {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRControllerPhysics.Version")
  @js.native
  val Version: Double = js.native
}
