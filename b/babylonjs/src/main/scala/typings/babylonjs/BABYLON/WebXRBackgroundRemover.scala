package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRBackgroundRemover extends WebXRAbstractFeature {
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

