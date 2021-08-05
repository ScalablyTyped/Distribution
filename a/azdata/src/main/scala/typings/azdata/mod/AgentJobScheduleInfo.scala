package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobScheduleInfo extends StObject {
  
  var activeEndDate: String
  
  var activeEndTimeOfDay: String
  
  var activeStartDate: String
  
  var activeStartTimeOfDay: String
  
  var dateCreated: String
  
  var description: String
  
  var frequencyInterval: Double
  
  var frequencyRecurrenceFactor: Double
  
  var frequencyRelativeIntervals: FrequencyRelativeIntervals
  
  var frequencySubDayInterval: Double
  
  var frequencySubDayTypes: FrequencySubDayTypes
  
  var frequencyTypes: FrequencyTypes
  
  var id: Double
  
  var isEnabled: Boolean
  
  var jobCount: Double
  
  var jobName: String
  
  var name: String
  
  var scheduleUid: String
}
object AgentJobScheduleInfo {
  
  inline def apply(
    activeEndDate: String,
    activeEndTimeOfDay: String,
    activeStartDate: String,
    activeStartTimeOfDay: String,
    dateCreated: String,
    description: String,
    frequencyInterval: Double,
    frequencyRecurrenceFactor: Double,
    frequencyRelativeIntervals: FrequencyRelativeIntervals,
    frequencySubDayInterval: Double,
    frequencySubDayTypes: FrequencySubDayTypes,
    frequencyTypes: FrequencyTypes,
    id: Double,
    isEnabled: Boolean,
    jobCount: Double,
    jobName: String,
    name: String,
    scheduleUid: String
  ): AgentJobScheduleInfo = {
    val __obj = js.Dynamic.literal(activeEndDate = activeEndDate.asInstanceOf[js.Any], activeEndTimeOfDay = activeEndTimeOfDay.asInstanceOf[js.Any], activeStartDate = activeStartDate.asInstanceOf[js.Any], activeStartTimeOfDay = activeStartTimeOfDay.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], frequencyInterval = frequencyInterval.asInstanceOf[js.Any], frequencyRecurrenceFactor = frequencyRecurrenceFactor.asInstanceOf[js.Any], frequencyRelativeIntervals = frequencyRelativeIntervals.asInstanceOf[js.Any], frequencySubDayInterval = frequencySubDayInterval.asInstanceOf[js.Any], frequencySubDayTypes = frequencySubDayTypes.asInstanceOf[js.Any], frequencyTypes = frequencyTypes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], jobCount = jobCount.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scheduleUid = scheduleUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobScheduleInfo]
  }
  
  extension [Self <: AgentJobScheduleInfo](x: Self) {
    
    inline def setActiveEndDate(value: String): Self = StObject.set(x, "activeEndDate", value.asInstanceOf[js.Any])
    
    inline def setActiveEndTimeOfDay(value: String): Self = StObject.set(x, "activeEndTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setActiveStartDate(value: String): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setActiveStartTimeOfDay(value: String): Self = StObject.set(x, "activeStartTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFrequencyInterval(value: Double): Self = StObject.set(x, "frequencyInterval", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRecurrenceFactor(value: Double): Self = StObject.set(x, "frequencyRecurrenceFactor", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRelativeIntervals(value: FrequencyRelativeIntervals): Self = StObject.set(x, "frequencyRelativeIntervals", value.asInstanceOf[js.Any])
    
    inline def setFrequencySubDayInterval(value: Double): Self = StObject.set(x, "frequencySubDayInterval", value.asInstanceOf[js.Any])
    
    inline def setFrequencySubDayTypes(value: FrequencySubDayTypes): Self = StObject.set(x, "frequencySubDayTypes", value.asInstanceOf[js.Any])
    
    inline def setFrequencyTypes(value: FrequencyTypes): Self = StObject.set(x, "frequencyTypes", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setJobCount(value: Double): Self = StObject.set(x, "jobCount", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScheduleUid(value: String): Self = StObject.set(x, "scheduleUid", value.asInstanceOf[js.Any])
  }
}
