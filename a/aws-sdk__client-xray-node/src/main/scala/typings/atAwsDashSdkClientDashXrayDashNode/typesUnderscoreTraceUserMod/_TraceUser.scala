package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceUserMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._ServiceId
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TraceUser extends js.Object {
  /**
    * <p>Services that the user's request hit.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[_ServiceId] | Iterable[_ServiceId]] = js.undefined
  /**
    * <p>The user's name.</p>
    */
  var UserName: js.UndefOr[String] = js.undefined
}

object _TraceUser {
  @scala.inline
  def apply(ServiceIds: js.Array[_ServiceId] | Iterable[_ServiceId] = null, UserName: String = null): _TraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[_TraceUser]
  }
}

