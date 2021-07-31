package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInputMod {
  
  @JSImport("carbon-components/components/number-input/number-input", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with NumberInput {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _handleClick(event: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/number-input/number-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/number-input/number-input", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait NumberInput extends StObject {
    
    def _handleClick(event: js.Any): Unit
  }
  object NumberInput {
    
    @scala.inline
    def apply(_handleClick: js.Any => Unit): NumberInput = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick))
      __obj.asInstanceOf[NumberInput]
    }
    
    @scala.inline
    implicit class NumberInputMutableBuilder[Self <: NumberInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
    }
  }
}
