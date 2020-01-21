package typings.awsSdkClientXrayNode.typesTraceUserMod

import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceUser extends js.Object {
  /**
    * <p>Services that the user's request hit.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.undefined
  /**
    * <p>The user's name.</p>
    */
  var UserName: js.UndefOr[String] = js.undefined
}

object TraceUser {
  @scala.inline
  def apply(ServiceIds: js.Array[ServiceId] | Iterable[ServiceId] = null, UserName: String = null): TraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceUser]
  }
}

