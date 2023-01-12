package typings.baseui

import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.baseui.dataTableTypesMod.RenderCell
import typings.baseui.dataTableTypesMod.RenderFilter
import typings.baseui.dataTableTypesMod.SharedColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnCustomMod {
  
  @JSImport("baseui/data-table/column-custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value, FilterParams](options: Options[Value, FilterParams]): ColumnOptions[Value, FilterParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ColumnOptions[Value, FilterParams]]
  
  trait Options[Value, FilterParams]
    extends StObject
       with SharedColumnOptions[Value] {
    
    var buildFilter: js.UndefOr[js.Function1[/* a */ FilterParams, js.Function1[/* a */ Value, Boolean]]] = js.undefined
    
    var renderCell: RenderCell[Value]
    
    var renderFilter: js.UndefOr[RenderFilter[Value, FilterParams]] = js.undefined
    
    var sortFn: js.UndefOr[js.Function2[/* b */ Value, /* a */ Value, Double]] = js.undefined
    
    var textQueryFilter: js.UndefOr[js.Function2[/* b */ String, /* a */ Value, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply[Value, FilterParams](mapDataToValue: Any => Value, renderCell: RenderCell[Value], title: String): Options[Value, FilterParams] = {
      val __obj = js.Dynamic.literal(mapDataToValue = js.Any.fromFunction1(mapDataToValue), renderCell = renderCell.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[Value, FilterParams]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], Value, FilterParams] (val x: Self & (Options[Value, FilterParams])) extends AnyVal {
      
      inline def setBuildFilter(value: /* a */ FilterParams => js.Function1[/* a */ Value, Boolean]): Self = StObject.set(x, "buildFilter", js.Any.fromFunction1(value))
      
      inline def setBuildFilterUndefined: Self = StObject.set(x, "buildFilter", js.undefined)
      
      inline def setRenderCell(value: RenderCell[Value]): Self = StObject.set(x, "renderCell", value.asInstanceOf[js.Any])
      
      inline def setRenderFilter(value: RenderFilter[Value, FilterParams]): Self = StObject.set(x, "renderFilter", value.asInstanceOf[js.Any])
      
      inline def setRenderFilterUndefined: Self = StObject.set(x, "renderFilter", js.undefined)
      
      inline def setSortFn(value: (/* b */ Value, /* a */ Value) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      inline def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
      
      inline def setTextQueryFilter(value: (/* b */ String, /* a */ Value) => Boolean): Self = StObject.set(x, "textQueryFilter", js.Any.fromFunction2(value))
      
      inline def setTextQueryFilterUndefined: Self = StObject.set(x, "textQueryFilter", js.undefined)
    }
  }
}
