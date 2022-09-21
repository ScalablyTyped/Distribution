package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSchedule extends StObject {
  
  /**
    * The number of clusters associated with the schedule.
    */
  var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
    */
  var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.undefined
  
  /**
    * 
    */
  var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined
  
  /**
    * A list of ScheduleDefinitions.
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
  
  /**
    * The description of the schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * An optional set of tags describing the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object SnapshotSchedule {
  
  inline def apply(): SnapshotSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotSchedule]
  }
  
  extension [Self <: SnapshotSchedule](x: Self) {
    
    inline def setAssociatedClusterCount(value: IntegerOptional): Self = StObject.set(x, "AssociatedClusterCount", value.asInstanceOf[js.Any])
    
    inline def setAssociatedClusterCountUndefined: Self = StObject.set(x, "AssociatedClusterCount", js.undefined)
    
    inline def setAssociatedClusters(value: AssociatedClusterList): Self = StObject.set(x, "AssociatedClusters", value.asInstanceOf[js.Any])
    
    inline def setAssociatedClustersUndefined: Self = StObject.set(x, "AssociatedClusters", js.undefined)
    
    inline def setAssociatedClustersVarargs(value: ClusterAssociatedToSchedule*): Self = StObject.set(x, "AssociatedClusters", js.Array(value*))
    
    inline def setNextInvocations(value: ScheduledSnapshotTimeList): Self = StObject.set(x, "NextInvocations", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationsUndefined: Self = StObject.set(x, "NextInvocations", js.undefined)
    
    inline def setNextInvocationsVarargs(value: js.Date*): Self = StObject.set(x, "NextInvocations", js.Array(value*))
    
    inline def setScheduleDefinitions(value: ScheduleDefinitionList): Self = StObject.set(x, "ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setScheduleDefinitionsUndefined: Self = StObject.set(x, "ScheduleDefinitions", js.undefined)
    
    inline def setScheduleDefinitionsVarargs(value: String*): Self = StObject.set(x, "ScheduleDefinitions", js.Array(value*))
    
    inline def setScheduleDescription(value: String): Self = StObject.set(x, "ScheduleDescription", value.asInstanceOf[js.Any])
    
    inline def setScheduleDescriptionUndefined: Self = StObject.set(x, "ScheduleDescription", js.undefined)
    
    inline def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setScheduleIdentifierUndefined: Self = StObject.set(x, "ScheduleIdentifier", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
