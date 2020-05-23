package typings.blueprintjsCore.toastMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastProps
  extends IProps
     with IIntentProps {
  /**
    * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
    * user clicks the action button. Note that the `intent` prop is ignored (the action button
    * cannot have its own intent color that might conflict with the toast's intent). Omit this
    * prop to omit the action button.
    */
  var action: js.UndefOr[IActionProps with ILinkProps] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Message to display in the body of the toast. */
  var message: ReactNode
  /**
    * Callback invoked when the toast is dismissed, either by the user or by the timeout.
    * The value of the argument indicates whether the toast was closed because the timeout expired.
    */
  var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ Boolean, Unit]] = js.undefined
  /**
    * Milliseconds to wait before automatically dismissing toast.
    * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object IToastProps {
  @scala.inline
  def apply(
    action: IActionProps with ILinkProps = null,
    className: String = null,
    icon: js.UndefOr[Null | IconName | MaybeElement] = js.undefined,
    intent: Intent = null,
    message: ReactNode = null,
    onDismiss: /* didTimeoutExpire */ Boolean => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): IToastProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastProps]
  }
}

