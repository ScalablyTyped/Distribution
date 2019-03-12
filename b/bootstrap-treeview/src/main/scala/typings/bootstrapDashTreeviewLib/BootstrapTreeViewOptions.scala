package typings
package bootstrapDashTreeviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewOptions extends js.Object {
  var backColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var checkedIcon: js.UndefOr[java.lang.String] = js.undefined
  var collapseIcon: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  var emptyIcon: js.UndefOr[java.lang.String] = js.undefined
  var enableLinks: js.UndefOr[scala.Boolean] = js.undefined
  var expandIcon: js.UndefOr[java.lang.String] = js.undefined
  var highlightSearchResults: js.UndefOr[scala.Boolean] = js.undefined
  var highlightSelected: js.UndefOr[scala.Boolean] = js.undefined
  var levels: js.UndefOr[scala.Double] = js.undefined
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  var nodeIcon: js.UndefOr[java.lang.String] = js.undefined
  var onNodeChecked: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeCollapsed: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeDisabled: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeEnabled: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeExpanded: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeSelected: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeUnchecked: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onNodeUnselected: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onSearchCleared: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onSearchComplete: js.UndefOr[
    js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, scala.Unit]
  ] = js.undefined
  var onhoverColor: js.UndefOr[java.lang.String] = js.undefined
  var searchResultBackColor: js.UndefOr[java.lang.String] = js.undefined
  var searchResultColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedBackColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedIcon: js.UndefOr[java.lang.String] = js.undefined
  var showBorder: js.UndefOr[scala.Boolean] = js.undefined
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showTags: js.UndefOr[scala.Boolean] = js.undefined
  var uncheckedIcon: js.UndefOr[scala.Boolean] = js.undefined
}

object BootstrapTreeViewOptions {
  @scala.inline
  def apply(
    backColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    checkedIcon: java.lang.String = null,
    collapseIcon: java.lang.String = null,
    color: java.lang.String = null,
    data: js.Array[BootstrapTreeViewNodeData] = null,
    emptyIcon: java.lang.String = null,
    enableLinks: js.UndefOr[scala.Boolean] = js.undefined,
    expandIcon: java.lang.String = null,
    highlightSearchResults: js.UndefOr[scala.Boolean] = js.undefined,
    highlightSelected: js.UndefOr[scala.Boolean] = js.undefined,
    levels: scala.Int | scala.Double = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    nodeIcon: java.lang.String = null,
    onNodeChecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeCollapsed: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeDisabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeEnabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeExpanded: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeSelected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeUnchecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onNodeUnselected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onSearchCleared: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onSearchComplete: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => scala.Unit = null,
    onhoverColor: java.lang.String = null,
    searchResultBackColor: java.lang.String = null,
    searchResultColor: java.lang.String = null,
    selectedBackColor: java.lang.String = null,
    selectedColor: java.lang.String = null,
    selectedIcon: java.lang.String = null,
    showBorder: js.UndefOr[scala.Boolean] = js.undefined,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showTags: js.UndefOr[scala.Boolean] = js.undefined,
    uncheckedIcon: js.UndefOr[scala.Boolean] = js.undefined
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

