package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignKeyRules extends js.Object {
  var onDelete: java.lang.String
  var onUpdate: java.lang.String
}

object ForeignKeyRules {
  @scala.inline
  def apply(onDelete: java.lang.String, onUpdate: java.lang.String): ForeignKeyRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDelete")(onDelete)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[ForeignKeyRules]
  }
}

