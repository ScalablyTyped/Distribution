package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    projectName: Name,
    projectDescription: Description = null
  ): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any], projectCreationDate = projectCreationDate.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectLastUpdateDate = projectLastUpdateDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    if (projectDescription != null) __obj.updateDynamic("projectDescription")(projectDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResponse]
  }
}

