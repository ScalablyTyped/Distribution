package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  var businessKey: js.UndefOr[String] = js.undefined
  var lockDuration: js.UndefOr[Double] = js.undefined
  var processDefinitionId: js.UndefOr[String] = js.undefined
  var processDefinitionIdIn: js.UndefOr[String] = js.undefined
  var processDefinitionKey: js.UndefOr[String] = js.undefined
  var processDefinitionKeyIn: js.UndefOr[String] = js.undefined
  var processDefinitionVersionTag: js.UndefOr[String] = js.undefined
  var tenantIdIn: js.UndefOr[js.Array[String]] = js.undefined
  var variables: js.UndefOr[js.Array[_]] = js.undefined
  var withoutTenantId: js.UndefOr[Boolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    businessKey: String = null,
    lockDuration: Int | Double = null,
    processDefinitionId: String = null,
    processDefinitionIdIn: String = null,
    processDefinitionKey: String = null,
    processDefinitionKeyIn: String = null,
    processDefinitionVersionTag: String = null,
    tenantIdIn: js.Array[String] = null,
    variables: js.Array[_] = null,
    withoutTenantId: js.UndefOr[Boolean] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (businessKey != null) __obj.updateDynamic("businessKey")(businessKey.asInstanceOf[js.Any])
    if (lockDuration != null) __obj.updateDynamic("lockDuration")(lockDuration.asInstanceOf[js.Any])
    if (processDefinitionId != null) __obj.updateDynamic("processDefinitionId")(processDefinitionId.asInstanceOf[js.Any])
    if (processDefinitionIdIn != null) __obj.updateDynamic("processDefinitionIdIn")(processDefinitionIdIn.asInstanceOf[js.Any])
    if (processDefinitionKey != null) __obj.updateDynamic("processDefinitionKey")(processDefinitionKey.asInstanceOf[js.Any])
    if (processDefinitionKeyIn != null) __obj.updateDynamic("processDefinitionKeyIn")(processDefinitionKeyIn.asInstanceOf[js.Any])
    if (processDefinitionVersionTag != null) __obj.updateDynamic("processDefinitionVersionTag")(processDefinitionVersionTag.asInstanceOf[js.Any])
    if (tenantIdIn != null) __obj.updateDynamic("tenantIdIn")(tenantIdIn.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutTenantId)) __obj.updateDynamic("withoutTenantId")(withoutTenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

