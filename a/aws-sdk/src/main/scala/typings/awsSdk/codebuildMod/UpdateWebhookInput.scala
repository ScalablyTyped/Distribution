package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebhookInput extends StObject {
  
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of build this webhook will trigger.
    */
  var buildType: js.UndefOr[WebhookBuildType] = js.undefined
  
  /**
    *  An array of arrays of WebhookFilter objects used to determine if a webhook event can trigger a build. A filter group must contain at least one EVENT WebhookFilter. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.undefined
  
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName
  
  /**
    *  A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you use Bitbucket for your repository, rotateSecret is ignored. 
    */
  var rotateSecret: js.UndefOr[Boolean] = js.undefined
}
object UpdateWebhookInput {
  
  @scala.inline
  def apply(projectName: ProjectName): UpdateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookInput]
  }
  
  @scala.inline
  implicit class UpdateWebhookInputMutableBuilder[Self <: UpdateWebhookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchFilter(value: String): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFilterUndefined: Self = StObject.set(x, "branchFilter", js.undefined)
    
    @scala.inline
    def setBuildType(value: WebhookBuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    @scala.inline
    def setFilterGroups(value: FilterGroups): Self = StObject.set(x, "filterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterGroupsUndefined: Self = StObject.set(x, "filterGroups", js.undefined)
    
    @scala.inline
    def setFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "filterGroups", js.Array(value :_*))
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateSecret(value: Boolean): Self = StObject.set(x, "rotateSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateSecretUndefined: Self = StObject.set(x, "rotateSecret", js.undefined)
  }
}
