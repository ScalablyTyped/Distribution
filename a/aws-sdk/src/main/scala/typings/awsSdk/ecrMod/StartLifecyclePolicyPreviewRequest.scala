package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLifecyclePolicyPreviewRequest extends js.Object {
  
  /**
    * The policy to be evaluated against. If you do not specify a policy, the current policy for the repository is used.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to be evaluated.
    */
  var repositoryName: RepositoryName = js.native
}
object StartLifecyclePolicyPreviewRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): StartLifecyclePolicyPreviewRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLifecyclePolicyPreviewRequest]
  }
  
  @scala.inline
  implicit class StartLifecyclePolicyPreviewRequestOps[Self <: StartLifecyclePolicyPreviewRequest] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicyText(value: LifecyclePolicyText): Self = this.set("lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecyclePolicyText: Self = this.set("lifecyclePolicyText", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
}
