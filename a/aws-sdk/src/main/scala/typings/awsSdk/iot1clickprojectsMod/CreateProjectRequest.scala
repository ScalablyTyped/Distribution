package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * An optional description for the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The schema defining the placement to be created. A placement template defines placement default attributes and device templates. You cannot add or remove device templates after the project has been created. However, you can update callbackOverrides for the device templates using the UpdateProject API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
  
  /**
    * The name of the project to create.
    */
  var projectName: ProjectName
  
  /**
    * Optional tags (metadata key/value pairs) to be associated with the project. For example, { {"key1": "value1", "key2": "value2"} }. For more information, see AWS Tagging Strategies.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateProjectRequest {
  
  inline def apply(projectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlacementTemplate(value: PlacementTemplate): Self = StObject.set(x, "placementTemplate", value.asInstanceOf[js.Any])
    
    inline def setPlacementTemplateUndefined: Self = StObject.set(x, "placementTemplate", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
