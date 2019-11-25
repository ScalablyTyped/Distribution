package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Min extends Aggregation {
  var min: String
}

object Anon_Min {
  @scala.inline
  def apply(min: String): Anon_Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Min]
  }
}

