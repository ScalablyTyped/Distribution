package typings.bootstrapTable

import typings.bootstrapTable.anon.FilterAlgorithm
import typings.bootstrapTable.anon.Limit
import typings.bootstrapTable.anon.TagName
import typings.bootstrapTable.mod.global.JQuery
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait BootstrapAjaxParams extends StObject {
    
    var cache: Boolean = js.native
    
    var contentType: String = js.native
    
    var data: Limit = js.native
    
    var dataType: String = js.native
    
    def error(jqXHR: JQueryXHR): Any = js.native
    
    def success(results: Any): Any = js.native
    def success(results: Any, textStatus: String): Any = js.native
    def success(results: Any, textStatus: String, jqXHR: JQueryXHR): Any = js.native
    def success(results: Any, textStatus: Unit, jqXHR: JQueryXHR): Any = js.native
    
    var `type`: String = js.native
  }
  
  trait BootstrapTableColumn extends StObject {
    
    var align: js.UndefOr[Any] = js.undefined
    
    var cardVisible: js.UndefOr[Boolean] = js.undefined
    
    var cellStyle: js.UndefOr[Any] = js.undefined
    
    var checkbox: js.UndefOr[Boolean] = js.undefined
    
    var checkboxEnabled: js.UndefOr[Boolean] = js.undefined
    
    var `class`: js.UndefOr[Any] = js.undefined
    
    var clickToSelect: js.UndefOr[Boolean] = js.undefined
    
    var colspan: js.UndefOr[Any] = js.undefined
    
    var detailFormatter: js.UndefOr[Any] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[BootstrapTableEvents] = js.undefined
    
    var falign: js.UndefOr[Any] = js.undefined
    
    var field: js.UndefOr[Any] = js.undefined
    
    var footerFormatter: js.UndefOr[Any] = js.undefined
    
    var formatter: js.UndefOr[Any] = js.undefined
    
    var halign: js.UndefOr[Any] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var radio: js.UndefOr[Boolean] = js.undefined
    
    var rowspan: js.UndefOr[Any] = js.undefined
    
    var searchFormatter: js.UndefOr[Boolean] = js.undefined
    
    var searchHighlightFormatter: js.UndefOr[Boolean] = js.undefined
    
    var searchable: js.UndefOr[Boolean] = js.undefined
    
    var showSelectTitle: js.UndefOr[Boolean] = js.undefined
    
    var sortName: js.UndefOr[Any] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var sorter: js.UndefOr[Any] = js.undefined
    
    var switchable: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Any] = js.undefined
    
    var titleTooltip: js.UndefOr[Any] = js.undefined
    
    var valign: js.UndefOr[Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Any] = js.undefined
    
    var widthUnit: js.UndefOr[String] = js.undefined
  }
  object BootstrapTableColumn {
    
    inline def apply(): BootstrapTableColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapTableColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapTableColumn] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Any): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCardVisible(value: Boolean): Self = StObject.set(x, "cardVisible", value.asInstanceOf[js.Any])
      
      inline def setCardVisibleUndefined: Self = StObject.set(x, "cardVisible", js.undefined)
      
      inline def setCellStyle(value: Any): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
      
      inline def setCellStyleUndefined: Self = StObject.set(x, "cellStyle", js.undefined)
      
      inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxEnabled(value: Boolean): Self = StObject.set(x, "checkboxEnabled", value.asInstanceOf[js.Any])
      
      inline def setCheckboxEnabledUndefined: Self = StObject.set(x, "checkboxEnabled", js.undefined)
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setClass(value: Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClickToSelect(value: Boolean): Self = StObject.set(x, "clickToSelect", value.asInstanceOf[js.Any])
      
      inline def setClickToSelectUndefined: Self = StObject.set(x, "clickToSelect", js.undefined)
      
      inline def setColspan(value: Any): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setDetailFormatter(value: Any): Self = StObject.set(x, "detailFormatter", value.asInstanceOf[js.Any])
      
      inline def setDetailFormatterUndefined: Self = StObject.set(x, "detailFormatter", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setEvents(value: BootstrapTableEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFalign(value: Any): Self = StObject.set(x, "falign", value.asInstanceOf[js.Any])
      
      inline def setFalignUndefined: Self = StObject.set(x, "falign", js.undefined)
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFooterFormatter(value: Any): Self = StObject.set(x, "footerFormatter", value.asInstanceOf[js.Any])
      
      inline def setFooterFormatterUndefined: Self = StObject.set(x, "footerFormatter", js.undefined)
      
      inline def setFormatter(value: Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHalign(value: Any): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
      
      inline def setHalignUndefined: Self = StObject.set(x, "halign", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setRowspan(value: Any): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
      
      inline def setSearchFormatter(value: Boolean): Self = StObject.set(x, "searchFormatter", value.asInstanceOf[js.Any])
      
      inline def setSearchFormatterUndefined: Self = StObject.set(x, "searchFormatter", js.undefined)
      
      inline def setSearchHighlightFormatter(value: Boolean): Self = StObject.set(x, "searchHighlightFormatter", value.asInstanceOf[js.Any])
      
      inline def setSearchHighlightFormatterUndefined: Self = StObject.set(x, "searchHighlightFormatter", js.undefined)
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      inline def setShowSelectTitle(value: Boolean): Self = StObject.set(x, "showSelectTitle", value.asInstanceOf[js.Any])
      
      inline def setShowSelectTitleUndefined: Self = StObject.set(x, "showSelectTitle", js.undefined)
      
      inline def setSortName(value: Any): Self = StObject.set(x, "sortName", value.asInstanceOf[js.Any])
      
      inline def setSortNameUndefined: Self = StObject.set(x, "sortName", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setSorter(value: Any): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setSwitchable(value: Boolean): Self = StObject.set(x, "switchable", value.asInstanceOf[js.Any])
      
      inline def setSwitchableUndefined: Self = StObject.set(x, "switchable", js.undefined)
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTooltip(value: Any): Self = StObject.set(x, "titleTooltip", value.asInstanceOf[js.Any])
      
      inline def setTitleTooltipUndefined: Self = StObject.set(x, "titleTooltip", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValign(value: Any): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthUnit(value: String): Self = StObject.set(x, "widthUnit", value.asInstanceOf[js.Any])
      
      inline def setWidthUnitUndefined: Self = StObject.set(x, "widthUnit", js.undefined)
    }
  }
  
  trait BootstrapTableEvents extends StObject {
    
    @JSName("all.bs.table")
    var allDotbsDottable: String
    
    @JSName("check-all.bs.table")
    var `check-allDotbsDottable`: String
    
    @JSName("check-some.bs.table")
    var `check-someDotbsDottable`: String
    
    @JSName("check.bs.table")
    var checkDotbsDottable: String
    
    @JSName("click-cell.bs.table")
    var `click-cellDotbsDottable`: String
    
    @JSName("click-row.bs.table")
    var `click-rowDotbsDottable`: String
    
    @JSName("collapse-row.bs.table")
    var `collapse-rowDotbsDottable`: String
    
    @JSName("column-switch-all.bs.table")
    var `column-switch-allDotbsDottable`: String
    
    @JSName("column-switch.bs.table")
    var `column-switchDotbsDottable`: String
    
    @JSName("dbl-click-cell.bs.table")
    var `dbl-click-cellDotbsDottable`: String
    
    @JSName("dbl-click-row.bs.table")
    var `dbl-click-rowDotbsDottable`: String
    
    @JSName("expand-row.bs.table")
    var `expand-rowDotbsDottable`: String
    
    @JSName("load-error.bs.table")
    var `load-errorDotbsDottable`: String
    
    @JSName("load-success.bs.table")
    var `load-successDotbsDottable`: String
    
    @JSName("page-change.bs.table")
    var `page-changeDotbsDottable`: String
    
    @JSName("post-body.bs.table")
    var `post-bodyDotbsDottable`: String
    
    @JSName("post-footer.bs.table")
    var `post-footerDotbsDottable`: String
    
    @JSName("post-header.bs.table")
    var `post-headerDotbsDottable`: String
    
    @JSName("pre-body.bs.table")
    var `pre-bodyDotbsDottable`: String
    
    @JSName("refresh-options.bs.table")
    var `refresh-optionsDotbsDottable`: String
    
    @JSName("refresh.bs.table")
    var refreshDotbsDottable: String
    
    @JSName("reset-view.bs.table")
    var `reset-viewDotbsDottable`: String
    
    @JSName("scroll-body.bs.table")
    var `scroll-bodyDotbsDottable`: String
    
    @JSName("search.bs.table")
    var searchDotbsDottable: String
    
    @JSName("sort.bs.table")
    var sortDotbsDottable: String
    
    @JSName("toggle.bs.table")
    var toggleDotbsDottable: String
    
    @JSName("uncheck-all.bs.table")
    var `uncheck-allDotbsDottable`: String
    
    @JSName("uncheck-some.bs.table")
    var `uncheck-someDotbsDottable`: String
    
    @JSName("uncheck.bs.table")
    var uncheckDotbsDottable: String
  }
  object BootstrapTableEvents {
    
    inline def apply(
      allDotbsDottable: String,
      `check-allDotbsDottable`: String,
      `check-someDotbsDottable`: String,
      checkDotbsDottable: String,
      `click-cellDotbsDottable`: String,
      `click-rowDotbsDottable`: String,
      `collapse-rowDotbsDottable`: String,
      `column-switch-allDotbsDottable`: String,
      `column-switchDotbsDottable`: String,
      `dbl-click-cellDotbsDottable`: String,
      `dbl-click-rowDotbsDottable`: String,
      `expand-rowDotbsDottable`: String,
      `load-errorDotbsDottable`: String,
      `load-successDotbsDottable`: String,
      `page-changeDotbsDottable`: String,
      `post-bodyDotbsDottable`: String,
      `post-footerDotbsDottable`: String,
      `post-headerDotbsDottable`: String,
      `pre-bodyDotbsDottable`: String,
      `refresh-optionsDotbsDottable`: String,
      refreshDotbsDottable: String,
      `reset-viewDotbsDottable`: String,
      `scroll-bodyDotbsDottable`: String,
      searchDotbsDottable: String,
      sortDotbsDottable: String,
      toggleDotbsDottable: String,
      `uncheck-allDotbsDottable`: String,
      `uncheck-someDotbsDottable`: String,
      uncheckDotbsDottable: String
    ): BootstrapTableEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("all.bs.table")(allDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("check-all.bs.table")(`check-allDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("check-some.bs.table")(`check-someDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("check.bs.table")(checkDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("click-cell.bs.table")(`click-cellDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("click-row.bs.table")(`click-rowDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("collapse-row.bs.table")(`collapse-rowDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("column-switch-all.bs.table")(`column-switch-allDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("column-switch.bs.table")(`column-switchDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("dbl-click-cell.bs.table")(`dbl-click-cellDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("dbl-click-row.bs.table")(`dbl-click-rowDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("expand-row.bs.table")(`expand-rowDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("load-error.bs.table")(`load-errorDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("load-success.bs.table")(`load-successDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("page-change.bs.table")(`page-changeDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("post-body.bs.table")(`post-bodyDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("post-footer.bs.table")(`post-footerDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("post-header.bs.table")(`post-headerDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("pre-body.bs.table")(`pre-bodyDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("refresh-options.bs.table")(`refresh-optionsDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("refresh.bs.table")(refreshDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("reset-view.bs.table")(`reset-viewDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("scroll-body.bs.table")(`scroll-bodyDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("search.bs.table")(searchDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("sort.bs.table")(sortDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("toggle.bs.table")(toggleDotbsDottable.asInstanceOf[js.Any])
      __obj.updateDynamic("uncheck-all.bs.table")(`uncheck-allDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("uncheck-some.bs.table")(`uncheck-someDotbsDottable`.asInstanceOf[js.Any])
      __obj.updateDynamic("uncheck.bs.table")(uncheckDotbsDottable.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapTableEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapTableEvents] (val x: Self) extends AnyVal {
      
      inline def setAllDotbsDottable(value: String): Self = StObject.set(x, "all.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setCheck-allDotbsDottable`(value: String): Self = StObject.set(x, "check-all.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setCheck-someDotbsDottable`(value: String): Self = StObject.set(x, "check-some.bs.table", value.asInstanceOf[js.Any])
      
      inline def setCheckDotbsDottable(value: String): Self = StObject.set(x, "check.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setClick-cellDotbsDottable`(value: String): Self = StObject.set(x, "click-cell.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setClick-rowDotbsDottable`(value: String): Self = StObject.set(x, "click-row.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setCollapse-rowDotbsDottable`(value: String): Self = StObject.set(x, "collapse-row.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setColumn-switch-allDotbsDottable`(value: String): Self = StObject.set(x, "column-switch-all.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setColumn-switchDotbsDottable`(value: String): Self = StObject.set(x, "column-switch.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setDbl-click-cellDotbsDottable`(value: String): Self = StObject.set(x, "dbl-click-cell.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setDbl-click-rowDotbsDottable`(value: String): Self = StObject.set(x, "dbl-click-row.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setExpand-rowDotbsDottable`(value: String): Self = StObject.set(x, "expand-row.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setLoad-errorDotbsDottable`(value: String): Self = StObject.set(x, "load-error.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setLoad-successDotbsDottable`(value: String): Self = StObject.set(x, "load-success.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setPage-changeDotbsDottable`(value: String): Self = StObject.set(x, "page-change.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setPost-bodyDotbsDottable`(value: String): Self = StObject.set(x, "post-body.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setPost-footerDotbsDottable`(value: String): Self = StObject.set(x, "post-footer.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setPost-headerDotbsDottable`(value: String): Self = StObject.set(x, "post-header.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setPre-bodyDotbsDottable`(value: String): Self = StObject.set(x, "pre-body.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setRefresh-optionsDotbsDottable`(value: String): Self = StObject.set(x, "refresh-options.bs.table", value.asInstanceOf[js.Any])
      
      inline def setRefreshDotbsDottable(value: String): Self = StObject.set(x, "refresh.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setReset-viewDotbsDottable`(value: String): Self = StObject.set(x, "reset-view.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setScroll-bodyDotbsDottable`(value: String): Self = StObject.set(x, "scroll-body.bs.table", value.asInstanceOf[js.Any])
      
      inline def setSearchDotbsDottable(value: String): Self = StObject.set(x, "search.bs.table", value.asInstanceOf[js.Any])
      
      inline def setSortDotbsDottable(value: String): Self = StObject.set(x, "sort.bs.table", value.asInstanceOf[js.Any])
      
      inline def setToggleDotbsDottable(value: String): Self = StObject.set(x, "toggle.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setUncheck-allDotbsDottable`(value: String): Self = StObject.set(x, "uncheck-all.bs.table", value.asInstanceOf[js.Any])
      
      inline def `setUncheck-someDotbsDottable`(value: String): Self = StObject.set(x, "uncheck-some.bs.table", value.asInstanceOf[js.Any])
      
      inline def setUncheckDotbsDottable(value: String): Self = StObject.set(x, "uncheck.bs.table", value.asInstanceOf[js.Any])
    }
  }
  
  trait BootstrapTableIcons extends StObject {
    
    var autoRefresh: js.UndefOr[String] = js.undefined
    
    var clearSearch: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[String] = js.undefined
    
    var detailClose: js.UndefOr[String] = js.undefined
    
    var detailOpen: js.UndefOr[String] = js.undefined
    
    var fullscreen: js.UndefOr[String] = js.undefined
    
    var paginationSwitchDown: js.UndefOr[String] = js.undefined
    
    var paginationSwitchUp: js.UndefOr[String] = js.undefined
    
    var refresh: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var toggleOff: js.UndefOr[String] = js.undefined
    
    var toggleOn: js.UndefOr[String] = js.undefined
  }
  object BootstrapTableIcons {
    
    inline def apply(): BootstrapTableIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapTableIcons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapTableIcons] (val x: Self) extends AnyVal {
      
      inline def setAutoRefresh(value: String): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
      
      inline def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
      
      inline def setClearSearch(value: String): Self = StObject.set(x, "clearSearch", value.asInstanceOf[js.Any])
      
      inline def setClearSearchUndefined: Self = StObject.set(x, "clearSearch", js.undefined)
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDetailClose(value: String): Self = StObject.set(x, "detailClose", value.asInstanceOf[js.Any])
      
      inline def setDetailCloseUndefined: Self = StObject.set(x, "detailClose", js.undefined)
      
      inline def setDetailOpen(value: String): Self = StObject.set(x, "detailOpen", value.asInstanceOf[js.Any])
      
      inline def setDetailOpenUndefined: Self = StObject.set(x, "detailOpen", js.undefined)
      
      inline def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setPaginationSwitchDown(value: String): Self = StObject.set(x, "paginationSwitchDown", value.asInstanceOf[js.Any])
      
      inline def setPaginationSwitchDownUndefined: Self = StObject.set(x, "paginationSwitchDown", js.undefined)
      
      inline def setPaginationSwitchUp(value: String): Self = StObject.set(x, "paginationSwitchUp", value.asInstanceOf[js.Any])
      
      inline def setPaginationSwitchUpUndefined: Self = StObject.set(x, "paginationSwitchUp", js.undefined)
      
      inline def setRefresh(value: String): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setToggleOff(value: String): Self = StObject.set(x, "toggleOff", value.asInstanceOf[js.Any])
      
      inline def setToggleOffUndefined: Self = StObject.set(x, "toggleOff", js.undefined)
      
      inline def setToggleOn(value: String): Self = StObject.set(x, "toggleOn", value.asInstanceOf[js.Any])
      
      inline def setToggleOnUndefined: Self = StObject.set(x, "toggleOn", js.undefined)
    }
  }
  
  trait BootstrapTableLocale extends StObject {
    
    var formatAllRows: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatClearSearch: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatColumns: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatColumnsToggleAll: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatDetailPagination: js.UndefOr[js.Function1[/* totalRows */ Double, String]] = js.undefined
    
    var formatFullscreen: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatLoadingMessage: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatNoMatches: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatPaginationSwitch: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatPaginationSwitchDown: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatPaginationSwitchUp: js.UndefOr[js.Function0[String]] = js.undefined
    
    def formatRecordsPerPage(pageNumber: Double): String
    
    var formatRefresh: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatSRPaginationNextText: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatSRPaginationPageText: js.UndefOr[js.Function1[/* page */ Double, String]] = js.undefined
    
    var formatSRPaginationPreText: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatSearch: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatShowingRows: js.UndefOr[
        js.Function4[
          /* pageFrom */ Double, 
          /* pageTo */ Double, 
          /* totalRows */ Double, 
          /* totalNotFiltered */ Double, 
          String
        ]
      ] = js.undefined
    
    var formatToggleOff: js.UndefOr[js.Function0[String]] = js.undefined
    
    var formatToggleOn: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object BootstrapTableLocale {
    
    inline def apply(formatRecordsPerPage: Double => String): BootstrapTableLocale = {
      val __obj = js.Dynamic.literal(formatRecordsPerPage = js.Any.fromFunction1(formatRecordsPerPage))
      __obj.asInstanceOf[BootstrapTableLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapTableLocale] (val x: Self) extends AnyVal {
      
      inline def setFormatAllRows(value: () => String): Self = StObject.set(x, "formatAllRows", js.Any.fromFunction0(value))
      
      inline def setFormatAllRowsUndefined: Self = StObject.set(x, "formatAllRows", js.undefined)
      
      inline def setFormatClearSearch(value: () => String): Self = StObject.set(x, "formatClearSearch", js.Any.fromFunction0(value))
      
      inline def setFormatClearSearchUndefined: Self = StObject.set(x, "formatClearSearch", js.undefined)
      
      inline def setFormatColumns(value: () => String): Self = StObject.set(x, "formatColumns", js.Any.fromFunction0(value))
      
      inline def setFormatColumnsToggleAll(value: () => String): Self = StObject.set(x, "formatColumnsToggleAll", js.Any.fromFunction0(value))
      
      inline def setFormatColumnsToggleAllUndefined: Self = StObject.set(x, "formatColumnsToggleAll", js.undefined)
      
      inline def setFormatColumnsUndefined: Self = StObject.set(x, "formatColumns", js.undefined)
      
      inline def setFormatDetailPagination(value: /* totalRows */ Double => String): Self = StObject.set(x, "formatDetailPagination", js.Any.fromFunction1(value))
      
      inline def setFormatDetailPaginationUndefined: Self = StObject.set(x, "formatDetailPagination", js.undefined)
      
      inline def setFormatFullscreen(value: () => String): Self = StObject.set(x, "formatFullscreen", js.Any.fromFunction0(value))
      
      inline def setFormatFullscreenUndefined: Self = StObject.set(x, "formatFullscreen", js.undefined)
      
      inline def setFormatLoadingMessage(value: () => String): Self = StObject.set(x, "formatLoadingMessage", js.Any.fromFunction0(value))
      
      inline def setFormatLoadingMessageUndefined: Self = StObject.set(x, "formatLoadingMessage", js.undefined)
      
      inline def setFormatNoMatches(value: () => String): Self = StObject.set(x, "formatNoMatches", js.Any.fromFunction0(value))
      
      inline def setFormatNoMatchesUndefined: Self = StObject.set(x, "formatNoMatches", js.undefined)
      
      inline def setFormatPaginationSwitch(value: () => String): Self = StObject.set(x, "formatPaginationSwitch", js.Any.fromFunction0(value))
      
      inline def setFormatPaginationSwitchDown(value: () => String): Self = StObject.set(x, "formatPaginationSwitchDown", js.Any.fromFunction0(value))
      
      inline def setFormatPaginationSwitchDownUndefined: Self = StObject.set(x, "formatPaginationSwitchDown", js.undefined)
      
      inline def setFormatPaginationSwitchUndefined: Self = StObject.set(x, "formatPaginationSwitch", js.undefined)
      
      inline def setFormatPaginationSwitchUp(value: () => String): Self = StObject.set(x, "formatPaginationSwitchUp", js.Any.fromFunction0(value))
      
      inline def setFormatPaginationSwitchUpUndefined: Self = StObject.set(x, "formatPaginationSwitchUp", js.undefined)
      
      inline def setFormatRecordsPerPage(value: Double => String): Self = StObject.set(x, "formatRecordsPerPage", js.Any.fromFunction1(value))
      
      inline def setFormatRefresh(value: () => String): Self = StObject.set(x, "formatRefresh", js.Any.fromFunction0(value))
      
      inline def setFormatRefreshUndefined: Self = StObject.set(x, "formatRefresh", js.undefined)
      
      inline def setFormatSRPaginationNextText(value: () => String): Self = StObject.set(x, "formatSRPaginationNextText", js.Any.fromFunction0(value))
      
      inline def setFormatSRPaginationNextTextUndefined: Self = StObject.set(x, "formatSRPaginationNextText", js.undefined)
      
      inline def setFormatSRPaginationPageText(value: /* page */ Double => String): Self = StObject.set(x, "formatSRPaginationPageText", js.Any.fromFunction1(value))
      
      inline def setFormatSRPaginationPageTextUndefined: Self = StObject.set(x, "formatSRPaginationPageText", js.undefined)
      
      inline def setFormatSRPaginationPreText(value: () => String): Self = StObject.set(x, "formatSRPaginationPreText", js.Any.fromFunction0(value))
      
      inline def setFormatSRPaginationPreTextUndefined: Self = StObject.set(x, "formatSRPaginationPreText", js.undefined)
      
      inline def setFormatSearch(value: () => String): Self = StObject.set(x, "formatSearch", js.Any.fromFunction0(value))
      
      inline def setFormatSearchUndefined: Self = StObject.set(x, "formatSearch", js.undefined)
      
      inline def setFormatShowingRows(
        value: (/* pageFrom */ Double, /* pageTo */ Double, /* totalRows */ Double, /* totalNotFiltered */ Double) => String
      ): Self = StObject.set(x, "formatShowingRows", js.Any.fromFunction4(value))
      
      inline def setFormatShowingRowsUndefined: Self = StObject.set(x, "formatShowingRows", js.undefined)
      
      inline def setFormatToggleOff(value: () => String): Self = StObject.set(x, "formatToggleOff", js.Any.fromFunction0(value))
      
      inline def setFormatToggleOffUndefined: Self = StObject.set(x, "formatToggleOff", js.undefined)
      
      inline def setFormatToggleOn(value: () => String): Self = StObject.set(x, "formatToggleOn", js.Any.fromFunction0(value))
      
      inline def setFormatToggleOnUndefined: Self = StObject.set(x, "formatToggleOn", js.undefined)
    }
  }
  
  trait BootstrapTableOptions extends StObject {
    
    var ajax: js.UndefOr[js.Function1[/* params */ BootstrapAjaxParams, Any]] = js.undefined
    
    var ajaxOptions: js.UndefOr[js.Object] = js.undefined
    
    var buttons: js.UndefOr[js.Object] = js.undefined
    
    var buttonsAlign: js.UndefOr[String] = js.undefined
    
    var buttonsClass: js.UndefOr[String] = js.undefined
    
    var buttonsOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var buttonsPrefix: js.UndefOr[String] = js.undefined
    
    var buttonsToolbar: js.UndefOr[Any] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cardView: js.UndefOr[Boolean] = js.undefined
    
    var checkboxHeader: js.UndefOr[Boolean] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var clickToSelect: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.UndefOr[js.Array[BootstrapTableColumn]] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var customSearch: js.UndefOr[Any] = js.undefined
    
    var customSort: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var dataField: js.UndefOr[String] = js.undefined
    
    var dataType: js.UndefOr[String] = js.undefined
    
    var detailFilter: js.UndefOr[js.Function2[/* index */ Double, /* row */ Any, Boolean | Unit]] = js.undefined
    
    var detailFormatter: js.UndefOr[js.Function3[/* index */ Double, /* row */ Any, /* $element */ JQuery, String]] = js.undefined
    
    var detailView: js.UndefOr[Boolean] = js.undefined
    
    var detailViewAlign: js.UndefOr[String] = js.undefined
    
    var detailViewByClick: js.UndefOr[Boolean] = js.undefined
    
    var detailViewIcon: js.UndefOr[Boolean] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var filterOptions: js.UndefOr[FilterAlgorithm] = js.undefined
    
    var footerField: js.UndefOr[String] = js.undefined
    
    var footerStyle: js.UndefOr[js.Function1[/* column */ BootstrapTableColumn, js.Object]] = js.undefined
    
    var headerStyle: js.UndefOr[js.Function1[/* column */ BootstrapTableColumn, js.Object]] = js.undefined
    
    var height: js.UndefOr[Any] = js.undefined
    
    var iconSize: js.UndefOr[Any] = js.undefined
    
    var icons: js.UndefOr[BootstrapTableIcons] = js.undefined
    
    var iconsPrefix: js.UndefOr[String] = js.undefined
    
    var idField: js.UndefOr[String] = js.undefined
    
    var ignoreClickToSelectOn: js.UndefOr[js.Function1[/* param0 */ js.UndefOr[TagName], Any]] = js.undefined
    
    var loadingFontSize: js.UndefOr[String] = js.undefined
    
    var loadingTemplate: js.UndefOr[js.Function1[/* loadingMessage */ String, String]] = js.undefined
    
    var locale: js.UndefOr[BootstrapTableLocale] = js.undefined
    
    var maintainMetaData: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var minimumCountColumns: js.UndefOr[Double] = js.undefined
    
    var multipleSelectRow: js.UndefOr[Boolean] = js.undefined
    
    var onAll: js.UndefOr[js.Function2[/* name */ String, /* args */ Any, Boolean | Unit]] = js.undefined
    
    var onCheck: js.UndefOr[js.Function2[/* row */ Any, /* $element */ JQuery, Boolean | Unit]] = js.undefined
    
    var onCheckAll: js.UndefOr[
        js.Function2[/* rowsAfter */ js.Array[Any], /* rowsBefore */ js.Array[Any], Boolean | Unit]
      ] = js.undefined
    
    var onCheckSome: js.UndefOr[js.Function1[/* rows */ js.Array[Any], Boolean | Unit]] = js.undefined
    
    var onClickCell: js.UndefOr[
        js.Function4[
          /* field */ String, 
          /* value */ Any, 
          /* row */ Any, 
          /* $element */ JQuery, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var onClickRow: js.UndefOr[
        js.Function3[/* row */ Any, /* $element */ JQuery, /* field */ String, Boolean | Unit]
      ] = js.undefined
    
    var onCollapseRow: js.UndefOr[
        js.Function3[/* index */ Double, /* row */ Any, /* detailView */ Any, Boolean | Unit]
      ] = js.undefined
    
    var onColumnSwitch: js.UndefOr[js.Function2[/* field */ String, /* checked */ Boolean, Boolean | Unit]] = js.undefined
    
    var onDblClickCell: js.UndefOr[
        js.Function4[
          /* field */ String, 
          /* value */ Any, 
          /* row */ Any, 
          /* $element */ JQuery, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var onDblClickRow: js.UndefOr[
        js.Function3[/* row */ Any, /* $element */ JQuery, /* field */ String, Boolean | Unit]
      ] = js.undefined
    
    var onExpandRow: js.UndefOr[
        js.Function3[/* index */ Double, /* row */ Any, /* $detail */ JQuery, Boolean | Unit]
      ] = js.undefined
    
    var onLoadError: js.UndefOr[js.Function2[/* status */ String, /* jqXHR */ jqXHR[Any], Boolean | Unit]] = js.undefined
    
    var onLoadSuccess: js.UndefOr[
        js.Function3[/* data */ Any, /* status */ String, /* jqXHR */ jqXHR[Any], Boolean | Unit]
      ] = js.undefined
    
    var onPageChange: js.UndefOr[js.Function2[/* number */ Double, /* size */ Double, Boolean | Unit]] = js.undefined
    
    var onPostBody: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
    
    var onPostFooter: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
    
    var onPostHeader: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
    
    var onPreBody: js.UndefOr[js.Function1[/* data */ Any, Boolean | Unit]] = js.undefined
    
    var onRefresh: js.UndefOr[js.Function1[/* params */ js.Array[Any], Boolean | Unit]] = js.undefined
    
    var onRefreshOptions: js.UndefOr[js.Function1[/* options */ this.type, Boolean | Unit]] = js.undefined
    
    var onResetView: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
    
    var onScrollBody: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* text */ String, Boolean | Unit]] = js.undefined
    
    var onSort: js.UndefOr[js.Function2[/* name */ String, /* order */ Double, Boolean | Unit]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* cardView */ Boolean, Boolean | Unit]] = js.undefined
    
    var onUncheck: js.UndefOr[js.Function2[/* row */ Any, /* $element */ JQuery, Boolean | Unit]] = js.undefined
    
    var onUncheckAll: js.UndefOr[
        js.Function2[/* rowsAfter */ js.Array[Any], /* rowsBefore */ js.Array[Any], Boolean | Unit]
      ] = js.undefined
    
    var onUncheckSome: js.UndefOr[js.Function1[/* rows */ js.Array[Any], Boolean | Unit]] = js.undefined
    
    var pageList: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pagination: js.UndefOr[Boolean] = js.undefined
    
    var paginationDetailHAlign: js.UndefOr[String] = js.undefined
    
    var paginationHAlign: js.UndefOr[String] = js.undefined
    
    var paginationLoop: js.UndefOr[Boolean] = js.undefined
    
    var paginationNextText: js.UndefOr[String] = js.undefined
    
    var paginationPagesBySide: js.UndefOr[Double] = js.undefined
    
    var paginationParts: js.UndefOr[js.Array[String]] = js.undefined
    
    var paginationPreText: js.UndefOr[String] = js.undefined
    
    var paginationSuccessivelySize: js.UndefOr[Double] = js.undefined
    
    var paginationUseIntermediate: js.UndefOr[Boolean] = js.undefined
    
    var paginationVAlign: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[js.Function1[/* params */ Any, Any]] = js.undefined
    
    var queryParamsType: js.UndefOr[String] = js.undefined
    
    var rememberOrder: js.UndefOr[Boolean] = js.undefined
    
    var responseHandler: js.UndefOr[js.Function1[/* res */ Any, Any]] = js.undefined
    
    var rowAttributes: js.UndefOr[js.Function2[/* row */ Any, /* index */ Double, js.Object]] = js.undefined
    
    var rowStyle: js.UndefOr[js.Function2[/* row */ Any, /* index */ Double, js.Object]] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var searchAccentNeutralise: js.UndefOr[Boolean] = js.undefined
    
    var searchAlign: js.UndefOr[String] = js.undefined
    
    var searchHighlight: js.UndefOr[Boolean] = js.undefined
    
    var searchOnEnterKey: js.UndefOr[Boolean] = js.undefined
    
    var searchSelector: js.UndefOr[Boolean | String] = js.undefined
    
    var searchText: js.UndefOr[String] = js.undefined
    
    var searchTimeOut: js.UndefOr[Double] = js.undefined
    
    var selectItemName: js.UndefOr[String] = js.undefined
    
    var serverSort: js.UndefOr[Boolean] = js.undefined
    
    var showButtonIcons: js.UndefOr[Boolean] = js.undefined
    
    var showButtonText: js.UndefOr[Boolean] = js.undefined
    
    var showColumns: js.UndefOr[Boolean] = js.undefined
    
    var showColumnsSearch: js.UndefOr[Boolean] = js.undefined
    
    var showColumnsToggleAll: js.UndefOr[Boolean] = js.undefined
    
    var showExtendedPagination: js.UndefOr[Boolean] = js.undefined
    
    var showFooter: js.UndefOr[Boolean] = js.undefined
    
    var showFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var showPaginationSwitch: js.UndefOr[Boolean] = js.undefined
    
    var showRefresh: js.UndefOr[Boolean] = js.undefined
    
    var showSearchButton: js.UndefOr[Boolean] = js.undefined
    
    var showSearchClearButton: js.UndefOr[Boolean] = js.undefined
    
    var showToggle: js.UndefOr[Boolean] = js.undefined
    
    var sidePagination: js.UndefOr[String] = js.undefined
    
    var silentSort: js.UndefOr[Boolean] = js.undefined
    
    var singleSelect: js.UndefOr[Boolean] = js.undefined
    
    var smartDisplay: js.UndefOr[Boolean] = js.undefined
    
    var sortClass: js.UndefOr[Any] = js.undefined
    
    var sortName: js.UndefOr[Any] = js.undefined
    
    var sortOrder: js.UndefOr[Any] = js.undefined
    
    var sortReset: js.UndefOr[Boolean] = js.undefined
    
    var sortResetPage: js.UndefOr[Boolean] = js.undefined
    
    var sortStable: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var strictSearch: js.UndefOr[Boolean] = js.undefined
    
    var theadClasses: js.UndefOr[String] = js.undefined
    
    var toolbar: js.UndefOr[Any] = js.undefined
    
    var toolbarAlign: js.UndefOr[String] = js.undefined
    
    var totalField: js.UndefOr[String] = js.undefined
    
    var totalNotFiltered: js.UndefOr[Double] = js.undefined
    
    var totalNotFilteredField: js.UndefOr[String] = js.undefined
    
    var totalRows: js.UndefOr[Double] = js.undefined
    
    var trimOnSearch: js.UndefOr[Boolean] = js.undefined
    
    var undefinedText: js.UndefOr[String] = js.undefined
    
    var uniqueId: js.UndefOr[Any] = js.undefined
    
    var url: js.UndefOr[Any] = js.undefined
    
    var virtualScroll: js.UndefOr[Boolean] = js.undefined
    
    var virtualScrollItemHeight: js.UndefOr[Any] = js.undefined
    
    var visibleSearch: js.UndefOr[Boolean] = js.undefined
  }
  object BootstrapTableOptions {
    
    inline def apply(): BootstrapTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapTableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapTableOptions] (val x: Self) extends AnyVal {
      
      inline def setAjax(value: /* params */ BootstrapAjaxParams => Any): Self = StObject.set(x, "ajax", js.Any.fromFunction1(value))
      
      inline def setAjaxOptions(value: js.Object): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
      
      inline def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setButtons(value: js.Object): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsAlign(value: String): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
      
      inline def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
      
      inline def setButtonsClass(value: String): Self = StObject.set(x, "buttonsClass", value.asInstanceOf[js.Any])
      
      inline def setButtonsClassUndefined: Self = StObject.set(x, "buttonsClass", js.undefined)
      
      inline def setButtonsOrder(value: js.Array[String]): Self = StObject.set(x, "buttonsOrder", value.asInstanceOf[js.Any])
      
      inline def setButtonsOrderUndefined: Self = StObject.set(x, "buttonsOrder", js.undefined)
      
      inline def setButtonsOrderVarargs(value: String*): Self = StObject.set(x, "buttonsOrder", js.Array(value*))
      
      inline def setButtonsPrefix(value: String): Self = StObject.set(x, "buttonsPrefix", value.asInstanceOf[js.Any])
      
      inline def setButtonsPrefixUndefined: Self = StObject.set(x, "buttonsPrefix", js.undefined)
      
      inline def setButtonsToolbar(value: Any): Self = StObject.set(x, "buttonsToolbar", value.asInstanceOf[js.Any])
      
      inline def setButtonsToolbarUndefined: Self = StObject.set(x, "buttonsToolbar", js.undefined)
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCardView(value: Boolean): Self = StObject.set(x, "cardView", value.asInstanceOf[js.Any])
      
      inline def setCardViewUndefined: Self = StObject.set(x, "cardView", js.undefined)
      
      inline def setCheckboxHeader(value: Boolean): Self = StObject.set(x, "checkboxHeader", value.asInstanceOf[js.Any])
      
      inline def setCheckboxHeaderUndefined: Self = StObject.set(x, "checkboxHeader", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClickToSelect(value: Boolean): Self = StObject.set(x, "clickToSelect", value.asInstanceOf[js.Any])
      
      inline def setClickToSelectUndefined: Self = StObject.set(x, "clickToSelect", js.undefined)
      
      inline def setColumns(value: js.Array[BootstrapTableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: BootstrapTableColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomSearch(value: Any): Self = StObject.set(x, "customSearch", value.asInstanceOf[js.Any])
      
      inline def setCustomSearchUndefined: Self = StObject.set(x, "customSearch", js.undefined)
      
      inline def setCustomSort(value: Any): Self = StObject.set(x, "customSort", value.asInstanceOf[js.Any])
      
      inline def setCustomSortUndefined: Self = StObject.set(x, "customSort", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDetailFilter(value: (/* index */ Double, /* row */ Any) => Boolean | Unit): Self = StObject.set(x, "detailFilter", js.Any.fromFunction2(value))
      
      inline def setDetailFilterUndefined: Self = StObject.set(x, "detailFilter", js.undefined)
      
      inline def setDetailFormatter(value: (/* index */ Double, /* row */ Any, /* $element */ JQuery) => String): Self = StObject.set(x, "detailFormatter", js.Any.fromFunction3(value))
      
      inline def setDetailFormatterUndefined: Self = StObject.set(x, "detailFormatter", js.undefined)
      
      inline def setDetailView(value: Boolean): Self = StObject.set(x, "detailView", value.asInstanceOf[js.Any])
      
      inline def setDetailViewAlign(value: String): Self = StObject.set(x, "detailViewAlign", value.asInstanceOf[js.Any])
      
      inline def setDetailViewAlignUndefined: Self = StObject.set(x, "detailViewAlign", js.undefined)
      
      inline def setDetailViewByClick(value: Boolean): Self = StObject.set(x, "detailViewByClick", value.asInstanceOf[js.Any])
      
      inline def setDetailViewByClickUndefined: Self = StObject.set(x, "detailViewByClick", js.undefined)
      
      inline def setDetailViewIcon(value: Boolean): Self = StObject.set(x, "detailViewIcon", value.asInstanceOf[js.Any])
      
      inline def setDetailViewIconUndefined: Self = StObject.set(x, "detailViewIcon", js.undefined)
      
      inline def setDetailViewUndefined: Self = StObject.set(x, "detailView", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFilterOptions(value: FilterAlgorithm): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      inline def setFooterField(value: String): Self = StObject.set(x, "footerField", value.asInstanceOf[js.Any])
      
      inline def setFooterFieldUndefined: Self = StObject.set(x, "footerField", js.undefined)
      
      inline def setFooterStyle(value: /* column */ BootstrapTableColumn => js.Object): Self = StObject.set(x, "footerStyle", js.Any.fromFunction1(value))
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setHeaderStyle(value: /* column */ BootstrapTableColumn => js.Object): Self = StObject.set(x, "headerStyle", js.Any.fromFunction1(value))
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIconSize(value: Any): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIcons(value: BootstrapTableIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsPrefix(value: String): Self = StObject.set(x, "iconsPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconsPrefixUndefined: Self = StObject.set(x, "iconsPrefix", js.undefined)
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
      
      inline def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
      
      inline def setIgnoreClickToSelectOn(value: /* param0 */ js.UndefOr[TagName] => Any): Self = StObject.set(x, "ignoreClickToSelectOn", js.Any.fromFunction1(value))
      
      inline def setIgnoreClickToSelectOnUndefined: Self = StObject.set(x, "ignoreClickToSelectOn", js.undefined)
      
      inline def setLoadingFontSize(value: String): Self = StObject.set(x, "loadingFontSize", value.asInstanceOf[js.Any])
      
      inline def setLoadingFontSizeUndefined: Self = StObject.set(x, "loadingFontSize", js.undefined)
      
      inline def setLoadingTemplate(value: /* loadingMessage */ String => String): Self = StObject.set(x, "loadingTemplate", js.Any.fromFunction1(value))
      
      inline def setLoadingTemplateUndefined: Self = StObject.set(x, "loadingTemplate", js.undefined)
      
      inline def setLocale(value: BootstrapTableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaintainMetaData(value: Boolean): Self = StObject.set(x, "maintainMetaData", value.asInstanceOf[js.Any])
      
      inline def setMaintainMetaDataUndefined: Self = StObject.set(x, "maintainMetaData", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMinimumCountColumns(value: Double): Self = StObject.set(x, "minimumCountColumns", value.asInstanceOf[js.Any])
      
      inline def setMinimumCountColumnsUndefined: Self = StObject.set(x, "minimumCountColumns", js.undefined)
      
      inline def setMultipleSelectRow(value: Boolean): Self = StObject.set(x, "multipleSelectRow", value.asInstanceOf[js.Any])
      
      inline def setMultipleSelectRowUndefined: Self = StObject.set(x, "multipleSelectRow", js.undefined)
      
      inline def setOnAll(value: (/* name */ String, /* args */ Any) => Boolean | Unit): Self = StObject.set(x, "onAll", js.Any.fromFunction2(value))
      
      inline def setOnAllUndefined: Self = StObject.set(x, "onAll", js.undefined)
      
      inline def setOnCheck(value: (/* row */ Any, /* $element */ JQuery) => Boolean | Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckAll(value: (/* rowsAfter */ js.Array[Any], /* rowsBefore */ js.Array[Any]) => Boolean | Unit): Self = StObject.set(x, "onCheckAll", js.Any.fromFunction2(value))
      
      inline def setOnCheckAllUndefined: Self = StObject.set(x, "onCheckAll", js.undefined)
      
      inline def setOnCheckSome(value: /* rows */ js.Array[Any] => Boolean | Unit): Self = StObject.set(x, "onCheckSome", js.Any.fromFunction1(value))
      
      inline def setOnCheckSomeUndefined: Self = StObject.set(x, "onCheckSome", js.undefined)
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setOnClickCell(
        value: (/* field */ String, /* value */ Any, /* row */ Any, /* $element */ JQuery) => Boolean | Unit
      ): Self = StObject.set(x, "onClickCell", js.Any.fromFunction4(value))
      
      inline def setOnClickCellUndefined: Self = StObject.set(x, "onClickCell", js.undefined)
      
      inline def setOnClickRow(value: (/* row */ Any, /* $element */ JQuery, /* field */ String) => Boolean | Unit): Self = StObject.set(x, "onClickRow", js.Any.fromFunction3(value))
      
      inline def setOnClickRowUndefined: Self = StObject.set(x, "onClickRow", js.undefined)
      
      inline def setOnCollapseRow(value: (/* index */ Double, /* row */ Any, /* detailView */ Any) => Boolean | Unit): Self = StObject.set(x, "onCollapseRow", js.Any.fromFunction3(value))
      
      inline def setOnCollapseRowUndefined: Self = StObject.set(x, "onCollapseRow", js.undefined)
      
      inline def setOnColumnSwitch(value: (/* field */ String, /* checked */ Boolean) => Boolean | Unit): Self = StObject.set(x, "onColumnSwitch", js.Any.fromFunction2(value))
      
      inline def setOnColumnSwitchUndefined: Self = StObject.set(x, "onColumnSwitch", js.undefined)
      
      inline def setOnDblClickCell(
        value: (/* field */ String, /* value */ Any, /* row */ Any, /* $element */ JQuery) => Boolean | Unit
      ): Self = StObject.set(x, "onDblClickCell", js.Any.fromFunction4(value))
      
      inline def setOnDblClickCellUndefined: Self = StObject.set(x, "onDblClickCell", js.undefined)
      
      inline def setOnDblClickRow(value: (/* row */ Any, /* $element */ JQuery, /* field */ String) => Boolean | Unit): Self = StObject.set(x, "onDblClickRow", js.Any.fromFunction3(value))
      
      inline def setOnDblClickRowUndefined: Self = StObject.set(x, "onDblClickRow", js.undefined)
      
      inline def setOnExpandRow(value: (/* index */ Double, /* row */ Any, /* $detail */ JQuery) => Boolean | Unit): Self = StObject.set(x, "onExpandRow", js.Any.fromFunction3(value))
      
      inline def setOnExpandRowUndefined: Self = StObject.set(x, "onExpandRow", js.undefined)
      
      inline def setOnLoadError(value: (/* status */ String, /* jqXHR */ jqXHR[Any]) => Boolean | Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction2(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadSuccess(value: (/* data */ Any, /* status */ String, /* jqXHR */ jqXHR[Any]) => Boolean | Unit): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction3(value))
      
      inline def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
      
      inline def setOnPageChange(value: (/* number */ Double, /* size */ Double) => Boolean | Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setOnPostBody(value: () => Boolean | Unit): Self = StObject.set(x, "onPostBody", js.Any.fromFunction0(value))
      
      inline def setOnPostBodyUndefined: Self = StObject.set(x, "onPostBody", js.undefined)
      
      inline def setOnPostFooter(value: () => Boolean | Unit): Self = StObject.set(x, "onPostFooter", js.Any.fromFunction0(value))
      
      inline def setOnPostFooterUndefined: Self = StObject.set(x, "onPostFooter", js.undefined)
      
      inline def setOnPostHeader(value: () => Boolean | Unit): Self = StObject.set(x, "onPostHeader", js.Any.fromFunction0(value))
      
      inline def setOnPostHeaderUndefined: Self = StObject.set(x, "onPostHeader", js.undefined)
      
      inline def setOnPreBody(value: /* data */ Any => Boolean | Unit): Self = StObject.set(x, "onPreBody", js.Any.fromFunction1(value))
      
      inline def setOnPreBodyUndefined: Self = StObject.set(x, "onPreBody", js.undefined)
      
      inline def setOnRefresh(value: /* params */ js.Array[Any] => Boolean | Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction1(value))
      
      inline def setOnRefreshOptions(value: BootstrapTableOptions => Boolean | Unit): Self = StObject.set(x, "onRefreshOptions", js.Any.fromFunction1(value))
      
      inline def setOnRefreshOptionsUndefined: Self = StObject.set(x, "onRefreshOptions", js.undefined)
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnResetView(value: () => Boolean | Unit): Self = StObject.set(x, "onResetView", js.Any.fromFunction0(value))
      
      inline def setOnResetViewUndefined: Self = StObject.set(x, "onResetView", js.undefined)
      
      inline def setOnScrollBody(value: () => Boolean | Unit): Self = StObject.set(x, "onScrollBody", js.Any.fromFunction0(value))
      
      inline def setOnScrollBodyUndefined: Self = StObject.set(x, "onScrollBody", js.undefined)
      
      inline def setOnSearch(value: /* text */ String => Boolean | Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSort(value: (/* name */ String, /* order */ Double) => Boolean | Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction2(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnToggle(value: /* cardView */ Boolean => Boolean | Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUncheck(value: (/* row */ Any, /* $element */ JQuery) => Boolean | Unit): Self = StObject.set(x, "onUncheck", js.Any.fromFunction2(value))
      
      inline def setOnUncheckAll(value: (/* rowsAfter */ js.Array[Any], /* rowsBefore */ js.Array[Any]) => Boolean | Unit): Self = StObject.set(x, "onUncheckAll", js.Any.fromFunction2(value))
      
      inline def setOnUncheckAllUndefined: Self = StObject.set(x, "onUncheckAll", js.undefined)
      
      inline def setOnUncheckSome(value: /* rows */ js.Array[Any] => Boolean | Unit): Self = StObject.set(x, "onUncheckSome", js.Any.fromFunction1(value))
      
      inline def setOnUncheckSomeUndefined: Self = StObject.set(x, "onUncheckSome", js.undefined)
      
      inline def setOnUncheckUndefined: Self = StObject.set(x, "onUncheck", js.undefined)
      
      inline def setPageList(value: js.Array[Double]): Self = StObject.set(x, "pageList", value.asInstanceOf[js.Any])
      
      inline def setPageListUndefined: Self = StObject.set(x, "pageList", js.undefined)
      
      inline def setPageListVarargs(value: Double*): Self = StObject.set(x, "pageList", js.Array(value*))
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationDetailHAlign(value: String): Self = StObject.set(x, "paginationDetailHAlign", value.asInstanceOf[js.Any])
      
      inline def setPaginationDetailHAlignUndefined: Self = StObject.set(x, "paginationDetailHAlign", js.undefined)
      
      inline def setPaginationHAlign(value: String): Self = StObject.set(x, "paginationHAlign", value.asInstanceOf[js.Any])
      
      inline def setPaginationHAlignUndefined: Self = StObject.set(x, "paginationHAlign", js.undefined)
      
      inline def setPaginationLoop(value: Boolean): Self = StObject.set(x, "paginationLoop", value.asInstanceOf[js.Any])
      
      inline def setPaginationLoopUndefined: Self = StObject.set(x, "paginationLoop", js.undefined)
      
      inline def setPaginationNextText(value: String): Self = StObject.set(x, "paginationNextText", value.asInstanceOf[js.Any])
      
      inline def setPaginationNextTextUndefined: Self = StObject.set(x, "paginationNextText", js.undefined)
      
      inline def setPaginationPagesBySide(value: Double): Self = StObject.set(x, "paginationPagesBySide", value.asInstanceOf[js.Any])
      
      inline def setPaginationPagesBySideUndefined: Self = StObject.set(x, "paginationPagesBySide", js.undefined)
      
      inline def setPaginationParts(value: js.Array[String]): Self = StObject.set(x, "paginationParts", value.asInstanceOf[js.Any])
      
      inline def setPaginationPartsUndefined: Self = StObject.set(x, "paginationParts", js.undefined)
      
      inline def setPaginationPartsVarargs(value: String*): Self = StObject.set(x, "paginationParts", js.Array(value*))
      
      inline def setPaginationPreText(value: String): Self = StObject.set(x, "paginationPreText", value.asInstanceOf[js.Any])
      
      inline def setPaginationPreTextUndefined: Self = StObject.set(x, "paginationPreText", js.undefined)
      
      inline def setPaginationSuccessivelySize(value: Double): Self = StObject.set(x, "paginationSuccessivelySize", value.asInstanceOf[js.Any])
      
      inline def setPaginationSuccessivelySizeUndefined: Self = StObject.set(x, "paginationSuccessivelySize", js.undefined)
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPaginationUseIntermediate(value: Boolean): Self = StObject.set(x, "paginationUseIntermediate", value.asInstanceOf[js.Any])
      
      inline def setPaginationUseIntermediateUndefined: Self = StObject.set(x, "paginationUseIntermediate", js.undefined)
      
      inline def setPaginationVAlign(value: String): Self = StObject.set(x, "paginationVAlign", value.asInstanceOf[js.Any])
      
      inline def setPaginationVAlignUndefined: Self = StObject.set(x, "paginationVAlign", js.undefined)
      
      inline def setQueryParams(value: /* params */ Any => Any): Self = StObject.set(x, "queryParams", js.Any.fromFunction1(value))
      
      inline def setQueryParamsType(value: String): Self = StObject.set(x, "queryParamsType", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsTypeUndefined: Self = StObject.set(x, "queryParamsType", js.undefined)
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setRememberOrder(value: Boolean): Self = StObject.set(x, "rememberOrder", value.asInstanceOf[js.Any])
      
      inline def setRememberOrderUndefined: Self = StObject.set(x, "rememberOrder", js.undefined)
      
      inline def setResponseHandler(value: /* res */ Any => Any): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1(value))
      
      inline def setResponseHandlerUndefined: Self = StObject.set(x, "responseHandler", js.undefined)
      
      inline def setRowAttributes(value: (/* row */ Any, /* index */ Double) => js.Object): Self = StObject.set(x, "rowAttributes", js.Any.fromFunction2(value))
      
      inline def setRowAttributesUndefined: Self = StObject.set(x, "rowAttributes", js.undefined)
      
      inline def setRowStyle(value: (/* row */ Any, /* index */ Double) => js.Object): Self = StObject.set(x, "rowStyle", js.Any.fromFunction2(value))
      
      inline def setRowStyleUndefined: Self = StObject.set(x, "rowStyle", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchAccentNeutralise(value: Boolean): Self = StObject.set(x, "searchAccentNeutralise", value.asInstanceOf[js.Any])
      
      inline def setSearchAccentNeutraliseUndefined: Self = StObject.set(x, "searchAccentNeutralise", js.undefined)
      
      inline def setSearchAlign(value: String): Self = StObject.set(x, "searchAlign", value.asInstanceOf[js.Any])
      
      inline def setSearchAlignUndefined: Self = StObject.set(x, "searchAlign", js.undefined)
      
      inline def setSearchHighlight(value: Boolean): Self = StObject.set(x, "searchHighlight", value.asInstanceOf[js.Any])
      
      inline def setSearchHighlightUndefined: Self = StObject.set(x, "searchHighlight", js.undefined)
      
      inline def setSearchOnEnterKey(value: Boolean): Self = StObject.set(x, "searchOnEnterKey", value.asInstanceOf[js.Any])
      
      inline def setSearchOnEnterKeyUndefined: Self = StObject.set(x, "searchOnEnterKey", js.undefined)
      
      inline def setSearchSelector(value: Boolean | String): Self = StObject.set(x, "searchSelector", value.asInstanceOf[js.Any])
      
      inline def setSearchSelectorUndefined: Self = StObject.set(x, "searchSelector", js.undefined)
      
      inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
      
      inline def setSearchTimeOut(value: Double): Self = StObject.set(x, "searchTimeOut", value.asInstanceOf[js.Any])
      
      inline def setSearchTimeOutUndefined: Self = StObject.set(x, "searchTimeOut", js.undefined)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectItemName(value: String): Self = StObject.set(x, "selectItemName", value.asInstanceOf[js.Any])
      
      inline def setSelectItemNameUndefined: Self = StObject.set(x, "selectItemName", js.undefined)
      
      inline def setServerSort(value: Boolean): Self = StObject.set(x, "serverSort", value.asInstanceOf[js.Any])
      
      inline def setServerSortUndefined: Self = StObject.set(x, "serverSort", js.undefined)
      
      inline def setShowButtonIcons(value: Boolean): Self = StObject.set(x, "showButtonIcons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonIconsUndefined: Self = StObject.set(x, "showButtonIcons", js.undefined)
      
      inline def setShowButtonText(value: Boolean): Self = StObject.set(x, "showButtonText", value.asInstanceOf[js.Any])
      
      inline def setShowButtonTextUndefined: Self = StObject.set(x, "showButtonText", js.undefined)
      
      inline def setShowColumns(value: Boolean): Self = StObject.set(x, "showColumns", value.asInstanceOf[js.Any])
      
      inline def setShowColumnsSearch(value: Boolean): Self = StObject.set(x, "showColumnsSearch", value.asInstanceOf[js.Any])
      
      inline def setShowColumnsSearchUndefined: Self = StObject.set(x, "showColumnsSearch", js.undefined)
      
      inline def setShowColumnsToggleAll(value: Boolean): Self = StObject.set(x, "showColumnsToggleAll", value.asInstanceOf[js.Any])
      
      inline def setShowColumnsToggleAllUndefined: Self = StObject.set(x, "showColumnsToggleAll", js.undefined)
      
      inline def setShowColumnsUndefined: Self = StObject.set(x, "showColumns", js.undefined)
      
      inline def setShowExtendedPagination(value: Boolean): Self = StObject.set(x, "showExtendedPagination", value.asInstanceOf[js.Any])
      
      inline def setShowExtendedPaginationUndefined: Self = StObject.set(x, "showExtendedPagination", js.undefined)
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowFullscreen(value: Boolean): Self = StObject.set(x, "showFullscreen", value.asInstanceOf[js.Any])
      
      inline def setShowFullscreenUndefined: Self = StObject.set(x, "showFullscreen", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowPaginationSwitch(value: Boolean): Self = StObject.set(x, "showPaginationSwitch", value.asInstanceOf[js.Any])
      
      inline def setShowPaginationSwitchUndefined: Self = StObject.set(x, "showPaginationSwitch", js.undefined)
      
      inline def setShowRefresh(value: Boolean): Self = StObject.set(x, "showRefresh", value.asInstanceOf[js.Any])
      
      inline def setShowRefreshUndefined: Self = StObject.set(x, "showRefresh", js.undefined)
      
      inline def setShowSearchButton(value: Boolean): Self = StObject.set(x, "showSearchButton", value.asInstanceOf[js.Any])
      
      inline def setShowSearchButtonUndefined: Self = StObject.set(x, "showSearchButton", js.undefined)
      
      inline def setShowSearchClearButton(value: Boolean): Self = StObject.set(x, "showSearchClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowSearchClearButtonUndefined: Self = StObject.set(x, "showSearchClearButton", js.undefined)
      
      inline def setShowToggle(value: Boolean): Self = StObject.set(x, "showToggle", value.asInstanceOf[js.Any])
      
      inline def setShowToggleUndefined: Self = StObject.set(x, "showToggle", js.undefined)
      
      inline def setSidePagination(value: String): Self = StObject.set(x, "sidePagination", value.asInstanceOf[js.Any])
      
      inline def setSidePaginationUndefined: Self = StObject.set(x, "sidePagination", js.undefined)
      
      inline def setSilentSort(value: Boolean): Self = StObject.set(x, "silentSort", value.asInstanceOf[js.Any])
      
      inline def setSilentSortUndefined: Self = StObject.set(x, "silentSort", js.undefined)
      
      inline def setSingleSelect(value: Boolean): Self = StObject.set(x, "singleSelect", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectUndefined: Self = StObject.set(x, "singleSelect", js.undefined)
      
      inline def setSmartDisplay(value: Boolean): Self = StObject.set(x, "smartDisplay", value.asInstanceOf[js.Any])
      
      inline def setSmartDisplayUndefined: Self = StObject.set(x, "smartDisplay", js.undefined)
      
      inline def setSortClass(value: Any): Self = StObject.set(x, "sortClass", value.asInstanceOf[js.Any])
      
      inline def setSortClassUndefined: Self = StObject.set(x, "sortClass", js.undefined)
      
      inline def setSortName(value: Any): Self = StObject.set(x, "sortName", value.asInstanceOf[js.Any])
      
      inline def setSortNameUndefined: Self = StObject.set(x, "sortName", js.undefined)
      
      inline def setSortOrder(value: Any): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortReset(value: Boolean): Self = StObject.set(x, "sortReset", value.asInstanceOf[js.Any])
      
      inline def setSortResetPage(value: Boolean): Self = StObject.set(x, "sortResetPage", value.asInstanceOf[js.Any])
      
      inline def setSortResetPageUndefined: Self = StObject.set(x, "sortResetPage", js.undefined)
      
      inline def setSortResetUndefined: Self = StObject.set(x, "sortReset", js.undefined)
      
      inline def setSortStable(value: Boolean): Self = StObject.set(x, "sortStable", value.asInstanceOf[js.Any])
      
      inline def setSortStableUndefined: Self = StObject.set(x, "sortStable", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStrictSearch(value: Boolean): Self = StObject.set(x, "strictSearch", value.asInstanceOf[js.Any])
      
      inline def setStrictSearchUndefined: Self = StObject.set(x, "strictSearch", js.undefined)
      
      inline def setTheadClasses(value: String): Self = StObject.set(x, "theadClasses", value.asInstanceOf[js.Any])
      
      inline def setTheadClassesUndefined: Self = StObject.set(x, "theadClasses", js.undefined)
      
      inline def setToolbar(value: Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarAlign(value: String): Self = StObject.set(x, "toolbarAlign", value.asInstanceOf[js.Any])
      
      inline def setToolbarAlignUndefined: Self = StObject.set(x, "toolbarAlign", js.undefined)
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setTotalField(value: String): Self = StObject.set(x, "totalField", value.asInstanceOf[js.Any])
      
      inline def setTotalFieldUndefined: Self = StObject.set(x, "totalField", js.undefined)
      
      inline def setTotalNotFiltered(value: Double): Self = StObject.set(x, "totalNotFiltered", value.asInstanceOf[js.Any])
      
      inline def setTotalNotFilteredField(value: String): Self = StObject.set(x, "totalNotFilteredField", value.asInstanceOf[js.Any])
      
      inline def setTotalNotFilteredFieldUndefined: Self = StObject.set(x, "totalNotFilteredField", js.undefined)
      
      inline def setTotalNotFilteredUndefined: Self = StObject.set(x, "totalNotFiltered", js.undefined)
      
      inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
      
      inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      
      inline def setTrimOnSearch(value: Boolean): Self = StObject.set(x, "trimOnSearch", value.asInstanceOf[js.Any])
      
      inline def setTrimOnSearchUndefined: Self = StObject.set(x, "trimOnSearch", js.undefined)
      
      inline def setUndefinedText(value: String): Self = StObject.set(x, "undefinedText", value.asInstanceOf[js.Any])
      
      inline def setUndefinedTextUndefined: Self = StObject.set(x, "undefinedText", js.undefined)
      
      inline def setUniqueId(value: Any): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVirtualScroll(value: Boolean): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollItemHeight(value: Any): Self = StObject.set(x, "virtualScrollItemHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollItemHeightUndefined: Self = StObject.set(x, "virtualScrollItemHeight", js.undefined)
      
      inline def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
      
      inline def setVisibleSearch(value: Boolean): Self = StObject.set(x, "visibleSearch", value.asInstanceOf[js.Any])
      
      inline def setVisibleSearchUndefined: Self = StObject.set(x, "visibleSearch", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def bootstrapTable(method: String, parameters: Any*): JQuery | Any = js.native
      def bootstrapTable(options: BootstrapTableOptions): JQuery = js.native
    }
  }
}
