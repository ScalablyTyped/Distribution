package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.ChildMenuPopover
import typings.baseui.menuTypesMod.Item
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMaybeChildMenuMod extends Shortcut {
  
  @JSImport("baseui/menu/maybe-child-menu", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var getChildMenu: js.UndefOr[(js.Function1[/* item */ Item, ReactNode]) | Null] = js.undefined
    
    var isOpen: Boolean
    
    var item: Item
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Any]] = js.undefined
    
    var overrides: js.UndefOr[ChildMenuPopover] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    def resetParentMenu(): Unit
  }
  object Props {
    
    inline def apply(isOpen: Boolean, item: Item, resetParentMenu: () => Unit): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], resetParentMenu = js.Any.fromFunction0(resetParentMenu))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setGetChildMenu(value: /* item */ Item => ReactNode): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
      
      inline def setGetChildMenuNull: Self = StObject.set(x, "getChildMenu", null)
      
      inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ChildMenuPopover): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setResetParentMenu(value: () => Unit): Self = StObject.set(x, "resetParentMenu", js.Any.fromFunction0(value))
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `menuMaybeChildMenuMod.foo` */
  override def _to: FC[Props] = default
}
