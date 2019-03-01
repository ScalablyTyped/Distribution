package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSequenceOptions extends js.Object {
  var temp: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateSequenceOptions {
  @scala.inline
  def apply(temp: js.UndefOr[scala.Boolean] = js.undefined): CreateSequenceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(temp)) __obj.updateDynamic("temp")(temp)
    __obj.asInstanceOf[CreateSequenceOptions]
  }
}

