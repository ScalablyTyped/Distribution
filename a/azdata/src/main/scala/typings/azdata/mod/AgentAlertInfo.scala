package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentAlertInfo extends js.Object {
  var alertType: AlertType
  var categoryName: String
  var countResetDate: String
  var databaseName: String
  var delayBetweenResponses: Double
  var eventDescriptionKeyword: String
  var eventSource: String
  var hasNotification: Double
  var id: Double
  var includeEventDescription: NotifyMethods
  var isEnabled: Boolean
  var jobId: String
  var jobName: String
  var lastOccurrenceDate: String
  var lastResponseDate: String
  var messageId: Double
  var name: String
  var notificationMessage: String
  var occurrenceCount: Double
  var performanceCondition: String
  var severity: Double
  var wmiEventNamespace: String
  var wmiEventQuery: String
}

object AgentAlertInfo {
  @scala.inline
  def apply(
    alertType: AlertType,
    categoryName: String,
    countResetDate: String,
    databaseName: String,
    delayBetweenResponses: Double,
    eventDescriptionKeyword: String,
    eventSource: String,
    hasNotification: Double,
    id: Double,
    includeEventDescription: NotifyMethods,
    isEnabled: Boolean,
    jobId: String,
    jobName: String,
    lastOccurrenceDate: String,
    lastResponseDate: String,
    messageId: Double,
    name: String,
    notificationMessage: String,
    occurrenceCount: Double,
    performanceCondition: String,
    severity: Double,
    wmiEventNamespace: String,
    wmiEventQuery: String
  ): AgentAlertInfo = {
    val __obj = js.Dynamic.literal(alertType = alertType.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], countResetDate = countResetDate.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], delayBetweenResponses = delayBetweenResponses.asInstanceOf[js.Any], eventDescriptionKeyword = eventDescriptionKeyword.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], hasNotification = hasNotification.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeEventDescription = includeEventDescription.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lastOccurrenceDate = lastOccurrenceDate.asInstanceOf[js.Any], lastResponseDate = lastResponseDate.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationMessage = notificationMessage.asInstanceOf[js.Any], occurrenceCount = occurrenceCount.asInstanceOf[js.Any], performanceCondition = performanceCondition.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], wmiEventNamespace = wmiEventNamespace.asInstanceOf[js.Any], wmiEventQuery = wmiEventQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAlertInfo]
  }
}

