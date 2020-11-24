package typings.dbMigratePg.mod

import typings.dbMigrateBase.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnConstraint extends js.Object {
  
  var constraints: String = js.native
  
  def foreignKey(callback: CallbackFunction): Unit = js.native
}
object ColumnConstraint {
  
  @scala.inline
  def apply(constraints: String, foreignKey: CallbackFunction => Unit): ColumnConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], foreignKey = js.Any.fromFunction1(foreignKey))
    __obj.asInstanceOf[ColumnConstraint]
  }
  
  @scala.inline
  implicit class ColumnConstraintOps[Self <: ColumnConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstraints(value: String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKey(value: CallbackFunction => Unit): Self = this.set("foreignKey", js.Any.fromFunction1(value))
  }
}
