package typings.baseui

import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.ol
import typings.baseui.progressStepsTypesMod.NumberedStepProps
import typings.baseui.progressStepsTypesMod.ProgressStepsProps
import typings.baseui.progressStepsTypesMod.StepProps
import typings.baseui.progressStepsTypesMod.StyleProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStepsMod {
  
  object NumberedStep {
    
    inline def apply(param0: NumberedStepProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/progress-steps", "NumberedStep")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/progress-steps", "NumberedStep.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/progress-steps", "NumberedStep.defaultProps.isCompleted")
      @js.native
      def isCompleted: Boolean = js.native
      inline def isCompleted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCompleted")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/progress-steps", "NumberedStep.defaultProps.isLast")
      @js.native
      def isLast: Boolean = js.native
      inline def isLast_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLast")(x.asInstanceOf[js.Any])
    }
  }
  
  object ProgressSteps {
    
    inline def apply(param0: ProgressStepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/progress-steps", "ProgressSteps")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/progress-steps", "ProgressSteps.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/progress-steps", "ProgressSteps.defaultProps.current")
      @js.native
      def current: Double = js.native
      inline def current_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    }
  }
  
  object Step {
    
    inline def apply(param0: StepProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/progress-steps", "Step")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/progress-steps", "Step.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/progress-steps", "Step.defaultProps.isCompleted")
      @js.native
      def isCompleted: Boolean = js.native
      inline def isCompleted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCompleted")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/progress-steps", "Step.defaultProps.isLast")
      @js.native
      def isLast: Boolean = js.native
      inline def isLast_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLast")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/progress-steps", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentDescription")
  @js.native
  val StyledContentDescription: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentTail")
  @js.native
  val StyledContentTail: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentTitle")
  @js.native
  val StyledContentTitle: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledIcon")
  @js.native
  val StyledIcon: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledIconContainer")
  @js.native
  val StyledIconContainer: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledInnerIcon")
  @js.native
  val StyledInnerIcon: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberContentTail")
  @js.native
  val StyledNumberContentTail: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberIcon")
  @js.native
  val StyledNumberIcon: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberStep")
  @js.native
  val StyledNumberStep: StyletronComponent[li_, StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledProgressSteps")
  @js.native
  val StyledProgressSteps: StyletronComponent[ol, js.Object] = js.native
  
  @JSImport("baseui/progress-steps", "StyledStep")
  @js.native
  val StyledStep: StyletronComponent[li_, StyleProps] = js.native
}
