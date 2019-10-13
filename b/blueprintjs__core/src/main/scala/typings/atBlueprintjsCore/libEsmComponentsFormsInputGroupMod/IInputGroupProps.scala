package typings.atBlueprintjsCore.libEsmComponentsFormsInputGroupMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IControlledProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.reactMod.FormEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputGroupProps
  extends IControlledProps
     with IIntentProps
     with IProps {
  /**
    * Whether the input is non-interactive.
    * Note that `rightElement` must be disabled separately; this prop will not affect it.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.undefined
  /** Whether this input should use large styles. */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of the input group,
    * before the user's cursor.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[Element] = js.undefined
  /** Whether the input (and any buttons) should appear with rounded caps. */
  var round: js.UndefOr[Boolean] = js.undefined
  /** Whether this input should use small styles. */
  var small: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML `input` type attribute.
    * @default "text"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IInputGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLInputElement | Null => _ = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    onChange: FormEvent[HTMLElement] => Unit = null,
    placeholder: String = null,
    rightElement: Element = null,
    round: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IInputGroupProps]
  }
}

