package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRDepthSensingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDepthSensing")
@js.native
open class WebXRDepthSensing protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRDepthSensing {
  /**
    * Creates a new instance of the depth sensing feature
    * @param _xrSessionManager the WebXRSessionManager
    * @param options options for WebXR Depth Sensing Feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    options: IWebXRDepthSensingOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRDepthSensing {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRDepthSensing.Name")
  @js.native
  val Name: /* "xr-depth-sensing" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRDepthSensing.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
