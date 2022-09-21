package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTabs.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTabsBaseOptions[TComponent /* <: dxTabs[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[TComponent, TItem, TKey] {
  
  /**
    * Specifies whether to repaint only those elements whose data changed.
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can scroll tabs by swiping.
    */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can scroll tabs.
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI component enables an end-user to select only a single item or multiple items.
    */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  
  /**
    * Specifies whether navigation buttons should be available when tabs exceed the UI component&apos;s width.
    */
  var showNavButtons: js.UndefOr[Boolean] = js.undefined
}
object dxTabsBaseOptions {
  
  inline def apply[TComponent /* <: dxTabs[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey](): dxTabsBaseOptions[TComponent, TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabsBaseOptions[TComponent, TItem, TKey]]
  }
  
  extension [Self <: dxTabsBaseOptions[?, ?, ?], TComponent /* <: dxTabs[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey](x: Self & (dxTabsBaseOptions[TComponent, TItem, TKey])) {
    
    inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
    
    inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
    
    inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
    
    inline def setScrollingEnabled(value: Boolean): Self = StObject.set(x, "scrollingEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollingEnabledUndefined: Self = StObject.set(x, "scrollingEnabled", js.undefined)
    
    inline def setSelectionMode(value: multiple | single_): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowNavButtons(value: Boolean): Self = StObject.set(x, "showNavButtons", value.asInstanceOf[js.Any])
    
    inline def setShowNavButtonsUndefined: Self = StObject.set(x, "showNavButtons", js.undefined)
  }
}
