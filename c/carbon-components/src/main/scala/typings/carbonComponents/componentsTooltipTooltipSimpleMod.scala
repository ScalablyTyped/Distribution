package typings.carbonComponents

import typings.carbonComponents.anon.PartialTooltipSimpleOptio
import typings.carbonComponents.anon.Visible
import typings.std.Element
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTooltipTooltipSimpleMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TooltipSimple {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialTooltipSimpleOptio) = this()
    
    /* CompleteClass */
    override def allowTooltipVisibility(hasVisible: Visible): Unit = js.native
    
    /* CompleteClass */
    override def getTooltipTriggerButton(): Element = js.native
    
    /* CompleteClass */
    override def tooltipFadeOut(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/tooltip/tooltip--simple", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait TooltipSimple extends StObject {
    
    def allowTooltipVisibility(hasVisible: Visible): Unit
    
    def getTooltipTriggerButton(): Element
    
    def tooltipFadeOut(): Unit
  }
  object TooltipSimple {
    
    inline def apply(
      allowTooltipVisibility: Visible => Unit,
      getTooltipTriggerButton: () => Element,
      tooltipFadeOut: () => Unit
    ): TooltipSimple = {
      val __obj = js.Dynamic.literal(allowTooltipVisibility = js.Any.fromFunction1(allowTooltipVisibility), getTooltipTriggerButton = js.Any.fromFunction0(getTooltipTriggerButton), tooltipFadeOut = js.Any.fromFunction0(tooltipFadeOut))
      __obj.asInstanceOf[TooltipSimple]
    }
    
    extension [Self <: TooltipSimple](x: Self) {
      
      inline def setAllowTooltipVisibility(value: Visible => Unit): Self = StObject.set(x, "allowTooltipVisibility", js.Any.fromFunction1(value))
      
      inline def setGetTooltipTriggerButton(value: () => Element): Self = StObject.set(x, "getTooltipTriggerButton", js.Any.fromFunction0(value))
      
      inline def setTooltipFadeOut(value: () => Unit): Self = StObject.set(x, "tooltipFadeOut", js.Any.fromFunction0(value))
    }
  }
  
  trait TooltipSimpleOptions extends StObject {
    
    var classTooltipHidden: String
    
    var classTooltipVisible: String
    
    var selectorInit: String
    
    var selectorTriggerButton: String
  }
  object TooltipSimpleOptions {
    
    inline def apply(
      classTooltipHidden: String,
      classTooltipVisible: String,
      selectorInit: String,
      selectorTriggerButton: String
    ): TooltipSimpleOptions = {
      val __obj = js.Dynamic.literal(classTooltipHidden = classTooltipHidden.asInstanceOf[js.Any], classTooltipVisible = classTooltipVisible.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTriggerButton = selectorTriggerButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipSimpleOptions]
    }
    
    extension [Self <: TooltipSimpleOptions](x: Self) {
      
      inline def setClassTooltipHidden(value: String): Self = StObject.set(x, "classTooltipHidden", value.asInstanceOf[js.Any])
      
      inline def setClassTooltipVisible(value: String): Self = StObject.set(x, "classTooltipVisible", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorTriggerButton(value: String): Self = StObject.set(x, "selectorTriggerButton", value.asInstanceOf[js.Any])
    }
  }
}
