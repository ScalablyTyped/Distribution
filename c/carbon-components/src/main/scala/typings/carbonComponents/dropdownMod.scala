package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("carbon-components/components/dropdown/dropdown", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Dropdown {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _focusCleanup(): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyDown(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _updateFocus(itemToFocus: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): js.Any = js.native
    
    /* CompleteClass */
    override def handleBlur(): Unit = js.native
    
    /* CompleteClass */
    override def navigate(direction: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def select(itemToSelect: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/dropdown/dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/dropdown/dropdown", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Dropdown extends StObject {
    
    def _focusCleanup(): Unit
    
    def _handleKeyDown(event: js.Any): Unit
    
    def _toggle(event: js.Any): Unit
    
    def _updateFocus(itemToFocus: js.Any): Unit
    
    def getCurrentNavigation(): js.Any
    
    def handleBlur(): Unit
    
    def navigate(direction: js.Any): Unit
    
    def select(itemToSelect: js.Any): Unit
  }
  object Dropdown {
    
    inline def apply(
      _focusCleanup: () => Unit,
      _handleKeyDown: js.Any => Unit,
      _toggle: js.Any => Unit,
      _updateFocus: js.Any => Unit,
      getCurrentNavigation: () => js.Any,
      handleBlur: () => Unit,
      navigate: js.Any => Unit,
      select: js.Any => Unit
    ): Dropdown = {
      val __obj = js.Dynamic.literal(_focusCleanup = js.Any.fromFunction0(_focusCleanup), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _toggle = js.Any.fromFunction1(_toggle), _updateFocus = js.Any.fromFunction1(_updateFocus), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), handleBlur = js.Any.fromFunction0(handleBlur), navigate = js.Any.fromFunction1(navigate), select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[Dropdown]
    }
    
    extension [Self <: Dropdown](x: Self) {
      
      inline def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      inline def setHandleBlur(value: () => Unit): Self = StObject.set(x, "handleBlur", js.Any.fromFunction0(value))
      
      inline def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setSelect(value: js.Any => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def set_focusCleanup(value: () => Unit): Self = StObject.set(x, "_focusCleanup", js.Any.fromFunction0(value))
      
      inline def set_handleKeyDown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1(value))
      
      inline def set_toggle(value: js.Any => Unit): Self = StObject.set(x, "_toggle", js.Any.fromFunction1(value))
      
      inline def set_updateFocus(value: js.Any => Unit): Self = StObject.set(x, "_updateFocus", js.Any.fromFunction1(value))
    }
  }
}
