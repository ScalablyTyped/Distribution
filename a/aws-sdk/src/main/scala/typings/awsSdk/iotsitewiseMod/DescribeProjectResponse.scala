package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectResponse extends js.Object {
  
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
  implicit class DescribeProjectResponseOps[Self <: DescribeProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: ARN): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectCreationDate(value: Timestamp): Self = this.set("projectCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: ID): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLastUpdateDate(value: Timestamp): Self = this.set("projectLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: Name): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDescription(value: Description): Self = this.set("projectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectDescription: Self = this.set("projectDescription", js.undefined)
  }
}
