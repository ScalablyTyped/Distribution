package typings.bootstrapTreeview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTreeViewOptions extends StObject {
  
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
  
  inline def apply(): BootstrapTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewOptions]
  }
  
  extension [Self <: BootstrapTreeViewOptions](x: Self) {
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    inline def setCollapseIcon(value: String): Self = StObject.set(x, "collapseIcon", value.asInstanceOf[js.Any])
    
    inline def setCollapseIconUndefined: Self = StObject.set(x, "collapseIcon", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setData(value: js.Array[BootstrapTreeViewNodeData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: BootstrapTreeViewNodeData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setEmptyIcon(value: String): Self = StObject.set(x, "emptyIcon", value.asInstanceOf[js.Any])
    
    inline def setEmptyIconUndefined: Self = StObject.set(x, "emptyIcon", js.undefined)
    
    inline def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
    
    inline def setEnableLinksUndefined: Self = StObject.set(x, "enableLinks", js.undefined)
    
    inline def setExpandIcon(value: String): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setHighlightSearchResults(value: Boolean): Self = StObject.set(x, "highlightSearchResults", value.asInstanceOf[js.Any])
    
    inline def setHighlightSearchResultsUndefined: Self = StObject.set(x, "highlightSearchResults", js.undefined)
    
    inline def setHighlightSelected(value: Boolean): Self = StObject.set(x, "highlightSelected", value.asInstanceOf[js.Any])
    
    inline def setHighlightSelectedUndefined: Self = StObject.set(x, "highlightSelected", js.undefined)
    
    inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    inline def setNodeIcon(value: String): Self = StObject.set(x, "nodeIcon", value.asInstanceOf[js.Any])
    
    inline def setNodeIconUndefined: Self = StObject.set(x, "nodeIcon", js.undefined)
    
    inline def setOnNodeChecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeChecked", js.Any.fromFunction2(value))
    
    inline def setOnNodeCheckedUndefined: Self = StObject.set(x, "onNodeChecked", js.undefined)
    
    inline def setOnNodeCollapsed(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeCollapsed", js.Any.fromFunction2(value))
    
    inline def setOnNodeCollapsedUndefined: Self = StObject.set(x, "onNodeCollapsed", js.undefined)
    
    inline def setOnNodeDisabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeDisabled", js.Any.fromFunction2(value))
    
    inline def setOnNodeDisabledUndefined: Self = StObject.set(x, "onNodeDisabled", js.undefined)
    
    inline def setOnNodeEnabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeEnabled", js.Any.fromFunction2(value))
    
    inline def setOnNodeEnabledUndefined: Self = StObject.set(x, "onNodeEnabled", js.undefined)
    
    inline def setOnNodeExpanded(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeExpanded", js.Any.fromFunction2(value))
    
    inline def setOnNodeExpandedUndefined: Self = StObject.set(x, "onNodeExpanded", js.undefined)
    
    inline def setOnNodeSelected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeSelected", js.Any.fromFunction2(value))
    
    inline def setOnNodeSelectedUndefined: Self = StObject.set(x, "onNodeSelected", js.undefined)
    
    inline def setOnNodeUnchecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeUnchecked", js.Any.fromFunction2(value))
    
    inline def setOnNodeUncheckedUndefined: Self = StObject.set(x, "onNodeUnchecked", js.undefined)
    
    inline def setOnNodeUnselected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onNodeUnselected", js.Any.fromFunction2(value))
    
    inline def setOnNodeUnselectedUndefined: Self = StObject.set(x, "onNodeUnselected", js.undefined)
    
    inline def setOnSearchCleared(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onSearchCleared", js.Any.fromFunction2(value))
    
    inline def setOnSearchClearedUndefined: Self = StObject.set(x, "onSearchCleared", js.undefined)
    
    inline def setOnSearchComplete(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction2(value))
    
    inline def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    inline def setOnhoverColor(value: String): Self = StObject.set(x, "onhoverColor", value.asInstanceOf[js.Any])
    
    inline def setOnhoverColorUndefined: Self = StObject.set(x, "onhoverColor", js.undefined)
    
    inline def setSearchResultBackColor(value: String): Self = StObject.set(x, "searchResultBackColor", value.asInstanceOf[js.Any])
    
    inline def setSearchResultBackColorUndefined: Self = StObject.set(x, "searchResultBackColor", js.undefined)
    
    inline def setSearchResultColor(value: String): Self = StObject.set(x, "searchResultColor", value.asInstanceOf[js.Any])
    
    inline def setSearchResultColorUndefined: Self = StObject.set(x, "searchResultColor", js.undefined)
    
    inline def setSelectedBackColor(value: String): Self = StObject.set(x, "selectedBackColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedBackColorUndefined: Self = StObject.set(x, "selectedBackColor", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSelectedIcon(value: String): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
    
    inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    inline def setShowTags(value: Boolean): Self = StObject.set(x, "showTags", value.asInstanceOf[js.Any])
    
    inline def setShowTagsUndefined: Self = StObject.set(x, "showTags", js.undefined)
    
    inline def setUncheckedIcon(value: Boolean): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
  }
}
