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
}

