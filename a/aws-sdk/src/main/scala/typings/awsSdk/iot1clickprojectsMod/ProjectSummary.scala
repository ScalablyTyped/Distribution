package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSummary extends StObject {
  
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: Time
  
  /**
    * The name of the project being summarized.
    */
  var projectName: ProjectName
  
  /**
    * The tags (metadata key/value pairs) associated with the project.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time
}
object ProjectSummary {
  
  @scala.inline
  def apply(createdDate: Time, projectName: ProjectName, updatedDate: Time): ProjectSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
  
  @scala.inline
  implicit class ProjectSummaryMutableBuilder[Self <: ProjectSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Time): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
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
