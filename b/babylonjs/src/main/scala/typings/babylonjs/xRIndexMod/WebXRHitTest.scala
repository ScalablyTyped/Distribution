package typings.babylonjs.xRIndexMod

import typings.babylonjs.xRFeaturesWebXRHitTestMod.IWebXRHitTestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHitTest")
@js.native
open class WebXRHitTest protected ()
  extends typings.babylonjs.xRFeaturesIndexMod.WebXRHitTest {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
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
  @JSImport("babylonjs/XR/index", "WebXRHitTest.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRHitTest.Version")
  @js.native
  val Version: Double = js.native
}
