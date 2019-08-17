package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceUserMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTraceUser extends _TraceUser {
  /**
    * <p>Services that the user's request hit.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds__UnmarshalledTraceUser: js.UndefOr[js.Array[_UnmarshalledServiceId]] = js.undefined
}

object _UnmarshalledTraceUser {
  @scala.inline
  def apply(ServiceIds: js.Array[_UnmarshalledServiceId] = null, UserName: String = null): _UnmarshalledTraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[_UnmarshalledTraceUser]
  }
}

