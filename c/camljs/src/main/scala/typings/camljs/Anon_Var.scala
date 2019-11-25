package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Var extends Aggregation {
  var `var`: String
}

object Anon_Var {
  @scala.inline
  def apply(`var`: String): Anon_Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Var]
  }
}

