package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignKeyRules extends js.Object {
  
  var onDelete: String = js.native
  
  var onUpdate: String = js.native
}
object ForeignKeyRules {
  
  @scala.inline
  def apply(onDelete: String, onUpdate: String): ForeignKeyRules = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeyRules]
  }
  
  @scala.inline
  implicit class ForeignKeyRulesOps[Self <: ForeignKeyRules] (val x: Self) extends AnyVal {
    
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
    def setOnDelete(value: String): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
  }
}
