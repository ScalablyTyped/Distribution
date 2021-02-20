package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingMod {
  
  @JSImport("carbon-components/components/loading/loading", JSImport.Default)
  @js.native
  class default protected () extends Loading {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/loading/loading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/loading/loading", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Loading extends StObject {
    
    def _deleteElement(): Unit = js.native
    
    def end(): Unit = js.native
    
    def isActive(): js.Any = js.native
    
    def set(active: js.Any): this.type = js.native
    
    def toggle(): this.type = js.native
  }
  object Loading {
    
    @scala.inline
    def apply(
      _deleteElement: () => Unit,
      end: () => Unit,
      isActive: () => js.Any,
      set: js.Any => Loading,
      toggle: () => Loading
    ): Loading = {
      val __obj = js.Dynamic.literal(_deleteElement = js.Any.fromFunction0(_deleteElement), end = js.Any.fromFunction0(end), isActive = js.Any.fromFunction0(isActive), set = js.Any.fromFunction1(set), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Loading]
    }
    
    @scala.inline
    implicit class LoadingMutableBuilder[Self <: Loading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActive(value: () => js.Any): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: js.Any => Loading): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggle(value: () => Loading): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_deleteElement(value: () => Unit): Self = StObject.set(x, "_deleteElement", js.Any.fromFunction0(value))
    }
  }
}
