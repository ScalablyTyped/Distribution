package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedUserPoliciesResponse extends js.Object {
  /**
    * A list of the attached policies.
    */
  var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
}

object ListAttachedUserPoliciesResponse {
  @scala.inline
  def apply(): ListAttachedUserPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachedUserPoliciesResponse]
  }
  @scala.inline
  implicit class ListAttachedUserPoliciesResponseOps[Self <: ListAttachedUserPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setAttachedPoliciesVarargs(value: AttachedPolicy*): Self = this.set("AttachedPolicies", js.Array(value :_*))
    @scala.inline
    def setAttachedPolicies(value: attachedPoliciesListType): Self = this.set("AttachedPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedPolicies: Self = this.set("AttachedPolicies", js.undefined)
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

