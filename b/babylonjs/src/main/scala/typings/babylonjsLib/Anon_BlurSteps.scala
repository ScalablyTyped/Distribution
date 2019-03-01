package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurSteps extends js.Object {
  var blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess]
  var circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess
}

object Anon_BlurSteps {
  @scala.inline
  def apply(
    blurSteps: js.Array[babylonjsLib.BABYLONNs.PostProcess],
    circleOfConfusion: babylonjsLib.BABYLONNs.PostProcess
  ): Anon_BlurSteps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blurSteps")(blurSteps)
    __obj.updateDynamic("circleOfConfusion")(circleOfConfusion)
    __obj.asInstanceOf[Anon_BlurSteps]
  }
}

