package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.always
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clear
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dropDown
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.email
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.filled
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.floating
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hidden
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.instantly
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.invalid
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onFocus
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outlined
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.password
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pending
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.search
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.static
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.tel
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.text
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.underlined
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.url
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.useButtons
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.valid
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDropDownBox.ContentTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties
import typings.std.ClipboardEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.devextremeB5DqTZzf.mod.DevExpress.ui.WidgetOptions because var conflicts: activeStateEnabled, focusStateEnabled, hoverStateEnabled. Inlined accessKey, disabled, hint, onContentReady, tabIndex, visible
- typings.devextremeB5DqTZzf.mod.DevExpress.ui.EditorOptions because var conflicts: activeStateEnabled, focusStateEnabled, hoverStateEnabled, stylingMode, value. Inlined isValid, onValueChanged, readOnly, validationError, validationErrors, validationMessageMode, validationStatus
- typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTextEditorOptions because var conflicts: activeStateEnabled, buttons, value. Inlined focusStateEnabled, hoverStateEnabled, inputAttr, label, labelMode, mask, maskChar, maskInvalidMessage, maskRules, name, onChange, onCopy, onCut, onEnterKey, onFocusIn, onFocusOut, onInput, onKeyDown, onKeyUp, onPaste, placeholder, showClearButton, showMaskMode, spellcheck, stylingMode, text, useMaskedValue, valueChangeEvent
- typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxTextBoxOptions because var conflicts: activeStateEnabled, buttons, value. Inlined maxLength, mode
- typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxDropDownEditorOptions because var conflicts: value. Inlined acceptCustomValue, activeStateEnabled, applyValueMode, dropDownOptions, buttons, deferRendering, dropDownButtonTemplate, onClosed, onOpened, openOnFieldClick, opened, showDropDownButton */ trait dxDropDownBoxOptions
  extends StObject
     with DataExpressionMixinOptions[dxDropDownBox]
     with DOMComponentOptions[dxDropDownBox] {
  
  /**
    * Specifies whether the UI component allows a user to enter a custom value.
    */
  var acceptCustomValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shortcut key that sets focus on the UI component.
    */
  var accessKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component changes its state as a result of user interaction.
    */
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the way an end-user applies the selected value.
    */
  var applyValueMode: js.UndefOr[instantly | useButtons] = js.undefined
  
  /**
    * Allows you to add custom buttons to the input text field.
    */
  var buttons: js.UndefOr[js.Array[clear | dropDown | dxTextEditorButton]] = js.undefined
  
  /**
    * Specifies a custom template for the drop-down content.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* templateData */ ContentTemplateData, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  @JSName("dataSource")
  var dataSource_dxDropDownBoxOptions: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies whether to render the drop-down field&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI component responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customizes text before it is displayed in the input field.
    */
  var displayValueFormatter: js.UndefOr[js.Function1[/* value */ String | js.Array[Any], String]] = js.undefined
  
  /**
    * Specifies a custom template for the drop-down button.
    */
  var dropDownButtonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ DropDownButtonTemplateDataModel, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures the drop-down field which holds the content.
    */
  var dropDownOptions: js.UndefOr[Properties | typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopover.Properties] = js.undefined
  
  /**
    * Specifies a custom template for the text field. Must contain the TextBox UI component.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* value */ Any, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether the UI component can be focused using keyboard navigation.
    */
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies text for a hint that appears when a user pauses on the UI component.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component changes its state when a user pauses on it.
    */
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the attributes to be passed on to the underlying HTML element.
    */
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies or indicates whether the editor&apos;s value is valid.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of items used to synchronize the DropDownBox with an embedded UI component.
    */
  @JSName("items")
  var items_dxDropDownBoxOptions: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies a text string used to annotate the editor&apos;s value.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the label&apos;s display mode.
    */
  var labelMode: js.UndefOr[static | floating | hidden] = js.undefined
  
  /**
    * The editor mask that specifies the custom format of the entered string.
    */
  var mask: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a mask placeholder. A single character is recommended.
    */
  var maskChar: js.UndefOr[String] = js.undefined
  
  /**
    * A message displayed when the entered text does not match the specified pattern.
    */
  var maskInvalidMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies custom mask rules.
    */
  var maskRules: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the maximum number of characters you can enter into the textbox.
    */
  var maxLength: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The &apos;mode&apos; attribute value of the actual HTML input element representing the text box.
    */
  var mode: js.UndefOr[email | password | search | tel | text | url] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the UI component loses focus after the text field&apos;s content was changed using the keyboard.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, Event], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* e */ EventInfo[dxDropDownBox], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s content is ready and each time the content is changed.
    */
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxDropDownBox], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been copied.
    */
  var onCopy: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been cut.
    */
  var onCut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the Enter key has been pressed while the UI component is focused.
    */
  var onEnterKey: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component gets focus.
    */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, FocusEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component loses focus.
    */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, FocusEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed each time the UI component&apos;s input is changed while the UI component is focused.
    */
  var onInput: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, UIEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a user is pressing a key on the keyboard.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a user releases a key on the keyboard.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed once the drop-down editor is opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* e */ EventInfo[dxDropDownBox], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s input has been pasted.
    */
  var onPaste: js.UndefOr[js.Function1[/* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent], Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  var onValueChanged: js.UndefOr[
    js.Function1[/* e */ (NativeEventInfo[dxDropDownBox, Event]) & ValueChangedInfo, Unit]
  ] = js.undefined
  
  /**
    * Specifies whether a user can open the drop-down list by clicking a text field.
    */
  var openOnFieldClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the drop-down editor is displayed.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a text string displayed when the editor&apos;s value is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the editor is read-only.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Clear button in the UI component.
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the drop-down button is visible.
    */
  var showDropDownButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when the UI component shows the mask. Applies only if useMaskedValue is true.
    */
  var showMaskMode: js.UndefOr[always | onFocus] = js.undefined
  
  /**
    * Specifies whether or not the UI component checks the inner text for spelling mistakes.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the UI component&apos;s text field is styled.
    */
  var stylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  
  /**
    * Specifies the number of the element when the Tab key is used for navigating.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The read-only property that holds the text displayed by the UI component input element.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the value should contain mask characters or not.
    */
  var useMaskedValue: js.UndefOr[Boolean] = js.undefined
  
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
    * Specifies the DOM events after which the UI component&apos;s value should be updated.
    */
  var valueChangeEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxDropDownBoxOptions {
  
  inline def apply(): dxDropDownBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownBoxOptions]
  }
  
  extension [Self <: dxDropDownBoxOptions](x: Self) {
    
    inline def setAcceptCustomValue(value: Boolean): Self = StObject.set(x, "acceptCustomValue", value.asInstanceOf[js.Any])
    
    inline def setAcceptCustomValueUndefined: Self = StObject.set(x, "acceptCustomValue", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setApplyValueMode(value: instantly | useButtons): Self = StObject.set(x, "applyValueMode", value.asInstanceOf[js.Any])
    
    inline def setApplyValueModeUndefined: Self = StObject.set(x, "applyValueMode", js.undefined)
    
    inline def setButtons(value: js.Array[clear | dropDown | dxTextEditorButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (clear | dropDown | dxTextEditorButton)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* templateData */ ContentTemplateData, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* templateData */ ContentTemplateData, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayValueFormatter(value: /* value */ String | js.Array[Any] => String): Self = StObject.set(x, "displayValueFormatter", js.Any.fromFunction1(value))
    
    inline def setDisplayValueFormatterUndefined: Self = StObject.set(x, "displayValueFormatter", js.undefined)
    
    inline def setDropDownButtonTemplate(
      value: template | (js.Function2[
          /* buttonData */ DropDownButtonTemplateDataModel, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dropDownButtonTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownButtonTemplateFunction2(
      value: (/* buttonData */ DropDownButtonTemplateDataModel, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dropDownButtonTemplate", js.Any.fromFunction2(value))
    
    inline def setDropDownButtonTemplateUndefined: Self = StObject.set(x, "dropDownButtonTemplate", js.undefined)
    
    inline def setDropDownOptions(value: Properties | typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopover.Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* value */ Any, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* value */ Any, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setInputAttr(value: Any): Self = StObject.set(x, "inputAttr", value.asInstanceOf[js.Any])
    
    inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelMode(value: static | floating | hidden): Self = StObject.set(x, "labelMode", value.asInstanceOf[js.Any])
    
    inline def setLabelModeUndefined: Self = StObject.set(x, "labelMode", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
    
    inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
    
    inline def setMaskInvalidMessage(value: String): Self = StObject.set(x, "maskInvalidMessage", value.asInstanceOf[js.Any])
    
    inline def setMaskInvalidMessageUndefined: Self = StObject.set(x, "maskInvalidMessage", js.undefined)
    
    inline def setMaskRules(value: Any): Self = StObject.set(x, "maskRules", value.asInstanceOf[js.Any])
    
    inline def setMaskRulesUndefined: Self = StObject.set(x, "maskRules", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaxLength(value: String | Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMode(value: email | password | search | tel | text | url): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* e */ NativeEventInfo[dxDropDownBox, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClosed(value: /* e */ EventInfo[dxDropDownBox] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxDropDownBox] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnCopy(value: /* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: /* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnEnterKey(value: /* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEnterKeyUndefined: Self = StObject.set(x, "onEnterKey", js.undefined)
    
    inline def setOnFocusIn(value: /* e */ NativeEventInfo[dxDropDownBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusIn", js.Any.fromFunction1(value))
    
    inline def setOnFocusInUndefined: Self = StObject.set(x, "onFocusIn", js.undefined)
    
    inline def setOnFocusOut(value: /* e */ NativeEventInfo[dxDropDownBox, FocusEvent] => Unit): Self = StObject.set(x, "onFocusOut", js.Any.fromFunction1(value))
    
    inline def setOnFocusOutUndefined: Self = StObject.set(x, "onFocusOut", js.undefined)
    
    inline def setOnInput(value: /* e */ NativeEventInfo[dxDropDownBox, UIEvent] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ NativeEventInfo[dxDropDownBox, KeyboardEvent] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnOpened(value: /* e */ EventInfo[dxDropDownBox] => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    inline def setOnPaste(value: /* e */ NativeEventInfo[dxDropDownBox, ClipboardEvent] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ (NativeEventInfo[dxDropDownBox, Event]) & ValueChangedInfo => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setOpenOnFieldClick(value: Boolean): Self = StObject.set(x, "openOnFieldClick", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFieldClickUndefined: Self = StObject.set(x, "openOnFieldClick", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowDropDownButton(value: Boolean): Self = StObject.set(x, "showDropDownButton", value.asInstanceOf[js.Any])
    
    inline def setShowDropDownButtonUndefined: Self = StObject.set(x, "showDropDownButton", js.undefined)
    
    inline def setShowMaskMode(value: always | onFocus): Self = StObject.set(x, "showMaskMode", value.asInstanceOf[js.Any])
    
    inline def setShowMaskModeUndefined: Self = StObject.set(x, "showMaskMode", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStylingMode(value: outlined | underlined | filled): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseMaskedValue(value: Boolean): Self = StObject.set(x, "useMaskedValue", value.asInstanceOf[js.Any])
    
    inline def setUseMaskedValueUndefined: Self = StObject.set(x, "useMaskedValue", js.undefined)
    
    inline def setValidationError(value: Any): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    
    inline def setValidationErrors(value: js.Array[Any]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: Any*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationMessageMode(value: always | auto): Self = StObject.set(x, "validationMessageMode", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageModeUndefined: Self = StObject.set(x, "validationMessageMode", js.undefined)
    
    inline def setValidationStatus(value: valid | invalid | pending): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
