package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractHighlightsPostProcess extends PostProcess {
  /** @hidden */
  var _exposure: Double = js.native
  /**
    * Post process which has the input texture to be used when performing highlight extraction
    * @hidden
    */
  var _inputPostProcess: Nullable[PostProcess] = js.native
  /**
    * The luminance threshold, pixels below this value will be set to black.
    */
  var threshold: Double = js.native
}

