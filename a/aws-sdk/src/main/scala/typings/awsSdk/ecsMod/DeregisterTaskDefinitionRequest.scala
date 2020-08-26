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
  @scala.inline
  implicit class DeregisterTaskDefinitionRequestOps[Self <: DeregisterTaskDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
  }
  
}

