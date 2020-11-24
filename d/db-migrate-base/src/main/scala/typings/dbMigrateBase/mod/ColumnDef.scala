package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDef extends js.Object {
  
   // TODO Figure this out!
  var constraints: String = js.native
  
  var foreignKey: js.UndefOr[js.Any] = js.native
}
object ColumnDef {
  
  @scala.inline
  def apply(constraints: String): ColumnDef = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDef]
  }
  
  @scala.inline
  implicit class ColumnDefOps[Self <: ColumnDef] (val x: Self) extends AnyVal {
    
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
    def setForeignKey(value: js.Any): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
  }
}
