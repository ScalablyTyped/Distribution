package typings.baseui

import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.baseui.dataTableTypesMod.SharedColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnDatetimeMod {
  
  @JSImport("baseui/data-table/column-datetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): DatetimeColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DatetimeColumn]
  
  type DatetimeColumn = ColumnOptions[js.Date, FilterParameters]
  
  type DatetimeOperations = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DATETIME_OPERATIONS.RANGE_DATETIME */ Any
  
  trait FilterParameters extends StObject {
    
    var description: String
    
    var exclude: Boolean
    
    var operation: DatetimeOperations
    
    var range: js.Array[js.Date]
    
    var selection: js.Array[Double]
  }
  object FilterParameters {
    
    inline def apply(
      description: String,
      exclude: Boolean,
      operation: DatetimeOperations,
      range: js.Array[js.Date],
      selection: js.Array[Double]
    ): FilterParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterParameters]
    }
    
    extension [Self <: FilterParameters](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: DatetimeOperations): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[js.Date]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: js.Date*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setSelection(value: js.Array[Double]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionVarargs(value: Double*): Self = StObject.set(x, "selection", js.Array(value*))
    }
  }
  
  trait Options
    extends StObject
       with SharedColumnOptions[js.Date] {
    
    var formatString: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(mapDataToValue: Any => js.Date, title: String): Options = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormatString(value: String): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
      
      inline def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
}
