package typings.carbonComponents

import typings.carbonComponents.anon.Left
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowMenuMod {
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with OverflowMenu {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _handleDocumentClick(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyPress(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): js.Any = js.native
    
    /* CompleteClass */
    override def navigate(direction: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  inline def getMenuOffset(menuBody: js.Any, direction: js.Any, trigger: js.Any): js.UndefOr[Left] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuOffset")(menuBody.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Left]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait OverflowMenu extends StObject {
    
    def _handleDocumentClick(event: js.Any): Unit
    
    def _handleKeyPress(event: js.Any): Unit
    
    def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit
    
    def getCurrentNavigation(): js.Any
    
    def navigate(direction: js.Any): Unit
  }
  object OverflowMenu {
    
    inline def apply(
      _handleDocumentClick: js.Any => Unit,
      _handleKeyPress: js.Any => Unit,
      changeState: (js.Any, js.Any, js.Any) => Unit,
      getCurrentNavigation: () => js.Any,
      navigate: js.Any => Unit
    ): OverflowMenu = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyPress = js.Any.fromFunction1(_handleKeyPress), changeState = js.Any.fromFunction3(changeState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[OverflowMenu]
    }
    
    extension [Self <: OverflowMenu](x: Self) {
      
      inline def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction3(value))
      
      inline def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      inline def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def set_handleDocumentClick(value: js.Any => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      inline def set_handleKeyPress(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyPress", js.Any.fromFunction1(value))
    }
  }
}
