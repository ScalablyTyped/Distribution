package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTypeSettings extends js.Object {
  /**
    * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of the action display in the pipeline.
    */
  var entityUrlTemplate: js.UndefOr[UrlTemplate] = js.native
  /**
    * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the external system, such as the console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS CodePipeline console and provides a link to the execution entity of the external action.
    */
  var executionUrlTemplate: js.UndefOr[UrlTemplate] = js.native
  /**
    * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or change the configuration of the external action.
    */
  var revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.native
  /**
    * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of the action provided by that service.
    */
  var thirdPartyConfigurationUrl: js.UndefOr[Url] = js.native
}

object ActionTypeSettings {
  @scala.inline
  def apply(): ActionTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTypeSettings]
  }
  @scala.inline
  implicit class ActionTypeSettingsOps[Self <: ActionTypeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityUrlTemplate(value: UrlTemplate): Self = this.set("entityUrlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityUrlTemplate: Self = this.set("entityUrlTemplate", js.undefined)
    @scala.inline
    def setExecutionUrlTemplate(value: UrlTemplate): Self = this.set("executionUrlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionUrlTemplate: Self = this.set("executionUrlTemplate", js.undefined)
    @scala.inline
    def setRevisionUrlTemplate(value: UrlTemplate): Self = this.set("revisionUrlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionUrlTemplate: Self = this.set("revisionUrlTemplate", js.undefined)
    @scala.inline
    def setThirdPartyConfigurationUrl(value: Url): Self = this.set("thirdPartyConfigurationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyConfigurationUrl: Self = this.set("thirdPartyConfigurationUrl", js.undefined)
  }
  
}

