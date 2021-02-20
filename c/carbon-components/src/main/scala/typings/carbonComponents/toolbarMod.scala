package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("carbon-components/components/toolbar/toolbar", JSImport.Default)
  @js.native
  class default protected () extends Toolbar {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/toolbar/toolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/toolbar/toolbar", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Toolbar extends StObject {
    
    def _handleDocumentClick(event: js.Any): Unit = js.native
    
    def _handleKeyDown(event: js.Any): Unit = js.native
    
    def _handleRowHeightChange(event: js.Any, boundTable: js.Any): Unit = js.native
  }
  object Toolbar {
    
    @scala.inline
    def apply(
      _handleDocumentClick: js.Any => Unit,
      _handleKeyDown: js.Any => Unit,
      _handleRowHeightChange: (js.Any, js.Any) => Unit
    ): Toolbar = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _handleRowHeightChange = js.Any.fromFunction2(_handleRowHeightChange))
      __obj.asInstanceOf[Toolbar]
    }
    
    @scala.inline
    implicit class ToolbarMutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_handleDocumentClick(value: js.Any => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleKeyDown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleRowHeightChange(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_handleRowHeightChange", js.Any.fromFunction2(value))
    }
  }
}
