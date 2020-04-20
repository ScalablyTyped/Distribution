package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupCertificateAuthoritiesRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object ListGroupCertificateAuthoritiesRequest {
  @scala.inline
  def apply(GroupId: string): ListGroupCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesRequest]
  }
}

