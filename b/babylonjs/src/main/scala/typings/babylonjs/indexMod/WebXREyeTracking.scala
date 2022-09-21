package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXREyeTracking")
@js.native
open class WebXREyeTracking protected ()
  extends typings.babylonjs.xRIndexMod.WebXREyeTracking {
  /**
    * Creates a new instance of the XR eye tracking feature.
    * @param _xrSessionManager An instance of WebXRSessionManager.
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
}
/* static members */
object WebXREyeTracking {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXREyeTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXREyeTracking.Version")
  @js.native
  val Version: Double = js.native
}
