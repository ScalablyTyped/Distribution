package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Round extends js.Object {
  def ceil(n: scala.Double): scala.Double
  def floor(n: scala.Double): scala.Double
  def round(n: scala.Double): scala.Double
}

object Round {
  @scala.inline
  def apply(
    ceil: js.Function1[scala.Double, scala.Double],
    floor: js.Function1[scala.Double, scala.Double],
    round: js.Function1[scala.Double, scala.Double]
  ): Round = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ceil")(ceil)
    __obj.updateDynamic("floor")(floor)
    __obj.updateDynamic("round")(round)
    __obj.asInstanceOf[Round]
  }
}

