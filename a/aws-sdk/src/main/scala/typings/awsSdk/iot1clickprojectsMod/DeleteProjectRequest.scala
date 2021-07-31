package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectRequest extends StObject {
  
  /**
    * The name of the empty project to delete.
    */
  var projectName: ProjectName
}
object DeleteProjectRequest {
  
  @scala.inline
  def apply(projectName: ProjectName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectRequestMutableBuilder[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
