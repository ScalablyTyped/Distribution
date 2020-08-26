package typings.blueprintjsCore.editableTextMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableTextProps
  extends IIntentProps
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
  var alwaysRenderInput: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and in multiline mode, the `enter` key will trigger onConfirm and `mod+enter`
    * will insert a newline. If `false`, the key bindings are inverted such that `enter`
    * adds a newline.
    * @default false
    */
  var confirmOnEnterKey: js.UndefOr[Boolean] = js.native
  /** Default text value of uncontrolled input. */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Whether the text can be edited.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the component is currently being edited. */
  var isEditing: js.UndefOr[Boolean] = js.native
  /** Maximum number of characters allowed. Unlimited by default. */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Maximum number of lines before scrolling begins, when `multiline`.
    */
  var maxLines: js.UndefOr[Double] = js.native
  /**
    * Minimum number of lines (essentially minimum height), when `multiline`.
    * @default 1
    */
  var minLines: js.UndefOr[Double] = js.native
  /** Minimum width in pixels of the input, when not `multiline`. */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * Whether the component supports multiple lines of text.
    * This prop should not be changed during the component's lifetime.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /** Callback invoked when user cancels input with the `esc` key. Receives last confirmed value. */
  var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked when user changes input in any way. */
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked when user confirms value with `enter` key or by blurring input. */
  var onConfirm: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /** Callback invoked after the user enters edit mode. */
  var onEdit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  /**
    * Placeholder text when there is no value.
    * @default "Click to Edit"
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Whether the entire text field should be selected on focus.
    * If `false`, the cursor is placed at the end of the text.
    * This prop is ignored on inputs with type other then text, search, url, tel and password. See https://html.spec.whatwg.org/multipage/input.html#do-not-apply for details.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * The type of input that should be shown, when not `multiline`.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Text value of controlled input. */
  var value: js.UndefOr[String] = js.native
}

object IEditableTextProps {
  @scala.inline
  def apply(): IEditableTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableTextProps]
  }
  @scala.inline
  implicit class IEditableTextPropsOps[Self <: IEditableTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysRenderInput(value: Boolean): Self = this.set("alwaysRenderInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysRenderInput: Self = this.set("alwaysRenderInput", js.undefined)
    @scala.inline
    def setConfirmOnEnterKey(value: Boolean): Self = this.set("confirmOnEnterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmOnEnterKey: Self = this.set("confirmOnEnterKey", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setOnCancel(value: /* value */ String => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnConfirm(value: /* value */ String => Unit): Self = this.set("onConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    @scala.inline
    def setOnEdit(value: /* value */ String => Unit): Self = this.set("onEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEdit: Self = this.set("onEdit", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSelectAllOnFocus(value: Boolean): Self = this.set("selectAllOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllOnFocus: Self = this.set("selectAllOnFocus", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

