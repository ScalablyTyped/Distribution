package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.button
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.empty
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.group
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.simple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.tabbed
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormButtonItem extends StObject {
  
  /**
    * Configures the button.
    */
  var buttonOptions: js.UndefOr[dxButtonOptions] = js.undefined
  
  /**
    * Specifies how many columns the item spans.
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button&apos;s horizontal alignment.
    */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Specifies the item&apos;s type. Set it to &apos;button&apos; to create a button item.
    */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  
  /**
    * Specifies the item&apos;s identifier.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button&apos;s vertical alignment.
    */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
  
  /**
    * Specifies whether the item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the item&apos;s position regarding other items in a group, tab, or the whole UI component.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object dxFormButtonItem {
  
  inline def apply(): dxFormButtonItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormButtonItem]
  }
  
  extension [Self <: dxFormButtonItem](x: Self) {
    
    inline def setButtonOptions(value: dxButtonOptions): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
    
    inline def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setItemType(value: empty | group | simple | tabbed | button): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVerticalAlignment(value: bottom | center | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
