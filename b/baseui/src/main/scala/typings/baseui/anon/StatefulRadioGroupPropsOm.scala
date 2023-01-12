package typings.baseui.anon

import typings.baseui.radioTypesMod.LabelPlacement
import typings.baseui.radioTypesMod.RadioGroupOverrides
import typings.baseui.radioTypesMod.State
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/radio/types.StatefulRadioGroupProps & std.Omit<baseui.baseui/radio/types.RadioGroupProps, keyof baseui.baseui/radio/types.StatefulRadioGroupProps> */
trait StatefulRadioGroupPropsOm extends StObject {
  
  var align: js.UndefOr[typings.baseui.radioTypesMod.Align] = js.undefined
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /** Set to be focused (active) on selected\checked radio. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /** A list of `Radio` components. */
  var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Initial state populated into the component */
  var initialState: js.UndefOr[State] = js.undefined
  
  var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  /** Handler for change events on trigger element. */
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
  
  var overrides: js.UndefOr[RadioGroupOverrides] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object StatefulRadioGroupPropsOm {
  
  inline def apply(): StatefulRadioGroupPropsOm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRadioGroupPropsOm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatefulRadioGroupPropsOm] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: typings.baseui.radioTypesMod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setLabelPlacement(value: LabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: RadioGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
