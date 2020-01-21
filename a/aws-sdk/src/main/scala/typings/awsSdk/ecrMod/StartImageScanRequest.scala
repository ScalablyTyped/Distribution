package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImageScanRequest extends js.Object {
  var imageId: ImageIdentifier = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to start an image scan request. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository that contains the images to scan.
    */
  var repositoryName: RepositoryName = js.native
}

object StartImageScanRequest {
  @scala.inline
  def apply(imageId: ImageIdentifier, repositoryName: RepositoryName, registryId: RegistryId = null): StartImageScanRequest = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageScanRequest]
  }
}

