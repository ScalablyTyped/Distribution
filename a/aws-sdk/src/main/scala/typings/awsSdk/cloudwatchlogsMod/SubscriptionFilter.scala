package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionFilter extends js.Object {
  /**
    * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var destinationArn: js.UndefOr[DestinationArn] = js.native
  var distribution: js.UndefOr[Distribution] = js.native
  /**
    * The name of the subscription filter.
    */
  var filterName: js.UndefOr[FilterName] = js.native
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * 
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object SubscriptionFilter {
  @scala.inline
  def apply(
    creationTime: Int | Double = null,
    destinationArn: DestinationArn = null,
    distribution: Distribution = null,
    filterName: FilterName = null,
    filterPattern: FilterPattern = null,
    logGroupName: LogGroupName = null,
    roleArn: RoleArn = null
  ): SubscriptionFilter = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (destinationArn != null) __obj.updateDynamic("destinationArn")(destinationArn.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (filterName != null) __obj.updateDynamic("filterName")(filterName.asInstanceOf[js.Any])
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionFilter]
  }
}

