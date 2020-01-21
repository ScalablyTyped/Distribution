package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLifecyclePolicyPreviewResponse extends js.Object {
  /**
    * The JSON repository policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
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
}

object StartLifecyclePolicyPreviewResponse {
  @scala.inline
  def apply(
    lifecyclePolicyText: LifecyclePolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null,
    status: LifecyclePolicyPreviewStatus = null
  ): StartLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLifecyclePolicyPreviewResponse]
  }
}

