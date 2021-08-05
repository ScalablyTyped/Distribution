package typings.baseui

import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.small_
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  class ProgressBar protected ()
    extends Component[ProgressBarProps, js.Object, js.Any] {
    def this(props: ProgressBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressBarProps, context: js.Any) = this()
  }
  
  trait SIZE extends StObject {
    
    var large: large_
    
    var medium: medium_
    
    var small: small_
  }
  object SIZE {
    
    @JSImport("baseui/progress-bar", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    extension [Self <: SIZE](x: Self) {
      
      inline def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: medium_): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: small_): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/progress-bar", "StyledBar")
  @js.native
  val StyledBar: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarContainer")
  @js.native
  val StyledBarContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarProgress")
  @js.native
  val StyledBarProgress: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/progress-bar", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/progress-bar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  trait ProgressBarOverrides extends StObject {
    
    var Bar: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var BarContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var BarProgress: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object ProgressBarOverrides {
    
    inline def apply(): ProgressBarOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarOverrides]
    }
    
    extension [Self <: ProgressBarOverrides](x: Self) {
      
      inline def setBar(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Bar", value.asInstanceOf[js.Any])
      
      inline def setBarContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "BarContainer", value.asInstanceOf[js.Any])
      
      inline def setBarContainerUndefined: Self = StObject.set(x, "BarContainer", js.undefined)
      
      inline def setBarProgress(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "BarProgress", value.asInstanceOf[js.Any])
      
      inline def setBarProgressUndefined: Self = StObject.set(x, "BarProgress", js.undefined)
      
      inline def setBarUndefined: Self = StObject.set(x, "Bar", js.undefined)
      
      inline def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ProgressBarProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var getProgressLabel: js.UndefOr[js.Function2[/* value */ Double, /* successValue */ Double, ReactNode]] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[ProgressBarOverrides] = js.undefined
    
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small_ | medium_ | large_] = js.undefined
    
    var steps: js.UndefOr[Double] = js.undefined
    
    var successValue: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ProgressBarProps {
    
    inline def apply(): ProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    extension [Self <: ProgressBarProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGetProgressLabel(value: (/* value */ Double, /* successValue */ Double) => ReactNode): Self = StObject.set(x, "getProgressLabel", js.Any.fromFunction2(value))
      
      inline def setGetProgressLabelUndefined: Self = StObject.set(x, "getProgressLabel", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setOverrides(value: ProgressBarOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setSize(value: small_ | medium_ | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setSuccessValue(value: Double): Self = StObject.set(x, "successValue", value.asInstanceOf[js.Any])
      
      inline def setSuccessValueUndefined: Self = StObject.set(x, "successValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
