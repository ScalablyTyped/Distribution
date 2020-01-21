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
  def apply(
    lifecyclePolicyText: LifecyclePolicyText,
    repositoryName: RepositoryName,
    registryId: RegistryId = null
  ): PutLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(lifecyclePolicyText = lifecyclePolicyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyRequest]
  }
}

