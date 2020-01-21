package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditFindingsRequest extends js.Object {
  /**
    * A filter to limit results to the findings for the specified audit check.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.native
  /**
    * A filter to limit results to those found before the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information identifying the noncompliant resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  /**
    * A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * A filter to limit results to the audit with the specified ID. You must specify either the taskId or the startTime and endTime, but not both.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
}

object ListAuditFindingsRequest {
  @scala.inline
  def apply(
    checkName: AuditCheckName = null,
    endTime: Timestamp = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    resourceIdentifier: ResourceIdentifier = null,
    startTime: Timestamp = null,
    taskId: AuditTaskId = null
  ): ListAuditFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (checkName != null) __obj.updateDynamic("checkName")(checkName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditFindingsRequest]
  }
}

