package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Static-Methods"
//#region "Settings"
trait Settings extends StObject {
  
  //#endregion "Features"
  //#region "Data"
  /**
    * Load data for the table's content from an Ajax source. Since: 1.10
    */
  var ajax: js.UndefOr[String | AjaxSettings | FunctionAjax] = js.undefined
  
  //#region "Features"
  /**
    * Feature control DataTables' smart column width handling. Since: 1.10
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
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
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Delay the loading of server-side data until second draw
    */
  var deferLoading: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Feature control deferred rendering for additional speed of initialisation. Since: 1.10
    */
  var deferRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Destroy any existing table matching the selector and replace with the new options. Since: 1.10
    */
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial paging start point. Since: 1.10
    */
  var displayStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Define the table control elements to appear on the page and in what order. Since: 1.10
    */
  var dom: js.UndefOr[String] = js.undefined
  
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
  var info: js.UndefOr[Boolean] = js.undefined
  
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
  var jQueryUI: js.UndefOr[Boolean] = js.undefined
  
  //#endregion "Callbacks"
  //#region "Language"
  var language: js.UndefOr[LanguageSettings] = js.undefined
  
  /**
    * Feature control the end user's ability to change the paging display length of the table. Since: 1.10
    */
  var lengthChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change the options in the page length select list. Since: 1.10
    */
  var lengthMenu: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.undefined
  
  /**
    * Initial order (sort) to apply to the table. Since: 1.10
    */
  var order: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.undefined
  
  /**
    * Control which cell the order event handler will be applied to in a column. Since: 1.10
    */
  var orderCellsTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Highlight the columns being ordered in the table's body. Since: 1.10
    */
  var orderClasses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ordering to always be applied to the table. Since: 1.10
    */
  var orderFixed: js.UndefOr[(js.Array[(js.Array[Double | String]) | Double | String]) | js.Object] = js.undefined
  
  /**
    * Multiple column ordering ability control. Since: 1.10
    */
  var orderMulti: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Feature control ordering (sorting) abilities in DataTables. Since: 1.10
    */
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change the initial page length (number of rows per page). Since: 1.10
    */
  var pageLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable or disable table pagination. Since: 1.10
    */
  var paging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pagination button display options. Basic Types: numbers (1.10.8) simple, simple_numbers, full, full_numbers
    */
  var pagingType: js.UndefOr[String] = js.undefined
  
  /**
    * Pre-draw callback. Since: 1.10
    */
  var preDrawCallback: js.UndefOr[FunctionPreDrawCallback] = js.undefined
  
  /**
    * Feature control the processing indicator. Since: 1.10
    */
  var processing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display component renderer types. Since: 1.10
    */
  var renderer: js.UndefOr[String | RendererSettings] = js.undefined
  
  /**
    * Enable or disable datatables responsive. Since: 1.10
    */
  var responsive: js.UndefOr[Boolean | js.Object] = js.undefined
  
  /**
    * Retrieve an existing DataTables instance. Since: 1.10
    */
  var retrieve: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Row draw callback.. Since: 1.10
    */
  var rowCallback: js.UndefOr[FunctionRowCallback] = js.undefined
  
  /**
    * Data property name that DataTables will use to set <tr> element DOM IDs. Since: 1.10.8
    */
  var rowId: js.UndefOr[String | (js.Function1[/* data */ Any, String])] = js.undefined
  
  /**
    * Allow the table to reduce in height when a limited number of rows are shown. Since: 1.10
    */
  var scrollCollapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Horizontal scrolling. Since: 1.10
    */
  var scrollX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical scrolling. Since: 1.10 Exp: "200px"
    */
  var scrollY: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Set an initial filter in DataTables and / or filtering options. Since: 1.10
    */
  var search: js.UndefOr[SearchSettings | Boolean] = js.undefined
  
  /**
    * Define an initial search for individual columns. Since: 1.10
    */
  var searchCols: js.UndefOr[js.Array[SearchSettings]] = js.undefined
  
  /**
    * Set a throttle frequency for searching. Since: 1.10
    */
  var searchDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Set placeholder attribute for input type="text" tag elements. Since: 1.10
    */
  var searchPlaceholder: js.UndefOr[SearchSettings] = js.undefined
  
  /**
    * Feature control search (filtering) abilities Since: 1.10
    */
  var searching: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Feature control DataTables' server-side processing mode. Since: 1.10
    */
  var serverSide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Saved state validity duration. Since: 1.10
    */
  var stateDuration: js.UndefOr[Double] = js.undefined
  
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
  var stateSave: js.UndefOr[Boolean] = js.undefined
  
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
  var stripeClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Tab index control for keyboard navigation. Since: 1.10
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setAjax(value: String | AjaxSettings | FunctionAjax): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    inline def setAjaxFunction3(
      value: (/* data */ js.Object, /* callback */ js.Function1[/* data */ Any, Unit], /* settings */ SettingsLegacy) => Unit
    ): Self = StObject.set(x, "ajax", js.Any.fromFunction3(value))
    
    inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setColumnDefs(value: js.Array[ColumnDefsSettings]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
    
    inline def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
    
    inline def setColumnDefsVarargs(value: ColumnDefsSettings*): Self = StObject.set(x, "columnDefs", js.Array(value*))
    
    inline def setColumns(value: js.Array[ColumnSettings]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnSettings*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreatedRow(
      value: (/* row */ Node, /* data */ js.Array[Any] | js.Object, /* dataIndex */ Double, /* cells */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "createdRow", js.Any.fromFunction4(value))
    
    inline def setCreatedRowUndefined: Self = StObject.set(x, "createdRow", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDeferLoading(value: Double | js.Array[Double]): Self = StObject.set(x, "deferLoading", value.asInstanceOf[js.Any])
    
    inline def setDeferLoadingUndefined: Self = StObject.set(x, "deferLoading", js.undefined)
    
    inline def setDeferLoadingVarargs(value: Double*): Self = StObject.set(x, "deferLoading", js.Array(value*))
    
    inline def setDeferRender(value: Boolean): Self = StObject.set(x, "deferRender", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderUndefined: Self = StObject.set(x, "deferRender", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisplayStart(value: Double): Self = StObject.set(x, "displayStart", value.asInstanceOf[js.Any])
    
    inline def setDisplayStartUndefined: Self = StObject.set(x, "displayStart", js.undefined)
    
    inline def setDom(value: String): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "drawCallback", js.Any.fromFunction1(value))
    
    inline def setDrawCallbackUndefined: Self = StObject.set(x, "drawCallback", js.undefined)
    
    inline def setFooterCallback(
      value: (/* tfoot */ Node, /* data */ js.Array[Any], /* start */ Double, /* end */ Double, /* display */ js.Array[Any]) => Unit
    ): Self = StObject.set(x, "footerCallback", js.Any.fromFunction5(value))
    
    inline def setFooterCallbackUndefined: Self = StObject.set(x, "footerCallback", js.undefined)
    
    inline def setFormatNumber(value: /* formatNumber */ Double => Unit): Self = StObject.set(x, "formatNumber", js.Any.fromFunction1(value))
    
    inline def setFormatNumberUndefined: Self = StObject.set(x, "formatNumber", js.undefined)
    
    inline def setHeaderCallback(
      value: (/* thead */ Node, /* data */ js.Array[Any], /* start */ Double, /* end */ Double, /* display */ js.Array[Any]) => Unit
    ): Self = StObject.set(x, "headerCallback", js.Any.fromFunction5(value))
    
    inline def setHeaderCallbackUndefined: Self = StObject.set(x, "headerCallback", js.undefined)
    
    inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoCallback(
      value: (/* settings */ SettingsLegacy, /* start */ Double, /* end */ Double, /* mnax */ Double, /* total */ Double, /* pre */ String) => Unit
    ): Self = StObject.set(x, "infoCallback", js.Any.fromFunction6(value))
    
    inline def setInfoCallbackUndefined: Self = StObject.set(x, "infoCallback", js.undefined)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setInitComplete(value: (/* settings */ SettingsLegacy, /* json */ js.Object) => Unit): Self = StObject.set(x, "initComplete", js.Any.fromFunction2(value))
    
    inline def setInitCompleteUndefined: Self = StObject.set(x, "initComplete", js.undefined)
    
    inline def setJQueryUI(value: Boolean): Self = StObject.set(x, "jQueryUI", value.asInstanceOf[js.Any])
    
    inline def setJQueryUIUndefined: Self = StObject.set(x, "jQueryUI", js.undefined)
    
    inline def setLanguage(value: LanguageSettings): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLengthChange(value: Boolean): Self = StObject.set(x, "lengthChange", value.asInstanceOf[js.Any])
    
    inline def setLengthChangeUndefined: Self = StObject.set(x, "lengthChange", js.undefined)
    
    inline def setLengthMenu(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = StObject.set(x, "lengthMenu", value.asInstanceOf[js.Any])
    
    inline def setLengthMenuUndefined: Self = StObject.set(x, "lengthMenu", js.undefined)
    
    inline def setLengthMenuVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "lengthMenu", js.Array(value*))
    
    inline def setOrder(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderCellsTop(value: Boolean): Self = StObject.set(x, "orderCellsTop", value.asInstanceOf[js.Any])
    
    inline def setOrderCellsTopUndefined: Self = StObject.set(x, "orderCellsTop", js.undefined)
    
    inline def setOrderClasses(value: Boolean): Self = StObject.set(x, "orderClasses", value.asInstanceOf[js.Any])
    
    inline def setOrderClassesUndefined: Self = StObject.set(x, "orderClasses", js.undefined)
    
    inline def setOrderFixed(value: (js.Array[(js.Array[Double | String]) | Double | String]) | js.Object): Self = StObject.set(x, "orderFixed", value.asInstanceOf[js.Any])
    
    inline def setOrderFixedUndefined: Self = StObject.set(x, "orderFixed", js.undefined)
    
    inline def setOrderFixedVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "orderFixed", js.Array(value*))
    
    inline def setOrderMulti(value: Boolean): Self = StObject.set(x, "orderMulti", value.asInstanceOf[js.Any])
    
    inline def setOrderMultiUndefined: Self = StObject.set(x, "orderMulti", js.undefined)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: ((js.Array[Double | String]) | Double | String)*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setPageLength(value: Double): Self = StObject.set(x, "pageLength", value.asInstanceOf[js.Any])
    
    inline def setPageLengthUndefined: Self = StObject.set(x, "pageLength", js.undefined)
    
    inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingType(value: String): Self = StObject.set(x, "pagingType", value.asInstanceOf[js.Any])
    
    inline def setPagingTypeUndefined: Self = StObject.set(x, "pagingType", js.undefined)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setPreDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "preDrawCallback", js.Any.fromFunction1(value))
    
    inline def setPreDrawCallbackUndefined: Self = StObject.set(x, "preDrawCallback", js.undefined)
    
    inline def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setRenderer(value: String | RendererSettings): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setResponsive(value: Boolean | js.Object): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRetrieve(value: Boolean): Self = StObject.set(x, "retrieve", value.asInstanceOf[js.Any])
    
    inline def setRetrieveUndefined: Self = StObject.set(x, "retrieve", js.undefined)
    
    inline def setRowCallback(value: (/* row */ Node, /* data */ js.Array[Any] | js.Object, /* index */ Double) => Unit): Self = StObject.set(x, "rowCallback", js.Any.fromFunction3(value))
    
    inline def setRowCallbackUndefined: Self = StObject.set(x, "rowCallback", js.undefined)
    
    inline def setRowId(value: String | (js.Function1[/* data */ Any, String])): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdFunction1(value: /* data */ Any => String): Self = StObject.set(x, "rowId", js.Any.fromFunction1(value))
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    inline def setScrollCollapse(value: Boolean): Self = StObject.set(x, "scrollCollapse", value.asInstanceOf[js.Any])
    
    inline def setScrollCollapseUndefined: Self = StObject.set(x, "scrollCollapse", js.undefined)
    
    inline def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    inline def setScrollY(value: Double | String): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    
    inline def setSearch(value: SearchSettings | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchCols(value: js.Array[SearchSettings]): Self = StObject.set(x, "searchCols", value.asInstanceOf[js.Any])
    
    inline def setSearchColsUndefined: Self = StObject.set(x, "searchCols", js.undefined)
    
    inline def setSearchColsVarargs(value: SearchSettings*): Self = StObject.set(x, "searchCols", js.Array(value*))
    
    inline def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
    
    inline def setSearchDelayUndefined: Self = StObject.set(x, "searchDelay", js.undefined)
    
    inline def setSearchPlaceholder(value: SearchSettings): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    inline def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
    
    inline def setServerSide(value: Boolean): Self = StObject.set(x, "serverSide", value.asInstanceOf[js.Any])
    
    inline def setServerSideUndefined: Self = StObject.set(x, "serverSide", js.undefined)
    
    inline def setStateDuration(value: Double): Self = StObject.set(x, "stateDuration", value.asInstanceOf[js.Any])
    
    inline def setStateDurationUndefined: Self = StObject.set(x, "stateDuration", js.undefined)
    
    inline def setStateLoadCallback(value: /* settings */ SettingsLegacy => Unit): Self = StObject.set(x, "stateLoadCallback", js.Any.fromFunction1(value))
    
    inline def setStateLoadCallbackUndefined: Self = StObject.set(x, "stateLoadCallback", js.undefined)
    
    inline def setStateLoadParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateLoadParams", js.Any.fromFunction2(value))
    
    inline def setStateLoadParamsUndefined: Self = StObject.set(x, "stateLoadParams", js.undefined)
    
    inline def setStateLoaded(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateLoaded", js.Any.fromFunction2(value))
    
    inline def setStateLoadedUndefined: Self = StObject.set(x, "stateLoaded", js.undefined)
    
    inline def setStateSave(value: Boolean): Self = StObject.set(x, "stateSave", value.asInstanceOf[js.Any])
    
    inline def setStateSaveCallback(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateSaveCallback", js.Any.fromFunction2(value))
    
    inline def setStateSaveCallbackUndefined: Self = StObject.set(x, "stateSaveCallback", js.undefined)
    
    inline def setStateSaveParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = StObject.set(x, "stateSaveParams", js.Any.fromFunction2(value))
    
    inline def setStateSaveParamsUndefined: Self = StObject.set(x, "stateSaveParams", js.undefined)
    
    inline def setStateSaveUndefined: Self = StObject.set(x, "stateSave", js.undefined)
    
    inline def setStripeClasses(value: js.Array[String]): Self = StObject.set(x, "stripeClasses", value.asInstanceOf[js.Any])
    
    inline def setStripeClassesUndefined: Self = StObject.set(x, "stripeClasses", js.undefined)
    
    inline def setStripeClassesVarargs(value: String*): Self = StObject.set(x, "stripeClasses", js.Array(value*))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
