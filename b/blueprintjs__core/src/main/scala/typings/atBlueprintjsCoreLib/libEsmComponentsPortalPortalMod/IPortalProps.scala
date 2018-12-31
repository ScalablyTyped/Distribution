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

