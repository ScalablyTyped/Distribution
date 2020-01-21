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
  def apply(
    entityUrlTemplate: UrlTemplate = null,
    executionUrlTemplate: UrlTemplate = null,
    revisionUrlTemplate: UrlTemplate = null,
    thirdPartyConfigurationUrl: Url = null
  ): ActionTypeSettings = {
    val __obj = js.Dynamic.literal()
    if (entityUrlTemplate != null) __obj.updateDynamic("entityUrlTemplate")(entityUrlTemplate.asInstanceOf[js.Any])
    if (executionUrlTemplate != null) __obj.updateDynamic("executionUrlTemplate")(executionUrlTemplate.asInstanceOf[js.Any])
    if (revisionUrlTemplate != null) __obj.updateDynamic("revisionUrlTemplate")(revisionUrlTemplate.asInstanceOf[js.Any])
    if (thirdPartyConfigurationUrl != null) __obj.updateDynamic("thirdPartyConfigurationUrl")(thirdPartyConfigurationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeSettings]
  }
}

