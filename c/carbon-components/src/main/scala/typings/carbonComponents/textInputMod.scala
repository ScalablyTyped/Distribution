package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod {
  
  @JSImport("carbon-components/components/text-input/text-input", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TextInput {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _setIconVisibility(hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(hasElementButton: js.Any): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/text-input/text-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/text-input/text-input", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TextInput extends StObject {
    
    def _setIconVisibility(hasIconVisibilityOnIconVisibilityOffPasswordIsVisibleSelectorPasswordVisibilityTooltip: js.Any): Unit
    
    def _toggle(hasElementButton: js.Any): Unit
  }
  object TextInput {
    
    @scala.inline
    def apply(_setIconVisibility: js.Any => Unit, _toggle: js.Any => Unit): TextInput = {
      val __obj = js.Dynamic.literal(_setIconVisibility = js.Any.fromFunction1(_setIconVisibility), _toggle = js.Any.fromFunction1(_toggle))
      __obj.asInstanceOf[TextInput]
    }
    
    @scala.inline
    implicit class TextInputMutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_setIconVisibility(value: js.Any => Unit): Self = StObject.set(x, "_setIconVisibility", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_toggle(value: js.Any => Unit): Self = StObject.set(x, "_toggle", js.Any.fromFunction1(value))
    }
  }
}
