package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomBatchActionsProps extends StObject {
  
  def onCancel(): Unit
  
  var shouldShowBatchActions: js.UndefOr[Boolean] = js.undefined
  
  var totalSelected: Double
}
object DataTableCustomBatchActionsProps {
  
  inline def apply(onCancel: () => Unit, totalSelected: Double): DataTableCustomBatchActionsProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), totalSelected = totalSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCustomBatchActionsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCustomBatchActionsProps] (val x: Self) extends AnyVal {
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setShouldShowBatchActions(value: Boolean): Self = StObject.set(x, "shouldShowBatchActions", value.asInstanceOf[js.Any])
    
    inline def setShouldShowBatchActionsUndefined: Self = StObject.set(x, "shouldShowBatchActions", js.undefined)
    
    inline def setTotalSelected(value: Double): Self = StObject.set(x, "totalSelected", value.asInstanceOf[js.Any])
  }
}
