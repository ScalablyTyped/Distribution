package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameColumnOperation extends js.Object {
  
  /**
    * The name of the column to be renamed.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  
  /**
    * The new name for the column.
    */
  var NewColumnName: ColumnName = js.native
}
object RenameColumnOperation {
  
  @scala.inline
  def apply(ColumnName: ColumnName, NewColumnName: ColumnName): RenameColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnName = NewColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameColumnOperation]
  }
  
  @scala.inline
  implicit class RenameColumnOperationOps[Self <: RenameColumnOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnName(value: ColumnName): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColumnName(value: ColumnName): Self = this.set("NewColumnName", value.asInstanceOf[js.Any])
  }
}
