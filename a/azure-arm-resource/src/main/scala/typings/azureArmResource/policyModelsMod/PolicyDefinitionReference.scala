package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDefinitionReference extends js.Object {
  /**
    * Required if a parameter is used in policy rule.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The ID of the policy definition or policy set definition.
    */
  var policyDefinitionId: js.UndefOr[String] = js.native
}

object PolicyDefinitionReference {
  @scala.inline
  def apply(): PolicyDefinitionReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDefinitionReference]
  }
  @scala.inline
  implicit class PolicyDefinitionReferenceOps[Self <: PolicyDefinitionReference] (val x: Self) extends AnyVal {
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
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPolicyDefinitionId(value: String): Self = this.set("policyDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDefinitionId: Self = this.set("policyDefinitionId", js.undefined)
  }
  
}

