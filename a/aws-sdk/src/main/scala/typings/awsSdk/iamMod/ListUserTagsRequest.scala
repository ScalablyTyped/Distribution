package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserTagsRequest extends js.Object {
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.native
  /**
    * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the response. If additional items exist beyond the maximum that you specify, the IsTruncated response element is true. If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when more results are available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.native
  /**
    * The name of the IAM user whose tags you want to see. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType = js.native
}

object ListUserTagsRequest {
  @scala.inline
  def apply(UserName: existingUserNameType): ListUserTagsRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserTagsRequest]
  }
  @scala.inline
  implicit class ListUserTagsRequestOps[Self <: ListUserTagsRequest] (val x: Self) extends AnyVal {
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
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: markerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: maxItemsType): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
  
}

