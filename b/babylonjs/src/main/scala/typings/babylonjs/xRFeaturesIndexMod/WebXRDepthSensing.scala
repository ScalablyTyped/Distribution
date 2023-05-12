package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.xRFeaturesWebXRDepthSensingMod.IWebXRDepthSensingOptions
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRDepthSensing")
@js.native
open class WebXRDepthSensing protected ()
  extends typings.babylonjs.xRFeaturesWebXRDepthSensingMod.WebXRDepthSensing {
  /**
    * Creates a new instance of the depth sensing feature
    * @param _xrSessionManager the WebXRSessionManager
    * @param options options for WebXR Depth Sensing Feature
    */
  def this(_xrSessionManager: WebXRSessionManager, options: IWebXRDepthSensingOptions) = this()
}
/* static members */
object WebXRDepthSensing {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRDepthSensing.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRDepthSensing.Version")
  @js.native
  val Version: Double = js.native
}
