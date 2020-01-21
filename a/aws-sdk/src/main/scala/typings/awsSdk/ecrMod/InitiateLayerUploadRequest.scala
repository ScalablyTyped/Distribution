package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateLayerUploadRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which you intend to upload layers.
    */
  var repositoryName: RepositoryName = js.native
}

object InitiateLayerUploadRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): InitiateLayerUploadRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateLayerUploadRequest]
  }
}

