package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/accordion/accordion.AccordionOptions> */
trait PartialAccordionOptions extends StObject {
  
  var classActive: js.UndefOr[String] = js.undefined
  
  var selectorAccordionContent: js.UndefOr[String] = js.undefined
  
  var selectorAccordionItem: js.UndefOr[String] = js.undefined
  
  var selectorAccordionItemHeading: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialAccordionOptions {
  
  inline def apply(): PartialAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAccordionOptions] (val x: Self) extends AnyVal {
    
    inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
    
    inline def setClassActiveUndefined: Self = StObject.set(x, "classActive", js.undefined)
    
    inline def setSelectorAccordionContent(value: String): Self = StObject.set(x, "selectorAccordionContent", value.asInstanceOf[js.Any])
    
    inline def setSelectorAccordionContentUndefined: Self = StObject.set(x, "selectorAccordionContent", js.undefined)
    
    inline def setSelectorAccordionItem(value: String): Self = StObject.set(x, "selectorAccordionItem", value.asInstanceOf[js.Any])
    
    inline def setSelectorAccordionItemHeading(value: String): Self = StObject.set(x, "selectorAccordionItemHeading", value.asInstanceOf[js.Any])
    
    inline def setSelectorAccordionItemHeadingUndefined: Self = StObject.set(x, "selectorAccordionItemHeading", js.undefined)
    
    inline def setSelectorAccordionItemUndefined: Self = StObject.set(x, "selectorAccordionItem", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
