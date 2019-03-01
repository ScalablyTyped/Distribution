package typings
package atBlueprintjsCoreLib.libEsmComponentsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The HTML element that children will be mounted to.
    * @default document.body
    */
  var container: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
    * Callback invoked when the children of this `Portal` have been added to the DOM.
    */
  var onChildrenMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IPortalProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    container: reactLib.HTMLElement = null,
    onChildrenMount: js.Function0[scala.Unit] = null
  ): IPortalProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container)
    if (onChildrenMount != null) __obj.updateDynamic("onChildrenMount")(onChildrenMount)
    __obj.asInstanceOf[IPortalProps]
  }
}

