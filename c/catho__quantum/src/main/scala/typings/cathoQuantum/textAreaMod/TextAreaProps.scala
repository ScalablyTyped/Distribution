package typings.cathoQuantum.textAreaMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps[T] extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply[T](
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    helperText: String = null,
    id: String | Double = null,
    label: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): TextAreaProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps[T]]
  }
}

