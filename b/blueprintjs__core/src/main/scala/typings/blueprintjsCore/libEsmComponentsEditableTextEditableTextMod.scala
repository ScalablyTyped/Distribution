package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsEditableTextEditableTextMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
  @js.native
  open class EditableText protected ()
    extends AbstractPureComponent2[EditableTextProps, IEditableTextState, js.Object] {
    def this(props: EditableTextProps) = this()
    def this(props: EditableTextProps, context: Any) = this()
    
    def cancelEditing(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableText(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableText(prevProps: EditableTextProps, prevState: IEditableTextState): Unit = js.native
    
    /* private */ var handleFocus: Any = js.native
    
    /* private */ var handleKeyEvent: Any = js.native
    
    /* private */ var handleTextChange: Any = js.native
    
    /* private */ var inputElement: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderInput: Any = js.native
    
    def toggleEditing(): Unit = js.native
    
    /* private */ var updateInputDimensions: Any = js.native
    
    /* private */ var valueElement: Any = js.native
  }
  /* static members */
  object EditableText {
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText.defaultProps")
    @js.native
    def defaultProps: EditableTextProps = js.native
    inline def defaultProps_=(x: EditableTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type EditableTextProps = IEditableTextProps
  
  trait IEditableTextProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /**
      * EXPERIMENTAL FEATURE.
      *
      * When true, this forces the component to _always_ render an editable input (or textarea)
      * both when the component is focussed and unfocussed, instead of the component's default
      * behavior of switching between a text span and a text input upon interaction.
      *
      * This behavior can help in certain applications where, for example, a custom right-click
      * context menu is used to supply clipboard copy and paste functionality.
      *
      * @default false
      */
    var alwaysRenderInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
      * will insert a newline. If `false`, the key bindings are inverted such that `enter`
      * adds a newline.
      *
      * @default false
      */
    var confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined
    
    /** ID attribute to pass to the underlying element that contains the text contents. This allows for referencing via aria attributes */
    var contentId: js.UndefOr[String] = js.undefined
    
    /** Default text value of uncontrolled input. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the text can be edited.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the component is currently being edited. */
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum number of characters allowed. Unlimited by default. */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of lines before scrolling begins, when `multiline`.
      */
    var maxLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of lines (essentially minimum height), when `multiline`.
      *
      * @default 1
      */
    var minLines: js.UndefOr[Double] = js.undefined
    
    /** Minimum width in pixels of the input, when not `multiline`. */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the component supports multiple lines of text.
      * This prop should not be changed during the component's lifetime.
      *
      * @default false
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /** Callback invoked when user cancels input with the `esc` key. Receives last confirmed value. */
    var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Callback invoked when user changes input in any way. */
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Callback invoked when user confirms value with `enter` key or by blurring input. */
    var onConfirm: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Callback invoked after the user enters edit mode. */
    var onEdit: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * Placeholder text when there is no value.
      *
      * @default "Click to Edit"
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the entire text field should be selected on focus.
      * If `false`, the cursor is placed at the end of the text.
      * This prop is ignored on inputs with type other then text, search, url, tel and password. See https://html.spec.whatwg.org/multipage/input.html#do-not-apply for details.
      *
      * @default false
      */
    var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The type of input that should be shown, when not `multiline`.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Text value of controlled input. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IEditableTextProps {
    
    inline def apply(): IEditableTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEditableTextProps] (val x: Self) extends AnyVal {
      
      inline def setAlwaysRenderInput(value: Boolean): Self = StObject.set(x, "alwaysRenderInput", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRenderInputUndefined: Self = StObject.set(x, "alwaysRenderInput", js.undefined)
      
      inline def setConfirmOnEnterKey(value: Boolean): Self = StObject.set(x, "confirmOnEnterKey", value.asInstanceOf[js.Any])
      
      inline def setConfirmOnEnterKeyUndefined: Self = StObject.set(x, "confirmOnEnterKey", js.undefined)
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      inline def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOnCancel(value: /* value */ String => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(value: /* value */ String => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnEdit(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onEdit", js.Any.fromFunction1(value))
      
      inline def setOnEditUndefined: Self = StObject.set(x, "onEdit", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IEditableTextState extends StObject {
    
    /** Pixel height of the input, measured from span size */
    var inputHeight: js.UndefOr[Double] = js.undefined
    
    /** Pixel width of the input, measured from span size */
    var inputWidth: js.UndefOr[Double] = js.undefined
    
    /** Whether the value is currently being edited */
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    /** The last confirmed value */
    var lastValue: js.UndefOr[String] = js.undefined
    
    /** The controlled input value, may be different from prop during editing */
    var value: js.UndefOr[String] = js.undefined
  }
  object IEditableTextState {
    
    inline def apply(): IEditableTextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableTextState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEditableTextState] (val x: Self) extends AnyVal {
      
      inline def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
      
      inline def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
      
      inline def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
      
      inline def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setLastValue(value: String): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
      
      inline def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
