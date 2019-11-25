package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends Aggregation {
  var max: String
}

object Anon_Max {
  @scala.inline
  def apply(max: String): Anon_Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Max]
  }
}

