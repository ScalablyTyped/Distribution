package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropSequenceOptions extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
  var ifExists: js.UndefOr[Boolean] = js.undefined
  var restrict: js.UndefOr[Boolean] = js.undefined
}

object DropSequenceOptions {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    ifExists: js.UndefOr[Boolean] = js.undefined,
    restrict: js.UndefOr[Boolean] = js.undefined
  ): DropSequenceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.asInstanceOf[js.Any])
    if (!js.isUndefined(restrict)) __obj.updateDynamic("restrict")(restrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropSequenceOptions]
  }
}

