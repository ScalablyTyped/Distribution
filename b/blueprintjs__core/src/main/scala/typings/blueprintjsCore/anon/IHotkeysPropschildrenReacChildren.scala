package typings.blueprintjsCore.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTypes.IHotkeysProps & {  children ? :react.react.ReactNode} */
trait IHotkeysPropschildrenReacChildren extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * In order to make local hotkeys work on elements that are not normally
    * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
    * to the hotkey target, which makes it focusable. By default, we use `0`,
    * but you can override this value to change the tab navigation behavior
    * of the component. You may even set this value to `null`, which will omit
    * the `tabIndex` from the component decorated by `HotkeysTarget`.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IHotkeysPropschildrenReacChildren {
  @scala.inline
  def apply(children: ReactNode = null, className: String = null, tabIndex: js.UndefOr[Double] = js.undefined): IHotkeysPropschildrenReacChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeysPropschildrenReacChildren]
  }
}

