package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecyclePolicyRequest extends js.Object {
  /**
    * The JSON repository policy text to apply to the repository.
    */
  var lifecyclePolicyText: LifecyclePolicyText = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName = js.native
}

object PutLifecyclePolicyRequest {
  @scala.inline
  def apply(lifecyclePolicyText: LifecyclePolicyText, repositoryName: RepositoryName): PutLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(lifecyclePolicyText = lifecyclePolicyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyRequest]
  }
  @scala.inline
  implicit class PutLifecyclePolicyRequestOps[Self <: PutLifecyclePolicyRequest] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

