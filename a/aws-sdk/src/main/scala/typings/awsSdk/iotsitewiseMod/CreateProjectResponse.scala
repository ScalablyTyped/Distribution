package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResponse extends js.Object {
  /**
    * The ARN of the project, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId} 
    */
  var projectArn: ARN = js.native
  /**
    * The ID of the project.
    */
  var projectId: ID = js.native
}

object CreateProjectResponse {
  @scala.inline
  def apply(projectArn: ARN, projectId: ID): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
}

