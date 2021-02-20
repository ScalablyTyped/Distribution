package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("carbon-components/components/checkbox/checkbox", JSImport.Default)
  @js.native
  class default protected () extends Checkbox {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/checkbox/checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/checkbox/checkbox", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object stateChangeTypes {
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.mixed")
      @js.native
      def mixed: String = js.native
      @scala.inline
      def mixed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixed")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.false")
      @js.native
      val `false`: String = js.native
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.true")
      @js.native
      val `true`: String = js.native
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Checkbox extends StObject {
    
    def _handleBlur(): Unit = js.native
    
    def _handleClick(): Unit = js.native
    
    def _handleFocus(): Unit = js.native
    
    def _indeterminateCheckbox(): Unit = js.native
    
    def _initCheckbox(): Unit = js.native
    
    def setDisabled(value: js.Any): Unit = js.native
    
    def setState(state: js.Any): Unit = js.native
  }
  object Checkbox {
    
    @scala.inline
    def apply(
      _handleBlur: () => Unit,
      _handleClick: () => Unit,
      _handleFocus: () => Unit,
      _indeterminateCheckbox: () => Unit,
      _initCheckbox: () => Unit,
      setDisabled: js.Any => Unit,
      setState: js.Any => Unit
    ): Checkbox = {
      val __obj = js.Dynamic.literal(_handleBlur = js.Any.fromFunction0(_handleBlur), _handleClick = js.Any.fromFunction0(_handleClick), _handleFocus = js.Any.fromFunction0(_handleFocus), _indeterminateCheckbox = js.Any.fromFunction0(_indeterminateCheckbox), _initCheckbox = js.Any.fromFunction0(_initCheckbox), setDisabled = js.Any.fromFunction1(setDisabled), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[Checkbox]
    }
    
    @scala.inline
    implicit class CheckboxMutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetDisabled(value: js.Any => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetState(value: js.Any => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleBlur(value: () => Unit): Self = StObject.set(x, "_handleBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handleClick(value: () => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handleFocus(value: () => Unit): Self = StObject.set(x, "_handleFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_indeterminateCheckbox(value: () => Unit): Self = StObject.set(x, "_indeterminateCheckbox", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_initCheckbox(value: () => Unit): Self = StObject.set(x, "_initCheckbox", js.Any.fromFunction0(value))
    }
  }
}
