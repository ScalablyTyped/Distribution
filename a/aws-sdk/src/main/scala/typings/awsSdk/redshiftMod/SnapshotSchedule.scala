package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSchedule extends js.Object {
  /**
    * The number of clusters associated with the schedule.
    */
  var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
    */
  var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.native
  /**
    * 
    */
  var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.native
  /**
    * A list of ScheduleDefinitions.
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  /**
    * The description of the schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional set of tags describing the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SnapshotSchedule {
  @scala.inline
  def apply(): SnapshotSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotSchedule]
  }
  @scala.inline
  implicit class SnapshotScheduleOps[Self <: SnapshotSchedule] (val x: Self) extends AnyVal {
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
    def setAssociatedClusterCount(value: IntegerOptional): Self = this.set("AssociatedClusterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedClusterCount: Self = this.set("AssociatedClusterCount", js.undefined)
    @scala.inline
    def setAssociatedClustersVarargs(value: ClusterAssociatedToSchedule*): Self = this.set("AssociatedClusters", js.Array(value :_*))
    @scala.inline
    def setAssociatedClusters(value: AssociatedClusterList): Self = this.set("AssociatedClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedClusters: Self = this.set("AssociatedClusters", js.undefined)
    @scala.inline
    def setNextInvocationsVarargs(value: TStamp*): Self = this.set("NextInvocations", js.Array(value :_*))
    @scala.inline
    def setNextInvocations(value: ScheduledSnapshotTimeList): Self = this.set("NextInvocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextInvocations: Self = this.set("NextInvocations", js.undefined)
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = this.set("ScheduleDefinitions", js.Array(value :_*))
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = this.set("ScheduleDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleDefinitions: Self = this.set("ScheduleDefinitions", js.undefined)
    @scala.inline
    def setScheduleDescription(value: String): Self = this.set("ScheduleDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleDescription: Self = this.set("ScheduleDescription", js.undefined)
    @scala.inline
    def setScheduleIdentifier(value: String): Self = this.set("ScheduleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleIdentifier: Self = this.set("ScheduleIdentifier", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

