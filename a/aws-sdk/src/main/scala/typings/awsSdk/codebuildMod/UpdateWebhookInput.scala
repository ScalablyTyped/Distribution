package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebhookInput extends js.Object {
  
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of build this webhook will trigger.
    */
  var buildType: js.UndefOr[WebhookBuildType] = js.native
  
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
  def apply(projectName: ProjectName): UpdateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookInput]
  }
  
  @scala.inline
  implicit class UpdateWebhookInputOps[Self <: UpdateWebhookInput] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRotateSecret(value: Boolean): Self = this.set("rotateSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateSecret: Self = this.set("rotateSecret", js.undefined)
  }
}
