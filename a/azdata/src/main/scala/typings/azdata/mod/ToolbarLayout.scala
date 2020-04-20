package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarLayout extends js.Object {
  var orientation: Orientation
}

object ToolbarLayout {
  @scala.inline
  def apply(orientation: Orientation): ToolbarLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarLayout]
  }
}

