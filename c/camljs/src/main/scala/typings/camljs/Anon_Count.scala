package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends Aggregation {
  var count: String
}

object Anon_Count {
  @scala.inline
  def apply(count: String): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Count]
  }
}

