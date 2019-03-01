package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropSequenceOptions extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var ifExists: js.UndefOr[scala.Boolean] = js.undefined
  var restrict: js.UndefOr[scala.Boolean] = js.undefined
}

object DropSequenceOptions {
  @scala.inline
  def apply(
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    ifExists: js.UndefOr[scala.Boolean] = js.undefined,
    restrict: js.UndefOr[scala.Boolean] = js.undefined
  ): DropSequenceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists)
    if (!js.isUndefined(restrict)) __obj.updateDynamic("restrict")(restrict)
    __obj.asInstanceOf[DropSequenceOptions]
  }
}

