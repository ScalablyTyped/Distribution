package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobScheduleInfo extends js.Object {
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
  implicit class AgentJobScheduleInfoOps[Self <: AgentJobScheduleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveEndDate(value: String): Self = this.set("activeEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveEndTimeOfDay(value: String): Self = this.set("activeEndTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveStartDate(value: String): Self = this.set("activeStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveStartTimeOfDay(value: String): Self = this.set("activeStartTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreated(value: String): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencyInterval(value: Double): Self = this.set("frequencyInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencyRecurrenceFactor(value: Double): Self = this.set("frequencyRecurrenceFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencyRelativeIntervals(value: FrequencyRelativeIntervals): Self = this.set("frequencyRelativeIntervals", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencySubDayInterval(value: Double): Self = this.set("frequencySubDayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencySubDayTypes(value: FrequencySubDayTypes): Self = this.set("frequencySubDayTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequencyTypes(value: FrequencyTypes): Self = this.set("frequencyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobCount(value: Double): Self = this.set("jobCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleUid(value: String): Self = this.set("scheduleUid", value.asInstanceOf[js.Any])
  }
  
}

