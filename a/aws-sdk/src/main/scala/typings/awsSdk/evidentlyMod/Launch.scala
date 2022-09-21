package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Launch extends StObject {
  
  /**
    * The ARN of the launch.
    */
  var arn: LaunchArn
  
  /**
    * The date and time that the launch is created.
    */
  var createdTime: js.Date
  
  /**
    * The description of the launch.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A structure that contains information about the start and end times of the launch.
    */
  var execution: js.UndefOr[LaunchExecution] = js.undefined
  
  /**
    * An array of structures that define the feature variations that are being used in the launch.
    */
  var groups: js.UndefOr[LaunchGroupList] = js.undefined
  
  /**
    * The date and time that the launch was most recently updated.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * An array of structures that define the metrics that are being used to monitor the launch performance.
    */
  var metricMonitors: js.UndefOr[MetricMonitorList] = js.undefined
  
  /**
    * The name of the launch.
    */
  var name: LaunchName
  
  /**
    * The name or ARN of the project that contains the launch.
    */
  var project: js.UndefOr[ProjectRef] = js.undefined
  
  /**
    * This value is used when Evidently assigns a particular user session to the launch, to help create a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * An array of structures that define the traffic allocation percentages among the feature variations during each step of the launch.
    */
  var scheduledSplitsDefinition: js.UndefOr[ScheduledSplitsLaunchDefinition] = js.undefined
  
  /**
    * The current state of the launch.
    */
  var status: LaunchStatus
  
  /**
    * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain why it was stopped.
    */
  var statusReason: js.UndefOr[Description] = js.undefined
  
  /**
    * The list of tag keys and values associated with this launch.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of launch.
    */
  var `type`: LaunchType
}
object Launch {
  
  inline def apply(
    arn: LaunchArn,
    createdTime: js.Date,
    lastUpdatedTime: js.Date,
    name: LaunchName,
    status: LaunchStatus,
    `type`: LaunchType
  ): Launch = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Launch]
  }
  
  extension [Self <: Launch](x: Self) {
    
    inline def setArn(value: LaunchArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExecution(value: LaunchExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setGroups(value: LaunchGroupList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: LaunchGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setMetricMonitors(value: MetricMonitorList): Self = StObject.set(x, "metricMonitors", value.asInstanceOf[js.Any])
    
    inline def setMetricMonitorsUndefined: Self = StObject.set(x, "metricMonitors", js.undefined)
    
    inline def setMetricMonitorsVarargs(value: MetricMonitor*): Self = StObject.set(x, "metricMonitors", js.Array(value*))
    
    inline def setName(value: LaunchName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setScheduledSplitsDefinition(value: ScheduledSplitsLaunchDefinition): Self = StObject.set(x, "scheduledSplitsDefinition", value.asInstanceOf[js.Any])
    
    inline def setScheduledSplitsDefinitionUndefined: Self = StObject.set(x, "scheduledSplitsDefinition", js.undefined)
    
    inline def setStatus(value: LaunchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: Description): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: LaunchType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
