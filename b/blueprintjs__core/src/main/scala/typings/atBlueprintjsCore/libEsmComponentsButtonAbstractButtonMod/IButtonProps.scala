package typings.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.button
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.reset
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.submit
import typings.atBlueprintjsCore.libEsmCommonAlignmentMod.Alignment
import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IActionProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonProps extends IActionProps {
  /**
    * If set to `true`, the button will display in an active state.
    * This is equivalent to setting `className={Classes.ACTIVE}`.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    * @default Alignment.CENTER
    */
  var alignText: js.UndefOr[Alignment] = js.undefined
  /** A ref handler that receives the native HTML element backing this component. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  /** Whether this button should expand to fill its container. */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** Whether this button should use large styles. */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `true`, the button will display a centered loading spinner instead of its contents.
    * The width of the button is not affected by the value of this prop.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** Whether this button should use minimal styles. */
  var minimal: js.UndefOr[Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Whether this button should use small styles. */
  var small: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML `type` attribute of button. Accepted values are `"button"`, `"submit"`, and `"reset"`.
    * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
    * @default "button"
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object IButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    alignText: Alignment = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementRef: /* ref */ HTMLElement | Null => _ = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    rightIcon: IconName | MaybeElement = null,
    small: js.UndefOr[Boolean] = js.undefined,
    text: ReactNode = null,
    `type`: submit | reset | button = null
  ): IButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alignText != null) __obj.updateDynamic("alignText")(alignText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

