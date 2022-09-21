package typings.baseui

import typings.baseui.anon.Error
import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlTypesMod {
  
  trait FormControlOverrides extends StObject {
    
    /** Customizes the caption element. */
    var Caption: js.UndefOr[Override[Any]] = js.undefined
    
    /** Customizes the container element. */
    var ControlContainer: js.UndefOr[Override[Any]] = js.undefined
    
    /** Customizes the label element. */
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    /** Customizes the label container element. */
    var LabelContainer: js.UndefOr[Override[Any]] = js.undefined
    
    /** Customizes the label end enhancer element. */
    var LabelEndEnhancer: js.UndefOr[Override[Any]] = js.undefined
  }
  object FormControlOverrides {
    
    inline def apply(): FormControlOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlOverrides]
    }
    
    extension [Self <: FormControlOverrides](x: Self) {
      
      inline def setCaption(value: Override[Any]): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "Caption", js.undefined)
      
      inline def setControlContainer(value: Override[Any]): Self = StObject.set(x, "ControlContainer", value.asInstanceOf[js.Any])
      
      inline def setControlContainerUndefined: Self = StObject.set(x, "ControlContainer", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelContainer(value: Override[Any]): Self = StObject.set(x, "LabelContainer", value.asInstanceOf[js.Any])
      
      inline def setLabelContainerUndefined: Self = StObject.set(x, "LabelContainer", js.undefined)
      
      inline def setLabelEndEnhancer(value: Override[Any]): Self = StObject.set(x, "LabelEndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setLabelEndEnhancerUndefined: Self = StObject.set(x, "LabelEndEnhancer", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    }
  }
  
  trait FormControlProps extends StObject {
    
    /** A caption rendered below the input field. */
    var caption: js.UndefOr[ReactNode | (js.Function1[/* props */ js.Object, ReactNode]) | Null] = js.undefined
    
    var children: ReactNode
    
    /** Adds a length counter to the form control. If your input does not have a "string" value exposed as a prop, you provide the length as an object.*/
    var counter: js.UndefOr[Boolean | Error] = js.undefined
    
    /** Displays label in light gray color if true */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Error state of the input. If an error prop passed it will be rendered in place of caption as an error message. */
    var error: js.UndefOr[ReactNode | (js.Function1[/* props */ js.Object, ReactNode])] = js.undefined
    
    /** The id of the related form element. Defaults to the id property of the child, if any. */
    var htmlFor: js.UndefOr[String] = js.undefined
    
    /** A label rendered above the input field. */
    var label: js.UndefOr[ReactNode | (js.Function1[/* props */ js.Object, ReactNode]) | Null] = js.undefined
    
    /** Adds a label end enhancer to the label */
    var labelEndEnhancer: js.UndefOr[ReactNode | (js.Function1[/* props */ js.Object, ReactNode]) | Null] = js.undefined
    
    var overrides: js.UndefOr[FormControlOverrides] = js.undefined
    
    /** Positive state of the input. If an error prop passed it will be rendered in place of positive as an error message. */
    var positive: js.UndefOr[ReactNode | (js.Function1[/* props */ js.Object, ReactNode])] = js.undefined
  }
  object FormControlProps {
    
    inline def apply(): FormControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlProps]
    }
    
    extension [Self <: FormControlProps](x: Self) {
      
      inline def setCaption(value: ReactNode | (js.Function1[/* props */ js.Object, ReactNode])): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionFunction1(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
      
      inline def setCaptionNull: Self = StObject.set(x, "caption", null)
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCounter(value: Boolean | Error): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: ReactNode | (js.Function1[/* props */ js.Object, ReactNode])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setLabel(value: ReactNode | (js.Function1[/* props */ js.Object, ReactNode])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelEndEnhancer(value: ReactNode | (js.Function1[/* props */ js.Object, ReactNode])): Self = StObject.set(x, "labelEndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setLabelEndEnhancerFunction1(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "labelEndEnhancer", js.Any.fromFunction1(value))
      
      inline def setLabelEndEnhancerNull: Self = StObject.set(x, "labelEndEnhancer", null)
      
      inline def setLabelEndEnhancerUndefined: Self = StObject.set(x, "labelEndEnhancer", js.undefined)
      
      inline def setLabelFunction1(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOverrides(value: FormControlOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPositive(value: ReactNode | (js.Function1[/* props */ js.Object, ReactNode])): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveFunction1(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "positive", js.Any.fromFunction1(value))
      
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
  
  trait StyleProps extends StObject {
    
    @JSName("$counterError")
    var $counterError: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$error")
    var $error: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$length")
    var $length: js.UndefOr[Double] = js.undefined
    
    @JSName("$maxLength")
    var $maxLength: js.UndefOr[Double] = js.undefined
    
    @JSName("$positive")
    var $positive: js.UndefOr[Boolean] = js.undefined
  }
  object StyleProps {
    
    inline def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$counterError(value: Boolean): Self = StObject.set(x, "$counterError", value.asInstanceOf[js.Any])
      
      inline def set$counterErrorUndefined: Self = StObject.set(x, "$counterError", js.undefined)
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
      
      inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
      
      inline def set$length(value: Double): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
      
      inline def set$lengthUndefined: Self = StObject.set(x, "$length", js.undefined)
      
      inline def set$maxLength(value: Double): Self = StObject.set(x, "$maxLength", value.asInstanceOf[js.Any])
      
      inline def set$maxLengthUndefined: Self = StObject.set(x, "$maxLength", js.undefined)
      
      inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
      
      inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
    }
  }
}
