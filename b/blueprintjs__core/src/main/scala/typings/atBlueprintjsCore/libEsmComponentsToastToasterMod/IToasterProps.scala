package typings.atBlueprintjsCore.libEsmComponentsToastToasterMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
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
    * Position of `Toaster` within its container.
    *
    * Note that only `TOP` and `BOTTOM` are supported because Toaster only
    * supports the top and bottom edge positioning.
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
    position: ToasterPosition = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): IToasterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(canEscapeKeyClear)) __obj.updateDynamic("canEscapeKeyClear")(canEscapeKeyClear)
    if (className != null) __obj.updateDynamic("className")(className)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    __obj.asInstanceOf[IToasterProps]
  }
}

