package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.native
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The date and time the project was created, in timestamp format.
    */
  var createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.native
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The ID of the project.
    */
  var id: js.UndefOr[ProjectId] = js.native
  /**
    * The display name for the project.
    */
  var name: js.UndefOr[ProjectName] = js.native
  /**
    * The ID for the AWS CodeStar project template used to create the project.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
  /**
    * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
    */
  var stackId: js.UndefOr[StackId] = js.native
  /**
    * The project creation or deletion status.
    */
  var status: js.UndefOr[ProjectStatus] = js.native
}

object DescribeProjectResult {
  @scala.inline
  def apply(
    arn: ProjectArn = null,
    clientRequestToken: ClientRequestToken = null,
    createdTimeStamp: CreatedTimestamp = null,
    description: ProjectDescription = null,
    id: ProjectId = null,
    name: ProjectName = null,
    projectTemplateId: ProjectTemplateId = null,
    stackId: StackId = null,
    status: ProjectStatus = null
  ): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (createdTimeStamp != null) __obj.updateDynamic("createdTimeStamp")(createdTimeStamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectTemplateId != null) __obj.updateDynamic("projectTemplateId")(projectTemplateId.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResult]
  }
}

