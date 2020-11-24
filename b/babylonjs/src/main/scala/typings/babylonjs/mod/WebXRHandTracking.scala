package typings.babylonjs.mod

import typings.babylonjs.webXRHandTrackingMod.IWebXRHandTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRHandTracking")
@js.native
class WebXRHandTracking protected ()
  extends typings.babylonjs.legacyMod.WebXRHandTracking {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHandTrackingOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs", "WebXRHandTracking")
@js.native
object WebXRHandTracking extends js.Object {
  
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
  
  var _idCounter: js.Any = js.native
}
