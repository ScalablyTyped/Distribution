package typings
package dcLib.dcMod

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
    ceil: scala.Double => scala.Double,
    floor: scala.Double => scala.Double,
    round: scala.Double => scala.Double
  ): Round = {
    val __obj = js.Dynamic.literal(ceil = js.Any.fromFunction1(ceil), floor = js.Any.fromFunction1(floor), round = js.Any.fromFunction1(round))
  
    __obj.asInstanceOf[Round]
  }
}

