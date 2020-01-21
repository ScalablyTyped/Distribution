package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupCertificateAuthorityRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object CreateGroupCertificateAuthorityRequest {
  @scala.inline
  def apply(GroupId: string, AmznClientToken: string = null): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
}

