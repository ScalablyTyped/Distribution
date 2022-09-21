package typings.baseui

import typings.baseui.progressStepsTypesMod.ProgressStepsProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStepsProgressStepsMod {
  
  object default {
    
    inline def apply(hasOverridesCurrentChildren: ProgressStepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasOverridesCurrentChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/progress-steps/progress-steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/progress-steps/progress-steps", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/progress-steps/progress-steps", "default.defaultProps.current")
      @js.native
      def current: Double = js.native
      inline def current_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    }
  }
}
