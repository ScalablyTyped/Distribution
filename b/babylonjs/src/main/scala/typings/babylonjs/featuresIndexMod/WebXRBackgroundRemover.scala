package typings.babylonjs.featuresIndexMod

import typings.babylonjs.webXRBackgroundRemoverMod.IWebXRBackgroundRemoverOptions
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover")
@js.native
open class WebXRBackgroundRemover protected ()
  extends typings.babylonjs.webXRBackgroundRemoverMod.WebXRBackgroundRemover {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * read-only options to be used in this module
    */
  options: IWebXRBackgroundRemoverOptions
  ) = this()
}
/* static members */
object WebXRBackgroundRemover {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover.Version")
  @js.native
  val Version: Double = js.native
}
