package typings.carbonLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: Double
  var margin: String
  var width: String
}

object AnonColumns {
  @scala.inline
  def apply(columns: Double, margin: String, width: String): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

