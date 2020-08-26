package typings.bootstrapTreeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTreeViewOptions extends js.Object {
  var backColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var checkedIcon: js.UndefOr[String] = js.native
  var collapseIcon: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.native
  var emptyIcon: js.UndefOr[String] = js.native
  var enableLinks: js.UndefOr[Boolean] = js.native
  var expandIcon: js.UndefOr[String] = js.native
  var highlightSearchResults: js.UndefOr[Boolean] = js.native
  var highlightSelected: js.UndefOr[Boolean] = js.native
  var levels: js.UndefOr[Double] = js.native
  var multiSelect: js.UndefOr[Boolean] = js.native
  var nodeIcon: js.UndefOr[String] = js.native
  var onNodeChecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeCollapsed: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeDisabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeEnabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeExpanded: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeSelected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeUnchecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeUnselected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onSearchCleared: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onSearchComplete: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onhoverColor: js.UndefOr[String] = js.native
  var searchResultBackColor: js.UndefOr[String] = js.native
  var searchResultColor: js.UndefOr[String] = js.native
  var selectedBackColor: js.UndefOr[String] = js.native
  var selectedColor: js.UndefOr[String] = js.native
  var selectedIcon: js.UndefOr[String] = js.native
  var showBorder: js.UndefOr[Boolean] = js.native
  var showCheckbox: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showTags: js.UndefOr[Boolean] = js.native
  var uncheckedIcon: js.UndefOr[Boolean] = js.native
}

object BootstrapTreeViewOptions {
  @scala.inline
  def apply(): BootstrapTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewOptions]
  }
  @scala.inline
  implicit class BootstrapTreeViewOptionsOps[Self <: BootstrapTreeViewOptions] (val x: Self) extends AnyVal {
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
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackColor: Self = this.set("backColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setCheckedIcon(value: String): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    @scala.inline
    def setCollapseIcon(value: String): Self = this.set("collapseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseIcon: Self = this.set("collapseIcon", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDataVarargs(value: BootstrapTreeViewNodeData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[BootstrapTreeViewNodeData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEmptyIcon(value: String): Self = this.set("emptyIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyIcon: Self = this.set("emptyIcon", js.undefined)
    @scala.inline
    def setEnableLinks(value: Boolean): Self = this.set("enableLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLinks: Self = this.set("enableLinks", js.undefined)
    @scala.inline
    def setExpandIcon(value: String): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setHighlightSearchResults(value: Boolean): Self = this.set("highlightSearchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSearchResults: Self = this.set("highlightSearchResults", js.undefined)
    @scala.inline
    def setHighlightSelected(value: Boolean): Self = this.set("highlightSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSelected: Self = this.set("highlightSelected", js.undefined)
    @scala.inline
    def setLevels(value: Double): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setNodeIcon(value: String): Self = this.set("nodeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIcon: Self = this.set("nodeIcon", js.undefined)
    @scala.inline
    def setOnNodeChecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeChecked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeChecked: Self = this.set("onNodeChecked", js.undefined)
    @scala.inline
    def setOnNodeCollapsed(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeCollapsed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeCollapsed: Self = this.set("onNodeCollapsed", js.undefined)
    @scala.inline
    def setOnNodeDisabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeDisabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeDisabled: Self = this.set("onNodeDisabled", js.undefined)
    @scala.inline
    def setOnNodeEnabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeEnabled: Self = this.set("onNodeEnabled", js.undefined)
    @scala.inline
    def setOnNodeExpanded(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeExpanded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeExpanded: Self = this.set("onNodeExpanded", js.undefined)
    @scala.inline
    def setOnNodeSelected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeSelected: Self = this.set("onNodeSelected", js.undefined)
    @scala.inline
    def setOnNodeUnchecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeUnchecked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeUnchecked: Self = this.set("onNodeUnchecked", js.undefined)
    @scala.inline
    def setOnNodeUnselected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onNodeUnselected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNodeUnselected: Self = this.set("onNodeUnselected", js.undefined)
    @scala.inline
    def setOnSearchCleared(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onSearchCleared", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearchCleared: Self = this.set("onSearchCleared", js.undefined)
    @scala.inline
    def setOnSearchComplete(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = this.set("onSearchComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearchComplete: Self = this.set("onSearchComplete", js.undefined)
    @scala.inline
    def setOnhoverColor(value: String): Self = this.set("onhoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnhoverColor: Self = this.set("onhoverColor", js.undefined)
    @scala.inline
    def setSearchResultBackColor(value: String): Self = this.set("searchResultBackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchResultBackColor: Self = this.set("searchResultBackColor", js.undefined)
    @scala.inline
    def setSearchResultColor(value: String): Self = this.set("searchResultColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchResultColor: Self = this.set("searchResultColor", js.undefined)
    @scala.inline
    def setSelectedBackColor(value: String): Self = this.set("selectedBackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedBackColor: Self = this.set("selectedBackColor", js.undefined)
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    @scala.inline
    def setSelectedIcon(value: String): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setShowBorder(value: Boolean): Self = this.set("showBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBorder: Self = this.set("showBorder", js.undefined)
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    @scala.inline
    def setShowTags(value: Boolean): Self = this.set("showTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTags: Self = this.set("showTags", js.undefined)
    @scala.inline
    def setUncheckedIcon(value: Boolean): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
  }
  
}

