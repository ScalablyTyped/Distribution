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
  def apply(): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
  @scala.inline
  implicit class ListGroupCertificateAuthoritiesResponseOps[Self <: ListGroupCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupCertificateAuthoritiesVarargs(value: GroupCertificateAuthorityProperties*): Self = this.set("GroupCertificateAuthorities", js.Array(value :_*))
    @scala.inline
    def setGroupCertificateAuthorities(value: listOfGroupCertificateAuthorityProperties): Self = this.set("GroupCertificateAuthorities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCertificateAuthorities: Self = this.set("GroupCertificateAuthorities", js.undefined)
  }
  
}

