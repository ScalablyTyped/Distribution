package typings.bootstrapDashTreeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewOptions extends js.Object {
  var backColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var checkedIcon: js.UndefOr[String] = js.undefined
  var collapseIcon: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  var emptyIcon: js.UndefOr[String] = js.undefined
  var enableLinks: js.UndefOr[Boolean] = js.undefined
  var expandIcon: js.UndefOr[String] = js.undefined
  var highlightSearchResults: js.UndefOr[Boolean] = js.undefined
  var highlightSelected: js.UndefOr[Boolean] = js.undefined
  var levels: js.UndefOr[Double] = js.undefined
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var nodeIcon: js.UndefOr[String] = js.undefined
  var onNodeChecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeCollapsed: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeDisabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeEnabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeExpanded: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeSelected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeUnchecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeUnselected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onSearchCleared: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onhoverColor: js.UndefOr[String] = js.undefined
  var searchResultBackColor: js.UndefOr[String] = js.undefined
  var searchResultColor: js.UndefOr[String] = js.undefined
  var selectedBackColor: js.UndefOr[String] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var selectedIcon: js.UndefOr[String] = js.undefined
  var showBorder: js.UndefOr[Boolean] = js.undefined
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showTags: js.UndefOr[Boolean] = js.undefined
  var uncheckedIcon: js.UndefOr[Boolean] = js.undefined
}

object BootstrapTreeViewOptions {
  @scala.inline
  def apply(
    backColor: String = null,
    borderColor: String = null,
    checkedIcon: String = null,
    collapseIcon: String = null,
    color: String = null,
    data: js.Array[BootstrapTreeViewNodeData] = null,
    emptyIcon: String = null,
    enableLinks: js.UndefOr[Boolean] = js.undefined,
    expandIcon: String = null,
    highlightSearchResults: js.UndefOr[Boolean] = js.undefined,
    highlightSelected: js.UndefOr[Boolean] = js.undefined,
    levels: Int | Double = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    nodeIcon: String = null,
    onNodeChecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeCollapsed: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeDisabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeEnabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeExpanded: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeSelected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeUnchecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onNodeUnselected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onSearchCleared: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onSearchComplete: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit = null,
    onhoverColor: String = null,
    searchResultBackColor: String = null,
    searchResultColor: String = null,
    selectedBackColor: String = null,
    selectedColor: String = null,
    selectedIcon: String = null,
    showBorder: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showTags: js.UndefOr[Boolean] = js.undefined,
    uncheckedIcon: js.UndefOr[Boolean] = js.undefined
  ): BootstrapTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (backColor != null) __obj.updateDynamic("backColor")(backColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (collapseIcon != null) __obj.updateDynamic("collapseIcon")(collapseIcon)
    if (color != null) __obj.updateDynamic("color")(color)
    if (data != null) __obj.updateDynamic("data")(data)
    if (emptyIcon != null) __obj.updateDynamic("emptyIcon")(emptyIcon)
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (!js.isUndefined(highlightSearchResults)) __obj.updateDynamic("highlightSearchResults")(highlightSearchResults)
    if (!js.isUndefined(highlightSelected)) __obj.updateDynamic("highlightSelected")(highlightSelected)
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (nodeIcon != null) __obj.updateDynamic("nodeIcon")(nodeIcon)
    if (onNodeChecked != null) __obj.updateDynamic("onNodeChecked")(js.Any.fromFunction2(onNodeChecked))
    if (onNodeCollapsed != null) __obj.updateDynamic("onNodeCollapsed")(js.Any.fromFunction2(onNodeCollapsed))
    if (onNodeDisabled != null) __obj.updateDynamic("onNodeDisabled")(js.Any.fromFunction2(onNodeDisabled))
    if (onNodeEnabled != null) __obj.updateDynamic("onNodeEnabled")(js.Any.fromFunction2(onNodeEnabled))
    if (onNodeExpanded != null) __obj.updateDynamic("onNodeExpanded")(js.Any.fromFunction2(onNodeExpanded))
    if (onNodeSelected != null) __obj.updateDynamic("onNodeSelected")(js.Any.fromFunction2(onNodeSelected))
    if (onNodeUnchecked != null) __obj.updateDynamic("onNodeUnchecked")(js.Any.fromFunction2(onNodeUnchecked))
    if (onNodeUnselected != null) __obj.updateDynamic("onNodeUnselected")(js.Any.fromFunction2(onNodeUnselected))
    if (onSearchCleared != null) __obj.updateDynamic("onSearchCleared")(js.Any.fromFunction2(onSearchCleared))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction2(onSearchComplete))
    if (onhoverColor != null) __obj.updateDynamic("onhoverColor")(onhoverColor)
    if (searchResultBackColor != null) __obj.updateDynamic("searchResultBackColor")(searchResultBackColor)
    if (searchResultColor != null) __obj.updateDynamic("searchResultColor")(searchResultColor)
    if (selectedBackColor != null) __obj.updateDynamic("selectedBackColor")(selectedBackColor)
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon)
    if (!js.isUndefined(showBorder)) __obj.updateDynamic("showBorder")(showBorder)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showTags)) __obj.updateDynamic("showTags")(showTags)
    if (!js.isUndefined(uncheckedIcon)) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    __obj.asInstanceOf[BootstrapTreeViewOptions]
  }
}

