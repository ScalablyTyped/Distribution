package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCheckLayerAvailabilityRequest extends js.Object {
  
  /**
    * The digests of the image layers to check.
    */
  var layerDigests: BatchedOperationLayerDigestList = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the image layers to check. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository that is associated with the image layers to check.
    */
  var repositoryName: RepositoryName = js.native
}
object BatchCheckLayerAvailabilityRequest {
  
  @scala.inline
  def apply(layerDigests: BatchedOperationLayerDigestList, repositoryName: RepositoryName): BatchCheckLayerAvailabilityRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCheckLayerAvailabilityRequest]
  }
  
  @scala.inline
  implicit class BatchCheckLayerAvailabilityRequestOps[Self <: BatchCheckLayerAvailabilityRequest] (val x: Self) extends AnyVal {
    
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
    def setLayerDigestsVarargs(value: BatchedOperationLayerDigest*): Self = this.set("layerDigests", js.Array(value :_*))
    
    @scala.inline
    def setLayerDigests(value: BatchedOperationLayerDigestList): Self = this.set("layerDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
}
