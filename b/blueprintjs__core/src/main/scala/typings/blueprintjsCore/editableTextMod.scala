package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableTextMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
  @js.native
  class EditableText protected ()
    extends AbstractPureComponent2[IEditableTextProps, IEditableTextState, js.Object] {
    def this(props: IEditableTextProps) = this()
    def this(props: IEditableTextProps, context: js.Any) = this()
    
    def cancelEditing(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableText(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableText(prevProps: IEditableTextProps, prevState: IEditableTextState): Unit = js.native
    
    var handleFocus: js.Any = js.native
    
    var handleKeyEvent: js.Any = js.native
    
    var handleTextChange: js.Any = js.native
    
    var inputElement: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderInput: js.Any = js.native
    
    def toggleEditing(): Unit = js.native
    
    var updateInputDimensions: js.Any = js.native
    
    var valueElement: js.Any = js.native
  }
  /* static members */
  object EditableText {
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText.defaultProps")
    @js.native
    def defaultProps: IEditableTextProps = js.native
    @scala.inline
    def defaultProps_=(x: IEditableTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
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
      * @default false
      */
    var alwaysRenderInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
      * will insert a newline. If `false`, the key bindings are inverted such that `enter`
      * adds a newline.
      * @default false
      */
    var confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined
    
    /** Default text value of uncontrolled input. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the text can be edited.
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
      * @default 1
      */
    var minLines: js.UndefOr[Double] = js.undefined
    
    /** Minimum width in pixels of the input, when not `multiline`. */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the component supports multiple lines of text.
      * This prop should not be changed during the component's lifetime.
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
      * @default "Click to Edit"
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the entire text field should be selected on focus.
      * If `false`, the cursor is placed at the end of the text.
      * This prop is ignored on inputs with type other then text, search, url, tel and password. See https://html.spec.whatwg.org/multipage/input.html#do-not-apply for details.
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
    
    @scala.inline
    def apply(): IEditableTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableTextProps]
    }
    
    @scala.inline
    implicit class IEditableTextPropsMutableBuilder[Self <: IEditableTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysRenderInput(value: Boolean): Self = StObject.set(x, "alwaysRenderInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysRenderInputUndefined: Self = StObject.set(x, "alwaysRenderInput", js.undefined)
      
      @scala.inline
      def setConfirmOnEnterKey(value: Boolean): Self = StObject.set(x, "confirmOnEnterKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmOnEnterKeyUndefined: Self = StObject.set(x, "confirmOnEnterKey", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* value */ String => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* value */ String => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnEdit(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditUndefined: Self = StObject.set(x, "onEdit", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSelectAllOnFocus(value: Boolean): Self = StObject.set(x, "selectAllOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnFocusUndefined: Self = StObject.set(x, "selectAllOnFocus", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    @scala.inline
    def apply(): IEditableTextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableTextState]
    }
    
    @scala.inline
    implicit class IEditableTextStateMutableBuilder[Self <: IEditableTextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
      
      @scala.inline
      def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
      
      @scala.inline
      def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      @scala.inline
      def setLastValue(value: String): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
