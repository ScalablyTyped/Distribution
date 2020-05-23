package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvolutionPostProcess extends PostProcess {
  /** Array of 9 values corresponding to the 3x3 kernel to be applied */
  var kernel: js.Array[Double] = js.native
}

