package typings.baseui

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStepsMod {
  
  @JSImport("baseui/progress-steps", "NumberedStep")
  @js.native
  val NumberedStep: FC[NumberedStepProps] = js.native
  
  @JSImport("baseui/progress-steps", "ProgressSteps")
  @js.native
  val ProgressSteps: FC[ProgressStepsProps] = js.native
  
  @JSImport("baseui/progress-steps", "Step")
  @js.native
  val Step: FC[StepProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentDescription")
  @js.native
  val StyledContentDescription: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentTail")
  @js.native
  val StyledContentTail: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledContentTitle")
  @js.native
  val StyledContentTitle: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledIcon")
  @js.native
  val StyledIcon: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledInnerIcon")
  @js.native
  val StyledInnerIcon: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberContentTail")
  @js.native
  val StyledNumberContentTail: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberIcon")
  @js.native
  val StyledNumberIcon: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledNumberStep")
  @js.native
  val StyledNumberStep: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledProgressSteps")
  @js.native
  val StyledProgressSteps: StyletronComponent[StyleProps] = js.native
  
  @JSImport("baseui/progress-steps", "StyledStep")
  @js.native
  val StyledStep: StyletronComponent[StyleProps] = js.native
  
  @js.native
  trait NumberedStepOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Description: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var InnerIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Tail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object NumberedStepOverrides {
    
    @scala.inline
    def apply(): NumberedStepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberedStepOverrides]
    }
    
    @scala.inline
    implicit class NumberedStepOverridesMutableBuilder[Self <: NumberedStepOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setDescription(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      @scala.inline
      def setInnerIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      @scala.inline
      def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  @js.native
  trait NumberedStepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var isCompleted: js.UndefOr[Boolean] = js.native
    
    var isLast: js.UndefOr[Boolean] = js.native
    
    var overrides: js.UndefOr[NumberedStepOverrides] = js.native
    
    var step: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object NumberedStepProps {
    
    @scala.inline
    def apply(): NumberedStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberedStepProps]
    }
    
    @scala.inline
    implicit class NumberedStepPropsMutableBuilder[Self <: NumberedStepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompletedUndefined: Self = StObject.set(x, "isCompleted", js.undefined)
      
      @scala.inline
      def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
      
      @scala.inline
      def setOverrides(value: NumberedStepOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStep(value: ReactNode): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ProgressStepsOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object ProgressStepsOverrides {
    
    @scala.inline
    def apply(): ProgressStepsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressStepsOverrides]
    }
    
    @scala.inline
    implicit class ProgressStepsOverridesMutableBuilder[Self <: ProgressStepsOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait ProgressStepsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var overrides: js.UndefOr[ProgressStepsOverrides] = js.native
  }
  object ProgressStepsProps {
    
    @scala.inline
    def apply(): ProgressStepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressStepsProps]
    }
    
    @scala.inline
    implicit class ProgressStepsPropsMutableBuilder[Self <: ProgressStepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setOverrides(value: ProgressStepsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait StepOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Description: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var InnerIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Tail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object StepOverrides {
    
    @scala.inline
    def apply(): StepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOverrides]
    }
    
    @scala.inline
    implicit class StepOverridesMutableBuilder[Self <: StepOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setDescription(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      @scala.inline
      def setInnerIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      @scala.inline
      def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  @js.native
  trait StepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var isCompleted: js.UndefOr[Boolean] = js.native
    
    var isLast: js.UndefOr[Boolean] = js.native
    
    var overrides: js.UndefOr[StepOverrides] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class StepPropsMutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompletedUndefined: Self = StObject.set(x, "isCompleted", js.undefined)
      
      @scala.inline
      def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
      
      @scala.inline
      def setOverrides(value: StepOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait StyleProps extends StObject {
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.native
    
    @JSName("$isActive")
    var $isActive: js.UndefOr[Boolean] = js.native
    
    @JSName("$isCompleted")
    var $isCompleted: js.UndefOr[Boolean] = js.native
  }
  object StyleProps {
    
    @scala.inline
    def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    @scala.inline
    implicit class StylePropsMutableBuilder[Self <: StyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      @scala.inline
      def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isActiveUndefined: Self = StObject.set(x, "$isActive", js.undefined)
      
      @scala.inline
      def set$isCompleted(value: Boolean): Self = StObject.set(x, "$isCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isCompletedUndefined: Self = StObject.set(x, "$isCompleted", js.undefined)
    }
  }
}
