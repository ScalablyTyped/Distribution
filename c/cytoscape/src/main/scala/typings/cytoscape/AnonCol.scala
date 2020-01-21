package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCol extends js.Object {
  var col: Double
  var row: Double
}

object AnonCol {
  @scala.inline
  def apply(col: Double, row: Double): AnonCol = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCol]
  }
}

