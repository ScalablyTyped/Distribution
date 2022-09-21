package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRControllerPointerSelectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerPointerSelection")
@js.native
open class WebXRControllerPointerSelection protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRControllerPointerSelection {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRControllerPointerSelectionOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRControllerPointerSelection {
  
  @JSGlobal("BABYLON.WebXRControllerPointerSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRControllerPointerSelection.Name")
  @js.native
  val Name: /* "xr-controller-pointer-selection" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRControllerPointerSelection.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
  
  @JSGlobal("BABYLON.WebXRControllerPointerSelection._IdCounter")
  @js.native
  def _IdCounter: Any = js.native
  inline def _IdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdCounter")(x.asInstanceOf[js.Any])
}
