package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAggregatedAssociationOverview extends js.Object {
  /**
    * Detailed status information about the aggregated associations.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The number of associations for the instance(s).
    */
  var InstanceAssociationStatusAggregatedCount: js.UndefOr[typings.awsSdk.ssmMod.InstanceAssociationStatusAggregatedCount] = js.native
}

object InstanceAggregatedAssociationOverview {
  @scala.inline
  def apply(): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
  @scala.inline
  implicit class InstanceAggregatedAssociationOverviewOps[Self <: InstanceAggregatedAssociationOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = this.set("DetailedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedStatus: Self = this.set("DetailedStatus", js.undefined)
    @scala.inline
    def setInstanceAssociationStatusAggregatedCount(value: InstanceAssociationStatusAggregatedCount): Self = this.set("InstanceAssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceAssociationStatusAggregatedCount: Self = this.set("InstanceAssociationStatusAggregatedCount", js.undefined)
  }
  
}

