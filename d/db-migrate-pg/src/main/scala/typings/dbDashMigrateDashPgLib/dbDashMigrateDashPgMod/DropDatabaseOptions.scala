package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDatabaseOptions extends js.Object {
  var ifExists: js.UndefOr[scala.Boolean] = js.undefined
}

object DropDatabaseOptions {
  @scala.inline
  def apply(ifExists: js.UndefOr[scala.Boolean] = js.undefined): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists)
    __obj.asInstanceOf[DropDatabaseOptions]
  }
}

