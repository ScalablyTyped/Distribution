package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceUser extends js.Object {
  /**
    * Services that the user's request hit.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.xrayMod.ServiceIds] = js.native
  /**
    * The user's name.
    */
  var UserName: js.UndefOr[String] = js.native
}

object TraceUser {
  @scala.inline
  def apply(ServiceIds: ServiceIds = null, UserName: String = null): TraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceUser]
  }
}

