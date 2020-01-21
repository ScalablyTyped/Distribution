package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLifecyclePolicyResponse extends js.Object {
  /**
    * The time stamp of the last time that the lifecycle policy was run.
    */
  var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.native
  /**
    * The JSON lifecycle policy text.
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
}

object DeleteLifecyclePolicyResponse {
  @scala.inline
  def apply(
    lastEvaluatedAt: EvaluationTimestamp = null,
    lifecyclePolicyText: LifecyclePolicyText = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): DeleteLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (lastEvaluatedAt != null) __obj.updateDynamic("lastEvaluatedAt")(lastEvaluatedAt.asInstanceOf[js.Any])
    if (lifecyclePolicyText != null) __obj.updateDynamic("lifecyclePolicyText")(lifecyclePolicyText.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
  }
}

