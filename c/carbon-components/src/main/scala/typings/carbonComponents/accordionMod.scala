package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("carbon-components/components/accordion/accordion", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Accordion {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _checkIfButton(): Boolean = js.native
    
    /* CompleteClass */
    override def _handleKeypress(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(element: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/accordion/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/accordion/accordion", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Accordion extends StObject {
    
    def _checkIfButton(): Boolean
    
    def _handleKeypress(event: js.Any): Unit
    
    def _toggle(element: js.Any): Unit
  }
  object Accordion {
    
    @scala.inline
    def apply(_checkIfButton: () => Boolean, _handleKeypress: js.Any => Unit, _toggle: js.Any => Unit): Accordion = {
      val __obj = js.Dynamic.literal(_checkIfButton = js.Any.fromFunction0(_checkIfButton), _handleKeypress = js.Any.fromFunction1(_handleKeypress), _toggle = js.Any.fromFunction1(_toggle))
      __obj.asInstanceOf[Accordion]
    }
    
    @scala.inline
    implicit class AccordionMutableBuilder[Self <: Accordion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_checkIfButton(value: () => Boolean): Self = StObject.set(x, "_checkIfButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handleKeypress(value: js.Any => Unit): Self = StObject.set(x, "_handleKeypress", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_toggle(value: js.Any => Unit): Self = StObject.set(x, "_toggle", js.Any.fromFunction1(value))
    }
  }
}
