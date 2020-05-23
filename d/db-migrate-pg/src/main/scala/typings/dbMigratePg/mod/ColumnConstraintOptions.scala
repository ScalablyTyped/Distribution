package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConstraintOptions extends js.Object {
  var emitPrimaryKey: js.UndefOr[Boolean] = js.undefined
}

object ColumnConstraintOptions {
  @scala.inline
  def apply(emitPrimaryKey: js.UndefOr[Boolean] = js.undefined): ColumnConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitPrimaryKey)) __obj.updateDynamic("emitPrimaryKey")(emitPrimaryKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConstraintOptions]
  }
}

