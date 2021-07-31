package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.OlHTMLAttributes
import typings.std.HTMLOListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderedListOrderedListMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/OrderedList/OrderedList", JSImport.Default)
  @js.native
  val default: FC[OrderedListProps] = js.native
  
  trait OrderedListProps
    extends StObject
       with OlHTMLAttributes[HTMLOListElement] {
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
  }
  object OrderedListProps {
    
    @scala.inline
    def apply(): OrderedListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderedListProps]
    }
    
    @scala.inline
    implicit class OrderedListPropsMutableBuilder[Self <: OrderedListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      @scala.inline
      def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    }
  }
  
  type _To = FC[OrderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `orderedListOrderedListMod.foo` */
  override def _to: FC[OrderedListProps] = default
}
