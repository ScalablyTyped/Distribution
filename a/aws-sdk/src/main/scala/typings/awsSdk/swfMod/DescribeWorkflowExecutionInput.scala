package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName = js.native
  /**
    * The workflow execution to describe.
    */
  var execution: WorkflowExecution = js.native
}

object DescribeWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, execution: WorkflowExecution): DescribeWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowExecutionInput]
  }
  @scala.inline
  implicit class DescribeWorkflowExecutionInputOps[Self <: DescribeWorkflowExecutionInput] (val x: Self) extends AnyVal {
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
    def setExecution(value: WorkflowExecution): Self = this.set("execution", value.asInstanceOf[js.Any])
  }
  
}

