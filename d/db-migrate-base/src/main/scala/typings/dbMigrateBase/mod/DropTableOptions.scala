package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTableOptions extends js.Object {
  var ifExists: js.UndefOr[Boolean] = js.undefined
}

object DropTableOptions {
  @scala.inline
  def apply(ifExists: js.UndefOr[Boolean] = js.undefined): DropTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTableOptions]
  }
}

