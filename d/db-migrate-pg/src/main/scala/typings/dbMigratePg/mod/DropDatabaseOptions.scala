package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDatabaseOptions extends js.Object {
  var ifExists: js.UndefOr[Boolean] = js.undefined
}

object DropDatabaseOptions {
  @scala.inline
  def apply(ifExists: js.UndefOr[Boolean] = js.undefined): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDatabaseOptions]
  }
}

