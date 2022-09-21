package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.always
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.filled
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.invalid
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outlined
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pending
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.underlined
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.valid
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions[TComponent]
  extends StObject
     with WidgetOptions[TComponent] {
  
  /**
    * Specifies or indicates whether the editor&apos;s value is valid.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  var onValueChanged: js.UndefOr[
    js.Function1[/* e */ (NativeEventInfo[TComponent, Event]) & ValueChangedInfo, Unit]
  ] = js.undefined
  
  /**
    * Specifies whether the editor is read-only.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var stylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  
  /**
    * Information on the broken validation rule. Contains the first item from the validationErrors array.
    */
  var validationError: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of the validation rules that failed.
    */
  var validationErrors: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies how the message about the validation rules that are not satisfied by this editor&apos;s value is displayed.
    */
  var validationMessageMode: js.UndefOr[always | auto] = js.undefined
  
  /**
    * Indicates or specifies the current validation status.
    */
  var validationStatus: js.UndefOr[valid | invalid | pending] = js.undefined
  
  /**
    * Specifies the UI component&apos;s value.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object EditorOptions {
  
  inline def apply[TComponent](): EditorOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions[TComponent]]
  }
  
  extension [Self <: EditorOptions[?], TComponent](x: Self & EditorOptions[TComponent]) {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ (NativeEventInfo[TComponent, Event]) & ValueChangedInfo => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setStylingMode(value: outlined | underlined | filled): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setValidationError(value: Any): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    
    inline def setValidationErrors(value: js.Array[Any]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: Any*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationMessageMode(value: always | auto): Self = StObject.set(x, "validationMessageMode", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageModeUndefined: Self = StObject.set(x, "validationMessageMode", js.undefined)
    
    inline def setValidationStatus(value: valid | invalid | pending): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
