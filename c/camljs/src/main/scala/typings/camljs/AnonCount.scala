package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends Aggregation {
  var count: String
}

object AnonCount {
  @scala.inline
  def apply(count: String): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

