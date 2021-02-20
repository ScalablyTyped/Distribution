package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectRequest extends StObject {
  
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName = js.native
}
object UpdateProjectRequest {
  
  @scala.inline
  def apply(projectName: ProjectName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectRequestMutableBuilder[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPlacementTemplate(value: PlacementTemplate): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTemplateUndefined: Self = StObject.set(x, "placementTemplate", js.undefined)
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
