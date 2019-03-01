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

object ButtonSettings {
  @scala.inline
  def apply(
    action: FunctionButtonAction = null,
    autoPrint: js.UndefOr[scala.Boolean] = js.undefined,
    available: FunctionButtonAvailable = null,
    bom: js.UndefOr[scala.Boolean] = js.undefined,
    charset: java.lang.String | scala.Boolean = null,
    className: java.lang.String = null,
    columnText: FunctionButtonColvisColumnText = null,
    columns: js.Any = null,
    customize: FunctionButtonCustomize = null,
    customizeData: FunctionButtonCustomizeData = null,
    destroy: FunctionButtonInit = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    escapeChar: java.lang.String = null,
    exportOptions: ButtonExportOptions | js.Object = null,
    extend: java.lang.String = null,
    extension: java.lang.String = null,
    fieldBoundary: java.lang.String = null,
    fieldSeparator: java.lang.String = null,
    filename: java.lang.String = null,
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    init: FunctionButtonInit = null,
    key: java.lang.String | ButtonKey = null,
    message: java.lang.String | Api | datatablesDotNetLib.JQuery | js.Object = null,
    messageBottom: java.lang.String = null,
    messageTop: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    newLine: java.lang.String = null,
    orientation: java.lang.String = null,
    pageSize: java.lang.String = null,
    text: java.lang.String | FunctionButtonText = null,
    title: java.lang.String = null,
    titleAttr: java.lang.String = null
  ): ButtonSettings = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(autoPrint)) __obj.updateDynamic("autoPrint")(autoPrint)
    if (available != null) __obj.updateDynamic("available")(available)
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnText != null) __obj.updateDynamic("columnText")(columnText)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (customize != null) __obj.updateDynamic("customize")(customize)
    if (customizeData != null) __obj.updateDynamic("customizeData")(customizeData)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar)
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fieldBoundary != null) __obj.updateDynamic("fieldBoundary")(fieldBoundary)
    if (fieldSeparator != null) __obj.updateDynamic("fieldSeparator")(fieldSeparator)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (init != null) __obj.updateDynamic("init")(init)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageBottom != null) __obj.updateDynamic("messageBottom")(messageBottom)
    if (messageTop != null) __obj.updateDynamic("messageTop")(messageTop)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAttr != null) __obj.updateDynamic("titleAttr")(titleAttr)
    __obj.asInstanceOf[ButtonSettings]
  }
}

