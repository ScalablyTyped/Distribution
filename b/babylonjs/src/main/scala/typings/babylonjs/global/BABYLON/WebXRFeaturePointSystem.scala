package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRFeaturePointSystem")
@js.native
class WebXRFeaturePointSystem protected ()
  extends typings.babylonjs.BABYLON.WebXRFeaturePointSystem {
  /**
    * construct the feature point system
    * @param _xrSessionManager an instance of xr Session manager
    */
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
}
/* static members */
@JSGlobal("BABYLON.WebXRFeaturePointSystem")
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
