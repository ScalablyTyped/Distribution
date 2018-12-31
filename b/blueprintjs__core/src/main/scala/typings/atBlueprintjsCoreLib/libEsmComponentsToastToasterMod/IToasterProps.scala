package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether a toast should acquire application focus when it first opens.
    * This is disabled by default so that toasts do not interrupt the user's flow.
    * Note that `enforceFocus` is always disabled for `Toaster`s.
    * @default false
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether pressing the `esc` key should clear all active toasts.
    * @default true
    */
  var canEscapeKeyClear: js.UndefOr[scala.Boolean] = js.undefined
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
  var usePortal: js.UndefOr[scala.Boolean] = js.undefined
}

