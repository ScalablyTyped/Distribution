package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeysProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * In order to make local hotkeys work on elements that are not normally
    * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
    * to the hotkey target, which makes it focusable. By default, we use `0`,
    * but you can override this value to change the tab navigation behavior
    * of the component. You may even set this value to `null`, which will omit
    * the `tabIndex` from the component decorated by `HotkeysTarget`.
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object IHotkeysProps {
  @scala.inline
  def apply(className: java.lang.String = null, tabIndex: scala.Int | scala.Double = null): IHotkeysProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeysProps]
  }
}

