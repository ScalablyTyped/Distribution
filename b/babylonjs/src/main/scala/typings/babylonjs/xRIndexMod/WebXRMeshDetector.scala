package typings.babylonjs.xRIndexMod

import typings.babylonjs.webXRMeshDetectorMod.IWebXRMeshDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRMeshDetector")
@js.native
open class WebXRMeshDetector protected ()
  extends typings.babylonjs.featuresIndexMod.WebXRMeshDetector {
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRMeshDetectorOptions
  ) = this()
}
/* static members */
object WebXRMeshDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRMeshDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRMeshDetector.Version")
  @js.native
  val Version: Double = js.native
}
