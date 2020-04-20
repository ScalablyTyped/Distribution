package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobScheduleInfo extends js.Object {
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
}

