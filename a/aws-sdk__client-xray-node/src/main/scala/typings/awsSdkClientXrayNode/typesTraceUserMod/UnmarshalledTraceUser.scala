package typings.awsSdkClientXrayNode.typesTraceUserMod

import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTraceUser extends TraceUser {
  /**
    * <p>Services that the user's request hit.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceUser: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
}

object UnmarshalledTraceUser {
  @scala.inline
  def apply(ServiceIds: js.Array[UnmarshalledServiceId] = null, UserName: String = null): UnmarshalledTraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTraceUser]
  }
}

