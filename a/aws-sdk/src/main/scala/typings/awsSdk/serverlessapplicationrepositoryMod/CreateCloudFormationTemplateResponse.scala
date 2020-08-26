package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFormationTemplateResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
  /**
    * The date and time this template expires. Templates
    expire 1 hour after creation.
    */
  var ExpirationTime: js.UndefOr[string] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  /**
    * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
    
    */
  var Status: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.Status] = js.native
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[string] = js.native
  /**
    * A link to the template that can be used to deploy the application using
    AWS CloudFormation.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}

object CreateCloudFormationTemplateResponse {
  @scala.inline
  def apply(): CreateCloudFormationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFormationTemplateResponse]
  }
  @scala.inline
  implicit class CreateCloudFormationTemplateResponseOps[Self <: CreateCloudFormationTemplateResponse] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCreationTime(value: string): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setExpirationTime(value: string): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemanticVersion: Self = this.set("SemanticVersion", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTemplateId(value: string): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
    @scala.inline
    def setTemplateUrl(value: string): Self = this.set("TemplateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("TemplateUrl", js.undefined)
  }
  
}

