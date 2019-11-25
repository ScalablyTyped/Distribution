package typings.atBabelCodeDashFrame.atBabelCodeDashFrameMod

import typings.atBabelCodeDashFrame.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: js.UndefOr[Anon_Column] = js.undefined
  var start: Anon_Column
}

object SourceLocation {
  @scala.inline
  def apply(start: Anon_Column, end: Anon_Column = null): SourceLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

