package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryServiceAuthenticationRequest extends js.Object {
  /**
    * The ID of the Active Directory to be used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.native
}

object DirectoryServiceAuthenticationRequest {
  @scala.inline
  def apply(DirectoryId: String = null): DirectoryServiceAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryServiceAuthenticationRequest]
  }
}

