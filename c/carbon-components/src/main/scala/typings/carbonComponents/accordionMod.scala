package typings.carbonComponents

import typings.carbonComponents.anon.PartialAccordionOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("carbon-components/components/accordion/accordion", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Accordion {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialAccordionOptions) = this()
    
    /* CompleteClass */
    override def _checkIfButton(): Boolean = js.native
    
    /* CompleteClass */
    override def _handleKeypress(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(element: HTMLElement): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/accordion/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/accordion/accordion", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Accordion extends StObject {
    
    def _checkIfButton(): Boolean
    
    def _handleKeypress(event: Any): Unit
    
    def _toggle(element: HTMLElement): Unit
  }
  object Accordion {
    
    inline def apply(_checkIfButton: () => Boolean, _handleKeypress: Any => Unit, _toggle: HTMLElement => Unit): Accordion = {
      val __obj = js.Dynamic.literal(_checkIfButton = js.Any.fromFunction0(_checkIfButton), _handleKeypress = js.Any.fromFunction1(_handleKeypress), _toggle = js.Any.fromFunction1(_toggle))
      __obj.asInstanceOf[Accordion]
    }
    
    extension [Self <: Accordion](x: Self) {
      
      inline def set_checkIfButton(value: () => Boolean): Self = StObject.set(x, "_checkIfButton", js.Any.fromFunction0(value))
      
      inline def set_handleKeypress(value: Any => Unit): Self = StObject.set(x, "_handleKeypress", js.Any.fromFunction1(value))
      
      inline def set_toggle(value: HTMLElement => Unit): Self = StObject.set(x, "_toggle", js.Any.fromFunction1(value))
    }
  }
  
  trait AccordionOptions extends StObject {
    
    var classActive: String
    
    var selectorAccordionContent: String
    
    var selectorAccordionItem: String
    
    var selectorAccordionItemHeading: String
    
    var selectorInit: String
  }
  object AccordionOptions {
    
    inline def apply(
      classActive: String,
      selectorAccordionContent: String,
      selectorAccordionItem: String,
      selectorAccordionItemHeading: String,
      selectorInit: String
    ): AccordionOptions = {
      val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], selectorAccordionContent = selectorAccordionContent.asInstanceOf[js.Any], selectorAccordionItem = selectorAccordionItem.asInstanceOf[js.Any], selectorAccordionItemHeading = selectorAccordionItemHeading.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionOptions]
    }
    
    extension [Self <: AccordionOptions](x: Self) {
      
      inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
      
      inline def setSelectorAccordionContent(value: String): Self = StObject.set(x, "selectorAccordionContent", value.asInstanceOf[js.Any])
      
      inline def setSelectorAccordionItem(value: String): Self = StObject.set(x, "selectorAccordionItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorAccordionItemHeading(value: String): Self = StObject.set(x, "selectorAccordionItemHeading", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
