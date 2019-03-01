package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveForeignKeyOptions extends js.Object {
  var dropIndex: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoveForeignKeyOptions {
  @scala.inline
  def apply(dropIndex: js.UndefOr[scala.Boolean] = js.undefined): RemoveForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropIndex)) __obj.updateDynamic("dropIndex")(dropIndex)
    __obj.asInstanceOf[RemoveForeignKeyOptions]
  }
}

