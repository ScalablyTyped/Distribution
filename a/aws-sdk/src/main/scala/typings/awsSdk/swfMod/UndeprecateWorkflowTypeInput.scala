package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeprecateWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var domain: DomainName = js.native
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var workflowType: WorkflowType = js.native
}

object UndeprecateWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): UndeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UndeprecateWorkflowTypeInput]
  }
}

