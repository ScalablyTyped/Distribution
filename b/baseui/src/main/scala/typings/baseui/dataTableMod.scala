package typings.baseui

import typings.baseui.dataTableColumnAnchorMod.Options
import typings.baseui.dataTableTypesMod.BatchAction
import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.baseui.dataTableTypesMod.DataTableProps
import typings.baseui.dataTableTypesMod.Row
import typings.baseui.dataTableTypesMod.RowAction
import typings.baseui.dataTableTypesMod.SortDirections
import typings.baseui.dataTableTypesMod.StatefulContainerProps
import typings.baseui.dataTableTypesMod.StatefulDataTableProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("baseui/data-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AnchorColumn(options: Options): typings.baseui.dataTableColumnAnchorMod.AnchorColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("AnchorColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnAnchorMod.AnchorColumn]
  
  inline def BooleanColumn(options: typings.baseui.dataTableColumnBooleanMod.Options): typings.baseui.dataTableColumnBooleanMod.BooleanColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("BooleanColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnBooleanMod.BooleanColumn]
  
  /* Inlined std.Readonly<{ readonly ANCHOR :'ANCHOR',  readonly BOOLEAN :'BOOLEAN',  readonly CATEGORICAL :'CATEGORICAL',  readonly CUSTOM :'CUSTOM',  readonly DATETIME :'DATETIME',  readonly NUMERICAL :'NUMERICAL',  readonly ROW_INDEX :'ROW_INDEX',  readonly STRING :'STRING'}> */
  object COLUMNS {
    
    @JSImport("baseui/data-table", "COLUMNS.ANCHOR")
    @js.native
    val ANCHOR: typings.baseui.baseuiStrings.ANCHOR = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.BOOLEAN")
    @js.native
    val BOOLEAN: typings.baseui.baseuiStrings.BOOLEAN = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.CATEGORICAL")
    @js.native
    val CATEGORICAL: typings.baseui.baseuiStrings.CATEGORICAL = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.CUSTOM")
    @js.native
    val CUSTOM: typings.baseui.baseuiStrings.CUSTOM = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.DATETIME")
    @js.native
    val DATETIME: typings.baseui.baseuiStrings.DATETIME = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.NUMERICAL")
    @js.native
    val NUMERICAL: typings.baseui.baseuiStrings.NUMERICAL = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.ROW_INDEX")
    @js.native
    val ROW_INDEX: typings.baseui.baseuiStrings.ROW_INDEX = js.native
    
    @JSImport("baseui/data-table", "COLUMNS.STRING")
    @js.native
    val STRING: typings.baseui.baseuiStrings.STRING = js.native
  }
  
  inline def CategoricalColumn(options: typings.baseui.dataTableColumnCategoricalMod.Options): typings.baseui.dataTableColumnCategoricalMod.CategoricalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("CategoricalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnCategoricalMod.CategoricalColumn]
  
  inline def CustomColumn[Value, FilterParams](options: typings.baseui.dataTableColumnCustomMod.Options[Value, FilterParams]): ColumnOptions[Value, FilterParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomColumn")(options.asInstanceOf[js.Any]).asInstanceOf[ColumnOptions[Value, FilterParams]]
  
  /* Inlined std.Readonly<{ readonly RANGE_DATETIME :'RANGE_DATETIME',  readonly RANGE_DATE :'RANGE_DATE',  readonly RANGE_TIME :'RANGE_TIME',  readonly WEEKDAY :'WEEKDAY',  readonly MONTH :'MONTH',  readonly QUARTER :'QUARTER',  readonly HALF :'HALF',  readonly YEAR :'YEAR'}> */
  object DATETIME_OPERATIONS {
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.HALF")
    @js.native
    val HALF: typings.baseui.baseuiStrings.HALF = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.MONTH")
    @js.native
    val MONTH: typings.baseui.baseuiStrings.MONTH = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.QUARTER")
    @js.native
    val QUARTER: typings.baseui.baseuiStrings.QUARTER = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_DATE")
    @js.native
    val RANGE_DATE: typings.baseui.baseuiStrings.RANGE_DATE = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_DATETIME")
    @js.native
    val RANGE_DATETIME: typings.baseui.baseuiStrings.RANGE_DATETIME = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.RANGE_TIME")
    @js.native
    val RANGE_TIME: typings.baseui.baseuiStrings.RANGE_TIME = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.WEEKDAY")
    @js.native
    val WEEKDAY: typings.baseui.baseuiStrings.WEEKDAY = js.native
    
    @JSImport("baseui/data-table", "DATETIME_OPERATIONS.YEAR")
    @js.native
    val YEAR: typings.baseui.baseuiStrings.YEAR = js.native
  }
  
  inline def DataTable(
    hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef: DataTableProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DataTable")(hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DatetimeColumn(options: typings.baseui.dataTableColumnDatetimeMod.Options): typings.baseui.dataTableColumnDatetimeMod.DatetimeColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("DatetimeColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnDatetimeMod.DatetimeColumn]
  
  /* Inlined std.Readonly<{ readonly DEFAULT :'DEFAULT',  readonly ACCOUNTING :'ACCOUNTING',  readonly PERCENTAGE :'PERCENTAGE'}> */
  object NUMERICAL_FORMATS {
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.ACCOUNTING")
    @js.native
    val ACCOUNTING: typings.baseui.baseuiStrings.ACCOUNTING = js.native
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.DEFAULT")
    @js.native
    val DEFAULT: typings.baseui.baseuiStrings.DEFAULT = js.native
    
    @JSImport("baseui/data-table", "NUMERICAL_FORMATS.PERCENTAGE")
    @js.native
    val PERCENTAGE: typings.baseui.baseuiStrings.PERCENTAGE = js.native
  }
  
  inline def NumericalColumn(options: typings.baseui.dataTableColumnNumericalMod.Options): typings.baseui.dataTableColumnNumericalMod.NumericalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("NumericalColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnNumericalMod.NumericalColumn]
  
  inline def RowIndexColumn(): typings.baseui.dataTableColumnRowIndexMod.RowIndexColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("RowIndexColumn")().asInstanceOf[typings.baseui.dataTableColumnRowIndexMod.RowIndexColumn]
  
  /* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
  object SORT_DIRECTIONS {
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS.ASC")
    @js.native
    val ASC: typings.baseui.baseuiStrings.ASC = js.native
    
    @JSImport("baseui/data-table", "SORT_DIRECTIONS.DESC")
    @js.native
    val DESC: typings.baseui.baseuiStrings.DESC = js.native
  }
  
  @JSImport("baseui/data-table", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  inline def StatefulDataTable(props: StatefulDataTableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulDataTable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StringColumn(options: typings.baseui.dataTableColumnStringMod.Options): typings.baseui.dataTableColumnStringMod.StringColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("StringColumn")(options.asInstanceOf[js.Any]).asInstanceOf[typings.baseui.dataTableColumnStringMod.StringColumn]
  
  inline def UnstableDataTable(
    hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef: DataTableProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Unstable_DataTable")(hasBatchActionsColumnsFiltersEmptyMessageLoadingLoadingMessageOnIncludedRowsChangeOnRowHighlightChangeOnSelectManyOnSelectNoneOnSelectOneOnSortResizableColumnWidthsAllRowsRowActionsRowHeightRowHighlightIndexControlledSelectedRowIdsSortIndexSortDirectionTextQueryControlRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/data-table", "Unstable_StatefulContainer")
  @js.native
  val UnstableStatefulContainer: FC[StatefulContainerProps] = js.native
  
  inline def UnstableStatefulDataTable(props: StatefulDataTableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Unstable_StatefulDataTable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type BatchActionT = BatchAction
  
  type ColumnT = ColumnOptions[Any, Any]
  
  type RowActionT = RowAction
  
  type RowT = Row
  
  type SortDirectionsT = SortDirections
}
