package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVar extends Aggregation {
  var `var`: String
}

object AnonVar {
  @scala.inline
  def apply(`var`: String): AnonVar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVar]
  }
}

