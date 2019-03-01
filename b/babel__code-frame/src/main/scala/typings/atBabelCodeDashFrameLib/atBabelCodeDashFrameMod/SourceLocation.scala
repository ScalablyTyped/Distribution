package typings
package atBabelCodeDashFrameLib.atBabelCodeDashFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: js.UndefOr[atBabelCodeDashFrameLib.Anon_Column] = js.undefined
  var start: atBabelCodeDashFrameLib.Anon_Column
}

object SourceLocation {
  @scala.inline
  def apply(start: atBabelCodeDashFrameLib.Anon_Column, end: atBabelCodeDashFrameLib.Anon_Column = null): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start)
    if (end != null) __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[SourceLocation]
  }
}

