package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import typings.std.Window_
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
  var extension: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    action: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit = null,
    autoPrint: js.UndefOr[Boolean] = js.undefined,
    available: (/* dt */ Api, /* config */ js.Any) => Boolean = null,
    bom: js.UndefOr[Boolean] = js.undefined,
    charset: String | Boolean = null,
    className: String = null,
    columnText: (/* dt */ Api, /* i */ Double, /* title */ String) => String = null,
    columns: js.Any = null,
    customize: /* win */ Window_ | String => Unit = null,
    customizeData: /* content */ js.Any => Unit = null,
    destroy: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    escapeChar: String = null,
    exportOptions: ButtonExportOptions | js.Object = null,
    extend: String = null,
    extension: String = null,
    fieldBoundary: String = null,
    fieldSeparator: String = null,
    filename: String = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    init: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit = null,
    key: String | ButtonKey = null,
    message: String | Api | JQuery | js.Object = null,
    messageBottom: String = null,
    messageTop: String = null,
    name: String = null,
    namespace: String = null,
    newLine: String = null,
    orientation: String = null,
    pageSize: String = null,
    text: String | FunctionButtonText = null,
    title: String = null,
    titleAttr: String = null
  ): ButtonSettings = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction4(action))
    if (!js.isUndefined(autoPrint)) __obj.updateDynamic("autoPrint")(autoPrint.asInstanceOf[js.Any])
    if (available != null) __obj.updateDynamic("available")(js.Any.fromFunction2(available))
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnText != null) __obj.updateDynamic("columnText")(js.Any.fromFunction3(columnText))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (customize != null) __obj.updateDynamic("customize")(js.Any.fromFunction1(customize))
    if (customizeData != null) __obj.updateDynamic("customizeData")(js.Any.fromFunction1(customizeData))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3(destroy))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar.asInstanceOf[js.Any])
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fieldBoundary != null) __obj.updateDynamic("fieldBoundary")(fieldBoundary.asInstanceOf[js.Any])
    if (fieldSeparator != null) __obj.updateDynamic("fieldSeparator")(fieldSeparator.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3(init))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageBottom != null) __obj.updateDynamic("messageBottom")(messageBottom.asInstanceOf[js.Any])
    if (messageTop != null) __obj.updateDynamic("messageTop")(messageTop.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (newLine != null) __obj.updateDynamic("newLine")(newLine.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAttr != null) __obj.updateDynamic("titleAttr")(titleAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonSettings]
  }
}

