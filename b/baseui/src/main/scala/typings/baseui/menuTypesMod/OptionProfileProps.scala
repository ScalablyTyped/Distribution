package typings.baseui.menuTypesMod

import typings.baseui.anon.Body
import typings.baseui.anon.ListItemProfile
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionProfileProps extends StObject {
  
  /** Renders UI in 'highlighted' state. */
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  /** Used to render a sub menu at this menu item. You'll often render another menu from this function. */
  var getChildMenu: js.UndefOr[js.Function1[/* item */ Item, ReactNode]] = js.undefined
  
  /** Returns either an image source url, or a full React component to render as the image. */
  var getProfileItemImg: GetProfileItemImgFn
  
  /** Returns the alt text for the image */
  var getProfileItemImgText: GetProfileItemImgTextFn
  
  /** Returns an object consisting of title, subtitle, and body to render menu item */
  var getProfileItemLabels: GetProfileItemLabelsFn
  
  /** Item to parse and render. */
  var item: Item
  
  var overrides: js.UndefOr[ListItemProfile] = js.undefined
  
  /** Renders all menu content for SEO purposes regardless of menu  state */
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  /** Utility to reset menu to default state. Useful for rendering child menus. */
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OptionProfileProps {
  
  inline def apply(
    getProfileItemImg: /* item */ Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ Item => String,
    getProfileItemLabels: /* item */ Item => Body,
    item: Item
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProfileProps]
  }
  
  extension [Self <: OptionProfileProps](x: Self) {
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    inline def setGetChildMenu(value: /* item */ Item => ReactNode): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    inline def setGetProfileItemImg(value: /* item */ Item => String | ComponentType[Any]): Self = StObject.set(x, "getProfileItemImg", js.Any.fromFunction1(value))
    
    inline def setGetProfileItemImgText(value: /* item */ Item => String): Self = StObject.set(x, "getProfileItemImgText", js.Any.fromFunction1(value))
    
    inline def setGetProfileItemLabels(value: /* item */ Item => Body): Self = StObject.set(x, "getProfileItemLabels", js.Any.fromFunction1(value))
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: ListItemProfile): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setResetMenu(value: () => Unit): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    inline def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
  }
}
