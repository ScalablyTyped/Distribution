package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipSimpleMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TooltipSimple {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def allowTooltipVisibility(hasVisible: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getTooltipTriggerButton(): js.Any = js.native
    
    /* CompleteClass */
    var tooltipFadeOut: js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TooltipSimple extends StObject {
    
    def allowTooltipVisibility(hasVisible: js.Any): Unit
    
    def getTooltipTriggerButton(): js.Any
    
    var tooltipFadeOut: js.Any
  }
  object TooltipSimple {
    
    inline def apply(
      allowTooltipVisibility: js.Any => Unit,
      getTooltipTriggerButton: () => js.Any,
      tooltipFadeOut: js.Any
    ): TooltipSimple = {
      val __obj = js.Dynamic.literal(allowTooltipVisibility = js.Any.fromFunction1(allowTooltipVisibility), getTooltipTriggerButton = js.Any.fromFunction0(getTooltipTriggerButton), tooltipFadeOut = tooltipFadeOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipSimple]
    }
    
    extension [Self <: TooltipSimple](x: Self) {
      
      inline def setAllowTooltipVisibility(value: js.Any => Unit): Self = StObject.set(x, "allowTooltipVisibility", js.Any.fromFunction1(value))
      
      inline def setGetTooltipTriggerButton(value: () => js.Any): Self = StObject.set(x, "getTooltipTriggerButton", js.Any.fromFunction0(value))
      
      inline def setTooltipFadeOut(value: js.Any): Self = StObject.set(x, "tooltipFadeOut", value.asInstanceOf[js.Any])
    }
  }
}
