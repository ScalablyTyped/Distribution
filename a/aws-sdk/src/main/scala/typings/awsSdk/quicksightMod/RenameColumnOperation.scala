package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameColumnOperation extends StObject {
  
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
  implicit class RenameColumnOperationMutableBuilder[Self <: RenameColumnOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: ColumnName): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColumnName(value: ColumnName): Self = StObject.set(x, "NewColumnName", value.asInstanceOf[js.Any])
  }
}
