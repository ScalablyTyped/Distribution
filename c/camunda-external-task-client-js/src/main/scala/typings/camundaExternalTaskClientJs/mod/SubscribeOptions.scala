package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  var businessKey: js.UndefOr[String] = js.native
  var lockDuration: js.UndefOr[Double] = js.native
  var processDefinitionId: js.UndefOr[String] = js.native
  var processDefinitionIdIn: js.UndefOr[String] = js.native
  var processDefinitionKey: js.UndefOr[String] = js.native
  var processDefinitionKeyIn: js.UndefOr[String] = js.native
  var processDefinitionVersionTag: js.UndefOr[String] = js.native
  var tenantIdIn: js.UndefOr[js.Array[String]] = js.native
  var variables: js.UndefOr[js.Array[_]] = js.native
  var withoutTenantId: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setBusinessKey(value: String): Self = this.set("businessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessKey: Self = this.set("businessKey", js.undefined)
    @scala.inline
    def setLockDuration(value: Double): Self = this.set("lockDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockDuration: Self = this.set("lockDuration", js.undefined)
    @scala.inline
    def setProcessDefinitionId(value: String): Self = this.set("processDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDefinitionId: Self = this.set("processDefinitionId", js.undefined)
    @scala.inline
    def setProcessDefinitionIdIn(value: String): Self = this.set("processDefinitionIdIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDefinitionIdIn: Self = this.set("processDefinitionIdIn", js.undefined)
    @scala.inline
    def setProcessDefinitionKey(value: String): Self = this.set("processDefinitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDefinitionKey: Self = this.set("processDefinitionKey", js.undefined)
    @scala.inline
    def setProcessDefinitionKeyIn(value: String): Self = this.set("processDefinitionKeyIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDefinitionKeyIn: Self = this.set("processDefinitionKeyIn", js.undefined)
    @scala.inline
    def setProcessDefinitionVersionTag(value: String): Self = this.set("processDefinitionVersionTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDefinitionVersionTag: Self = this.set("processDefinitionVersionTag", js.undefined)
    @scala.inline
    def setTenantIdInVarargs(value: String*): Self = this.set("tenantIdIn", js.Array(value :_*))
    @scala.inline
    def setTenantIdIn(value: js.Array[String]): Self = this.set("tenantIdIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantIdIn: Self = this.set("tenantIdIn", js.undefined)
    @scala.inline
    def setVariablesVarargs(value: js.Any*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[_]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
    @scala.inline
    def setWithoutTenantId(value: Boolean): Self = this.set("withoutTenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutTenantId: Self = this.set("withoutTenantId", js.undefined)
  }
  
}

