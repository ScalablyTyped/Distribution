package typings.devextremeB5DqTZzf.mod.DevExpress

import typings.devextremeB5DqTZzf.anon.GridCell
import typings.devextremeB5DqTZzf.anon.Name
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.all
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.chart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.treeList
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.visible
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  trait PdfDataGridCell extends StObject {
    
    /**
      * The configuration of the cell&apos;s column.
      */
    var column: js.UndefOr[Column[Any, Any]] = js.undefined
    
    /**
      * The data object of the cell&apos;s row.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The group index of the cell&apos;s row. Available when the rowType is &apos;group&apos;.
      */
    var groupIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Information about group summary items the cell represents.
      */
    var groupSummaryItems: js.UndefOr[js.Array[Name]] = js.undefined
    
    /**
      * The type of the cell&apos;s row.
      */
    var rowType: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier of the total summary item that the cell represents.
      */
    var totalSummaryItemName: js.UndefOr[String] = js.undefined
    
    /**
      * The cell&apos;s raw value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object PdfDataGridCell {
    
    inline def apply(): PdfDataGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfDataGridCell]
    }
    
    extension [Self <: PdfDataGridCell](x: Self) {
      
      inline def setColumn(value: Column[Any, Any]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setGroupSummaryItems(value: js.Array[Name]): Self = StObject.set(x, "groupSummaryItems", value.asInstanceOf[js.Any])
      
      inline def setGroupSummaryItemsUndefined: Self = StObject.set(x, "groupSummaryItems", js.undefined)
      
      inline def setGroupSummaryItemsVarargs(value: Name*): Self = StObject.set(x, "groupSummaryItems", js.Array(value*))
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      inline def setTotalSummaryItemName(value: String): Self = StObject.set(x, "totalSummaryItemName", value.asInstanceOf[js.Any])
      
      inline def setTotalSummaryItemNameUndefined: Self = StObject.set(x, "totalSummaryItemName", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PdfExportDataGridProps extends StObject {
    
    /**
      * Options of the generated PDF table. Refer to the jsPDF-autoTable plugin documentation to see the full list of available customizations.
      */
    var autoTableOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * A DataGrid instance. This setting is required.
      */
    var component: js.UndefOr[dxDataGrid[Any, Any]] = js.undefined
    
    /**
      * Customizes a cell in PDF after creation.
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ GridCell, Unit]] = js.undefined
    
    /**
      * A jsPDF instance. This setting is required.
      */
    var jsPDFDocument: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Specifies whether columns in the PDF file should have the same width as their source UI component&apos;s columns.
      */
    var keepColumnWidths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures the load panel.
      */
    var loadPanel: js.UndefOr[ExportLoadPanel] = js.undefined
    
    /**
      * Specifies whether or not to export only selected rows.
      */
    var selectedRowsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object PdfExportDataGridProps {
    
    inline def apply(): PdfExportDataGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfExportDataGridProps]
    }
    
    extension [Self <: PdfExportDataGridProps](x: Self) {
      
      inline def setAutoTableOptions(value: js.Object): Self = StObject.set(x, "autoTableOptions", value.asInstanceOf[js.Any])
      
      inline def setAutoTableOptionsUndefined: Self = StObject.set(x, "autoTableOptions", js.undefined)
      
      inline def setComponent(value: dxDataGrid[Any, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ GridCell => Unit): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      inline def setJsPDFDocument(value: js.Object): Self = StObject.set(x, "jsPDFDocument", value.asInstanceOf[js.Any])
      
      inline def setJsPDFDocumentUndefined: Self = StObject.set(x, "jsPDFDocument", js.undefined)
      
      inline def setKeepColumnWidths(value: Boolean): Self = StObject.set(x, "keepColumnWidths", value.asInstanceOf[js.Any])
      
      inline def setKeepColumnWidthsUndefined: Self = StObject.set(x, "keepColumnWidths", js.undefined)
      
      inline def setLoadPanel(value: ExportLoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      inline def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
    }
  }
  
  trait PdfExportGanttProps extends StObject {
    
    /**
      * A Gantt instance. This setting is required.
      */
    var component: js.UndefOr[dxGantt] = js.undefined
    
    /**
      * A function that creates a PDF document.
      */
    var createDocumentMethod: js.UndefOr[js.Function1[/* options */ Any, js.Object]] = js.undefined
    
    /**
      * Specifies the date range for which to export tasks.
      */
    var dateRange: js.UndefOr[all | visible | js.Object] = js.undefined
    
    /**
      * Specifies which part of the component to export (chart area, tree list area, or the entire component).
      */
    var exportMode: js.UndefOr[all | treeList | chart] = js.undefined
    
    /**
      * Specifies the file name.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the document size.
      */
    var format: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * A jsPDF instance. This setting is required.
      */
    var jsPDFDocument: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Specifies whether to use horizontal orientation for the document.
      */
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the outer indents of the exported area.
      */
    var margins: js.UndefOr[js.Object] = js.undefined
  }
  object PdfExportGanttProps {
    
    inline def apply(): PdfExportGanttProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfExportGanttProps]
    }
    
    extension [Self <: PdfExportGanttProps](x: Self) {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCreateDocumentMethod(value: /* options */ Any => js.Object): Self = StObject.set(x, "createDocumentMethod", js.Any.fromFunction1(value))
      
      inline def setCreateDocumentMethodUndefined: Self = StObject.set(x, "createDocumentMethod", js.undefined)
      
      inline def setDateRange(value: all | visible | js.Object): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      inline def setExportMode(value: all | treeList | chart): Self = StObject.set(x, "exportMode", value.asInstanceOf[js.Any])
      
      inline def setExportModeUndefined: Self = StObject.set(x, "exportMode", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormat(value: String | js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setJsPDFDocument(value: js.Object): Self = StObject.set(x, "jsPDFDocument", value.asInstanceOf[js.Any])
      
      inline def setJsPDFDocumentUndefined: Self = StObject.set(x, "jsPDFDocument", js.undefined)
      
      inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      inline def setMargins(value: js.Object): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    }
  }
}
