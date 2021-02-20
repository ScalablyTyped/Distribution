package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * A new description for the project.
    */
  var projectDescription: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the project to update.
    */
  var projectId: ID = js.native
  
  /**
    * A new friendly name for the project.
    */
  var projectName: Name = js.native
}
object UpdateProjectRequest {
  
  @scala.inline
  def apply(projectId: ID, projectName: Name): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectRequestMutableBuilder[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setProjectDescription(value: Description): Self = StObject.set(x, "projectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescriptionUndefined: Self = StObject.set(x, "projectDescription", js.undefined)
    
    @scala.inline
    def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: Name): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
