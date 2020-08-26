package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSSHPublicKeysResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list of the SSH public keys assigned to IAM user.
    */
  var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.native
}

object ListSSHPublicKeysResponse {
  @scala.inline
  def apply(): ListSSHPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSSHPublicKeysResponse]
  }
  @scala.inline
  implicit class ListSSHPublicKeysResponseOps[Self <: ListSSHPublicKeysResponse] (val x: Self) extends AnyVal {
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
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setSSHPublicKeysVarargs(value: SSHPublicKeyMetadata*): Self = this.set("SSHPublicKeys", js.Array(value :_*))
    @scala.inline
    def setSSHPublicKeys(value: SSHPublicKeyListType): Self = this.set("SSHPublicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSHPublicKeys: Self = this.set("SSHPublicKeys", js.undefined)
  }
  
}

