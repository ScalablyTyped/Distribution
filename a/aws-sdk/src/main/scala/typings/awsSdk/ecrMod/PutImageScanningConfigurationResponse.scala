package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PutImageScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageScanningConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutImageScanningConfigurationResponseOps[Self <: PutImageScanningConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def deleteImageScanningConfiguration: Self = this.set("imageScanningConfiguration", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
