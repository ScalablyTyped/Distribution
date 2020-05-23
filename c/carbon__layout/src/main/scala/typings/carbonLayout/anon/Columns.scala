package typings.carbonLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: Double
  var margin: String
  var width: String
}

object Columns {
  @scala.inline
  def apply(columns: Double, margin: String, width: String): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

