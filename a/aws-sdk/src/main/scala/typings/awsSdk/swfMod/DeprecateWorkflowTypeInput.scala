package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain in which the workflow type is registered.
    */
  var domain: DomainName = js.native
  /**
    * The workflow type to deprecate.
    */
  var workflowType: WorkflowType = js.native
}

object DeprecateWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): DeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateWorkflowTypeInput]
  }
  @scala.inline
  implicit class DeprecateWorkflowTypeInputOps[Self <: DeprecateWorkflowTypeInput] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
  }
  
}

