package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTaskDefinitionResponse extends js.Object {
  
  /**
    * The full description of the deregistered task.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.native
}
object DeregisterTaskDefinitionResponse {
  
  @scala.inline
  def apply(): DeregisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTaskDefinitionResponse]
  }
  
  @scala.inline
  implicit class DeregisterTaskDefinitionResponseOps[Self <: DeregisterTaskDefinitionResponse] (val x: Self) extends AnyVal {
    
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
    def setTaskDefinition(value: TaskDefinition): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskDefinition: Self = this.set("taskDefinition", js.undefined)
  }
}
