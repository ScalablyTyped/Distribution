package typings.babylonjs.legacyMod

import typings.babylonjs.webXRHandTrackingMod.IWebXRHandTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRHandTracking")
@js.native
class WebXRHandTracking protected ()
  extends typings.babylonjs.indexMod.WebXRHandTracking {
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
object WebXRHandTracking {
  
  @JSImport("babylonjs/Legacy/legacy", "WebXRHandTracking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRHandTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRHandTracking.Version")
  @js.native
  val Version: Double = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "WebXRHandTracking._idCounter")
  @js.native
  def _idCounter: js.Any = js.native
  inline def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
}
