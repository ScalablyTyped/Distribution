package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The unique ID of the detector the member is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.guarddutyMod.MaxResults] = js.native
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the list action. For subsequent calls to the action, fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Specifies what member accounts the response includes based on their relationship status with the master account. The default value is "true". If set to "false" the response includes all existing member accounts (including members who haven't been invited yet or have been disassociated).
    */
  var OnlyAssociated: js.UndefOr[String] = js.native
}

object ListMembersRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    OnlyAssociated: String = null
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OnlyAssociated != null) __obj.updateDynamic("OnlyAssociated")(OnlyAssociated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
}

