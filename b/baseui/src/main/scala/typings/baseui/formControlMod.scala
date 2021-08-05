package typings.baseui

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("baseui/form-control", "FormControl")
  @js.native
  class FormControl protected ()
    extends Component[FormControlProps, FormControlState, js.Any] {
    def this(props: FormControlProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormControlProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/form-control", "StyledCaption")
  @js.native
  val StyledCaption: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/form-control", "StyledControlContainer")
  @js.native
  val StyledControlContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/form-control", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[js.Any] = js.native
  
  trait FormControlOverrides extends StObject {
    
    var Caption: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ControlContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object FormControlOverrides {
    
    inline def apply(): FormControlOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlOverrides]
    }
    
    extension [Self <: FormControlOverrides](x: Self) {
      
      inline def setCaption(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "Caption", js.undefined)
      
      inline def setControlContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ControlContainer", value.asInstanceOf[js.Any])
      
      inline def setControlContainerUndefined: Self = StObject.set(x, "ControlContainer", js.undefined)
      
      inline def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    }
  }
  
  trait FormControlProps extends StObject {
    
    var caption: js.UndefOr[ReactNode] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var overrides: js.UndefOr[FormControlOverrides] = js.undefined
    
    var positive: js.UndefOr[ReactNode] = js.undefined
  }
  object FormControlProps {
    
    inline def apply(): FormControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlProps]
    }
    
    extension [Self <: FormControlProps](x: Self) {
      
      inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean | ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOverrides(value: FormControlOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPositive(value: ReactNode): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
    }
  }
  
  trait FormControlState extends StObject {
    
    var captionId: String
  }
  object FormControlState {
    
    inline def apply(captionId: String): FormControlState = {
      val __obj = js.Dynamic.literal(captionId = captionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlState]
    }
    
    extension [Self <: FormControlState](x: Self) {
      
      inline def setCaptionId(value: String): Self = StObject.set(x, "captionId", value.asInstanceOf[js.Any])
    }
  }
}
