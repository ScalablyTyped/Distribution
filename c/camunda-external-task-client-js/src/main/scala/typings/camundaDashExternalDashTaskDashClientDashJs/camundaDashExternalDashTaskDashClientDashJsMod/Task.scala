package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  // These are not guaranteed by package documentation, but are returned according to REST API docs
  var activityId: js.UndefOr[String] = js.undefined
  var activityInstanceId: js.UndefOr[String] = js.undefined
  var businessKey: js.UndefOr[String] = js.undefined
  var errorDetails: js.UndefOr[String] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var executionId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lockExpirationTime: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var processDefinitionId: js.UndefOr[String] = js.undefined
  var processDefinitionKey: js.UndefOr[String] = js.undefined
  var processInstanceId: js.UndefOr[String] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  var topicName: js.UndefOr[String] = js.undefined
  var variables: Variables
  var workerId: js.UndefOr[String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    variables: Variables,
    activityId: String = null,
    activityInstanceId: String = null,
    businessKey: String = null,
    errorDetails: String = null,
    errorMessage: String = null,
    executionId: String = null,
    id: String = null,
    lockExpirationTime: String = null,
    priority: Int | Double = null,
    processDefinitionId: String = null,
    processDefinitionKey: String = null,
    processInstanceId: String = null,
    retries: Int | Double = null,
    tenantId: String = null,
    topicName: String = null,
    workerId: String = null
  ): Task = {
    val __obj = js.Dynamic.literal(variables = variables)
    if (activityId != null) __obj.updateDynamic("activityId")(activityId)
    if (activityInstanceId != null) __obj.updateDynamic("activityInstanceId")(activityInstanceId)
    if (businessKey != null) __obj.updateDynamic("businessKey")(businessKey)
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (executionId != null) __obj.updateDynamic("executionId")(executionId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lockExpirationTime != null) __obj.updateDynamic("lockExpirationTime")(lockExpirationTime)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (processDefinitionId != null) __obj.updateDynamic("processDefinitionId")(processDefinitionId)
    if (processDefinitionKey != null) __obj.updateDynamic("processDefinitionKey")(processDefinitionKey)
    if (processInstanceId != null) __obj.updateDynamic("processInstanceId")(processInstanceId)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    if (workerId != null) __obj.updateDynamic("workerId")(workerId)
    __obj.asInstanceOf[Task]
  }
}

