package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResponse extends StObject {
  
  /**
    * The ID of the portal that the project is in.
    */
  var portalId: ID
  
  /**
    * The ARN of the project, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId} 
    */
  var projectArn: ARN
  
  /**
    * The date the project was created, in Unix epoch time.
    */
  var projectCreationDate: Timestamp
  
  /**
    * The project's description.
    */
  var projectDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the project.
    */
  var projectId: ID
  
  /**
    * The date the project was last updated, in Unix epoch time.
    */
  var projectLastUpdateDate: Timestamp
  
  /**
    * The name of the project.
    */
  var projectName: Name
}
object DescribeProjectResponse {
  
  inline def apply(
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
  
  extension [Self <: DescribeProjectResponse](x: Self) {
    
    inline def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: ARN): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectCreationDate(value: Timestamp): Self = StObject.set(x, "projectCreationDate", value.asInstanceOf[js.Any])
    
    inline def setProjectDescription(value: Description): Self = StObject.set(x, "projectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "projectDescription", js.undefined)
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectLastUpdateDate(value: Timestamp): Self = StObject.set(x, "projectLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: Name): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
