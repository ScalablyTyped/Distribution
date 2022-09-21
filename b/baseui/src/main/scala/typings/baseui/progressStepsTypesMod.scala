package typings.baseui

import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStepsTypesMod {
  
  trait NumberedStepOverrides extends StObject {
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Description: js.UndefOr[Override[Any]] = js.undefined
    
    var Icon: js.UndefOr[Override[Any]] = js.undefined
    
    var IconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var InnerIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Tail: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
  }
  object NumberedStepOverrides {
    
    inline def apply(): NumberedStepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberedStepOverrides]
    }
    
    extension [Self <: NumberedStepOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(value: Override[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIcon(value: Override[Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: Override[Any]): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setInnerIcon(value: Override[Any]): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      inline def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTail(value: Override[Any]): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      inline def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait NumberedStepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Defines if the step is currently active. */
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if the step is completed. */
    var isCompleted: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if the step is the last item displayed. */
    var isLast: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[NumberedStepOverrides] = js.undefined
    
    /** The number displayed as the step number */
    var step: js.UndefOr[ReactNode] = js.undefined
    
    /** The title of the Step. */
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
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Description: js.UndefOr[Override[Any]] = js.undefined
    
    var Icon: js.UndefOr[Override[Any]] = js.undefined
    
    var IconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var InnerIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StepRoot: js.UndefOr[Override[Any]] = js.undefined
    
    var Tail: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
  }
  object ProgressStepsOverrides {
    
    inline def apply(): ProgressStepsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressStepsOverrides]
    }
    
    extension [Self <: ProgressStepsOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(value: Override[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIcon(value: Override[Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: Override[Any]): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setInnerIcon(value: Override[Any]): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      inline def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStepRoot(value: Override[Any]): Self = StObject.set(x, "StepRoot", value.asInstanceOf[js.Any])
      
      inline def setStepRootUndefined: Self = StObject.set(x, "StepRoot", js.undefined)
      
      inline def setTail(value: Override[Any]): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      inline def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait ProgressStepsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Defines the current active step index. */
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
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Description: js.UndefOr[Override[Any]] = js.undefined
    
    var Icon: js.UndefOr[Override[Any]] = js.undefined
    
    var IconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var InnerIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Tail: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
  }
  object StepOverrides {
    
    inline def apply(): StepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOverrides]
    }
    
    extension [Self <: StepOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(value: Override[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIcon(value: Override[Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: Override[Any]): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setInnerIcon(value: Override[Any]): Self = StObject.set(x, "InnerIcon", value.asInstanceOf[js.Any])
      
      inline def setInnerIconUndefined: Self = StObject.set(x, "InnerIcon", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTail(value: Override[Any]): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
      
      inline def setTailUndefined: Self = StObject.set(x, "Tail", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait StepProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Defines if the step is currently active. */
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if the step is completed. Overriden by ProgressSteps, if used. */
    var isCompleted: js.UndefOr[Boolean] = js.undefined
    
    /** Defines if the step is the last item displayed. Overriden by ProgressSteps, if used. */
    var isLast: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[StepOverrides] = js.undefined
    
    /** The title of the Step. */
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
