package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOperation extends StObject {
  
  /**
    * A transform operation that casts a column to a different type.
    */
  var CastColumnTypeOperation: js.UndefOr[typings.awsSdk.quicksightMod.CastColumnTypeOperation] = js.native
  
  /**
    * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  var CreateColumnsOperation: js.UndefOr[typings.awsSdk.quicksightMod.CreateColumnsOperation] = js.native
  
  /**
    * An operation that filters rows based on some condition.
    */
  var FilterOperation: js.UndefOr[typings.awsSdk.quicksightMod.FilterOperation] = js.native
  
  /**
    * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  var ProjectOperation: js.UndefOr[typings.awsSdk.quicksightMod.ProjectOperation] = js.native
  
  /**
    * An operation that renames a column.
    */
  var RenameColumnOperation: js.UndefOr[typings.awsSdk.quicksightMod.RenameColumnOperation] = js.native
  
  /**
    * An operation that tags a column with additional information.
    */
  var TagColumnOperation: js.UndefOr[typings.awsSdk.quicksightMod.TagColumnOperation] = js.native
}
object TransformOperation {
  
  @scala.inline
  def apply(): TransformOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOperation]
  }
  
  @scala.inline
  implicit class TransformOperationMutableBuilder[Self <: TransformOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCastColumnTypeOperation(value: CastColumnTypeOperation): Self = StObject.set(x, "CastColumnTypeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastColumnTypeOperationUndefined: Self = StObject.set(x, "CastColumnTypeOperation", js.undefined)
    
    @scala.inline
    def setCreateColumnsOperation(value: CreateColumnsOperation): Self = StObject.set(x, "CreateColumnsOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateColumnsOperationUndefined: Self = StObject.set(x, "CreateColumnsOperation", js.undefined)
    
    @scala.inline
    def setFilterOperation(value: FilterOperation): Self = StObject.set(x, "FilterOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperationUndefined: Self = StObject.set(x, "FilterOperation", js.undefined)
    
    @scala.inline
    def setProjectOperation(value: ProjectOperation): Self = StObject.set(x, "ProjectOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectOperationUndefined: Self = StObject.set(x, "ProjectOperation", js.undefined)
    
    @scala.inline
    def setRenameColumnOperation(value: RenameColumnOperation): Self = StObject.set(x, "RenameColumnOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameColumnOperationUndefined: Self = StObject.set(x, "RenameColumnOperation", js.undefined)
    
    @scala.inline
    def setTagColumnOperation(value: TagColumnOperation): Self = StObject.set(x, "TagColumnOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagColumnOperationUndefined: Self = StObject.set(x, "TagColumnOperation", js.undefined)
  }
}
