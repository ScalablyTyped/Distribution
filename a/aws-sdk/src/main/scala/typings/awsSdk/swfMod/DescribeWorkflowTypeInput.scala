package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain in which this workflow type is registered.
    */
  var domain: DomainName = js.native
  /**
    * The workflow type to describe.
    */
  var workflowType: WorkflowType = js.native
}

object DescribeWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): DescribeWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowTypeInput]
  }
}

