package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Static-Methods"
//#region "Settings"
@js.native
trait Settings extends StObject {
  
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
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjax(value: String | AjaxSettings | FunctionAjax): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxFunction3(
      value: (/* data */ js.Object, /* callback */ js.Function1[/* data */ js.Any, Unit], /* settings */ SettingsLegacy) => Unit
    ): Self = StObject.set(x, "ajax", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setColumnDefs(value: js.Array[ColumnDefsSettings]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
    
    @scala.inline
    def setColumnDefsVarargs(value: ColumnDefsSettings*): Self = StObject.set(x, "columnDefs", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnSettings]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnSettings*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCreatedRow(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* dataIndex */ Double) => Unit): Self = StObject.set(x, "createdRow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreatedRowUndefined: Self = StObject.set(x, "createdRow", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDeferLoading(value: Double | js.Array[Double]): Self = StObject.set(x, "deferLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferLoadingUndefined: Self = StObject.set(x, "deferLoading", js.undefined)
    
    @scala.inline
    def setDeferLoadingVarargs(value: Double*): Self = StObject.set(x, "deferLoading", js.Array(value :_*))
    
    @scala.inline
    def setDeferRender(value: Boolean): Self = StObject.set(x, "deferRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferRenderUndefined: Self = StObject.set(x, "deferRender", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDisplayStart(value: Double): Self = StObject.set(x, "displayStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStartUndefined: Self = StObject.set(x, "displayStart", js.undefined)
    
    @scala.inline
    def setDom(value: String): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    @scala.inline
    def setDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "drawCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawCallbackUndefined: Self = StObject.set(x, "drawCallback", js.undefined)
    
    @scala.inline
    def setFooterCallback(
      value: (/* tfoot */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = StObject.set(x, "footerCallback", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFooterCallbackUndefined: Self = StObject.set(x, "footerCallback", js.undefined)
    
    @scala.inline
    def setFormatNumber(value: /* formatNumber */ Double => Unit): Self = StObject.set(x, "formatNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatNumberUndefined: Self = StObject.set(x, "formatNumber", js.undefined)
    
    @scala.inline
    def setHeaderCallback(
      value: (/* thead */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = StObject.set(x, "headerCallback", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHeaderCallbackUndefined: Self = StObject.set(x, "headerCallback", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoCallback(
      value: (/* settings */ SettingsLegacy, /* start */ Double, /* end */ Double, /* mnax */ Double, /* total */ Double, /* pre */ String) => Unit
    ): Self = StObject.set(x, "infoCallback", js.Any.fromFunction6(value))
    
    @scala.inline
    def setInfoCallbackUndefined: Self = StObject.set(x, "infoCallback", js.undefined)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInitComplete(value: (/* settings */ SettingsLegacy, /* json */ js.Object) => Unit): Self = StObject.set(x, "initComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitCompleteUndefined: Self = StObject.set(x, "initComplete", js.undefined)
    
    @scala.inline
    def setJQueryUI(value: Boolean): Self = StObject.set(x, "jQueryUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJQueryUIUndefined: Self = StObject.set(x, "jQueryUI", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageSettings): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLengthChange(value: Boolean): Self = StObject.set(x, "lengthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthChangeUndefined: Self = StObject.set(x, "lengthChange", js.undefined)
    
    @scala.inline
    def setLengthMenu(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = StObject.set(x, "lengthMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthMenuUndefined: Self = StObject.set(x, "lengthMenu", js.undefined)
    
    @scala.inline
    def setLengthMenuVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "lengthMenu", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderCellsTop(value: Boolean): Self = StObject.set(x, "orderCellsTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderCellsTopUndefined: Self = StObject.set(x, "orderCellsTop", js.undefined)
    
    @scala.inline
    def setOrderClasses(value: Boolean): Self = StObject.set(x, "orderClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderClassesUndefined: Self = StObject.set(x, "orderClasses", js.undefined)
    
    @scala.inline
    def setOrderFixed(value: (js.Array[(js.Array[Double | String]) | Double | String]) | js.Object): Self = StObject.set(x, "orderFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderFixedUndefined: Self = StObject.set(x, "orderFixed", js.undefined)
    
    @scala.inline
    def setOrderFixedVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "orderFixed", js.Array(value :_*))
    
    @scala.inline
    def setOrderMulti(value: Boolean): Self = StObject.set(x, "orderMulti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderMultiUndefined: Self = StObject.set(x, "orderMulti", js.undefined)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    @scala.inline
    def setPageLength(value: Double): Self = StObject.set(x, "pageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLengthUndefined: Self = StObject.set(x, "pageLength", js.undefined)
    
    @scala.inline
    def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingType(value: String): Self = StObject.set(x, "pagingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingTypeUndefined: Self = StObject.set(x, "pagingType", js.undefined)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setPreDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "preDrawCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreDrawCallbackUndefined: Self = StObject.set(x, "preDrawCallback", js.undefined)
    
    @scala.inline
    def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    @scala.inline
    def setRenderer(value: String | RendererSettings): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean | js.Object): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRetrieve(value: Boolean): Self = StObject.set(x, "retrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveUndefined: Self = StObject.set(x, "retrieve", js.undefined)
    
    @scala.inline
    def setRowCallback(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* index */ Double) => Unit): Self = StObject.set(x, "rowCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRowCallbackUndefined: Self = StObject.set(x, "rowCallback", js.undefined)
    
    @scala.inline
    def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    @scala.inline
    def setScrollCollapse(value: Boolean): Self = StObject.set(x, "scrollCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollCollapseUndefined: Self = StObject.set(x, "scrollCollapse", js.undefined)
    
    @scala.inline
    def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: String): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    
    @scala.inline
    def setSearch(value: SearchSettings | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCols(value: js.Array[SearchSettings]): Self = StObject.set(x, "searchCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchColsUndefined: Self = StObject.set(x, "searchCols", js.undefined)
    
    @scala.inline
    def setSearchColsVarargs(value: SearchSettings*): Self = StObject.set(x, "searchCols", js.Array(value :_*))
    
    @scala.inline
    def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDelayUndefined: Self = StObject.set(x, "searchDelay", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: SearchSettings): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
    
    @scala.inline
    def setServerSide(value: Boolean): Self = StObject.set(x, "serverSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideUndefined: Self = StObject.set(x, "serverSide", js.undefined)
    
    @scala.inline
    def setStateDuration(value: Double): Self = StObject.set(x, "stateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDurationUndefined: Self = StObject.set(x, "stateDuration", js.undefined)
    
    @scala.inline
    def setStateLoadCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "stateLoadCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStateLoadCallbackUndefined: Self = StObject.set(x, "stateLoadCallback", js.undefined)
    
    @scala.inline
    def setStateLoadParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateLoadParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateLoadParamsUndefined: Self = StObject.set(x, "stateLoadParams", js.undefined)
    
    @scala.inline
    def setStateLoaded(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateLoadedUndefined: Self = StObject.set(x, "stateLoaded", js.undefined)
    
    @scala.inline
    def setStateSave(value: Boolean): Self = StObject.set(x, "stateSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateSaveCallback(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateSaveCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateSaveCallbackUndefined: Self = StObject.set(x, "stateSaveCallback", js.undefined)
    
    @scala.inline
    def setStateSaveParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateSaveParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateSaveParamsUndefined: Self = StObject.set(x, "stateSaveParams", js.undefined)
    
    @scala.inline
    def setStateSaveUndefined: Self = StObject.set(x, "stateSave", js.undefined)
    
    @scala.inline
    def setStripeClasses(value: js.Array[String]): Self = StObject.set(x, "stripeClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripeClassesUndefined: Self = StObject.set(x, "stripeClasses", js.undefined)
    
    @scala.inline
    def setStripeClassesVarargs(value: String*): Self = StObject.set(x, "stripeClasses", js.Array(value :_*))
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
