package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobScheduleInfo extends StObject {
  
  var activeEndDate: String = js.native
  
  var activeEndTimeOfDay: String = js.native
  
  var activeStartDate: String = js.native
  
  var activeStartTimeOfDay: String = js.native
  
  var dateCreated: String = js.native
  
  var description: String = js.native
  
  var frequencyInterval: Double = js.native
  
  var frequencyRecurrenceFactor: Double = js.native
  
  var frequencyRelativeIntervals: FrequencyRelativeIntervals = js.native
  
  var frequencySubDayInterval: Double = js.native
  
  var frequencySubDayTypes: FrequencySubDayTypes = js.native
  
  var frequencyTypes: FrequencyTypes = js.native
  
  var id: Double = js.native
  
  var isEnabled: Boolean = js.native
  
  var jobCount: Double = js.native
  
  var jobName: String = js.native
  
  var name: String = js.native
  
  var scheduleUid: String = js.native
}
object AgentJobScheduleInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AgentJobScheduleInfoMutableBuilder[Self <: AgentJobScheduleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveEndDate(value: String): Self = StObject.set(x, "activeEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveEndTimeOfDay(value: String): Self = StObject.set(x, "activeEndTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStartDate(value: String): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStartTimeOfDay(value: String): Self = StObject.set(x, "activeStartTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyInterval(value: Double): Self = StObject.set(x, "frequencyInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyRecurrenceFactor(value: Double): Self = StObject.set(x, "frequencyRecurrenceFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyRelativeIntervals(value: FrequencyRelativeIntervals): Self = StObject.set(x, "frequencyRelativeIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencySubDayInterval(value: Double): Self = StObject.set(x, "frequencySubDayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencySubDayTypes(value: FrequencySubDayTypes): Self = StObject.set(x, "frequencySubDayTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyTypes(value: FrequencyTypes): Self = StObject.set(x, "frequencyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCount(value: Double): Self = StObject.set(x, "jobCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUid(value: String): Self = StObject.set(x, "scheduleUid", value.asInstanceOf[js.Any])
  }
}
