package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    *  An array of arrays of WebhookFilter objects used to determine if a webhook event can trigger a build. A filter group must contain at least one EVENT WebhookFilter. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName = js.native
  /**
    *  A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you use Bitbucket for your repository, rotateSecret is ignored. 
    */
  var rotateSecret: js.UndefOr[Boolean] = js.native
}

object UpdateWebhookInput {
  @scala.inline
  def apply(
    projectName: ProjectName,
    branchFilter: String = null,
    filterGroups: FilterGroups = null,
    rotateSecret: js.UndefOr[Boolean] = js.undefined
  ): UpdateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateSecret)) __obj.updateDynamic("rotateSecret")(rotateSecret.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookInput]
  }
}

