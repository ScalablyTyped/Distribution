package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Filtering
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.CellClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.CellDblClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.CellHoverChangedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.CellPreparedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ContextMenuPreparingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.DataRowTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Editing
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.EditingStartEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.EditorPreparedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.EditorPreparingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Export
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ExportedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ExportingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.FileSavingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.FocusedCellChangedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.FocusedCellChangingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.FocusedRowChangedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.FocusedRowChangingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.GroupPanel
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Grouping
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.MasterDetail
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Row
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.RowClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.RowDblClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.RowPreparedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.RowTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Scrolling
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Selection
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Summary
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Toolbar
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.dxDataGridSortByGroupSummaryInfoItem
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDataGridOptions[TRowData, TKey]
  extends StObject
     with GridBaseOptions[dxDataGrid[TRowData, TKey], TRowData, TKey] {
  
  /**
    * An array of grid columns.
    */
  @JSName("columns")
  var columns_dxDataGridOptions: js.UndefOr[js.Array[(Column[TRowData, TKey]) | String]] = js.undefined
  
  /**
    * Customizes columns after they are created.
    */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[Column[TRowData, TKey]], Unit]] = js.undefined
  
  /**
    * Customizes data before export.
    * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
    */
  var customizeExportData: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[Column[TRowData, TKey]], 
      /* rows */ js.Array[Row[TRowData, TKey]], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Specifies a custom template for data rows.
    */
  var dataRowTemplate: js.UndefOr[
    template | (js.Function2[
      /* rowElement */ DxElement_[HTMLElement], 
      /* rowInfo */ DataRowTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Configures editing.
    */
  @JSName("editing")
  var editing_dxDataGridOptions: js.UndefOr[Editing[TRowData, TKey]] = js.undefined
  
  /**
    * Configures client-side exporting.
    */
  var `export`: js.UndefOr[Export[TRowData, TKey]] = js.undefined
  
  /**
    * Configures the group panel.
    */
  var groupPanel: js.UndefOr[GroupPanel] = js.undefined
  
  /**
    * Configures grouping.
    */
  var grouping: js.UndefOr[Grouping] = js.undefined
  
  /**
    * Specifies the key property (or properties) that provide(s) key values to access data items. Each key value must be unique. This property applies only if data is a simple array.
    */
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Allows you to build a master-detail interface in the grid.
    */
  var masterDetail: js.UndefOr[MasterDetail[TRowData, TKey]] = js.undefined
  
  /**
    * A function that is executed when a cell is clicked or tapped. Executed before onRowClick.
    */
  var onCellClick: js.UndefOr[js.Function1[/* e */ CellClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick.
    */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ CellDblClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a cell.
    */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ CellHoverChangedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a grid cell is created.
    */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ CellPreparedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before the context menu is rendered.
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before a cell or row switches to the editing state.
    */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ EditingStartEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after an editor is created. Not executed for cells with an editCellTemplate.
    */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ EditorPreparedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function used to customize a cell&apos;s editor. Not executed for cells with an editCellTemplate.
    */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ EditorPreparingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after data is exported.
    * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
    */
  var onExported: js.UndefOr[js.Function1[/* e */ ExportedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before data is exported.
    */
  var onExporting: js.UndefOr[js.Function1[/* e */ ExportingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before a file with exported data is saved to the user&apos;s local storage.
    * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
    */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileSavingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after the focused cell changes. Applies only to cells in data or group rows.
    */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ FocusedCellChangedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before the focused cell changes. Applies only to cells in data or group rows.
    */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ FocusedCellChangingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after the focused row changes. Applies only to data or group rows. focusedRowEnabled should be true.
    */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ FocusedRowChangedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before the focused row changes. Applies only to data or group rows. focusedRowEnabled should be true.
    */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ FocusedRowChangingEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a row is clicked or tapped.
    */
  var onRowClick: js.UndefOr[js.Function1[/* e */ RowClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick.
    */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ RowDblClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a row is created.
    */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ RowPreparedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * Notifies the DataGrid of the server&apos;s data processing operations.
    */
  var remoteOperations: js.UndefOr[Boolean | Filtering | auto] = js.undefined
  
  /**
    * Specifies a custom template for rows.
    * @deprecated Use the dataRowTemplate option instead.
    */
  var rowTemplate: js.UndefOr[
    template | (js.Function2[
      /* rowElement */ DxElement_[HTMLElement], 
      /* rowInfo */ RowTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Configures scrolling.
    */
  @JSName("scrolling")
  var scrolling_dxDataGridOptions: js.UndefOr[Scrolling] = js.undefined
  
  /**
    * Specifies filters for the rows that must be selected initially. Applies only if selection.deferred is true.
    */
  var selectionFilter: js.UndefOr[String | js.Array[Any] | js.Function] = js.undefined
  
  /**
    * Configures runtime selection.
    */
  @JSName("selection")
  var selection_dxDataGridOptions: js.UndefOr[Selection] = js.undefined
  
  /**
    * Allows you to sort groups according to the values of group summary items.
    */
  var sortByGroupSummaryInfo: js.UndefOr[js.Array[dxDataGridSortByGroupSummaryInfoItem]] = js.undefined
  
  /**
    * Specifies the properties of the grid summary.
    */
  var summary: js.UndefOr[Summary[TRowData, TKey]] = js.undefined
  
  /**
    * Configures the toolbar.
    */
  var toolbar: js.UndefOr[Toolbar] = js.undefined
}
object dxDataGridOptions {
  
  inline def apply[TRowData, TKey](): dxDataGridOptions[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridOptions[TRowData, TKey]]
  }
  
  extension [Self <: dxDataGridOptions[?, ?], TRowData, TKey](x: Self & (dxDataGridOptions[TRowData, TKey])) {
    
    inline def setColumns(value: js.Array[(Column[TRowData, TKey]) | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ((Column[TRowData, TKey]) | String)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCustomizeColumns(value: /* columns */ js.Array[Column[TRowData, TKey]] => Unit): Self = StObject.set(x, "customizeColumns", js.Any.fromFunction1(value))
    
    inline def setCustomizeColumnsUndefined: Self = StObject.set(x, "customizeColumns", js.undefined)
    
    inline def setCustomizeExportData(
      value: (/* columns */ js.Array[Column[TRowData, TKey]], /* rows */ js.Array[Row[TRowData, TKey]]) => Unit
    ): Self = StObject.set(x, "customizeExportData", js.Any.fromFunction2(value))
    
    inline def setCustomizeExportDataUndefined: Self = StObject.set(x, "customizeExportData", js.undefined)
    
    inline def setDataRowTemplate(
      value: template | (js.Function2[
          /* rowElement */ DxElement_[HTMLElement], 
          /* rowInfo */ DataRowTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "dataRowTemplate", value.asInstanceOf[js.Any])
    
    inline def setDataRowTemplateFunction2(
      value: (/* rowElement */ DxElement_[HTMLElement], /* rowInfo */ DataRowTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "dataRowTemplate", js.Any.fromFunction2(value))
    
    inline def setDataRowTemplateUndefined: Self = StObject.set(x, "dataRowTemplate", js.undefined)
    
    inline def setEditing(value: Editing[TRowData, TKey]): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setExport(value: Export[TRowData, TKey]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setGroupPanel(value: GroupPanel): Self = StObject.set(x, "groupPanel", value.asInstanceOf[js.Any])
    
    inline def setGroupPanelUndefined: Self = StObject.set(x, "groupPanel", js.undefined)
    
    inline def setGrouping(value: Grouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setKeyExpr(value: String | js.Array[String]): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setKeyExprVarargs(value: String*): Self = StObject.set(x, "keyExpr", js.Array(value*))
    
    inline def setMasterDetail(value: MasterDetail[TRowData, TKey]): Self = StObject.set(x, "masterDetail", value.asInstanceOf[js.Any])
    
    inline def setMasterDetailUndefined: Self = StObject.set(x, "masterDetail", js.undefined)
    
    inline def setOnCellClick(value: /* e */ CellClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellDblClick(value: /* e */ CellDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellDblClick", js.Any.fromFunction1(value))
    
    inline def setOnCellDblClickUndefined: Self = StObject.set(x, "onCellDblClick", js.undefined)
    
    inline def setOnCellHoverChanged(value: /* e */ CellHoverChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnCellHoverChangedUndefined: Self = StObject.set(x, "onCellHoverChanged", js.undefined)
    
    inline def setOnCellPrepared(value: /* e */ CellPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellPrepared", js.Any.fromFunction1(value))
    
    inline def setOnCellPreparedUndefined: Self = StObject.set(x, "onCellPrepared", js.undefined)
    
    inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
    
    inline def setOnEditingStart(value: /* e */ EditingStartEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditingStart", js.Any.fromFunction1(value))
    
    inline def setOnEditingStartUndefined: Self = StObject.set(x, "onEditingStart", js.undefined)
    
    inline def setOnEditorPrepared(value: /* options */ EditorPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPrepared", js.Any.fromFunction1(value))
    
    inline def setOnEditorPreparedUndefined: Self = StObject.set(x, "onEditorPrepared", js.undefined)
    
    inline def setOnEditorPreparing(value: /* e */ EditorPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPreparing", js.Any.fromFunction1(value))
    
    inline def setOnEditorPreparingUndefined: Self = StObject.set(x, "onEditorPreparing", js.undefined)
    
    inline def setOnExported(value: /* e */ ExportedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onExported", js.Any.fromFunction1(value))
    
    inline def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    inline def setOnExporting(value: /* e */ ExportingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onExporting", js.Any.fromFunction1(value))
    
    inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    inline def setOnFileSaving(value: /* e */ FileSavingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFileSaving", js.Any.fromFunction1(value))
    
    inline def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    inline def setOnFocusedCellChanged(value: /* e */ FocusedCellChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanged", js.Any.fromFunction1(value))
    
    inline def setOnFocusedCellChangedUndefined: Self = StObject.set(x, "onFocusedCellChanged", js.undefined)
    
    inline def setOnFocusedCellChanging(value: /* e */ FocusedCellChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanging", js.Any.fromFunction1(value))
    
    inline def setOnFocusedCellChangingUndefined: Self = StObject.set(x, "onFocusedCellChanging", js.undefined)
    
    inline def setOnFocusedRowChanged(value: /* e */ FocusedRowChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanged", js.Any.fromFunction1(value))
    
    inline def setOnFocusedRowChangedUndefined: Self = StObject.set(x, "onFocusedRowChanged", js.undefined)
    
    inline def setOnFocusedRowChanging(value: /* e */ FocusedRowChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanging", js.Any.fromFunction1(value))
    
    inline def setOnFocusedRowChangingUndefined: Self = StObject.set(x, "onFocusedRowChanging", js.undefined)
    
    inline def setOnRowClick(value: /* e */ RowClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowDblClick(value: /* e */ RowDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowDblClick", js.Any.fromFunction1(value))
    
    inline def setOnRowDblClickUndefined: Self = StObject.set(x, "onRowDblClick", js.undefined)
    
    inline def setOnRowPrepared(value: /* e */ RowPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowPrepared", js.Any.fromFunction1(value))
    
    inline def setOnRowPreparedUndefined: Self = StObject.set(x, "onRowPrepared", js.undefined)
    
    inline def setRemoteOperations(value: Boolean | Filtering | auto): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
    
    inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
    
    inline def setRowTemplate(
      value: template | (js.Function2[
          /* rowElement */ DxElement_[HTMLElement], 
          /* rowInfo */ RowTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowTemplateFunction2(
      value: (/* rowElement */ DxElement_[HTMLElement], /* rowInfo */ RowTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "rowTemplate", js.Any.fromFunction2(value))
    
    inline def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
    
    inline def setScrolling(value: Scrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionFilter(value: String | js.Array[Any] | js.Function): Self = StObject.set(x, "selectionFilter", value.asInstanceOf[js.Any])
    
    inline def setSelectionFilterUndefined: Self = StObject.set(x, "selectionFilter", js.undefined)
    
    inline def setSelectionFilterVarargs(value: Any*): Self = StObject.set(x, "selectionFilter", js.Array(value*))
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSortByGroupSummaryInfo(value: js.Array[dxDataGridSortByGroupSummaryInfoItem]): Self = StObject.set(x, "sortByGroupSummaryInfo", value.asInstanceOf[js.Any])
    
    inline def setSortByGroupSummaryInfoUndefined: Self = StObject.set(x, "sortByGroupSummaryInfo", js.undefined)
    
    inline def setSortByGroupSummaryInfoVarargs(value: dxDataGridSortByGroupSummaryInfoItem*): Self = StObject.set(x, "sortByGroupSummaryInfo", js.Array(value*))
    
    inline def setSummary(value: Summary[TRowData, TKey]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
