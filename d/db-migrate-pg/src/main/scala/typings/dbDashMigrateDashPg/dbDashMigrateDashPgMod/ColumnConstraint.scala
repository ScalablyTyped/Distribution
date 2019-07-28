package typings.dbDashMigrateDashPg.dbDashMigrateDashPgMod

import typings.dbDashMigrateDashBase.dbDashMigrateDashBaseMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConstraint extends js.Object {
  var constraints: String
  def foreignKey(callback: CallbackFunction): Unit
}

object ColumnConstraint {
  @scala.inline
  def apply(constraints: String, foreignKey: CallbackFunction => Unit): ColumnConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints, foreignKey = js.Any.fromFunction1(foreignKey))
  
    __obj.asInstanceOf[ColumnConstraint]
  }
}

