package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.native
  
  /**
    * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its resources.
    */
  var stackId: js.UndefOr[StackId] = js.native
}
object DeleteProjectResult {
  
  @scala.inline
  def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  
  @scala.inline
  implicit class DeleteProjectResultOps[Self <: DeleteProjectResult] (val x: Self) extends AnyVal {
    
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
    def setProjectArn(value: ProjectArn): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectArn: Self = this.set("projectArn", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = this.set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
  }
}
