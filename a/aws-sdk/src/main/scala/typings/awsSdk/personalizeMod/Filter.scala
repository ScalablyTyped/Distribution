package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The time at which the filter was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The ARN of the dataset group to which the filter belongs.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * If the filter failed, the reason for its failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The ARN of the filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  /**
    * Specifies the type of item interactions to filter out of recommendation results. The filter expression must follow the following format:  EXCLUDE itemId WHERE INTERACTIONS.event_type in ("EVENT_TYPE")  Where "EVENT_TYPE" is the type of event to filter out. For more information, see Using Filters with Amazon Personalize.
    */
  var filterExpression: js.UndefOr[FilterExpression] = js.native
  /**
    * The time at which the filter was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the filter.
    */
  var status: js.UndefOr[Status] = js.native
}

object Filter {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    datasetGroupArn: Arn = null,
    failureReason: FailureReason = null,
    filterArn: Arn = null,
    filterExpression: FilterExpression = null,
    lastUpdatedDateTime: Date = null,
    name: Name = null,
    status: Status = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (filterArn != null) __obj.updateDynamic("filterArn")(filterArn.asInstanceOf[js.Any])
    if (filterExpression != null) __obj.updateDynamic("filterExpression")(filterExpression.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

