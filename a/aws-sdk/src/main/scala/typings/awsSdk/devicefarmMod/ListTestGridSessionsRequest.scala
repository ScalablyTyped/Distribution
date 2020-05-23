package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionsRequest extends js.Object {
  /**
    * Return only sessions created after this time.
    */
  var creationTimeAfter: js.UndefOr[DateTime] = js.native
  /**
    * Return only sessions created before this time.
    */
  var creationTimeBefore: js.UndefOr[DateTime] = js.native
  /**
    * Return only sessions that ended after this time.
    */
  var endTimeAfter: js.UndefOr[DateTime] = js.native
  /**
    * Return only sessions that ended before this time.
    */
  var endTimeBefore: js.UndefOr[DateTime] = js.native
  /**
    * Return only this many results at a time.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * ARN of a TestGridProject.
    */
  var projectArn: DeviceFarmArn = js.native
  /**
    * Return only sessions in this state.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}

object ListTestGridSessionsRequest {
  @scala.inline
  def apply(
    projectArn: DeviceFarmArn,
    creationTimeAfter: DateTime = null,
    creationTimeBefore: DateTime = null,
    endTimeAfter: DateTime = null,
    endTimeBefore: DateTime = null,
    maxResult: js.UndefOr[MaxPageSize] = js.undefined,
    nextToken: PaginationToken = null,
    status: TestGridSessionStatus = null
  ): ListTestGridSessionsRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    if (creationTimeAfter != null) __obj.updateDynamic("creationTimeAfter")(creationTimeAfter.asInstanceOf[js.Any])
    if (creationTimeBefore != null) __obj.updateDynamic("creationTimeBefore")(creationTimeBefore.asInstanceOf[js.Any])
    if (endTimeAfter != null) __obj.updateDynamic("endTimeAfter")(endTimeAfter.asInstanceOf[js.Any])
    if (endTimeBefore != null) __obj.updateDynamic("endTimeBefore")(endTimeBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResult)) __obj.updateDynamic("maxResult")(maxResult.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionsRequest]
  }
}

