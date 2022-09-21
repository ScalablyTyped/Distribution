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
    
    var isExpressive: js.UndefOr[Boolean] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
  }
  object OrderedListProps {
    
    inline def apply(): OrderedListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderedListProps]
    }
    
    extension [Self <: OrderedListProps](x: Self) {
      
      inline def setIsExpressive(value: Boolean): Self = StObject.set(x, "isExpressive", value.asInstanceOf[js.Any])
      
      inline def setIsExpressiveUndefined: Self = StObject.set(x, "isExpressive", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    }
  }
  
  type _To = FC[OrderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `orderedListOrderedListMod.foo` */
  override def _to: FC[OrderedListProps] = default
}
