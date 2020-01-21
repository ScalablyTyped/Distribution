package typings.blueprintjsCore.toasterMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterProps extends IProps {
  /**
    * Whether a toast should acquire application focus when it first opens.
    * This is disabled by default so that toasts do not interrupt the user's flow.
    * Note that `enforceFocus` is always disabled for `Toaster`s.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether pressing the `esc` key should clear all active toasts.
    * @default true
    */
  var canEscapeKeyClear: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of active toasts that can be displayed at once.
    *
    * When the limit is about to be exceeded, the oldest active toast is removed.
    * @default undefined
    */
  var maxToasts: js.UndefOr[Double] = js.undefined
  /**
    * Position of `Toaster` within its container.
    * @default Position.TOP
    */
  var position: js.UndefOr[ToasterPosition] = js.undefined
  /**
    * Whether the toaster should be rendered into a new element attached to `document.body`.
    * If `false`, then positioning will be relative to the parent element.
    *
    * This prop is ignored by `Toaster.create()` as that method always appends a new element
    * to the container.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.undefined
}

object IToasterProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    canEscapeKeyClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    maxToasts: Int | Double = null,
    position: ToasterPosition = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): IToasterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClear)) __obj.updateDynamic("canEscapeKeyClear")(canEscapeKeyClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxToasts != null) __obj.updateDynamic("maxToasts")(maxToasts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToasterProps]
  }
}

