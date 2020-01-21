package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupCertificateAuthoritiesResponse extends js.Object {
  /**
    * A list of certificate authorities associated with the group.
    */
  var GroupCertificateAuthorities: js.UndefOr[listOfGroupCertificateAuthorityProperties] = js.native
}

object ListGroupCertificateAuthoritiesResponse {
  @scala.inline
  def apply(GroupCertificateAuthorities: listOfGroupCertificateAuthorityProperties = null): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorities != null) __obj.updateDynamic("GroupCertificateAuthorities")(GroupCertificateAuthorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
}

