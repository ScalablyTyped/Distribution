package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRLayersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRLayers")
@js.native
open class WebXRLayers protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRLayers {
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager, _options: IWebXRLayersOptions) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRLayers {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRLayers.Name")
  @js.native
  val Name: /* "xr-layers" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRLayers.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
