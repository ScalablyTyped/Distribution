package typings.baseui

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait NumberedStepOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Description: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var InnerIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Tail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object NumberedStepOverrides {
    
    inline def apply(): NumberedStepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberedStepOverrides]
    }
    
    extension [Self <: NumberedStepOverrides](x: Self) {
      
      inline def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setInnerIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      inline def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      inline def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      inline def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait NumberedStepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var isCompleted: js.UndefOr[Boolean] = js.undefined
    
    var isLast: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[NumberedStepOverrides] = js.undefined
    
    var step: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NumberedStepProps {
    
    inline def apply(): NumberedStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberedStepProps]
    }
    
    extension [Self <: NumberedStepProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
      
      inline def setIsCompletedUndefined: Self = StObject.set(x, "isCompleted", js.undefined)
      
      inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      inline def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
      
      inline def setOverrides(value: NumberedStepOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStep(value: ReactNode): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ProgressStepsOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object ProgressStepsOverrides {
    
    inline def apply(): ProgressStepsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressStepsOverrides]
    }
    
    extension [Self <: ProgressStepsOverrides](x: Self) {
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ProgressStepsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var overrides: js.UndefOr[ProgressStepsOverrides] = js.undefined
  }
  object ProgressStepsProps {
    
    inline def apply(): ProgressStepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressStepsProps]
    }
    
    extension [Self <: ProgressStepsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setOverrides(value: ProgressStepsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait StepOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Description: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var InnerIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Tail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object StepOverrides {
    
    inline def apply(): StepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOverrides]
    }
    
    extension [Self <: StepOverrides](x: Self) {
      
      inline def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setInnerIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      inline def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      inline def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      inline def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait StepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var isCompleted: js.UndefOr[Boolean] = js.undefined
    
    var isLast: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[StepOverrides] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object StepProps {
    
    inline def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    extension [Self <: StepProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setIsCompleted(value: Boolean): Self = StObject.set(x, "isCompleted", value.asInstanceOf[js.Any])
      
      inline def setIsCompletedUndefined: Self = StObject.set(x, "isCompleted", js.undefined)
      
      inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      inline def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
      
      inline def setOverrides(value: StepOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait StyleProps extends StObject {
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isActive")
    var $isActive: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isCompleted")
    var $isCompleted: js.UndefOr[Boolean] = js.undefined
  }
  object StyleProps {
    
    inline def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      inline def set$isActiveUndefined: Self = StObject.set(x, "$isActive", js.undefined)
      
      inline def set$isCompleted(value: Boolean): Self = StObject.set(x, "$isCompleted", value.asInstanceOf[js.Any])
      
      inline def set$isCompletedUndefined: Self = StObject.set(x, "$isCompleted", js.undefined)
    }
  }
}
