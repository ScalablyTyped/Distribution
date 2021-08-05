package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Button Defaults"
//#region "Add-Ons"
/**
  * Buttons extension options
  */
trait ButtonSettings
  extends StObject
     with ButtomSettingsCommon {
  
  /**
    * PRINT: Show print dialoge on click
    */
  var autoPrint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSV: UTF-8 boom
    */
  var bom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSV: charset
    */
  var charset: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * COLVIS:
    */
  var columnText: js.UndefOr[FunctionButtonColvisColumnText] = js.undefined
  
  //#endregion Export and Print
  //#region ColVis
  /**
    * COLVIS: Column selector
    */
  var columns: js.UndefOr[js.Any] = js.undefined
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var customize: js.UndefOr[FunctionButtonCustomize] = js.undefined
  
  /**
    * EXCEL
    */
  var customizeData: js.UndefOr[FunctionButtonCustomizeData] = js.undefined
  
  /**
    * CSV: escape char
    */
  var escapeChar: js.UndefOr[String] = js.undefined
  
  //#endregion (HTML-)File-Export
  //#region Export and Print
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var exportOptions: js.UndefOr[ButtonExportOptions | js.Object] = js.undefined
  
  /**
    * CSV / EXCEL / PDF: file extension
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / CSV: field boundary
    */
  var fieldBoundary: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / CSV: field separator
    */
  var fieldSeparator: js.UndefOr[String] = js.undefined
  
  //#region (HTML-)File-Export
  /**
    * CSV / EXCEL: Define what the exported filename should be
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show footer
    */
  var footer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * PDF / PRINT: Extra message
    */
  var message: js.UndefOr[String | Api | JQuery | js.Object] = js.undefined
  
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageBottom: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageTop: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / CSV: field separator
    */
  var newLine: js.UndefOr[String] = js.undefined
  
  /**
    * PDF: portrait / landscape
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * PDF: A3 / A4 / A5 / LEGAL / LETTER / TABLOID
    */
  var pageSize: js.UndefOr[String] = js.undefined
  
  /**
    * COPY / PRINT: title
    */
  var title: js.UndefOr[String] = js.undefined
}
object ButtonSettings {
  
  inline def apply(): ButtonSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSettings]
  }
  
  extension [Self <: ButtonSettings](x: Self) {
    
    inline def setAutoPrint(value: Boolean): Self = StObject.set(x, "autoPrint", value.asInstanceOf[js.Any])
    
    inline def setAutoPrintUndefined: Self = StObject.set(x, "autoPrint", js.undefined)
    
    inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
    
    inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
    
    inline def setCharset(value: String | Boolean): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setColumnText(value: (/* dt */ Api, /* i */ Double, /* title */ String) => String): Self = StObject.set(x, "columnText", js.Any.fromFunction3(value))
    
    inline def setColumnTextUndefined: Self = StObject.set(x, "columnText", js.undefined)
    
    inline def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCustomize(value: /* win */ Window | String => Unit): Self = StObject.set(x, "customize", js.Any.fromFunction1(value))
    
    inline def setCustomizeData(value: /* content */ js.Any => Unit): Self = StObject.set(x, "customizeData", js.Any.fromFunction1(value))
    
    inline def setCustomizeDataUndefined: Self = StObject.set(x, "customizeData", js.undefined)
    
    inline def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setExportOptions(value: ButtonExportOptions | js.Object): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFieldBoundary(value: String): Self = StObject.set(x, "fieldBoundary", value.asInstanceOf[js.Any])
    
    inline def setFieldBoundaryUndefined: Self = StObject.set(x, "fieldBoundary", js.undefined)
    
    inline def setFieldSeparator(value: String): Self = StObject.set(x, "fieldSeparator", value.asInstanceOf[js.Any])
    
    inline def setFieldSeparatorUndefined: Self = StObject.set(x, "fieldSeparator", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMessage(value: String | Api | JQuery | js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageBottom(value: String): Self = StObject.set(x, "messageBottom", value.asInstanceOf[js.Any])
    
    inline def setMessageBottomUndefined: Self = StObject.set(x, "messageBottom", js.undefined)
    
    inline def setMessageTop(value: String): Self = StObject.set(x, "messageTop", value.asInstanceOf[js.Any])
    
    inline def setMessageTopUndefined: Self = StObject.set(x, "messageTop", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPageSize(value: String): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
