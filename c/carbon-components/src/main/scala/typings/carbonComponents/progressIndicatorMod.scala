package typings.carbonComponents

import typings.carbonComponents.anon.Element
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorMod {
  
  @JSImport("carbon-components/components/progress-indicator/progress-indicator", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ProgressIndicator {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/progress-indicator/progress-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/progress-indicator/progress-indicator", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait ProgressIndicator extends StObject {
    
    def _getCurrentSVG(): String = js.native
    
    def _getIncompleteSVG(): String = js.native
    
    def _getSVGComplete(): String = js.native
    
    def _updateStep(args: js.Any): Unit = js.native
    
    def addOverflowTooltip(): Unit = js.native
    
    def getCurrent(): Element = js.native
    
    def getSteps(): js.Array[Element] = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(newCurrentStep: js.Any): Unit = js.native
  }
}
