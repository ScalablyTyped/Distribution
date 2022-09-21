package typings.babylonjs.featuresIndexMod

import typings.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector")
@js.native
open class WebXRPlaneDetector protected ()
  extends typings.babylonjs.webXRPlaneDetectorMod.WebXRPlaneDetector {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions) = this()
}
/* static members */
object WebXRPlaneDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRPlaneDetector.Version")
  @js.native
  val Version: Double = js.native
}
