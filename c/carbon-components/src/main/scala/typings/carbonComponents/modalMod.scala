package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("carbon-components/components/modal/modal", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Modal {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _handleFocusin(evt: js.Any): Unit = js.native
    
    /* CompleteClass */
    var _handleFocusinListener: js.Any = js.native
    
    /* CompleteClass */
    var _handleKeydownListener: js.Any = js.native
    
    /* CompleteClass */
    override def _hookCloseActions(): Unit = js.native
    
    /* CompleteClass */
    override def createdByLauncher(evt: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def shouldStateBeChanged(state: js.Any): js.Any = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/modal/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/modal/modal", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Modal extends StObject {
    
    def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit
    
    def _handleFocusin(evt: js.Any): Unit
    
    var _handleFocusinListener: js.Any
    
    var _handleKeydownListener: js.Any
    
    def _hookCloseActions(): Unit
    
    def createdByLauncher(evt: js.Any): Unit
    
    def shouldStateBeChanged(state: js.Any): js.Any
  }
  object Modal {
    
    @scala.inline
    def apply(
      _changeState: (js.Any, js.Any, js.Any) => Unit,
      _handleFocusin: js.Any => Unit,
      _handleFocusinListener: js.Any,
      _handleKeydownListener: js.Any,
      _hookCloseActions: () => Unit,
      createdByLauncher: js.Any => Unit,
      shouldStateBeChanged: js.Any => js.Any
    ): Modal = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3(_changeState), _handleFocusin = js.Any.fromFunction1(_handleFocusin), _handleFocusinListener = _handleFocusinListener.asInstanceOf[js.Any], _handleKeydownListener = _handleKeydownListener.asInstanceOf[js.Any], _hookCloseActions = js.Any.fromFunction0(_hookCloseActions), createdByLauncher = js.Any.fromFunction1(createdByLauncher), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[Modal]
    }
    
    @scala.inline
    implicit class ModalMutableBuilder[Self <: Modal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedByLauncher(value: js.Any => Unit): Self = StObject.set(x, "createdByLauncher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldStateBeChanged(value: js.Any => js.Any): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_handleFocusin(value: js.Any => Unit): Self = StObject.set(x, "_handleFocusin", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleFocusinListener(value: js.Any): Self = StObject.set(x, "_handleFocusinListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_handleKeydownListener(value: js.Any): Self = StObject.set(x, "_handleKeydownListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hookCloseActions(value: () => Unit): Self = StObject.set(x, "_hookCloseActions", js.Any.fromFunction0(value))
    }
  }
}
