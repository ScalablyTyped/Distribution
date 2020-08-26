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
  def apply(): SubscriptionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionFilter]
  }
  @scala.inline
  implicit class SubscriptionFilterOps[Self <: SubscriptionFilter] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDestinationArn(value: DestinationArn): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationArn: Self = this.set("destinationArn", js.undefined)
    @scala.inline
    def setDistribution(value: Distribution): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setFilterName(value: FilterName): Self = this.set("filterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterName: Self = this.set("filterName", js.undefined)
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPattern: Self = this.set("filterPattern", js.undefined)
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

