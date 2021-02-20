package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebhookInput extends StObject {
  
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
  implicit class CreateWebhookInputMutableBuilder[Self <: CreateWebhookInput] (val x: Self) extends AnyVal {
    
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
  }
}
