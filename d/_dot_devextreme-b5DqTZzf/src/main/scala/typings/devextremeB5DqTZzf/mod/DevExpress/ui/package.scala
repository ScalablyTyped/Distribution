package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.ExternalFormat
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.CollectionWidget.ItemLike
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ColumnBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ColumnButtonBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Editing
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.EditingBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.EditingTextsBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.PagingBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Scrolling
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.ScrollingBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.Selection
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDataGrid.SelectionBase
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.EditingTexts
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.Node
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.Paging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CollectionWidgetItemTemplate = CollectionWidgetItem

type DataExpressionMixinItemTemplate = CollectionWidgetItem

/* Rewritten from type alias, can be one of: 
  - typings.devextremeB5DqTZzf.mod.DevExpress.FormatObject
  - typings.devextremeB5DqTZzf.mod.DevExpress.PredefinedFormat
  - java.lang.String
  - js.Function1[js.Date | scala.Double, java.lang.String]
  - typings.devextremeB5DqTZzf.mod.DevExpress.ExternalFormat
*/
type Format = _Format | (js.Function1[js.Date | Double, String]) | String | ExternalFormat

type GridBaseColumn[TRowData] = ColumnBase[TRowData]

type GridBaseColumnButton = ColumnButtonBase

type GridBaseEditing[TRowData, TKey] = EditingBase[TRowData, TKey]

type GridBaseEditingTexts = EditingTextsBase

type GridBasePaging = PagingBase

type GridBaseScrolling = ScrollingBase

type GridBaseSelection = SelectionBase

type HierarchicalCollectionWidget[TProperties /* <: HierarchicalCollectionWidgetOptions[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type Template = template

type dxAccordionItemTemplate = dxAccordionItem

type dxActionSheetItemTemplate = dxActionSheetItem[Any]

type dxAutocomplete = dxDropDownList[dxAutocompleteOptions]

type dxBox[TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxBox.ItemLike[TKey] */, TKey] = CollectionWidget[dxBoxOptions[TItem, TKey], TItem, TKey]

type dxBoxItemTemplate = dxBoxItem[Any]

type dxButton = Widget[dxButtonOptions]

type dxButtonGroup = Widget[dxButtonGroupOptions]

type dxCalendar = Editor[dxCalendarOptions]

type dxColorBox = dxDropDownEditor[dxColorBoxOptions]

type dxContextMenuItemTemplate = dxContextMenuItem

type dxDataGridEditing[TRowData, TKey] = Editing[TRowData, TKey]

type dxDataGridScrolling = Scrolling

type dxDataGridSelection = Selection

type dxDeferRendering = Widget[dxDeferRenderingOptions]

type dxGalleryItemTemplate = dxGalleryItem

type dxListItemTemplate = dxListItem

type dxLoadIndicator = Widget[dxLoadIndicatorOptions]

type dxLoadPanel = dxOverlay[dxLoadPanelOptions]

type dxLookup = dxDropDownList[dxLookupOptions]

type dxMenu[TKey] = dxMenuBase[dxMenuOptions[TKey], dxMenuItem, TKey]

type dxMenuBaseItemTemplate = dxMenuBaseItem

type dxMenuItemTemplate = dxMenuItem

type dxMultiView[TProperties /* <: dxMultiViewOptions[TItem, TKey] */, TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMultiView.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxMultiViewItem = CollectionWidgetItem

type dxMultiViewItemTemplate = dxMultiViewItem

type dxNavBar[TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxNavBar.ItemLike */, TKey] = dxTabs[dxNavBarOptions[TItem, TKey], TItem, TKey]

type dxNavBarItemTemplate = dxNavBarItem

type dxNumberBox = dxTextEditor[dxNumberBoxOptions]

type dxPopup[TProperties] = dxOverlay[TProperties]

type dxProgressBar = dxTrackBar[dxProgressBarOptions]

type dxRangeSlider = dxTrackBar[dxRangeSliderOptions]

type dxRecurrenceEditor = Editor[dxRecurrenceEditorOptions]

type dxResizable = DOMComponent[dxResizableOptions]

type dxResponsiveBox[TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxResponsiveBox.ItemLike */, TKey] = CollectionWidget[dxResponsiveBoxOptions[TItem, TKey], TItem, TKey]

type dxResponsiveBoxItemTemplate = dxResponsiveBoxItem

type dxSchedulerAppointmentTemplate = dxSchedulerAppointment

type dxSelectBox[TProperties] = dxDropDownList[TProperties]

type dxSlideOutItemTemplate = dxSlideOutItem

type dxSlider = dxTrackBar[dxSliderOptions]

type dxSpeedDialAction = Widget[dxSpeedDialActionOptions]

type dxSwitch = Editor[dxSwitchOptions]

type dxTabPanel[TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTabPanel.ItemLike */, TKey] = dxMultiView[dxTabPanelOptions[TItem, TKey], TItem, TKey]

type dxTabPanelItemTemplate = dxTabPanelItem

type dxTabs[TProperties /* <: dxTabsOptions[TItem, TKey] */, TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTabs.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxTabsItemTemplate = dxTabsItem

type dxTagBox = dxSelectBox[dxTagBoxOptions]

type dxTextArea = dxTextBox[dxTextAreaOptions]

type dxTextBox[TProperties] = dxTextEditor[TProperties]

type dxTileViewItemTemplate = dxTileViewItem

type dxToast = dxOverlay[dxToastOptions]

type dxToolbar[TItem /* <: typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxToolbar.ItemLike */, TKey] = CollectionWidget[dxToolbarOptions[TItem, TKey], TItem, TKey]

type dxToolbarItemTemplate = dxToolbarItem

type dxTooltip = dxPopover[dxTooltipOptions]

type dxTrackBar[TProperties] = Editor[TProperties]

type dxTreeListEditing[TRowData, TKey] = typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.Editing[TRowData, TKey]

type dxTreeListEditingTexts = EditingTexts

type dxTreeListNode[TRowData, TKey] = Node[TRowData, TKey]

type dxTreeListPaging = Paging

type dxTreeListScrolling = typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.Scrolling

type dxTreeListSelection = typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTreeList.Selection

type dxTreeViewItemTemplate = dxTreeViewItem

type dxValidationGroupOptions = DOMComponentOptions[dxValidationGroup]

type dxValidationMessage = dxOverlay[dxValidationMessageOptions]

type dxValidationSummary[TItem /* <: ItemLike */, TKey] = CollectionWidget[dxValidationSummaryOptions[TItem, TKey], TItem, TKey]
