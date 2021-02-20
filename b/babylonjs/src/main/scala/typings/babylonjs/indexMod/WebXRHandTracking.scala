package typings.babylonjs.indexMod

import typings.babylonjs.webXRHandTrackingMod.IWebXRHandTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRHandTracking")
@js.native
class WebXRHandTracking protected ()
  extends typings.babylonjs.xRIndexMod.WebXRHandTracking {
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
  
  @JSImport("babylonjs/index", "WebXRHandTracking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRHandTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRHandTracking.Version")
  @js.native
  val Version: Double = js.native
  
  @JSImport("babylonjs/index", "WebXRHandTracking._idCounter")
  @js.native
  def _idCounter: js.Any = js.native
  @scala.inline
  def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
}
