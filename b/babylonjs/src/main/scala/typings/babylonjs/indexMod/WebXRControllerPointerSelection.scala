package typings.babylonjs.indexMod

import typings.babylonjs.webXRControllerPointerSelectionMod.IWebXRControllerPointerSelectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRControllerPointerSelection")
@js.native
class WebXRControllerPointerSelection protected ()
  extends typings.babylonjs.xRIndexMod.WebXRControllerPointerSelection {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRControllerPointerSelectionOptions
  ) = this()
}
/* static members */
object WebXRControllerPointerSelection {
  
  @JSImport("babylonjs/index", "WebXRControllerPointerSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRControllerPointerSelection.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRControllerPointerSelection.Version")
  @js.native
  val Version: Double = js.native
  
  @JSImport("babylonjs/index", "WebXRControllerPointerSelection._idCounter")
  @js.native
  def _idCounter: js.Any = js.native
  @scala.inline
  def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
}
