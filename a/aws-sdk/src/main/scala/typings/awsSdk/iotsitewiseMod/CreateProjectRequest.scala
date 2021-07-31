package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the portal in which to create the project.
    */
  var portalId: ID
  
  /**
    * A description for the project.
    */
  var projectDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A friendly name for the project.
    */
  var projectName: Name
  
  /**
    * A list of key-value pairs that contain metadata for the project. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(portalId: ID, projectName: Name): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescription(value: Description): Self = StObject.set(x, "projectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescriptionUndefined: Self = StObject.set(x, "projectDescription", js.undefined)
    
    @scala.inline
    def setProjectName(value: Name): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
