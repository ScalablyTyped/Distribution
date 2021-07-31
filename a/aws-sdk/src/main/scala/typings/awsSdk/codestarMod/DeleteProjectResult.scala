package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its resources.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
}
object DeleteProjectResult {
  
  @scala.inline
  def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  
  @scala.inline
  implicit class DeleteProjectResultMutableBuilder[Self <: DeleteProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArnUndefined: Self = StObject.set(x, "projectArn", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
  }
}
