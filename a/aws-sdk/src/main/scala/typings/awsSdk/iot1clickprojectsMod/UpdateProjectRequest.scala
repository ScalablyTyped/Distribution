package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectRequest extends StObject {
  
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
  
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName
}
object UpdateProjectRequest {
  
  inline def apply(projectName: ProjectName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  extension [Self <: UpdateProjectRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlacementTemplate(value: PlacementTemplate): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    inline def setPlacementTemplateUndefined: Self = StObject.set(x, "placementTemplate", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
