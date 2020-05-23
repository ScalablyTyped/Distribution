package typings.camljs.anon

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Var extends Aggregation {
  var `var`: String
}

object Var {
  @scala.inline
  def apply(`var`: String): Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Var]
  }
}

