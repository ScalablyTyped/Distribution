package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRBackgroundRemoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRBackgroundRemover")
@js.native
class WebXRBackgroundRemover protected ()
  extends typings.babylonjs.BABYLON.WebXRBackgroundRemover {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
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
  @JSGlobal("BABYLON.WebXRBackgroundRemover.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRBackgroundRemover.Version")
  @js.native
  val Version: Double = js.native
}
