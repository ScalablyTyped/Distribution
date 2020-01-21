package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRepositoryPolicyResponse extends js.Object {
  /**
    * The JSON repository policy text applied to the repository.
    */
  var policyText: js.UndefOr[RepositoryPolicyText] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object SetRepositoryPolicyResponse {
  @scala.inline
  def apply(
    policyText: RepositoryPolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): SetRepositoryPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policyText != null) __obj.updateDynamic("policyText")(policyText.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRepositoryPolicyResponse]
  }
}

