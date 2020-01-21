package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporaryCredential extends js.Object {
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The password.
    */
  var Password: js.UndefOr[String] = js.native
  /**
    * The user name.
    */
  var Username: js.UndefOr[String] = js.native
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be automatically logged out.
    */
  var ValidForInMinutes: js.UndefOr[Integer] = js.native
}

object TemporaryCredential {
  @scala.inline
  def apply(
    InstanceId: String = null,
    Password: String = null,
    Username: String = null,
    ValidForInMinutes: Int | scala.Double = null
  ): TemporaryCredential = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    if (ValidForInMinutes != null) __obj.updateDynamic("ValidForInMinutes")(ValidForInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryCredential]
  }
}

