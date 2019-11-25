package typings.azureDashArmDashResource.libPolicyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDefinitionReference extends js.Object {
  /**
    * Required if a parameter is used in policy rule.
    */
  var parameters: js.UndefOr[js.Any] = js.undefined
  /**
    * The ID of the policy definition or policy set definition.
    */
  var policyDefinitionId: js.UndefOr[String] = js.undefined
}

object PolicyDefinitionReference {
  @scala.inline
  def apply(parameters: js.Any = null, policyDefinitionId: String = null): PolicyDefinitionReference = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (policyDefinitionId != null) __obj.updateDynamic("policyDefinitionId")(policyDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDefinitionReference]
  }
}

