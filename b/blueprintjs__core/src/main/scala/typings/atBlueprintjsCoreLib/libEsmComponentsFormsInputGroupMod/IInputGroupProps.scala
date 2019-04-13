package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputGroupProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IControlledProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the input is non-interactive.
    * Note that `rightElement` must be disabled separately; this prop will not affect it.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ stdLib.HTMLInputElement | scala.Null, _]] = js.undefined
  /** Whether this input should use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of the input group,
    * before the user's cursor.
    */
  var leftIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /** Placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /** Whether the input (and any buttons) should appear with rounded caps. */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this input should use small styles. */
  var small: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * HTML `input` type attribute.
    * @default "text"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IInputGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: /* ref */ stdLib.HTMLInputElement | scala.Null => _ = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    leftIcon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    placeholder: java.lang.String = null,
    rightElement: reactLib.reactMod.Global.JSXNs.Element = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IInputGroupProps]
  }
}

