package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotSchedule extends StObject {
  
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
  implicit class SnapshotScheduleMutableBuilder[Self <: SnapshotSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedClusterCount(value: IntegerOptional): Self = StObject.set(x, "AssociatedClusterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedClusterCountUndefined: Self = StObject.set(x, "AssociatedClusterCount", js.undefined)
    
    @scala.inline
    def setAssociatedClusters(value: AssociatedClusterList): Self = StObject.set(x, "AssociatedClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedClustersUndefined: Self = StObject.set(x, "AssociatedClusters", js.undefined)
    
    @scala.inline
    def setAssociatedClustersVarargs(value: ClusterAssociatedToSchedule*): Self = StObject.set(x, "AssociatedClusters", js.Array(value :_*))
    
    @scala.inline
    def setNextInvocations(value: ScheduledSnapshotTimeList): Self = StObject.set(x, "NextInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextInvocationsUndefined: Self = StObject.set(x, "NextInvocations", js.undefined)
    
    @scala.inline
    def setNextInvocationsVarargs(value: TStamp*): Self = StObject.set(x, "NextInvocations", js.Array(value :_*))
    
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = StObject.set(x, "ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleDefinitionsUndefined: Self = StObject.set(x, "ScheduleDefinitions", js.undefined)
    
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = StObject.set(x, "ScheduleDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setScheduleDescription(value: String): Self = StObject.set(x, "ScheduleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleDescriptionUndefined: Self = StObject.set(x, "ScheduleDescription", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleIdentifierUndefined: Self = StObject.set(x, "ScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
