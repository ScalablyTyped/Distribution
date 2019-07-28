package typings.atBlueprintjsCore.libEsmComponentsPortalPortalMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalProps extends IProps {
  /**
    * The HTML element that children will be mounted to.
    * @default document.body
    */
  var container: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Callback invoked when the children of this `Portal` have been added to the DOM.
    */
  var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IPortalProps {
  @scala.inline
  def apply(className: String = null, container: HTMLElement = null, onChildrenMount: () => Unit = null): IPortalProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container)
    if (onChildrenMount != null) __obj.updateDynamic("onChildrenMount")(js.Any.fromFunction0(onChildrenMount))
    __obj.asInstanceOf[IPortalProps]
  }
}

