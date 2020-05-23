package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveForeignKeyOptions extends js.Object {
  var dropIndex: js.UndefOr[Boolean] = js.undefined
}

object RemoveForeignKeyOptions {
  @scala.inline
  def apply(dropIndex: js.UndefOr[Boolean] = js.undefined): RemoveForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropIndex)) __obj.updateDynamic("dropIndex")(dropIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveForeignKeyOptions]
  }
}

