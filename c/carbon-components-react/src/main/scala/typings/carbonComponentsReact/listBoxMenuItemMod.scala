package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBoxMenuItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListBox/ListBoxMenuItem", JSImport.Default)
  @js.native
  val default: ListBoxMenuItemComponent = js.native
  
  type ListBoxMenuItemComponent = FC[ListBoxMenuItemProps]
  
  trait ListBoxMenuItemProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    // required but has default value
    var isHighlighted: js.UndefOr[Boolean] = js.undefined
  }
  object ListBoxMenuItemProps {
    
    @scala.inline
    def apply(): ListBoxMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxMenuItemProps]
    }
    
    @scala.inline
    implicit class ListBoxMenuItemPropsMutableBuilder[Self <: ListBoxMenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHighlightedUndefined: Self = StObject.set(x, "isHighlighted", js.undefined)
    }
  }
  
  type _To = ListBoxMenuItemComponent
  
  /* This means you don't have to write `default`, but can instead just say `listBoxMenuItemMod.foo` */
  override def _to: ListBoxMenuItemComponent = default
}
