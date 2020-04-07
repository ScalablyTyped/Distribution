package typings.babylonjs.webXRBackgroundRemoverMod

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/features/WebXRBackgroundRemover", "WebXRBackgroundRemover")
@js.native
class WebXRBackgroundRemover protected () extends WebXRAbstractFeature {
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
  var _setBackgroundState: js.Any = js.native
  /**
    * registered observers will be triggered when the background state changes
    */
  var onBackgroundStateChangedObservable: Observable[Boolean] = js.native
  /**
    * read-only options to be used in this module
    */
  val options: IWebXRBackgroundRemoverOptions = js.native
}

/* static members */
@JSImport("babylonjs/XR/features/WebXRBackgroundRemover", "WebXRBackgroundRemover")
@js.native
object WebXRBackgroundRemover extends js.Object {
  /**
    * The module's name
    */
  val Name: String = js.native
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
}

