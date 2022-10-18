package typings.baseui

import typings.baseui.progressStepsTypesMod.StepProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStepsStepMod {
  
  object default {
    
    inline def apply(hasOverridesIsCompletedIsActiveIsLastTitleChildren: StepProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasOverridesIsCompletedIsActiveIsLastTitleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/progress-steps/step", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/progress-steps/step", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/progress-steps/step", "default.defaultProps.isCompleted")
      @js.native
      def isCompleted: Boolean = js.native
      inline def isCompleted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCompleted")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/progress-steps/step", "default.defaultProps.isLast")
      @js.native
      def isLast: Boolean = js.native
      inline def isLast_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLast")(x.asInstanceOf[js.Any])
    }
  }
}
