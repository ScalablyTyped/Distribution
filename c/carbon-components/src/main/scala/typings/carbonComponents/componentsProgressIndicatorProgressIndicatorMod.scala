package typings.carbonComponents

import typings.carbonComponents.anon.ClassName
import typings.carbonComponents.anon.Index
import typings.carbonComponents.anon.PartialProgressIndicatorO
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProgressIndicatorProgressIndicatorMod {
  
  @JSImport("carbon-components/components/progress-indicator/progress-indicator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ProgressIndicator {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialProgressIndicatorO) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/progress-indicator/progress-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/progress-indicator/progress-indicator", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait ProgressIndicator extends StObject {
    
    def _getCurrentSVG(): String = js.native
    
    def _getIncompleteSVG(): String = js.native
    
    def _getSVGComplete(): String = js.native
    
    def _updateStep(args: ClassName): Unit = js.native
    
    def addOverflowTooltip(): Unit = js.native
    
    def getCurrent(): Index = js.native
    
    def getSteps(): js.Array[Index] = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(newCurrentStep: Double): Unit = js.native
  }
  
  trait ProgressIndicatorOptions extends StObject {
    
    var classComplete: String
    
    var classCurrent: String
    
    var classIncomplete: String
    
    var classOverflowLabel: String
    
    var classStep: String
    
    var classTooltipMulti: String
    
    var maxWidth: Double
    
    var selectorComplete: String
    
    var selectorCurrent: String
    
    var selectorIncomplete: String
    
    var selectorInit: String
    
    var selectorLabel: String
    
    var selectorStepElement: String
    
    var selectorTooltip: String
    
    var selectorTooltipText: String
    
    var tooltipMaxHeight: Double
  }
  object ProgressIndicatorOptions {
    
    inline def apply(
      classComplete: String,
      classCurrent: String,
      classIncomplete: String,
      classOverflowLabel: String,
      classStep: String,
      classTooltipMulti: String,
      maxWidth: Double,
      selectorComplete: String,
      selectorCurrent: String,
      selectorIncomplete: String,
      selectorInit: String,
      selectorLabel: String,
      selectorStepElement: String,
      selectorTooltip: String,
      selectorTooltipText: String,
      tooltipMaxHeight: Double
    ): ProgressIndicatorOptions = {
      val __obj = js.Dynamic.literal(classComplete = classComplete.asInstanceOf[js.Any], classCurrent = classCurrent.asInstanceOf[js.Any], classIncomplete = classIncomplete.asInstanceOf[js.Any], classOverflowLabel = classOverflowLabel.asInstanceOf[js.Any], classStep = classStep.asInstanceOf[js.Any], classTooltipMulti = classTooltipMulti.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], selectorComplete = selectorComplete.asInstanceOf[js.Any], selectorCurrent = selectorCurrent.asInstanceOf[js.Any], selectorIncomplete = selectorIncomplete.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorLabel = selectorLabel.asInstanceOf[js.Any], selectorStepElement = selectorStepElement.asInstanceOf[js.Any], selectorTooltip = selectorTooltip.asInstanceOf[js.Any], selectorTooltipText = selectorTooltipText.asInstanceOf[js.Any], tooltipMaxHeight = tooltipMaxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressIndicatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressIndicatorOptions] (val x: Self) extends AnyVal {
      
      inline def setClassComplete(value: String): Self = StObject.set(x, "classComplete", value.asInstanceOf[js.Any])
      
      inline def setClassCurrent(value: String): Self = StObject.set(x, "classCurrent", value.asInstanceOf[js.Any])
      
      inline def setClassIncomplete(value: String): Self = StObject.set(x, "classIncomplete", value.asInstanceOf[js.Any])
      
      inline def setClassOverflowLabel(value: String): Self = StObject.set(x, "classOverflowLabel", value.asInstanceOf[js.Any])
      
      inline def setClassStep(value: String): Self = StObject.set(x, "classStep", value.asInstanceOf[js.Any])
      
      inline def setClassTooltipMulti(value: String): Self = StObject.set(x, "classTooltipMulti", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setSelectorComplete(value: String): Self = StObject.set(x, "selectorComplete", value.asInstanceOf[js.Any])
      
      inline def setSelectorCurrent(value: String): Self = StObject.set(x, "selectorCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectorIncomplete(value: String): Self = StObject.set(x, "selectorIncomplete", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorLabel(value: String): Self = StObject.set(x, "selectorLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectorStepElement(value: String): Self = StObject.set(x, "selectorStepElement", value.asInstanceOf[js.Any])
      
      inline def setSelectorTooltip(value: String): Self = StObject.set(x, "selectorTooltip", value.asInstanceOf[js.Any])
      
      inline def setSelectorTooltipText(value: String): Self = StObject.set(x, "selectorTooltipText", value.asInstanceOf[js.Any])
      
      inline def setTooltipMaxHeight(value: Double): Self = StObject.set(x, "tooltipMaxHeight", value.asInstanceOf[js.Any])
    }
  }
}
