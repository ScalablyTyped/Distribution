package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyButtonMod {
  
  @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with CopyButton {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def handleAnimationEnd(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def handleClick(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/copy-button/copy-button", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CopyButton extends StObject {
    
    def handleAnimationEnd(event: js.Any): Unit
    
    def handleClick(): Unit
  }
  object CopyButton {
    
    inline def apply(handleAnimationEnd: js.Any => Unit, handleClick: () => Unit): CopyButton = {
      val __obj = js.Dynamic.literal(handleAnimationEnd = js.Any.fromFunction1(handleAnimationEnd), handleClick = js.Any.fromFunction0(handleClick))
      __obj.asInstanceOf[CopyButton]
    }
    
    extension [Self <: CopyButton](x: Self) {
      
      inline def setHandleAnimationEnd(value: js.Any => Unit): Self = StObject.set(x, "handleAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
    }
  }
}
