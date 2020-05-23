package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: Double
  var width: Double
}

object Columns {
  @scala.inline
  def apply(columns: Double, width: Double): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

