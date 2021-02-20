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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("baseui/data-table", "AnchorColumn")
  @js.native
  def AnchorColumn(options: js.Any): js.Any = js.native
  
  @JSImport("baseui/data-table", "BooleanColumn")
  @js.native
  def BooleanColumn(options: js.Any): js.Any = js.native
  
  @js.native
  trait COLUMNS extends StObject {
    
    var ANCHOR: typings.baseui.baseuiStrings.ANCHOR = js.native
    
    var BOOLEAN: typings.baseui.baseuiStrings.BOOLEAN = js.native
    
    var CATEGORICAL: typings.baseui.baseuiStrings.CATEGORICAL = js.native
    
    var CUSTOM: typings.baseui.baseuiStrings.CUSTOM = js.native
    
    var DATETIME: typings.baseui.baseuiStrings.DATETIME = js.native
    
    var NUMERICAL: typings.baseui.baseuiStrings.NUMERICAL = js.native
    
    var STRING: typings.baseui.baseuiStrings.STRING = js.native
  }
  object COLUMNS {
    
    @JSImport("baseui/data-table", "COLUMNS")
    @js.native
    val ^ : COLUMNS = js.native
    
    @scala.inline
    implicit class COLUMNSMutableBuilder[Self <: COLUMNS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANCHOR(value: ANCHOR): Self = StObject.set(x, "ANCHOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOLEAN(value: BOOLEAN): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCATEGORICAL(value: CATEGORICAL): Self = StObject.set(x, "CATEGORICAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUSTOM(value: CUSTOM): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATETIME(value: DATETIME): Self = StObject.set(x, "DATETIME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMERICAL(value: NUMERICAL): Self = StObject.set(x, "NUMERICAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTRING(value: STRING): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/data-table", "CategoricalColumn")
  @js.native
  def CategoricalColumn(options: js.Any): js.Any = js.native
  
  @JSImport("baseui/data-table", "CustomColumn")
  @js.native
  def CustomColumn[ValueT, FilterParamsT](options: js.Any): js.Any = js.native
  
  @JSImport("baseui/data-table", "DatetimeColumn")
  @js.native
  def DatetimeColumn(options: js.Any): js.Any = js.native
  
  @js.native
  trait NUMERICAL_FORMATS extends StObject {
    
    var ACCOUNTING: typings.baseui.baseuiStrings.ACCOUNTING = js.native
    
    var DEFAULT: typings.baseui.baseuiStrings.DEFAULT = js.native
    
    var PERCENTAGE: typings.baseui.baseuiStrings.PERCENTAGE = js.native
  }
  object NUMERICAL_FORMATS {
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS")
    @js.native
    val ^ : NUMERICAL_FORMATS = js.native
    
    @scala.inline
    implicit class NUMERICAL_FORMATSMutableBuilder[Self <: NUMERICAL_FORMATS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACCOUNTING(value: ACCOUNTING): Self = StObject.set(x, "ACCOUNTING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEFAULT(value: DEFAULT): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPERCENTAGE(value: PERCENTAGE): Self = StObject.set(x, "PERCENTAGE", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/data-table", "NumericalColumn")
  @js.native
  def NumericalColumn(options: js.Any): js.Any = js.native
  
  @js.native
  trait SORT_DIRECTIONS extends StObject {
    
    var ASC: typings.baseui.baseuiStrings.ASC = js.native
    
    var DESC: typings.baseui.baseuiStrings.DESC = js.native
  }
  object SORT_DIRECTIONS {
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS")
    @js.native
    val ^ : SORT_DIRECTIONS = js.native
    
    @scala.inline
    implicit class SORT_DIRECTIONSMutableBuilder[Self <: SORT_DIRECTIONS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setASC(value: ASC): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESC(value: DESC): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
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
  
  @JSImport("baseui/data-table", "StringColumn")
  @js.native
  def StringColumn(options: js.Any): js.Any = js.native
  
  @js.native
  trait BatchActionT extends StObject {
    
    var label: String = js.native
    
    def onClick(params: ClearSelection): js.Any = js.native
    
    var renderIcon: js.UndefOr[js.Any] = js.native
  }
  object BatchActionT {
    
    @scala.inline
    def apply(label: String, onClick: ClearSelection => js.Any): BatchActionT = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[BatchActionT]
    }
    
    @scala.inline
    implicit class BatchActionTMutableBuilder[Self <: BatchActionT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: ClearSelection => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderIcon(value: js.Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    }
  }
  
  type ColumnT = js.Any
  
  @js.native
  trait Props extends StObject {
    
    var batchActions: js.UndefOr[js.Array[BatchActionT]] = js.native
    
    var columns: js.Array[ColumnT] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function1[/* rows */ js.Array[RowT], _]] = js.native
    
    var rowActions: js.UndefOr[js.Array[RowActionT]] = js.native
    
    var rows: js.Array[RowT] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(columns: js.Array[ColumnT], rows: js.Array[RowT]): Props = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchActions(value: js.Array[BatchActionT]): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
      
      @scala.inline
      def setBatchActionsVarargs(value: BatchActionT*): Self = StObject.set(x, "batchActions", js.Array(value :_*))
      
      @scala.inline
      def setColumns(value: js.Array[ColumnT]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: ColumnT*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setOnSelectionChange(value: /* rows */ js.Array[RowT] => _): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setRowActions(value: js.Array[RowActionT]): Self = StObject.set(x, "rowActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowActionsUndefined: Self = StObject.set(x, "rowActions", js.undefined)
      
      @scala.inline
      def setRowActionsVarargs(value: RowActionT*): Self = StObject.set(x, "rowActions", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: js.Array[RowT]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: RowT*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RowActionT extends StObject {
    
    var label: String = js.native
    
    def onClick(params: Event): js.Any = js.native
    
    var renderIcon: js.Any = js.native
  }
  object RowActionT {
    
    @scala.inline
    def apply(label: String, onClick: Event => js.Any, renderIcon: js.Any): RowActionT = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowActionT]
    }
    
    @scala.inline
    implicit class RowActionTMutableBuilder[Self <: RowActionT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderIcon(value: js.Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RowT extends StObject {
    
    var data: js.Any = js.native
    
    var id: Double | String = js.native
  }
  object RowT {
    
    @scala.inline
    def apply(data: js.Any, id: Double | String): RowT = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowT]
    }
    
    @scala.inline
    implicit class RowTMutableBuilder[Self <: RowT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
