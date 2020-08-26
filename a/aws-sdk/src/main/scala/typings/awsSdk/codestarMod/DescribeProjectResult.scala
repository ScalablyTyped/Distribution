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
  def apply(): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectResult]
  }
  @scala.inline
  implicit class DescribeProjectResultOps[Self <: DescribeProjectResult] (val x: Self) extends AnyVal {
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
    def setArn(value: ProjectArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setCreatedTimeStamp(value: CreatedTimestamp): Self = this.set("createdTimeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimeStamp: Self = this.set("createdTimeStamp", js.undefined)
    @scala.inline
    def setDescription(value: ProjectDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: ProjectName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProjectTemplateId(value: ProjectTemplateId): Self = this.set("projectTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectTemplateId: Self = this.set("projectTemplateId", js.undefined)
    @scala.inline
    def setStackId(value: StackId): Self = this.set("stackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
    @scala.inline
    def setStatus(value: ProjectStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

