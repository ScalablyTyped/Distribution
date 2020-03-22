package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.tagInputMod.TagInputAddMethod
import typings.blueprintjsCore.tagMod.ITagProps
import typings.blueprintjsIcons.iconNameMod.IconName
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

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputProps> */
trait ReadonlyITagInputProps extends js.Object {
  val addOnBlur: js.UndefOr[Boolean] = js.undefined
  val addOnPaste: js.UndefOr[Boolean] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val fill: js.UndefOr[Boolean] = js.undefined
  val inputProps: js.UndefOr[HTMLInputProps] = js.undefined
  val inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.undefined
  val inputValue: js.UndefOr[String] = js.undefined
  val intent: js.UndefOr[Intent] = js.undefined
  val large: js.UndefOr[Boolean] = js.undefined
  val leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  val onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.undefined
  val onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  val onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  val onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  val onRemove: js.UndefOr[js.Function2[/* value */ String, /* index */ Double, Unit]] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val rightElement: js.UndefOr[Element] = js.undefined
  val separator: js.UndefOr[String | RegExp | `false`] = js.undefined
  val tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])] = js.undefined
  val values: js.Array[ReactNode]
}

object ReadonlyITagInputProps {
  @scala.inline
  def apply(
    values: js.Array[ReactNode],
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
    tagProps: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps]) = null
  ): ReadonlyITagInputProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ReadonlyITagInputProps]
  }
}

