package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRFeaturePointSystem")
@js.native
open class WebXRFeaturePointSystem protected ()
  extends typings.babylonjs.indexMod.WebXRFeaturePointSystem {
  /**
    * construct the feature point system
    * @param _xrSessionManager an instance of xr Session manager
    */
  def this(_xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
}
/* static members */
object WebXRFeaturePointSystem {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRFeaturePointSystem.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRFeaturePointSystem.Version")
  @js.native
  val Version: Double = js.native
}
