package typings
package atBlueprintjsCoreLib.libEsmComponentsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalState extends js.Object {
  var hasMounted: scala.Boolean
}

object IPortalState {
  @scala.inline
  def apply(hasMounted: scala.Boolean): IPortalState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasMounted")(hasMounted)
    __obj.asInstanceOf[IPortalState]
  }
}

