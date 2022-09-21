package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchRequest extends StObject {
  
  /**
    * An optional description for the launch.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An array of structures that contains the feature and variations that are to be used for the launch.
    */
  var groups: js.UndefOr[LaunchGroupConfigList] = js.undefined
  
  /**
    * The name of the launch that is to be updated.
    */
  var launch: LaunchName
  
  /**
    * An array of structures that define the metrics that will be used to monitor the launch performance.
    */
  var metricMonitors: js.UndefOr[MetricMonitorConfigList] = js.undefined
  
  /**
    * The name or ARN of the project that contains the launch that you want to update.
    */
  var project: ProjectRef
  
  /**
    * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the launch name as the randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * An array of structures that define the traffic allocation percentages among the feature variations during each step of the launch.
    */
  var scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig] = js.undefined
}
object UpdateLaunchRequest {
  
  inline def apply(launch: LaunchName, project: ProjectRef): UpdateLaunchRequest = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchRequest]
  }
  
  extension [Self <: UpdateLaunchRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroups(value: LaunchGroupConfigList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: LaunchGroupConfig*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setLaunch(value: LaunchName): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setMetricMonitors(value: MetricMonitorConfigList): Self = StObject.set(x, "metricMonitors", value.asInstanceOf[js.Any])
    
    inline def setMetricMonitorsUndefined: Self = StObject.set(x, "metricMonitors", js.undefined)
    
    inline def setMetricMonitorsVarargs(value: MetricMonitorConfig*): Self = StObject.set(x, "metricMonitors", js.Array(value*))
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setScheduledSplitsConfig(value: ScheduledSplitsLaunchConfig): Self = StObject.set(x, "scheduledSplitsConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduledSplitsConfigUndefined: Self = StObject.set(x, "scheduledSplitsConfig", js.undefined)
  }
}
