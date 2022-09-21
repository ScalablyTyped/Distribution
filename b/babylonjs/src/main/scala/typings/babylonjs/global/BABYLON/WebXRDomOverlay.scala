package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRDomOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDomOverlay")
@js.native
open class WebXRDomOverlay protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRDomOverlay {
  /**
    * Creates a new instance of the dom-overlay feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRDomOverlayOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRDomOverlay {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRDomOverlay.Name")
  @js.native
  val Name: /* "xr-dom-overlay" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRDomOverlay.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
