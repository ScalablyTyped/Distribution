package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectRequest extends StObject {
  
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
}
object DeleteProjectRequest {
  
  @scala.inline
  def apply(projectId: ProjectId): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectRequestMutableBuilder[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
