package typings.babylonjs.featuresIndexMod

import typings.babylonjs.webXRMeshDetectorMod.IWebXRMeshDetectorOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRMeshDetector")
@js.native
open class WebXRMeshDetector protected ()
  extends typings.babylonjs.webXRMeshDetectorMod.WebXRMeshDetector {
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRMeshDetectorOptions) = this()
}
/* static members */
object WebXRMeshDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRMeshDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRMeshDetector.Version")
  @js.native
  val Version: Double = js.native
}
