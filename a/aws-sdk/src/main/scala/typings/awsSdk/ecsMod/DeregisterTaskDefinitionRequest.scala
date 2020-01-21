package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskDefinitionRequest extends js.Object {
  /**
    * The family and revision (family:revision) or full Amazon Resource Name (ARN) of the task definition to deregister. You must specify a revision.
    */
  var taskDefinition: String = js.native
}

object DeregisterTaskDefinitionRequest {
  @scala.inline
  def apply(taskDefinition: String): DeregisterTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterTaskDefinitionRequest]
  }
}

