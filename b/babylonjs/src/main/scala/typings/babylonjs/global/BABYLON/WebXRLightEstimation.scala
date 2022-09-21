package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRLightEstimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRLightEstimation")
@js.native
open class WebXRLightEstimation protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRLightEstimation {
  /**
    * Creates a new instance of the light estimation feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRLightEstimationOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRLightEstimation {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRLightEstimation.Name")
  @js.native
  val Name: /* "xr-light-estimation" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRLightEstimation.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
