package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.xRFeaturesWebXRHitTestMod.IWebXRHitTestOptions
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRHitTest")
@js.native
open class WebXRHitTest protected ()
  extends typings.babylonjs.xRFeaturesWebXRHitTestMod.WebXRHitTest {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHitTestOptions
  ) = this()
}
/* static members */
object WebXRHitTest {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRHitTest.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRHitTest.Version")
  @js.native
  val Version: Double = js.native
}
