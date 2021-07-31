package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSwitcherMod {
  
  @JSImport("carbon-components/components/content-switcher/content-switcher", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ContentSwitcher {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _changeState(hasItem: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _handleClick(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def setActive(item: js.Any, callback: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/content-switcher/content-switcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/content-switcher/content-switcher", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait ContentSwitcher extends StObject {
    
    def _changeState(hasItem: js.Any, callback: js.Any): Unit
    
    def _handleClick(event: js.Any): Unit
    
    def setActive(item: js.Any, callback: js.Any): Unit
  }
  object ContentSwitcher {
    
    @scala.inline
    def apply(
      _changeState: (js.Any, js.Any) => Unit,
      _handleClick: js.Any => Unit,
      setActive: (js.Any, js.Any) => Unit
    ): ContentSwitcher = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), _handleClick = js.Any.fromFunction1(_handleClick), setActive = js.Any.fromFunction2(setActive))
      __obj.asInstanceOf[ContentSwitcher]
    }
    
    @scala.inline
    implicit class ContentSwitcherMutableBuilder[Self <: ContentSwitcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetActive(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
    }
  }
}
