package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTableOptions extends js.Object {
  var ifExists: js.UndefOr[scala.Boolean] = js.undefined
}

object DropTableOptions {
  @scala.inline
  def apply(ifExists: js.UndefOr[scala.Boolean] = js.undefined): DropTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists)
    __obj.asInstanceOf[DropTableOptions]
  }
}

