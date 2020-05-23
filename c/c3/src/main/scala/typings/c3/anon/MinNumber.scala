package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinNumber extends js.Object {
  var max: Double
  var min: Double
}

object MinNumber {
  @scala.inline
  def apply(max: Double, min: Double): MinNumber = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinNumber]
  }
}

