package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRHandTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRHandTracking")
@js.native
class WebXRHandTracking protected ()
  extends typings.babylonjs.BABYLON.WebXRHandTracking {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHandTrackingOptions
  ) = this()
}
/* static members */
object WebXRHandTracking {
  
  @JSGlobal("BABYLON.WebXRHandTracking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRHandTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRHandTracking.Version")
  @js.native
  val Version: Double = js.native
  
  @JSGlobal("BABYLON.WebXRHandTracking._idCounter")
  @js.native
  def _idCounter: js.Any = js.native
  @scala.inline
  def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
}
