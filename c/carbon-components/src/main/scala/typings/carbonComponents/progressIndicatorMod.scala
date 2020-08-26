package typings.carbonComponents

import typings.carbonComponents.anon.ClassComplete
import typings.carbonComponents.anon.Index
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/progress-indicator/progress-indicator", JSImport.Namespace)
@js.native
object progressIndicatorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait ProgressIndicator extends js.Object {
    def _getCurrentSVG(): String = js.native
    def _getIncompleteSVG(): String = js.native
    def _getSVGComplete(): String = js.native
    def _updateStep(args: js.Any): Unit = js.native
    def addOverflowTooltip(): Unit = js.native
    def getCurrent(): Index = js.native
    def getSteps(): js.Array[Index] = js.native
    def setCurrent(): Unit = js.native
    def setCurrent(newCurrentStep: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends ProgressIndicator {
    def this(element: js.Any, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var components: WeakMap[js.Object, _] = js.native
    def options: ClassComplete = js.native
  }
  
}

