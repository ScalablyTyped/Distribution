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
  def apply(
    UserName: existingUserNameType,
    Marker: markerType = null,
    MaxItems: js.UndefOr[maxItemsType] = js.undefined
  ): ListUserTagsRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserTagsRequest]
  }
}

