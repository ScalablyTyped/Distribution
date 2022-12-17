package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.end
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.carbonComponentsReactStrings.start
import typings.carbonComponentsReact.carbonComponentsReactStrings.xl
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAccordionAccordionMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Accordion/Accordion", JSImport.Default)
  @js.native
  val default: FC[AccordionProps] = js.native
  
  trait AccordionProps
    extends StObject
       with HTMLAttributes[HTMLUListElement] {
    
    var align: js.UndefOr[end | start] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[sm | md | lg | xl] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setAlign(value: end | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setSize(value: sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AccordionProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsAccordionAccordionMod.foo` */
  override def _to: FC[AccordionProps] = default
}
