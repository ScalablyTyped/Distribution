package typings.carbonComponentsReact.dataTableDataTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRow[ID /* <: String */] extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: ID
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
}
object DataTableRow {
  
  @scala.inline
  def apply[ID /* <: String */](id: ID): DataTableRow[ID] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRow[ID]]
  }
  
  @scala.inline
  implicit class DataTableRowMutableBuilder[Self <: DataTableRow[?], ID /* <: String */] (val x: Self & DataTableRow[ID]) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
  }
}
