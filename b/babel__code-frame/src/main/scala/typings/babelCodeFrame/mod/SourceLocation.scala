package typings.babelCodeFrame.mod

import typings.babelCodeFrame.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: js.UndefOr[AnonColumn] = js.undefined
  var start: AnonColumn
}

object SourceLocation {
  @scala.inline
  def apply(start: AnonColumn, end: AnonColumn = null): SourceLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

