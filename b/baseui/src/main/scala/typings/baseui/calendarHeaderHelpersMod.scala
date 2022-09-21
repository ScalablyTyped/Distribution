package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarHeaderHelpersMod {
  
  @JSImport("baseui/datepicker/utils/calendar-header-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterMonthItems(monthItems: js.Array[Option], filterList: js.Array[Double]): js.Array[Option] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMonthItems")(monthItems.asInstanceOf[js.Any], filterList.asInstanceOf[js.Any])).asInstanceOf[js.Array[Option]]
  
  inline def getFilteredMonthItems(hasFilterMonthsListFormatMonthLabel: GetMonthItemsArgs): js.Array[Option] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilteredMonthItems")(hasFilterMonthsListFormatMonthLabel.asInstanceOf[js.Any]).asInstanceOf[js.Array[Option]]
  
  trait GetMonthItemsArgs extends StObject {
    
    var filterMonthsList: js.Array[Double] | Null
    
    def formatMonthLabel(a: Double): String
  }
  object GetMonthItemsArgs {
    
    inline def apply(formatMonthLabel: Double => String): GetMonthItemsArgs = {
      val __obj = js.Dynamic.literal(formatMonthLabel = js.Any.fromFunction1(formatMonthLabel), filterMonthsList = null)
      __obj.asInstanceOf[GetMonthItemsArgs]
    }
    
    extension [Self <: GetMonthItemsArgs](x: Self) {
      
      inline def setFilterMonthsList(value: js.Array[Double]): Self = StObject.set(x, "filterMonthsList", value.asInstanceOf[js.Any])
      
      inline def setFilterMonthsListNull: Self = StObject.set(x, "filterMonthsList", null)
      
      inline def setFilterMonthsListVarargs(value: Double*): Self = StObject.set(x, "filterMonthsList", js.Array(value*))
      
      inline def setFormatMonthLabel(value: Double => String): Self = StObject.set(x, "formatMonthLabel", js.Any.fromFunction1(value))
    }
  }
  
  trait Option extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var label: String
  }
  object Option {
    
    inline def apply(id: String, label: String): Option = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
