package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSummary extends StObject {
  
  /**
    * The time that the project was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: typings.awsSdk.sagemakerMod.ProjectArn
  
  /**
    * The description of the project.
    */
  var ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The ID of the project.
    */
  var ProjectId: typings.awsSdk.sagemakerMod.ProjectId
  
  /**
    * The name of the project.
    */
  var ProjectName: ProjectEntityName
  
  /**
    * The status of the project.
    */
  var ProjectStatus: typings.awsSdk.sagemakerMod.ProjectStatus
}
object ProjectSummary {
  
  inline def apply(
    CreationTime: js.Date,
    ProjectArn: ProjectArn,
    ProjectId: ProjectId,
    ProjectName: ProjectEntityName,
    ProjectStatus: ProjectStatus
  ): ProjectSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any], ProjectId = ProjectId.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any], ProjectStatus = ProjectStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
  
  extension [Self <: ProjectSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectDescription(value: EntityDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "ProjectId", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectStatus(value: ProjectStatus): Self = StObject.set(x, "ProjectStatus", value.asInstanceOf[js.Any])
  }
}
