package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCredentials extends js.Object {
  /**
    * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux instances, it is a private key (which must be saved as a .pem file) for use with SSH.
    */
  var Secret: js.UndefOr[NonEmptyString] = js.native
  /**
    * User login string.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}

object InstanceCredentials {
  @scala.inline
  def apply(Secret: NonEmptyString = null, UserName: NonEmptyString = null): InstanceCredentials = {
    val __obj = js.Dynamic.literal()
    if (Secret != null) __obj.updateDynamic("Secret")(Secret.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCredentials]
  }
}

