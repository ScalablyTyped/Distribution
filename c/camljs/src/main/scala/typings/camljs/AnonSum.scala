package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSum extends Aggregation {
  var sum: String
}

object AnonSum {
  @scala.inline
  def apply(sum: String): AnonSum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSum]
  }
}

