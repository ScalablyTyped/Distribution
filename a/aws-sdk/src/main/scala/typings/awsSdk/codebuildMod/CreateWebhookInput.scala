package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.  It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    * Specifies the type of build this webhook will trigger.
    */
  var buildType: js.UndefOr[WebhookBuildType] = js.native
  /**
    * An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.  For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName = js.native
}

object CreateWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName): CreateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookInput]
  }
  @scala.inline
  implicit class CreateWebhookInputOps[Self <: CreateWebhookInput] (val x: Self) extends AnyVal {
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
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchFilter(value: String): Self = this.set("branchFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchFilter: Self = this.set("branchFilter", js.undefined)
    @scala.inline
    def setBuildType(value: WebhookBuildType): Self = this.set("buildType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildType: Self = this.set("buildType", js.undefined)
    @scala.inline
    def setFilterGroupsVarargs(value: FilterGroup*): Self = this.set("filterGroups", js.Array(value :_*))
    @scala.inline
    def setFilterGroups(value: FilterGroups): Self = this.set("filterGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterGroups: Self = this.set("filterGroups", js.undefined)
  }
  
}

