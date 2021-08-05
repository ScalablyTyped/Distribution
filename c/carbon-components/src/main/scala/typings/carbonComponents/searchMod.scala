package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  @JSImport("carbon-components/components/search/search", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Search {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def showClear(value: js.Any, icon: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toggleLayout(element: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/search/search", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/search/search", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Search extends StObject {
    
    def showClear(value: js.Any, icon: js.Any): Unit
    
    def toggleLayout(element: js.Any): Unit
  }
  object Search {
    
    inline def apply(showClear: (js.Any, js.Any) => Unit, toggleLayout: js.Any => Unit): Search = {
      val __obj = js.Dynamic.literal(showClear = js.Any.fromFunction2(showClear), toggleLayout = js.Any.fromFunction1(toggleLayout))
      __obj.asInstanceOf[Search]
    }
    
    extension [Self <: Search](x: Self) {
      
      inline def setShowClear(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "showClear", js.Any.fromFunction2(value))
      
      inline def setToggleLayout(value: js.Any => Unit): Self = StObject.set(x, "toggleLayout", js.Any.fromFunction1(value))
    }
  }
}
