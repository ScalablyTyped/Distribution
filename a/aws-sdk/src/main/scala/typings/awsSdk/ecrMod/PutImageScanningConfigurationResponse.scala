package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageScanningConfigurationResponse extends js.Object {
  /**
    * The image scanning configuration setting for the repository.
    */
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PutImageScanningConfigurationResponse {
  @scala.inline
  def apply(
    imageScanningConfiguration: ImageScanningConfiguration = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): PutImageScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (imageScanningConfiguration != null) __obj.updateDynamic("imageScanningConfiguration")(imageScanningConfiguration.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageScanningConfigurationResponse]
  }
}

