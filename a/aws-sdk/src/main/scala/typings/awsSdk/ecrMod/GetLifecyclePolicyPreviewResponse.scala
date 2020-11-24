package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePolicyPreviewResponse extends js.Object {
  
  /**
    * The JSON lifecycle policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
  
  /**
    * The nextToken value to include in a future GetLifecyclePolicyPreview request. When the results of a GetLifecyclePolicyPreview request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The results of the lifecycle policy preview request.
    */
  var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.native
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  
  /**
    * The status of the lifecycle policy preview request.
    */
  var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.native
  
  /**
    * The list of images that is returned as a result of the action.
    */
  var summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.native
}
object GetLifecyclePolicyPreviewResponse {
  
  @scala.inline
  def apply(): GetLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePolicyPreviewResponse]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyPreviewResponseOps[Self <: GetLifecyclePolicyPreviewResponse] (val x: Self) extends AnyVal {
    
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
    def setLifecyclePolicyText(value: LifecyclePolicyText): Self = this.set("lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecyclePolicyText: Self = this.set("lifecyclePolicyText", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPreviewResultsVarargs(value: LifecyclePolicyPreviewResult*): Self = this.set("previewResults", js.Array(value :_*))
    
    @scala.inline
    def setPreviewResults(value: LifecyclePolicyPreviewResultList): Self = this.set("previewResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewResults: Self = this.set("previewResults", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setStatus(value: LifecyclePolicyPreviewStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSummary(value: LifecyclePolicyPreviewSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
