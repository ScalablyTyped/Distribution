package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Button Defaults"
//#region "Add-Ons"
/**
     * Buttons extension options
     */

trait ButtonSettings extends ButtomSettingsCommon {
  /**
           * PRINT: Show print dialoge on click
           */
  var autoPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * CSV: UTF-8 boom
           */
  var bom: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * CSV: charset
           */
  var charset: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
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
  var escapeChar: js.UndefOr[java.lang.String] = js.undefined
  //#endregion (HTML-)File-Export
  //#region Export and Print
  /**
           * COPY / CSV / EXCEL / PDF / PRINT: show header
           */
  var exportOptions: js.UndefOr[ButtonExportOptions | js.Object] = js.undefined
  /**
           * CSV / EXCEL / PDF: file extension
           */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / CSV: field boundary
           */
  var fieldBoundary: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / CSV: field separator
           */
  var fieldSeparator: js.UndefOr[java.lang.String] = js.undefined
  //#region (HTML-)File-Export
  /**
           * CSV / EXCEL: Define what the exported filename should be
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / CSV / EXCEL / PDF / PRINT: show footer
           */
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * COPY / CSV / EXCEL / PDF / PRINT: show header
           */
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * PDF / PRINT: Extra message
           */
  var message: js.UndefOr[java.lang.String | Api | datatablesDotNetLib.JQuery | js.Object] = js.undefined
  /**
           * COPY / EXCEL / PDF / PRINT: field separator
           */
  var messageBottom: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / EXCEL / PDF / PRINT: field separator
           */
  var messageTop: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / CSV: field separator
           */
  var newLine: js.UndefOr[java.lang.String] = js.undefined
  /**
           * PDF: portrait / landscape
           */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * PDF: A3 / A4 / A5 / LEGAL / LETTER / TABLOID
           */
  var pageSize: js.UndefOr[java.lang.String] = js.undefined
  /**
           * COPY / PRINT: title
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

