package typings.atBlueprintjsCore.libEsmComponentsTagDashInputTagInputMod

import typings.atBlueprintjsCore.atBlueprintjsCoreNumbers.`false`
import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsCore.libEsmComponentsTagTagMod.ITagProps
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagInputProps
  extends IIntentProps
     with IProps {
  /**
    * If true, `onAdd` will be invoked when the input loses focus.
    * Otherwise, `onAdd` is only invoked when `enter` is pressed.
    * @default false
    */
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, `onAdd` will be invoked when the user pastes text containing the `separator`
    * into the input. Otherwise, pasted text will remain in the input.
    *
    * __Note:__ For example, if `addOnPaste=true` and `separator="\n"` (new line), then:
    * - Pasting `"hello"` will _not_ invoke `onAdd`
    * - Pasting `"hello\n"` will invoke `onAdd` with `["hello"]`
    * - Pasting `"hello\nworld"` will invoke `onAdd` with `["hello", "world"]`
    *
    * @default true
    */
  var addOnPaste: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component is non-interactive.
    * Note that you'll also need to disable the component's `rightElement`,
    * if appropriate.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the tag input should take up the full width of its container. */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * React props to pass to the `<input>` element.
    * Note that `ref` and `key` are not supported here; use `inputRef` below.
    */
  var inputProps: js.UndefOr[HTMLInputProps] = js.undefined
  /** Ref handler for the `<input>` element. */
  var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.undefined
  /** Controlled value of the `<input>` element. This is shorthand for `inputProps={{ value }}`. */
  var inputValue: js.UndefOr[String] = js.undefined
  /** Whether the tag input should use a large size. */
  var large: js.UndefOr[Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render on the left side of the input. */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * Callback invoked when new tags are added by the user pressing `enter` on the input.
    * Receives the current value of the input field split by `separator` into an array.
    * New tags are expected to be appended to the list.
    *
    * The input will be cleared after `onAdd` is invoked _unless_ the callback explicitly
    * returns `false`. This is useful if the provided `value` is somehow invalid and should
    * not be added as a tag.
    */
  var onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.undefined
  /**
    * Callback invoked when new tags are added or removed. Receives the updated list of `values`:
    * new tags are appended to the end of the list, removed tags are removed at their index.
    *
    * Like `onAdd`, the input will be cleared after this handler is invoked _unless_ the callback
    * explicitly returns `false`.
    *
    * This callback essentially implements basic `onAdd` and `onRemove` functionality and merges
    * the two handlers into one to simplify controlled usage.
    *
    * **Note about typed usage:** Your handler can declare a subset type of `React.ReactNode[]`,
    * such as `string[]` or `Array<string | JSX.Element>`, to match the type of your `values` array:
    * ```tsx
    * <TagInput
    *     onChange={(values: string[]) => this.setState({ values })}
    *     values={["apple", "banana", "cherry"]}
    * />
    * ```
    */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.undefined
  /**
    * Callback invoked when the value of `<input>` element is changed.
    * This is shorthand for `inputProps={{ onChange }}`.
    */
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  /**
    * Callback invoked when the user depresses a keyboard key.
    * Receives the event and the index of the active tag (or `undefined` if
    * focused in the input).
    */
  var onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /**
    * Callback invoked when the user releases a keyboard key.
    * Receives the event and the index of the active tag (or `undefined` if
    * focused in the input).
    */
  var onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /**
    * Callback invoked when the user clicks the X button on a tag.
    * Receives value and index of removed tag.
    */
  var onRemove: js.UndefOr[js.Function2[/* value */ String, /* index */ Double, Unit]] = js.undefined
  /**
    * Input placeholder text which will not appear if `values` contains any items
    * (consistent with default HTML input behavior).
    * Use `inputProps.placeholder` if you want the placeholder text to _always_ appear.
    *
    * If you define both `placeholder` and `inputProps.placeholder`, then the former will appear
    * when `values` is empty and the latter at all other times.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Element to render on right side of input.
    * For best results, use a small spinner or minimal button (button height will adjust if `TagInput` uses large styles).
    * Other elements will likely require custom styles for correct positioning.
    */
  var rightElement: js.UndefOr[Element] = js.undefined
  /**
    * Separator pattern used to split input text into multiple values. Default value splits on commas and newlines.
    * Explicit `false` value disables splitting (note that `onAdd` will still receive an array of length 1).
    * @default /[,\n\r]/
    */
  var separator: js.UndefOr[String | RegExp | `false`] = js.undefined
  /**
    * React props to pass to each `Tag`. Provide an object to pass the same props to every tag,
    * or a function to customize props per tag.
    *
    * If you define `onRemove` here then you will have to implement your own tag removal
    * handling as `TagInput`'s own `onRemove` handler will never be invoked.
    */
  var tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])] = js.undefined
  /**
    * Controlled tag values. Each value will be rendered inside a `Tag`, which can be customized
    * using `tagProps`. Therefore, any valid React node can be used as a `TagInput` value; falsy
    * values will not be rendered.
    *
    * __Note about typed usage:__ If you know your `values` will always be of a certain `ReactNode`
    * subtype, such as `string` or `ReactChild`, you can use that type on all your handlers
    * to simplify type logic.
    */
  var values: js.Array[ReactNode]
}

object ITagInputProps {
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
    onInputChange: FormEventHandler[HTMLInputElement] = null,
    onKeyDown: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onKeyUp: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onRemove: (/* value */ String, /* index */ Double) => Unit = null,
    placeholder: String = null,
    rightElement: Element = null,
    separator: String | RegExp | `false` = null,
    tagProps: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps]) = null
  ): ITagInputProps = {
    val __obj = js.Dynamic.literal(values = values)
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur)
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(onInputChange)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagInputProps]
  }
}

