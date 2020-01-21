package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends Aggregation {
  var max: String
}

object AnonMax {
  @scala.inline
  def apply(max: String): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMax]
  }
}

