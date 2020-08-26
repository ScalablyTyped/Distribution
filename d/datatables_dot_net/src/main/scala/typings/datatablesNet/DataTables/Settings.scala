package typings.datatablesNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Static-Methods"
//#region "Settings"
@js.native
trait Settings extends js.Object {
  //#endregion "Features"
  //#region "Data"
  /**
    * Load data for the table's content from an Ajax source. Since: 1.10
    */
  var ajax: js.UndefOr[String | AjaxSettings | FunctionAjax] = js.native
  //#region "Features"
  /**
    * Feature control DataTables' smart column width handling. Since: 1.10
    */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /**
    * Assign a column definition to one or more columns.. Since: 1.10
    */
  var columnDefs: js.UndefOr[js.Array[ColumnDefsSettings]] = js.native
  //#endregion "Data"
  //#region "Options"
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var columns: js.UndefOr[js.Array[ColumnSettings]] = js.native
  //#endregion "Options"
  //#region "Callbacks"
  /**
    * Callback for whenever a TR element is created for the table's body. Since: 1.10
    */
  var createdRow: js.UndefOr[FunctionCreateRow] = js.native
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Delay the loading of server-side data until second draw
    */
  var deferLoading: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Feature control deferred rendering for additional speed of initialisation. Since: 1.10
    */
  var deferRender: js.UndefOr[Boolean] = js.native
  /**
    * Destroy any existing table matching the selector and replace with the new options. Since: 1.10
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * Initial paging start point. Since: 1.10
    */
  var displayStart: js.UndefOr[Double] = js.native
  /**
    * Define the table control elements to appear on the page and in what order. Since: 1.10
    */
  var dom: js.UndefOr[String] = js.native
  /**
    * Function that is called every time DataTables performs a draw. Since: 1.10
    */
  var drawCallback: js.UndefOr[FunctionDrawCallback] = js.native
  /**
    * Footer display callback function. Since: 1.10
    */
  var footerCallback: js.UndefOr[FunctionFooterCallback] = js.native
  /**
    * Number formatting callback function. Since: 1.10
    */
  var formatNumber: js.UndefOr[FunctionFormatNumber] = js.native
  /**
    * Header display callback function. Since: 1.10
    */
  var headerCallback: js.UndefOr[FunctionHeaderCallback] = js.native
  /**
    * Feature control table information display field. Since: 1.10
    */
  var info: js.UndefOr[Boolean] = js.native
  /**
    * Table summary information display callback. Since: 1.10
    */
  var infoCallback: js.UndefOr[FunctionInfoCallback] = js.native
  /**
    * Initialisation complete callback. Since: 1.10
    */
  var initComplete: js.UndefOr[FunctionInitComplete] = js.native
  /**
    * Use markup and classes for the table to be themed by jQuery UI ThemeRoller. Since: 1.10
    */
  var jQueryUI: js.UndefOr[Boolean] = js.native
  //#endregion "Callbacks"
  //#region "Language"
  var language: js.UndefOr[LanguageSettings] = js.native
  /**
    * Feature control the end user's ability to change the paging display length of the table. Since: 1.10
    */
  var lengthChange: js.UndefOr[Boolean] = js.native
  /**
    * Change the options in the page length select list. Since: 1.10
    */
  var lengthMenu: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.native
  /**
    * Initial order (sort) to apply to the table. Since: 1.10
    */
  var order: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.native
  /**
    * Control which cell the order event handler will be applied to in a column. Since: 1.10
    */
  var orderCellsTop: js.UndefOr[Boolean] = js.native
  /**
    * Highlight the columns being ordered in the table's body. Since: 1.10
    */
  var orderClasses: js.UndefOr[Boolean] = js.native
  /**
    * Ordering to always be applied to the table. Since: 1.10
    */
  var orderFixed: js.UndefOr[(js.Array[(js.Array[Double | String]) | Double | String]) | js.Object] = js.native
  /**
    * Multiple column ordering ability control. Since: 1.10
    */
  var orderMulti: js.UndefOr[Boolean] = js.native
  /**
    * Feature control ordering (sorting) abilities in DataTables. Since: 1.10
    */
  var ordering: js.UndefOr[Boolean] = js.native
  /**
    * Change the initial page length (number of rows per page). Since: 1.10
    */
  var pageLength: js.UndefOr[Double] = js.native
  /**
    * Enable or disable table pagination. Since: 1.10
    */
  var paging: js.UndefOr[Boolean] = js.native
  /**
    * Pagination button display options. Basic Types: numbers (1.10.8) simple, simple_numbers, full, full_numbers
    */
  var pagingType: js.UndefOr[String] = js.native
  /**
    * Pre-draw callback. Since: 1.10
    */
  var preDrawCallback: js.UndefOr[FunctionPreDrawCallback] = js.native
  /**
    * Feature control the processing indicator. Since: 1.10
    */
  var processing: js.UndefOr[Boolean] = js.native
  /**
    * Display component renderer types. Since: 1.10
    */
  var renderer: js.UndefOr[String | RendererSettings] = js.native
  /**
    * Enable or disable datatables responsive. Since: 1.10
    */
  var responsive: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * Retrieve an existing DataTables instance. Since: 1.10
    */
  var retrieve: js.UndefOr[Boolean] = js.native
  /**
    * Row draw callback.. Since: 1.10
    */
  var rowCallback: js.UndefOr[FunctionRowCallback] = js.native
  /**
    * Data property name that DataTables will use to set <tr> element DOM IDs. Since: 1.10.8
    */
  var rowId: js.UndefOr[String] = js.native
  /**
    * Allow the table to reduce in height when a limited number of rows are shown. Since: 1.10
    */
  var scrollCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Horizontal scrolling. Since: 1.10
    */
  var scrollX: js.UndefOr[Boolean] = js.native
  /**
    * Vertical scrolling. Since: 1.10 Exp: "200px"
    */
  var scrollY: js.UndefOr[String] = js.native
  /**
    * Set an initial filter in DataTables and / or filtering options. Since: 1.10
    */
  var search: js.UndefOr[SearchSettings | Boolean] = js.native
  /**
    * Define an initial search for individual columns. Since: 1.10
    */
  var searchCols: js.UndefOr[js.Array[SearchSettings]] = js.native
  /**
    * Set a throttle frequency for searching. Since: 1.10
    */
  var searchDelay: js.UndefOr[Double] = js.native
  /**
    * Set placeholder attribute for input type="text" tag elements. Since: 1.10
    */
  var searchPlaceholder: js.UndefOr[SearchSettings] = js.native
  /**
    * Feature control search (filtering) abilities Since: 1.10
    */
  var searching: js.UndefOr[Boolean] = js.native
  /**
    * Feature control DataTables' server-side processing mode. Since: 1.10
    */
  var serverSide: js.UndefOr[Boolean] = js.native
  /**
    * Saved state validity duration. Since: 1.10
    */
  var stateDuration: js.UndefOr[Double] = js.native
  /**
    * Callback that defines where and how a saved state should be loaded. Since: 1.10
    */
  var stateLoadCallback: js.UndefOr[FunctionStateLoadCallback] = js.native
  /**
    * State loaded - data manipulation callback. Since: 1.10
    */
  var stateLoadParams: js.UndefOr[FunctionStateLoadParams] = js.native
  /**
    * State loaded callback. Since: 1.10
    */
  var stateLoaded: js.UndefOr[FunctionStateLoaded] = js.native
  /**
    * State saving - restore table state on page reload. Since: 1.10
    */
  var stateSave: js.UndefOr[Boolean] = js.native
  /**
    * Callback that defines how the table state is stored and where. Since: 1.10
    */
  var stateSaveCallback: js.UndefOr[FunctionStateSaveCallback] = js.native
  /**
    * State save - data manipulation callback. Since: 1.10
    */
  var stateSaveParams: js.UndefOr[FunctionStateSaveParams] = js.native
  /**
    * Set the zebra stripe class names for the rows in the table. Since: 1.10
    */
  var stripeClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tab index control for keyboard navigation. Since: 1.10
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setAjaxFunction3(
      value: (/* data */ js.Object, /* callback */ js.Function1[/* data */ js.Any, Unit], /* settings */ SettingsLegacy) => Unit
    ): Self = this.set("ajax", js.Any.fromFunction3(value))
    @scala.inline
    def setAjax(value: String | AjaxSettings | FunctionAjax): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setColumnDefsVarargs(value: ColumnDefsSettings*): Self = this.set("columnDefs", js.Array(value :_*))
    @scala.inline
    def setColumnDefs(value: js.Array[ColumnDefsSettings]): Self = this.set("columnDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDefs: Self = this.set("columnDefs", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnSettings*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnSettings]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCreatedRow(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* dataIndex */ Double) => Unit): Self = this.set("createdRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreatedRow: Self = this.set("createdRow", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDeferLoadingVarargs(value: Double*): Self = this.set("deferLoading", js.Array(value :_*))
    @scala.inline
    def setDeferLoading(value: Double | js.Array[Double]): Self = this.set("deferLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferLoading: Self = this.set("deferLoading", js.undefined)
    @scala.inline
    def setDeferRender(value: Boolean): Self = this.set("deferRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferRender: Self = this.set("deferRender", js.undefined)
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisplayStart(value: Double): Self = this.set("displayStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayStart: Self = this.set("displayStart", js.undefined)
    @scala.inline
    def setDom(value: String): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    @scala.inline
    def setDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = this.set("drawCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrawCallback: Self = this.set("drawCallback", js.undefined)
    @scala.inline
    def setFooterCallback(
      value: (/* tfoot */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = this.set("footerCallback", js.Any.fromFunction5(value))
    @scala.inline
    def deleteFooterCallback: Self = this.set("footerCallback", js.undefined)
    @scala.inline
    def setFormatNumber(value: /* formatNumber */ Double => Unit): Self = this.set("formatNumber", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatNumber: Self = this.set("formatNumber", js.undefined)
    @scala.inline
    def setHeaderCallback(
      value: (/* thead */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = this.set("headerCallback", js.Any.fromFunction5(value))
    @scala.inline
    def deleteHeaderCallback: Self = this.set("headerCallback", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInfoCallback(
      value: (/* settings */ SettingsLegacy, /* start */ Double, /* end */ Double, /* mnax */ Double, /* total */ Double, /* pre */ String) => Unit
    ): Self = this.set("infoCallback", js.Any.fromFunction6(value))
    @scala.inline
    def deleteInfoCallback: Self = this.set("infoCallback", js.undefined)
    @scala.inline
    def setInitComplete(value: (/* settings */ SettingsLegacy, /* json */ js.Object) => Unit): Self = this.set("initComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInitComplete: Self = this.set("initComplete", js.undefined)
    @scala.inline
    def setJQueryUI(value: Boolean): Self = this.set("jQueryUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJQueryUI: Self = this.set("jQueryUI", js.undefined)
    @scala.inline
    def setLanguage(value: LanguageSettings): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLengthChange(value: Boolean): Self = this.set("lengthChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthChange: Self = this.set("lengthChange", js.undefined)
    @scala.inline
    def setLengthMenuVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = this.set("lengthMenu", js.Array(value :_*))
    @scala.inline
    def setLengthMenu(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = this.set("lengthMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthMenu: Self = this.set("lengthMenu", js.undefined)
    @scala.inline
    def setOrderVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrderCellsTop(value: Boolean): Self = this.set("orderCellsTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderCellsTop: Self = this.set("orderCellsTop", js.undefined)
    @scala.inline
    def setOrderClasses(value: Boolean): Self = this.set("orderClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderClasses: Self = this.set("orderClasses", js.undefined)
    @scala.inline
    def setOrderFixedVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = this.set("orderFixed", js.Array(value :_*))
    @scala.inline
    def setOrderFixed(value: (js.Array[(js.Array[Double | String]) | Double | String]) | js.Object): Self = this.set("orderFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderFixed: Self = this.set("orderFixed", js.undefined)
    @scala.inline
    def setOrderMulti(value: Boolean): Self = this.set("orderMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderMulti: Self = this.set("orderMulti", js.undefined)
    @scala.inline
    def setOrdering(value: Boolean): Self = this.set("ordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdering: Self = this.set("ordering", js.undefined)
    @scala.inline
    def setPageLength(value: Double): Self = this.set("pageLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLength: Self = this.set("pageLength", js.undefined)
    @scala.inline
    def setPaging(value: Boolean): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setPagingType(value: String): Self = this.set("pagingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingType: Self = this.set("pagingType", js.undefined)
    @scala.inline
    def setPreDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = this.set("preDrawCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreDrawCallback: Self = this.set("preDrawCallback", js.undefined)
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    @scala.inline
    def setRenderer(value: String | RendererSettings): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean | js.Object): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRetrieve(value: Boolean): Self = this.set("retrieve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrieve: Self = this.set("retrieve", js.undefined)
    @scala.inline
    def setRowCallback(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* index */ Double) => Unit): Self = this.set("rowCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRowCallback: Self = this.set("rowCallback", js.undefined)
    @scala.inline
    def setRowId(value: String): Self = this.set("rowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
    @scala.inline
    def setScrollCollapse(value: Boolean): Self = this.set("scrollCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollCollapse: Self = this.set("scrollCollapse", js.undefined)
    @scala.inline
    def setScrollX(value: Boolean): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    @scala.inline
    def setScrollY(value: String): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
    @scala.inline
    def setSearch(value: SearchSettings | Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSearchColsVarargs(value: SearchSettings*): Self = this.set("searchCols", js.Array(value :_*))
    @scala.inline
    def setSearchCols(value: js.Array[SearchSettings]): Self = this.set("searchCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchCols: Self = this.set("searchCols", js.undefined)
    @scala.inline
    def setSearchDelay(value: Double): Self = this.set("searchDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchDelay: Self = this.set("searchDelay", js.undefined)
    @scala.inline
    def setSearchPlaceholder(value: SearchSettings): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    @scala.inline
    def setSearching(value: Boolean): Self = this.set("searching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearching: Self = this.set("searching", js.undefined)
    @scala.inline
    def setServerSide(value: Boolean): Self = this.set("serverSide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSide: Self = this.set("serverSide", js.undefined)
    @scala.inline
    def setStateDuration(value: Double): Self = this.set("stateDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateDuration: Self = this.set("stateDuration", js.undefined)
    @scala.inline
    def setStateLoadCallback(value: /* settings */ SettingsLegacy => Unit): Self = this.set("stateLoadCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStateLoadCallback: Self = this.set("stateLoadCallback", js.undefined)
    @scala.inline
    def setStateLoadParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = this.set("stateLoadParams", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateLoadParams: Self = this.set("stateLoadParams", js.undefined)
    @scala.inline
    def setStateLoaded(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = this.set("stateLoaded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateLoaded: Self = this.set("stateLoaded", js.undefined)
    @scala.inline
    def setStateSave(value: Boolean): Self = this.set("stateSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateSave: Self = this.set("stateSave", js.undefined)
    @scala.inline
    def setStateSaveCallback(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = this.set("stateSaveCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateSaveCallback: Self = this.set("stateSaveCallback", js.undefined)
    @scala.inline
    def setStateSaveParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = this.set("stateSaveParams", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateSaveParams: Self = this.set("stateSaveParams", js.undefined)
    @scala.inline
    def setStripeClassesVarargs(value: String*): Self = this.set("stripeClasses", js.Array(value :_*))
    @scala.inline
    def setStripeClasses(value: js.Array[String]): Self = this.set("stripeClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeClasses: Self = this.set("stripeClasses", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

