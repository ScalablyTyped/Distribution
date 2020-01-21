package typings.camljs

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvg extends Aggregation {
  var avg: String
}

object AnonAvg {
  @scala.inline
  def apply(avg: String): AnonAvg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAvg]
  }
}

