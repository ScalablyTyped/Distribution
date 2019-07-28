package typings.dbDashMigrateDashBase.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignKeyRules extends js.Object {
  var onDelete: String
  var onUpdate: String
}

object ForeignKeyRules {
  @scala.inline
  def apply(onDelete: String, onUpdate: String): ForeignKeyRules = {
    val __obj = js.Dynamic.literal(onDelete = onDelete, onUpdate = onUpdate)
  
    __obj.asInstanceOf[ForeignKeyRules]
  }
}

