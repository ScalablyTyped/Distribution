package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avg extends Aggregation {
  var avg: String
}

object Anon_Avg {
  @scala.inline
  def apply(avg: String): Anon_Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Avg]
  }
}

