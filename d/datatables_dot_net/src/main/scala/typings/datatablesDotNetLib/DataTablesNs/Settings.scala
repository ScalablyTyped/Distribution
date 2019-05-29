package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Static-Methods"
//#region "Settings"
trait Settings extends js.Object {
  //#endregion "Features"
  //#region "Data"
  /**
    * Load data for the table's content from an Ajax source. Since: 1.10
    */
  var ajax: js.UndefOr[java.lang.String | AjaxSettings | FunctionAjax] = js.undefined
  //#region "Features"
  /**
    * Feature control DataTables' smart column width handling. Since: 1.10
    */
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Assign a column definition to one or more columns.. Since: 1.10
    */
  var columnDefs: js.UndefOr[js.Array[ColumnDefsSettings]] = js.undefined
  //#endregion "Data"
  //#region "Options"
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var columns: js.UndefOr[js.Array[ColumnSettings]] = js.undefined
  //#endregion "Options"
  //#region "Callbacks"
  /**
    * Callback for whenever a TR element is created for the table's body. Since: 1.10
    */
  var createdRow: js.UndefOr[FunctionCreateRow] = js.undefined
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Delay the loading of server-side data until second draw
    */
  var deferLoading: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * Feature control deferred rendering for additional speed of initialisation. Since: 1.10
    */
  var deferRender: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Destroy any existing table matching the selector and replace with the new options. Since: 1.10
    */
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initial paging start point. Since: 1.10
    */
  var displayStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * Define the table control elements to appear on the page and in what order. Since: 1.10
    */
  var dom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function that is called every time DataTables performs a draw. Since: 1.10
    */
  var drawCallback: js.UndefOr[FunctionDrawCallback] = js.undefined
  /**
    * Footer display callback function. Since: 1.10
    */
  var footerCallback: js.UndefOr[FunctionFooterCallback] = js.undefined
  /**
    * Number formatting callback function. Since: 1.10
    */
  var formatNumber: js.UndefOr[FunctionFormatNumber] = js.undefined
  /**
    * Header display callback function. Since: 1.10
    */
  var headerCallback: js.UndefOr[FunctionHeaderCallback] = js.undefined
  /**
    * Feature control table information display field. Since: 1.10
    */
  var info: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Table summary information display callback. Since: 1.10
    */
  var infoCallback: js.UndefOr[FunctionInfoCallback] = js.undefined
  /**
    * Initialisation complete callback. Since: 1.10
    */
  var initComplete: js.UndefOr[FunctionInitComplete] = js.undefined
  /**
    * Use markup and classes for the table to be themed by jQuery UI ThemeRoller. Since: 1.10
    */
  var jQueryUI: js.UndefOr[scala.Boolean] = js.undefined
  //#endregion "Callbacks"
  //#region "Language"
  var language: js.UndefOr[LanguageSettings] = js.undefined
  /**
    * Feature control the end user's ability to change the paging display length of the table. Since: 1.10
    */
  var lengthChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change the options in the page length select list. Since: 1.10
    */
  var lengthMenu: js.UndefOr[
    js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String]
  ] = js.undefined
  /**
    * Initial order (sort) to apply to the table. Since: 1.10
    */
  var order: js.UndefOr[
    js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String]
  ] = js.undefined
  /**
    * Control which cell the order event handler will be applied to in a column. Since: 1.10
    */
  var orderCellsTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Highlight the columns being ordered in the table's body. Since: 1.10
    */
  var orderClasses: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ordering to always be applied to the table. Since: 1.10
    */
  var orderFixed: js.UndefOr[
    (js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String]) | js.Object
  ] = js.undefined
  /**
    * Multiple column ordering ability control. Since: 1.10
    */
  var orderMulti: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Feature control ordering (sorting) abilities in DataTables. Since: 1.10
    */
  var ordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change the initial page length (number of rows per page). Since: 1.10
    */
  var pageLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable or disable table pagination. Since: 1.10
    */
  var paging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pagination button display options. Basic Types: numbers (1.10.8) simple, simple_numbers, full, full_numbers
    */
  var pagingType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pre-draw callback. Since: 1.10
    */
  var preDrawCallback: js.UndefOr[FunctionPreDrawCallback] = js.undefined
  /**
    * Feature control the processing indicator. Since: 1.10
    */
  var processing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Display component renderer types. Since: 1.10
    */
  var renderer: js.UndefOr[java.lang.String | RendererSettings] = js.undefined
  /**
    * Enable or disable datatables responsive. Since: 1.10
    */
  var responsive: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
    * Retrieve an existing DataTables instance. Since: 1.10
    */
  var retrieve: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Row draw callback.. Since: 1.10
    */
  var rowCallback: js.UndefOr[FunctionRowCallback] = js.undefined
  /**
    * Data property name that DataTables will use to set <tr> element DOM IDs. Since: 1.10.8
    */
  var rowId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow the table to reduce in height when a limited number of rows are shown. Since: 1.10
    */
  var scrollCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Horizontal scrolling. Since: 1.10
    */
  var scrollX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical scrolling. Since: 1.10 Exp: "200px"
    */
  var scrollY: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set an initial filter in DataTables and / or filtering options. Since: 1.10
    */
  var search: js.UndefOr[SearchSettings | scala.Boolean] = js.undefined
  /**
    * Define an initial search for individual columns. Since: 1.10
    */
  var searchCols: js.UndefOr[js.Array[SearchSettings]] = js.undefined
  /**
    * Set a throttle frequency for searching. Since: 1.10
    */
  var searchDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set placeholder attribute for input type="text" tag elements. Since: 1.10
    */
  var searchPlaceholder: js.UndefOr[SearchSettings] = js.undefined
  /**
    * Feature control search (filtering) abilities Since: 1.10
    */
  var searching: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Feature control DataTables' server-side processing mode. Since: 1.10
    */
  var serverSide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Saved state validity duration. Since: 1.10
    */
  var stateDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback that defines where and how a saved state should be loaded. Since: 1.10
    */
  var stateLoadCallback: js.UndefOr[FunctionStateLoadCallback] = js.undefined
  /**
    * State loaded - data manipulation callback. Since: 1.10
    */
  var stateLoadParams: js.UndefOr[FunctionStateLoadParams] = js.undefined
  /**
    * State loaded callback. Since: 1.10
    */
  var stateLoaded: js.UndefOr[FunctionStateLoaded] = js.undefined
  /**
    * State saving - restore table state on page reload. Since: 1.10
    */
  var stateSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback that defines how the table state is stored and where. Since: 1.10
    */
  var stateSaveCallback: js.UndefOr[FunctionStateSaveCallback] = js.undefined
  /**
    * State save - data manipulation callback. Since: 1.10
    */
  var stateSaveParams: js.UndefOr[FunctionStateSaveParams] = js.undefined
  /**
    * Set the zebra stripe class names for the rows in the table. Since: 1.10
    */
  var stripeClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Tab index control for keyboard navigation. Since: 1.10
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    ajax: java.lang.String | AjaxSettings | FunctionAjax = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    columnDefs: js.Array[ColumnDefsSettings] = null,
    columns: js.Array[ColumnSettings] = null,
    createdRow: FunctionCreateRow = null,
    data: js.Array[_] = null,
    deferLoading: scala.Double | js.Array[scala.Double] = null,
    deferRender: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    displayStart: scala.Int | scala.Double = null,
    dom: java.lang.String = null,
    drawCallback: FunctionDrawCallback = null,
    footerCallback: FunctionFooterCallback = null,
    formatNumber: FunctionFormatNumber = null,
    headerCallback: FunctionHeaderCallback = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    infoCallback: FunctionInfoCallback = null,
    initComplete: FunctionInitComplete = null,
    jQueryUI: js.UndefOr[scala.Boolean] = js.undefined,
    language: LanguageSettings = null,
    lengthChange: js.UndefOr[scala.Boolean] = js.undefined,
    lengthMenu: js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String] = null,
    order: js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String] = null,
    orderCellsTop: js.UndefOr[scala.Boolean] = js.undefined,
    orderClasses: js.UndefOr[scala.Boolean] = js.undefined,
    orderFixed: (js.Array[(js.Array[scala.Double | java.lang.String]) | scala.Double | java.lang.String]) | js.Object = null,
    orderMulti: js.UndefOr[scala.Boolean] = js.undefined,
    ordering: js.UndefOr[scala.Boolean] = js.undefined,
    pageLength: scala.Int | scala.Double = null,
    paging: js.UndefOr[scala.Boolean] = js.undefined,
    pagingType: java.lang.String = null,
    preDrawCallback: FunctionPreDrawCallback = null,
    processing: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: java.lang.String | RendererSettings = null,
    responsive: scala.Boolean | js.Object = null,
    retrieve: js.UndefOr[scala.Boolean] = js.undefined,
    rowCallback: FunctionRowCallback = null,
    rowId: java.lang.String = null,
    scrollCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    scrollX: js.UndefOr[scala.Boolean] = js.undefined,
    scrollY: java.lang.String = null,
    search: SearchSettings | scala.Boolean = null,
    searchCols: js.Array[SearchSettings] = null,
    searchDelay: scala.Int | scala.Double = null,
    searchPlaceholder: SearchSettings = null,
    searching: js.UndefOr[scala.Boolean] = js.undefined,
    serverSide: js.UndefOr[scala.Boolean] = js.undefined,
    stateDuration: scala.Int | scala.Double = null,
    stateLoadCallback: FunctionStateLoadCallback = null,
    stateLoadParams: FunctionStateLoadParams = null,
    stateLoaded: FunctionStateLoaded = null,
    stateSave: js.UndefOr[scala.Boolean] = js.undefined,
    stateSaveCallback: FunctionStateSaveCallback = null,
    stateSaveParams: FunctionStateSaveParams = null,
    stripeClasses: js.Array[java.lang.String] = null,
    tabIndex: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (createdRow != null) __obj.updateDynamic("createdRow")(createdRow)
    if (data != null) __obj.updateDynamic("data")(data)
    if (deferLoading != null) __obj.updateDynamic("deferLoading")(deferLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRender)) __obj.updateDynamic("deferRender")(deferRender)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (displayStart != null) __obj.updateDynamic("displayStart")(displayStart.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (drawCallback != null) __obj.updateDynamic("drawCallback")(drawCallback)
    if (footerCallback != null) __obj.updateDynamic("footerCallback")(footerCallback)
    if (formatNumber != null) __obj.updateDynamic("formatNumber")(formatNumber)
    if (headerCallback != null) __obj.updateDynamic("headerCallback")(headerCallback)
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (infoCallback != null) __obj.updateDynamic("infoCallback")(infoCallback)
    if (initComplete != null) __obj.updateDynamic("initComplete")(initComplete)
    if (!js.isUndefined(jQueryUI)) __obj.updateDynamic("jQueryUI")(jQueryUI)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(lengthChange)) __obj.updateDynamic("lengthChange")(lengthChange)
    if (lengthMenu != null) __obj.updateDynamic("lengthMenu")(lengthMenu)
    if (order != null) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(orderCellsTop)) __obj.updateDynamic("orderCellsTop")(orderCellsTop)
    if (!js.isUndefined(orderClasses)) __obj.updateDynamic("orderClasses")(orderClasses)
    if (orderFixed != null) __obj.updateDynamic("orderFixed")(orderFixed.asInstanceOf[js.Any])
    if (!js.isUndefined(orderMulti)) __obj.updateDynamic("orderMulti")(orderMulti)
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering)
    if (pageLength != null) __obj.updateDynamic("pageLength")(pageLength.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging)
    if (pagingType != null) __obj.updateDynamic("pagingType")(pagingType)
    if (preDrawCallback != null) __obj.updateDynamic("preDrawCallback")(preDrawCallback)
    if (!js.isUndefined(processing)) __obj.updateDynamic("processing")(processing)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(retrieve)) __obj.updateDynamic("retrieve")(retrieve)
    if (rowCallback != null) __obj.updateDynamic("rowCallback")(rowCallback)
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    if (!js.isUndefined(scrollCollapse)) __obj.updateDynamic("scrollCollapse")(scrollCollapse)
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX)
    if (scrollY != null) __obj.updateDynamic("scrollY")(scrollY)
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchCols != null) __obj.updateDynamic("searchCols")(searchCols)
    if (searchDelay != null) __obj.updateDynamic("searchDelay")(searchDelay.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (!js.isUndefined(searching)) __obj.updateDynamic("searching")(searching)
    if (!js.isUndefined(serverSide)) __obj.updateDynamic("serverSide")(serverSide)
    if (stateDuration != null) __obj.updateDynamic("stateDuration")(stateDuration.asInstanceOf[js.Any])
    if (stateLoadCallback != null) __obj.updateDynamic("stateLoadCallback")(stateLoadCallback)
    if (stateLoadParams != null) __obj.updateDynamic("stateLoadParams")(stateLoadParams)
    if (stateLoaded != null) __obj.updateDynamic("stateLoaded")(stateLoaded)
    if (!js.isUndefined(stateSave)) __obj.updateDynamic("stateSave")(stateSave)
    if (stateSaveCallback != null) __obj.updateDynamic("stateSaveCallback")(stateSaveCallback)
    if (stateSaveParams != null) __obj.updateDynamic("stateSaveParams")(stateSaveParams)
    if (stripeClasses != null) __obj.updateDynamic("stripeClasses")(stripeClasses)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

