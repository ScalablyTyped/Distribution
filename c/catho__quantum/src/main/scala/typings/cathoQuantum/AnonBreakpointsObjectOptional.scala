package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreakpointsObjectOptional extends js.Object {
  var breakpoints: js.UndefOr[js.Object] = js.undefined
}

object AnonBreakpointsObjectOptional {
  @scala.inline
  def apply(breakpoints: js.Object = null): AnonBreakpointsObjectOptional = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreakpointsObjectOptional]
  }
}

