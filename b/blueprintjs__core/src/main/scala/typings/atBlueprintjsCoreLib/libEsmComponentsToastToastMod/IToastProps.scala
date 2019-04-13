package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
    * user clicks the action button. Note that the `intent` prop is ignored (the action button
    * cannot have its own intent color that might conflict with the toast's intent). Omit this
    * prop to omit the action button.
    */
  var action: js.UndefOr[
    atBlueprintjsCoreLib.libEsmCommonPropsMod.IActionProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.ILinkProps
  ] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /** Message to display in the body of the toast. */
  var message: reactLib.reactMod.ReactNode
  /**
    * Callback invoked when the toast is dismissed, either by the user or by the timeout.
    * The value of the argument indicates whether the toast was closed because the timeout expired.
    */
  var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Milliseconds to wait before automatically dismissing toast.
    * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
    * @default 5000
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IToastProps {
  @scala.inline
  def apply(
    message: reactLib.reactMod.ReactNode,
    action: atBlueprintjsCoreLib.libEsmCommonPropsMod.IActionProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.ILinkProps = null,
    className: java.lang.String = null,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    onDismiss: /* didTimeoutExpire */ scala.Boolean => scala.Unit = null,
    timeout: scala.Int | scala.Double = null
  ): IToastProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastProps]
  }
}

