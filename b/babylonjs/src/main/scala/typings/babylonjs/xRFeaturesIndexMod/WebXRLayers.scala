package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.xRFeaturesWebXRLayersMod.IWebXRLayersOptions
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRLayers")
@js.native
open class WebXRLayers protected ()
  extends typings.babylonjs.xRFeaturesWebXRLayersMod.WebXRLayers {
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRLayersOptions) = this()
}
/* static members */
object WebXRLayers {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRLayers.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRLayers.Version")
  @js.native
  val Version: Double = js.native
}
