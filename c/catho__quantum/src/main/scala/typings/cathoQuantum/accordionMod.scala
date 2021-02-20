package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSize
import typings.cathoQuantum.anon.Content
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@catho/quantum/Accordion", JSImport.Default)
  @js.native
  class default ()
    extends Component[AccordionProps, js.Object, js.Any]
  
  type Accordion = Component[AccordionProps, js.Object, js.Any]
  
  @js.native
  trait AccordionProps extends StObject {
    
    var items: js.Array[Content] = js.native
    
    var keepOnlyOneOpen: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[BaseFontSize] = js.native
  }
  object AccordionProps {
    
    @scala.inline
    def apply(items: js.Array[Content]): AccordionProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionProps]
    }
    
    @scala.inline
    implicit class AccordionPropsMutableBuilder[Self <: AccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Content]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Content*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKeepOnlyOneOpen(value: Boolean): Self = StObject.set(x, "keepOnlyOneOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepOnlyOneOpenUndefined: Self = StObject.set(x, "keepOnlyOneOpen", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
