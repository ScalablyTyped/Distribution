package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageScanningConfigurationRequest extends js.Object {
  /**
    * The image scanning configuration for the repository. This setting determines whether images are scanned for known vulnerabilities after being pushed to the repository.
    */
  var imageScanningConfiguration: ImageScanningConfiguration = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image scanning configuration setting. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository in which to update the image scanning configuration setting.
    */
  var repositoryName: RepositoryName = js.native
}

object PutImageScanningConfigurationRequest {
  @scala.inline
  def apply(imageScanningConfiguration: ImageScanningConfiguration, repositoryName: RepositoryName): PutImageScanningConfigurationRequest = {
    val __obj = js.Dynamic.literal(imageScanningConfiguration = imageScanningConfiguration.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageScanningConfigurationRequest]
  }
  @scala.inline
  implicit class PutImageScanningConfigurationRequestOps[Self <: PutImageScanningConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = this.set("imageScanningConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

