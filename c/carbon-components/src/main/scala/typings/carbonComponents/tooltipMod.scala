package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Tooltip {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _handleClick(hasRelatedTargetTypeHadContextMenuDetails: js.Any): Unit = js.native
    
    /* CompleteClass */
    var _hasContextMenu: Boolean = js.native
    
    /* CompleteClass */
    override def _hookOn(element: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def createdByEvent(event: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/tooltip/tooltip", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Tooltip extends StObject {
    
    def _handleClick(hasRelatedTargetTypeHadContextMenuDetails: js.Any): Unit
    
    var _hasContextMenu: Boolean
    
    def _hookOn(element: js.Any): Unit
    
    def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit
    
    def createdByEvent(event: js.Any): Unit
  }
  object Tooltip {
    
    inline def apply(
      _handleClick: js.Any => Unit,
      _hasContextMenu: Boolean,
      _hookOn: js.Any => Unit,
      changeState: (js.Any, js.Any, js.Any) => Unit,
      createdByEvent: js.Any => Unit
    ): Tooltip = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick), _hasContextMenu = _hasContextMenu.asInstanceOf[js.Any], _hookOn = js.Any.fromFunction1(_hookOn), changeState = js.Any.fromFunction3(changeState), createdByEvent = js.Any.fromFunction1(createdByEvent))
      __obj.asInstanceOf[Tooltip]
    }
    
    extension [Self <: Tooltip](x: Self) {
      
      inline def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction3(value))
      
      inline def setCreatedByEvent(value: js.Any => Unit): Self = StObject.set(x, "createdByEvent", js.Any.fromFunction1(value))
      
      inline def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
      
      inline def set_hasContextMenu(value: Boolean): Self = StObject.set(x, "_hasContextMenu", value.asInstanceOf[js.Any])
      
      inline def set_hookOn(value: js.Any => Unit): Self = StObject.set(x, "_hookOn", js.Any.fromFunction1(value))
    }
  }
}
