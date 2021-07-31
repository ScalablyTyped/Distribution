package typings.carbonComponentsReact.dataTableDataTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomBatchActionsProps extends StObject {
  
  def onCancel(): Unit
  
  var shouldShowBatchActions: js.UndefOr[Boolean] = js.undefined
  
  var totalSelected: Double
}
object DataTableCustomBatchActionsProps {
  
  @scala.inline
  def apply(onCancel: () => Unit, totalSelected: Double): DataTableCustomBatchActionsProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), totalSelected = totalSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCustomBatchActionsProps]
  }
  
  @scala.inline
  implicit class DataTableCustomBatchActionsPropsMutableBuilder[Self <: DataTableCustomBatchActionsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldShowBatchActions(value: Boolean): Self = StObject.set(x, "shouldShowBatchActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldShowBatchActionsUndefined: Self = StObject.set(x, "shouldShowBatchActions", js.undefined)
    
    @scala.inline
    def setTotalSelected(value: Double): Self = StObject.set(x, "totalSelected", value.asInstanceOf[js.Any])
  }
}
