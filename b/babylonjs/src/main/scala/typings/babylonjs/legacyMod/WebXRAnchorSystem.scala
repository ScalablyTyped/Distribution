package typings.babylonjs.legacyMod

import typings.babylonjs.webXRAnchorSystemMod.IWebXRAnchorSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "WebXRAnchorSystem")
@js.native
class WebXRAnchorSystem protected ()
  extends typings.babylonjs.indexMod.WebXRAnchorSystem {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRAnchorSystemOptions
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXRAnchorSystem")
@js.native
object WebXRAnchorSystem extends js.Object {
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
}

