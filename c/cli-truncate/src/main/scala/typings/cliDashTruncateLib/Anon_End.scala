package typings
package cliDashTruncateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var position: js.UndefOr[
    cliDashTruncateLib.cliDashTruncateLibStrings.start | cliDashTruncateLib.cliDashTruncateLibStrings.middle | cliDashTruncateLib.cliDashTruncateLibStrings.end
  ] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(
    position: cliDashTruncateLib.cliDashTruncateLibStrings.start | cliDashTruncateLib.cliDashTruncateLibStrings.middle | cliDashTruncateLib.cliDashTruncateLibStrings.end = null
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

