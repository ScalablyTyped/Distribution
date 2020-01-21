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
  def apply(
    ApplicationId: string = null,
    CreationTime: string = null,
    ExpirationTime: string = null,
    SemanticVersion: string = null,
    Status: Status = null,
    TemplateId: string = null,
    TemplateUrl: string = null
  ): CreateCloudFormationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationTemplateResponse]
  }
}

