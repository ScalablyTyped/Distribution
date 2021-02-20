package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDescription extends StObject {
  
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.native
  
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: Time = js.native
  
  /**
    * The description of the project.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * An object describing the project's placement specifications.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  
  /**
    * The name of the project for which to obtain information from.
    */
  var projectName: ProjectName = js.native
  
  /**
    * The tags (metadata key/value pairs) associated with the project.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time = js.native
}
object ProjectDescription {
  
  @scala.inline
  def apply(createdDate: Time, projectName: ProjectName, updatedDate: Time): ProjectDescription = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDescription]
  }
  
  @scala.inline
  implicit class ProjectDescriptionMutableBuilder[Self <: ProjectDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Time): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUpdatedDate(value: Time): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
  }
}
