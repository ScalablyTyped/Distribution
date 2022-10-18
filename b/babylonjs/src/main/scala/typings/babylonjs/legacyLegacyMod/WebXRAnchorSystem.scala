package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.xRFeaturesWebXRAnchorSystemMod.IWebXRAnchorSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRAnchorSystem")
@js.native
open class WebXRAnchorSystem protected ()
  extends typings.babylonjs.indexMod.WebXRAnchorSystem {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRAnchorSystemOptions
  ) = this()
}
/* static members */
object WebXRAnchorSystem {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRAnchorSystem.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRAnchorSystem.Version")
  @js.native
  val Version: Double = js.native
}
