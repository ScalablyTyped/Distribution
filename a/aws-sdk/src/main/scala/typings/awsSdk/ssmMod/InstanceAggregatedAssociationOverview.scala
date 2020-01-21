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
  def apply(
    DetailedStatus: StatusName = null,
    InstanceAssociationStatusAggregatedCount: InstanceAssociationStatusAggregatedCount = null
  ): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    if (InstanceAssociationStatusAggregatedCount != null) __obj.updateDynamic("InstanceAssociationStatusAggregatedCount")(InstanceAssociationStatusAggregatedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
}

