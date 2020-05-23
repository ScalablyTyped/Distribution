package typings.camljs.anon

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sum extends Aggregation {
  var sum: String
}

object Sum {
  @scala.inline
  def apply(sum: String): Sum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sum]
  }
}

