package typings.blueprintjsCore.portalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalState extends js.Object {
  var hasMounted: Boolean
}

object IPortalState {
  @scala.inline
  def apply(hasMounted: Boolean): IPortalState = {
    val __obj = js.Dynamic.literal(hasMounted = hasMounted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPortalState]
  }
}

