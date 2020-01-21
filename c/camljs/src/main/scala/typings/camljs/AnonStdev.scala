package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStdev extends Aggregation {
  var stdev: String
}

object AnonStdev {
  @scala.inline
  def apply(stdev: String): AnonStdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStdev]
  }
}

