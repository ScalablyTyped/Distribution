package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRFeaturePointSystem")
@js.native
class WebXRFeaturePointSystem protected ()
  extends typings.babylonjs.legacyMod.WebXRFeaturePointSystem {
  /**
    * construct the feature point system
    * @param _xrSessionManager an instance of xr Session manager
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
}
/* static members */
@JSImport("babylonjs", "WebXRFeaturePointSystem")
@js.native
object WebXRFeaturePointSystem extends js.Object {
  
  /**
    * The module's name
    */
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
}
