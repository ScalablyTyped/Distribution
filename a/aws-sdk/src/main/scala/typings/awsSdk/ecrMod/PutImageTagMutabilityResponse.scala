package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageTagMutabilityResponse extends js.Object {
  /**
    * The image tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PutImageTagMutabilityResponse {
  @scala.inline
  def apply(
    imageTagMutability: ImageTagMutability = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): PutImageTagMutabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageTagMutabilityResponse]
  }
}

