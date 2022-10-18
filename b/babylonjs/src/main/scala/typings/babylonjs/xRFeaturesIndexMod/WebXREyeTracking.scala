package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXREyeTracking")
@js.native
open class WebXREyeTracking protected ()
  extends typings.babylonjs.xRFeaturesWebXREyeTrackingMod.WebXREyeTracking {
  /**
    * Creates a new instance of the XR eye tracking feature.
    * @param _xrSessionManager An instance of WebXRSessionManager.
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
}
/* static members */
object WebXREyeTracking {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXREyeTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXREyeTracking.Version")
  @js.native
  val Version: Double = js.native
}
