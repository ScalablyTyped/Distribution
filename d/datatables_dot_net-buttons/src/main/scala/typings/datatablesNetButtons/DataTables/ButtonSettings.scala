package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Button Defaults"
//#region "Add-Ons"
/**
  * Buttons extension options
  */
@js.native
trait ButtonSettings extends ButtomSettingsCommon {
  
  /**
    * PRINT: Show print dialoge on click
    */
  var autoPrint: js.UndefOr[Boolean] = js.native
  
  /**
    * CSV: UTF-8 boom
    */
  var bom: js.UndefOr[Boolean] = js.native
  
  /**
    * CSV: charset
    */
  var charset: js.UndefOr[String | Boolean] = js.native
  
  /**
    * COLVIS:
    */
  var columnText: js.UndefOr[FunctionButtonColvisColumnText] = js.native
  
  //#endregion Export and Print
  //#region ColVis
  /**
    * COLVIS: Column selector
    */
  var columns: js.UndefOr[js.Any] = js.native
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var customize: js.UndefOr[FunctionButtonCustomize] = js.native
  
  /**
    * EXCEL
    */
  var customizeData: js.UndefOr[FunctionButtonCustomizeData] = js.native
  
  /**
    * CSV: escape char
    */
  var escapeChar: js.UndefOr[String] = js.native
  
  //#endregion (HTML-)File-Export
  //#region Export and Print
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var exportOptions: js.UndefOr[ButtonExportOptions | js.Object] = js.native
  
  /**
    * CSV / EXCEL / PDF: file extension
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * COPY / CSV: field boundary
    */
  var fieldBoundary: js.UndefOr[String] = js.native
  
  /**
    * COPY / CSV: field separator
    */
  var fieldSeparator: js.UndefOr[String] = js.native
  
  //#region (HTML-)File-Export
  /**
    * CSV / EXCEL: Define what the exported filename should be
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show footer
    */
  var footer: js.UndefOr[Boolean] = js.native
  
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var header: js.UndefOr[Boolean] = js.native
  
  /**
    * PDF / PRINT: Extra message
    */
  var message: js.UndefOr[String | Api | JQuery | js.Object] = js.native
  
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageBottom: js.UndefOr[String] = js.native
  
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageTop: js.UndefOr[String] = js.native
  
  /**
    * COPY / CSV: field separator
    */
  var newLine: js.UndefOr[String] = js.native
  
  /**
    * PDF: portrait / landscape
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * PDF: A3 / A4 / A5 / LEGAL / LETTER / TABLOID
    */
  var pageSize: js.UndefOr[String] = js.native
  
  /**
    * COPY / PRINT: title
    */
  var title: js.UndefOr[String] = js.native
}
object ButtonSettings {
  
  @scala.inline
  def apply(): ButtonSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSettings]
  }
  
  @scala.inline
  implicit class ButtonSettingsOps[Self <: ButtonSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoPrint(value: Boolean): Self = this.set("autoPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPrint: Self = this.set("autoPrint", js.undefined)
    
    @scala.inline
    def setBom(value: Boolean): Self = this.set("bom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    
    @scala.inline
    def setCharset(value: String | Boolean): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setColumnText(value: (/* dt */ Api, /* i */ Double, /* title */ String) => String): Self = this.set("columnText", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteColumnText: Self = this.set("columnText", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCustomize(value: /* win */ Window | String => Unit): Self = this.set("customize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomize: Self = this.set("customize", js.undefined)
    
    @scala.inline
    def setCustomizeData(value: /* content */ js.Any => Unit): Self = this.set("customizeData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeData: Self = this.set("customizeData", js.undefined)
    
    @scala.inline
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    
    @scala.inline
    def setExportOptions(value: ButtonExportOptions | js.Object): Self = this.set("exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportOptions: Self = this.set("exportOptions", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFieldBoundary(value: String): Self = this.set("fieldBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldBoundary: Self = this.set("fieldBoundary", js.undefined)
    
    @scala.inline
    def setFieldSeparator(value: String): Self = this.set("fieldSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSeparator: Self = this.set("fieldSeparator", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMessage(value: String | Api | JQuery | js.Object): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageBottom(value: String): Self = this.set("messageBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageBottom: Self = this.set("messageBottom", js.undefined)
    
    @scala.inline
    def setMessageTop(value: String): Self = this.set("messageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTop: Self = this.set("messageTop", js.undefined)
    
    @scala.inline
    def setNewLine(value: String): Self = this.set("newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPageSize(value: String): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
