package typings.bootstrapTreeview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTreeViewOptions extends StObject {
  
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
  implicit class BootstrapTreeViewOptionsMutableBuilder[Self <: BootstrapTreeViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    @scala.inline
    def setCollapseIcon(value: String): Self = StObject.set(x, "collapseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseIconUndefined: Self = StObject.set(x, "collapseIcon", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[BootstrapTreeViewNodeData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: BootstrapTreeViewNodeData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEmptyIcon(value: String): Self = StObject.set(x, "emptyIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyIconUndefined: Self = StObject.set(x, "emptyIcon", js.undefined)
    
    @scala.inline
    def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLinksUndefined: Self = StObject.set(x, "enableLinks", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: String): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    @scala.inline
    def setHighlightSearchResults(value: Boolean): Self = StObject.set(x, "highlightSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSearchResultsUndefined: Self = StObject.set(x, "highlightSearchResults", js.undefined)
    
    @scala.inline
    def setHighlightSelected(value: Boolean): Self = StObject.set(x, "highlightSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSelectedUndefined: Self = StObject.set(x, "highlightSelected", js.undefined)
    
    @scala.inline
    def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    @scala.inline
    def setNodeIcon(value: String): Self = StObject.set(x, "nodeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIconUndefined: Self = StObject.set(x, "nodeIcon", js.undefined)
    
    @scala.inline
    def setOnNodeChecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeChecked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeCheckedUndefined: Self = StObject.set(x, "onNodeChecked", js.undefined)
    
    @scala.inline
    def setOnNodeCollapsed(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeCollapsedUndefined: Self = StObject.set(x, "onNodeCollapsed", js.undefined)
    
    @scala.inline
    def setOnNodeDisabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeDisabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeDisabledUndefined: Self = StObject.set(x, "onNodeDisabled", js.undefined)
    
    @scala.inline
    def setOnNodeEnabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeEnabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeEnabledUndefined: Self = StObject.set(x, "onNodeEnabled", js.undefined)
    
    @scala.inline
    def setOnNodeExpanded(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeExpandedUndefined: Self = StObject.set(x, "onNodeExpanded", js.undefined)
    
    @scala.inline
    def setOnNodeSelected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeSelectedUndefined: Self = StObject.set(x, "onNodeSelected", js.undefined)
    
    @scala.inline
    def setOnNodeUnchecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeUnchecked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeUncheckedUndefined: Self = StObject.set(x, "onNodeUnchecked", js.undefined)
    
    @scala.inline
    def setOnNodeUnselected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeUnselected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNodeUnselectedUndefined: Self = StObject.set(x, "onNodeUnselected", js.undefined)
    
    @scala.inline
    def setOnSearchCleared(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onSearchCleared", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSearchClearedUndefined: Self = StObject.set(x, "onSearchCleared", js.undefined)
    
    @scala.inline
    def setOnSearchComplete(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    @scala.inline
    def setOnhoverColor(value: String): Self = StObject.set(x, "onhoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhoverColorUndefined: Self = StObject.set(x, "onhoverColor", js.undefined)
    
    @scala.inline
    def setSearchResultBackColor(value: String): Self = StObject.set(x, "searchResultBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultBackColorUndefined: Self = StObject.set(x, "searchResultBackColor", js.undefined)
    
    @scala.inline
    def setSearchResultColor(value: String): Self = StObject.set(x, "searchResultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultColorUndefined: Self = StObject.set(x, "searchResultColor", js.undefined)
    
    @scala.inline
    def setSelectedBackColor(value: String): Self = StObject.set(x, "selectedBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackColorUndefined: Self = StObject.set(x, "selectedBackColor", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setSelectedIcon(value: String): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    @scala.inline
    def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setShowTags(value: Boolean): Self = StObject.set(x, "showTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTagsUndefined: Self = StObject.set(x, "showTags", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: Boolean): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
  }
}
