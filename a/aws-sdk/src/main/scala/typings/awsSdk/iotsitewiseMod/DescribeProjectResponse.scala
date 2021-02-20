package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectResponse extends StObject {
  
  /**
    * The ID of the portal that the project is in.
    */
  var portalId: ID = js.native
  
  /**
    * The ARN of the project, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId} 
    */
  var projectArn: ARN = js.native
  
  /**
    * The date the project was created, in Unix epoch time.
    */
  var projectCreationDate: Timestamp = js.native
  
  /**
    * The project's description.
    */
  var projectDescription: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the project.
    */
  var projectId: ID = js.native
  
  /**
    * The date the project was last updated, in Unix epoch time.
    */
  var projectLastUpdateDate: Timestamp = js.native
  
  /**
    * The name of the project.
    */
  var projectName: Name = js.native
}
object DescribeProjectResponse {
  
  @scala.inline
  def apply(
    portalId: ID,
    projectArn: ARN,
    projectCreationDate: Timestamp,
    projectId: ID,
    projectLastUpdateDate: Timestamp,
    projectName: Name
  ): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any], projectCreationDate = projectCreationDate.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectLastUpdateDate = projectLastUpdateDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResponse]
  }
  
  @scala.inline
  implicit class DescribeProjectResponseMutableBuilder[Self <: DescribeProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: ARN): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectCreationDate(value: Timestamp): Self = StObject.set(x, "projectCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescription(value: Description): Self = StObject.set(x, "projectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescriptionUndefined: Self = StObject.set(x, "projectDescription", js.undefined)
    
    @scala.inline
    def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLastUpdateDate(value: Timestamp): Self = StObject.set(x, "projectLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: Name): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
