package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoleTagsResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can use the Marker request parameter to make a subsequent pagination request that retrieves more items. Note that IAM might return fewer than the MaxItems number of results even when more results are available. Check IsTruncated after every call to ensure that you receive all of your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value. If no tags are attached to the specified role, the response contains an empty list.
    */
  var Tags: tagListType = js.native
}

object ListRoleTagsResponse {
  @scala.inline
  def apply(
    Tags: tagListType,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null
  ): ListRoleTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoleTagsResponse]
  }
}

