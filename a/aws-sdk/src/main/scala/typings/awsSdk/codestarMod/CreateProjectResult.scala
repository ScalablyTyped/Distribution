package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn = js.native
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The ID of the project.
    */
  var id: ProjectId = js.native
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
}

object CreateProjectResult {
  @scala.inline
  def apply(arn: ProjectArn, id: ProjectId): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
  @scala.inline
  implicit class CreateProjectResultOps[Self <: CreateProjectResult] (val x: Self) extends AnyVal {
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
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setProjectTemplateId(value: ProjectTemplateId): Self = this.set("projectTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectTemplateId: Self = this.set("projectTemplateId", js.undefined)
  }
  
}

