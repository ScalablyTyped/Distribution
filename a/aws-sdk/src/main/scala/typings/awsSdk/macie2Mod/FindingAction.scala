package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingAction extends js.Object {
  /**
    * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates that an entity invoked an API operation for the resource.
    */
  var actionType: js.UndefOr[FindingActionType] = js.native
  /**
    * For the affected resource: The name of the operation that was invoked most recently and produced the finding (api). The first date and time when any operation was invoked and produced the finding (firstSeen). The most recent date and time when the specified operation was invoked and produced the finding (lastSeen). All date and time values are in UTC and extended ISO 8601 format.
    */
  var apiCallDetails: js.UndefOr[ApiCallDetails] = js.native
}

object FindingAction {
  @scala.inline
  def apply(actionType: FindingActionType = null, apiCallDetails: ApiCallDetails = null): FindingAction = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (apiCallDetails != null) __obj.updateDynamic("apiCallDetails")(apiCallDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingAction]
  }
}

