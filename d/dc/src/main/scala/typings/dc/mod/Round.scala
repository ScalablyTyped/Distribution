package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Round extends js.Object {
  def ceil(n: Double): Double
  def floor(n: Double): Double
  def round(n: Double): Double
}

object Round {
  @scala.inline
  def apply(ceil: Double => Double, floor: Double => Double, round: Double => Double): Round = {
    val __obj = js.Dynamic.literal(ceil = js.Any.fromFunction1(ceil), floor = js.Any.fromFunction1(floor), round = js.Any.fromFunction1(round))
    __obj.asInstanceOf[Round]
  }
}

