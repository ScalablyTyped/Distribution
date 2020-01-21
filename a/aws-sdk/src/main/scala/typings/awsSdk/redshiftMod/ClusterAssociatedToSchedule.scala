package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterAssociatedToSchedule extends js.Object {
  /**
    * 
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * 
    */
  var ScheduleAssociationState: js.UndefOr[ScheduleState] = js.native
}

object ClusterAssociatedToSchedule {
  @scala.inline
  def apply(ClusterIdentifier: String = null, ScheduleAssociationState: ScheduleState = null): ClusterAssociatedToSchedule = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (ScheduleAssociationState != null) __obj.updateDynamic("ScheduleAssociationState")(ScheduleAssociationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAssociatedToSchedule]
  }
}

