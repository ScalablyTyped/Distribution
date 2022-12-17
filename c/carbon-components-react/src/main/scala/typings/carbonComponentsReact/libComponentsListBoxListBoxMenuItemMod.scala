package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListBoxListBoxMenuItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListBox/ListBoxMenuItem", JSImport.Default)
  @js.native
  val default: ListBoxMenuItemComponent = js.native
  
  type ListBoxMenuItemComponent = ForwardRefReturn[ListBoxMenuItemForwardedRef, ListBoxMenuItemProps]
  
  trait ListBoxMenuItemForwardedRef extends StObject {
    
    var menuItemOptionRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object ListBoxMenuItemForwardedRef {
    
    inline def apply(): ListBoxMenuItemForwardedRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxMenuItemForwardedRef]
    }
    
    extension [Self <: ListBoxMenuItemForwardedRef](x: Self) {
      
      inline def setMenuItemOptionRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuItemOptionRef", value.asInstanceOf[js.Any])
      
      inline def setMenuItemOptionRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "menuItemOptionRef", js.Any.fromFunction1(value))
      
      inline def setMenuItemOptionRefNull: Self = StObject.set(x, "menuItemOptionRef", null)
      
      inline def setMenuItemOptionRefUndefined: Self = StObject.set(x, "menuItemOptionRef", js.undefined)
    }
  }
  
  trait ListBoxMenuItemProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    // required but has default value
    var isHighlighted: js.UndefOr[Boolean] = js.undefined
  }
  object ListBoxMenuItemProps {
    
    inline def apply(): ListBoxMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxMenuItemProps]
    }
    
    extension [Self <: ListBoxMenuItemProps](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    }
  }
  
  type _To = ListBoxMenuItemComponent
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsListBoxListBoxMenuItemMod.foo` */
  override def _to: ListBoxMenuItemComponent = default
}
