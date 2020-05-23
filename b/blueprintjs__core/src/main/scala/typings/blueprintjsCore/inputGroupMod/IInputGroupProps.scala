package typings.blueprintjsCore.inputGroupMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IControlledProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
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
  /** Ref handler or a ref object that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[IRef[HTMLInputElement]] = js.undefined
  /** Whether this input should use large styles. */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * Element to render on the left side of input.  This prop is mutually exclusive
    * with `leftIcon`.
    */
  var leftElement: js.UndefOr[Element] = js.undefined
  /**
    * Name of a Blueprint UI icon to render on the left side of the input group,
    * before the user's cursor.  This prop is mutually exclusive with `leftElement`.
    * Usage with content is deprecated.  Use `leftElement` for elements.
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
    inputRef: IRef[HTMLInputElement] = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element = null,
    leftIcon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    onChange: FormEvent[HTMLElement] => Unit = null,
    placeholder: String = null,
    rightElement: Element = null,
    round: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (!js.isUndefined(leftIcon)) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputGroupProps]
  }
}

