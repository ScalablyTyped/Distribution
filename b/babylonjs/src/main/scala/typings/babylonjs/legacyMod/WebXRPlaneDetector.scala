package typings.babylonjs.legacyMod

import typings.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRPlaneDetector")
@js.native
class WebXRPlaneDetector protected ()
  extends typings.babylonjs.indexMod.WebXRPlaneDetector {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRPlaneDetectorOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXRPlaneDetector")
@js.native
object WebXRPlaneDetector extends js.Object {
  
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
