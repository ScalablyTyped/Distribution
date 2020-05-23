package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRHitTestLegacy extends WebXRAbstractFeature {
  var _direction: js.Any = js.native
  var _mat: js.Any = js.native
  var _onHitTestResults: js.Any = js.native
  var _onSelect: js.Any = js.native
  var _onSelectEnabled: js.Any = js.native
  var _origin: js.Any = js.native
  /**
    * Populated with the last native XR Hit Results
    */
  var lastNativeXRHitResults: js.Array[XRHitResult] = js.native
  /**
    * Triggered when new babylon (transformed) hit test results are available
    */
  var onHitTestResultObservable: Observable[js.Array[IWebXRHitResult]] = js.native
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRHitTestOptions = js.native
}

