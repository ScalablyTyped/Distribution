package typings.camljs

import typings.camljs.camljsMod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sum extends Aggregation {
  var sum: String
}

object Anon_Sum {
  @scala.inline
  def apply(sum: String): Anon_Sum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Sum]
  }
}

