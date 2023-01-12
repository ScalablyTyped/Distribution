package typings.carbonComponents

import typings.carbonComponents.anon.PartialNumberInputOptions
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNumberInputNumberInputMod {
  
  @JSImport("carbon-components/components/number-input/number-input", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NumberInput {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialNumberInputOptions) = this()
    
    /* CompleteClass */
    override def _handleClick(event: MouseEvent): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/number-input/number-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/number-input/number-input", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait NumberInput extends StObject {
    
    def _handleClick(event: MouseEvent): Unit
  }
  object NumberInput {
    
    inline def apply(_handleClick: MouseEvent => Unit): NumberInput = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick))
      __obj.asInstanceOf[NumberInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberInput] (val x: Self) extends AnyVal {
      
      inline def set_handleClick(value: MouseEvent => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
    }
  }
  
  trait NumberInputOptions extends StObject {
    
    var selectorInit: String
    
    var selectorInput: String
  }
  object NumberInputOptions {
    
    inline def apply(selectorInit: String, selectorInput: String): NumberInputOptions = {
      val __obj = js.Dynamic.literal(selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberInputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberInputOptions] (val x: Self) extends AnyVal {
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorInput(value: String): Self = StObject.set(x, "selectorInput", value.asInstanceOf[js.Any])
    }
  }
}
