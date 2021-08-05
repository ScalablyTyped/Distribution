package typings.baseui

import typings.baseui.anon.ClearSelection
import typings.baseui.anon.Event
import typings.baseui.baseuiStrings.ACCOUNTING
import typings.baseui.baseuiStrings.ANCHOR
import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.BOOLEAN
import typings.baseui.baseuiStrings.CATEGORICAL
import typings.baseui.baseuiStrings.CUSTOM
import typings.baseui.baseuiStrings.DATETIME
import typings.baseui.baseuiStrings.DEFAULT
import typings.baseui.baseuiStrings.DESC
import typings.baseui.baseuiStrings.NUMERICAL
import typings.baseui.baseuiStrings.PERCENTAGE
import typings.baseui.baseuiStrings.STRING
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("baseui/data-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AnchorColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AnchorColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def BooleanColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("BooleanColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait COLUMNS extends StObject {
    
    var ANCHOR: typings.baseui.baseuiStrings.ANCHOR
    
    var BOOLEAN: typings.baseui.baseuiStrings.BOOLEAN
    
    var CATEGORICAL: typings.baseui.baseuiStrings.CATEGORICAL
    
    var CUSTOM: typings.baseui.baseuiStrings.CUSTOM
    
    var DATETIME: typings.baseui.baseuiStrings.DATETIME
    
    var NUMERICAL: typings.baseui.baseuiStrings.NUMERICAL
    
    var STRING: typings.baseui.baseuiStrings.STRING
  }
  object COLUMNS {
    
    @JSImport("baseui/data-table", "COLUMNS")
    @js.native
    val ^ : COLUMNS = js.native
    
    extension [Self <: COLUMNS](x: Self) {
      
      inline def setANCHOR(value: ANCHOR): Self = StObject.set(x, "ANCHOR", value.asInstanceOf[js.Any])
      
      inline def setBOOLEAN(value: BOOLEAN): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
      
      inline def setCATEGORICAL(value: CATEGORICAL): Self = StObject.set(x, "CATEGORICAL", value.asInstanceOf[js.Any])
      
      inline def setCUSTOM(value: CUSTOM): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
      
      inline def setDATETIME(value: DATETIME): Self = StObject.set(x, "DATETIME", value.asInstanceOf[js.Any])
      
      inline def setNUMERICAL(value: NUMERICAL): Self = StObject.set(x, "NUMERICAL", value.asInstanceOf[js.Any])
      
      inline def setSTRING(value: STRING): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
  
  inline def CategoricalColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CategoricalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def CustomColumn[ValueT, FilterParamsT](options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def DatetimeColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DatetimeColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait NUMERICAL_FORMATS extends StObject {
    
    var ACCOUNTING: typings.baseui.baseuiStrings.ACCOUNTING
    
    var DEFAULT: typings.baseui.baseuiStrings.DEFAULT
    
    var PERCENTAGE: typings.baseui.baseuiStrings.PERCENTAGE
  }
  object NUMERICAL_FORMATS {
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS")
    @js.native
    val ^ : NUMERICAL_FORMATS = js.native
    
    extension [Self <: NUMERICAL_FORMATS](x: Self) {
      
      inline def setACCOUNTING(value: ACCOUNTING): Self = StObject.set(x, "ACCOUNTING", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT(value: DEFAULT): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      inline def setPERCENTAGE(value: PERCENTAGE): Self = StObject.set(x, "PERCENTAGE", value.asInstanceOf[js.Any])
    }
  }
  
  inline def NumericalColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("NumericalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait SORT_DIRECTIONS extends StObject {
    
    var ASC: typings.baseui.baseuiStrings.ASC
    
    var DESC: typings.baseui.baseuiStrings.DESC
  }
  object SORT_DIRECTIONS {
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS")
    @js.native
    val ^ : SORT_DIRECTIONS = js.native
    
    extension [Self <: SORT_DIRECTIONS](x: Self) {
      
      inline def setASC(value: ASC): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
      
      inline def setDESC(value: DESC): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/data-table", "StatefulDataTable")
  @js.native
  class StatefulDataTable protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  inline def StringColumn(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StringColumn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait BatchActionT extends StObject {
    
    var label: String
    
    def onClick(params: ClearSelection): js.Any
    
    var renderIcon: js.UndefOr[js.Any] = js.undefined
  }
  object BatchActionT {
    
    inline def apply(label: String, onClick: ClearSelection => js.Any): BatchActionT = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[BatchActionT]
    }
    
    extension [Self <: BatchActionT](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ClearSelection => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRenderIcon(value: js.Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    }
  }
  
  type ColumnT = js.Any
  
  trait Props extends StObject {
    
    var batchActions: js.UndefOr[js.Array[BatchActionT]] = js.undefined
    
    var columns: js.Array[ColumnT]
    
    var onSelectionChange: js.UndefOr[js.Function1[/* rows */ js.Array[RowT], js.Any]] = js.undefined
    
    var rowActions: js.UndefOr[js.Array[RowActionT]] = js.undefined
    
    var rows: js.Array[RowT]
  }
  object Props {
    
    inline def apply(columns: js.Array[ColumnT], rows: js.Array[RowT]): Props = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBatchActions(value: js.Array[BatchActionT]): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
      
      inline def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
      
      inline def setBatchActionsVarargs(value: BatchActionT*): Self = StObject.set(x, "batchActions", js.Array(value :_*))
      
      inline def setColumns(value: js.Array[ColumnT]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnT*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setOnSelectionChange(value: /* rows */ js.Array[RowT] => js.Any): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setRowActions(value: js.Array[RowActionT]): Self = StObject.set(x, "rowActions", value.asInstanceOf[js.Any])
      
      inline def setRowActionsUndefined: Self = StObject.set(x, "rowActions", js.undefined)
      
      inline def setRowActionsVarargs(value: RowActionT*): Self = StObject.set(x, "rowActions", js.Array(value :_*))
      
      inline def setRows(value: js.Array[RowT]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: RowT*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  trait RowActionT extends StObject {
    
    var label: String
    
    def onClick(params: Event): js.Any
    
    var renderIcon: js.Any
  }
  object RowActionT {
    
    inline def apply(label: String, onClick: Event => js.Any, renderIcon: js.Any): RowActionT = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowActionT]
    }
    
    extension [Self <: RowActionT](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRenderIcon(value: js.Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowT extends StObject {
    
    var data: js.Any
    
    var id: Double | String
  }
  object RowT {
    
    inline def apply(data: js.Any, id: Double | String): RowT = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowT]
    }
    
    extension [Self <: RowT](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.ASC
    - typings.baseui.baseuiStrings.DESC
    - scala.Null
  */
  type SortDirectionsT = _SortDirectionsT | Null
  
  trait _SortDirectionsT extends StObject
}
