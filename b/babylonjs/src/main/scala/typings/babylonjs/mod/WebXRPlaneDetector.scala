package typings.babylonjs.mod

import typings.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRPlaneDetector")
@js.native
open class WebXRPlaneDetector protected ()
  extends typings.babylonjs.legacyMod.WebXRPlaneDetector {
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
object WebXRPlaneDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs", "WebXRPlaneDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs", "WebXRPlaneDetector.Version")
  @js.native
  val Version: Double = js.native
}
