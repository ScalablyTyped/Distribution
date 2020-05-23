package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharpenPostProcess extends PostProcess {
  /**
    * How much of the original color should be applied. Setting this to 0 will display edge detection. (default: 1)
    */
  var colorAmount: Double = js.native
  /**
    * How much sharpness should be applied (default: 0.3)
    */
  var edgeAmount: Double = js.native
}

