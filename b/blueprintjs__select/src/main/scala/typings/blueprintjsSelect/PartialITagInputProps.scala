package typings.blueprintjsSelect

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.tagInputMod.TagInputAddMethod
import typings.blueprintjsCore.tagMod.ITagProps
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsSelect.blueprintjsSelectBooleans.`false`
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.ITagInputProps> */
trait PartialITagInputProps extends js.Object {
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  var addOnPaste: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[HTMLInputProps] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.undefined
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  var onRemove: js.UndefOr[js.Function2[/* value */ String, /* index */ Double, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rightElement: js.UndefOr[Element] = js.undefined
  var separator: js.UndefOr[String | RegExp | `false`] = js.undefined
  var tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])] = js.undefined
  var values: js.UndefOr[js.Array[ReactNode]] = js.undefined
}

object PartialITagInputProps {
  @scala.inline
  def apply(
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputProps: HTMLInputProps = null,
    inputRef: /* input */ HTMLInputElement | Null => Unit = null,
    inputValue: String = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    onAdd: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit = null,
    onChange: /* values */ js.Array[ReactNode] => Boolean | Unit = null,
    onInputChange: FormEvent[HTMLInputElement] => Unit = null,
    onKeyDown: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onKeyUp: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onRemove: (/* value */ String, /* index */ Double) => Unit = null,
    placeholder: String = null,
    rightElement: Element = null,
    separator: String | RegExp | `false` = null,
    tagProps: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps]) = null,
    values: js.Array[ReactNode] = null
  ): PartialITagInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITagInputProps]
  }
}

