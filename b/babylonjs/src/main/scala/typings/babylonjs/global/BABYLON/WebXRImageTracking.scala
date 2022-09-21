package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRImageTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRImageTracking")
@js.native
open class WebXRImageTracking protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRImageTracking {
  /**
    * constructs the image tracking feature
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * read-only options to be used in this module
    */
  options: IWebXRImageTrackingOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRImageTracking {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRImageTracking.Name")
  @js.native
  val Name: /* "xr-image-tracking" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRImageTracking.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
