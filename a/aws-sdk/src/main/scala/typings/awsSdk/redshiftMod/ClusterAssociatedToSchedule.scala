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
  def apply(): ClusterAssociatedToSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAssociatedToSchedule]
  }
  @scala.inline
  implicit class ClusterAssociatedToScheduleOps[Self <: ClusterAssociatedToSchedule] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setScheduleAssociationState(value: ScheduleState): Self = this.set("ScheduleAssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleAssociationState: Self = this.set("ScheduleAssociationState", js.undefined)
  }
  
}

