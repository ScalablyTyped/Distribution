package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stdev extends Aggregation {
  var stdev: String
}

object Anon_Stdev {
  @scala.inline
  def apply(stdev: String): Anon_Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Stdev]
  }
}

