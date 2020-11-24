package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRepositoryRequest extends js.Object {
  
  /**
    * The encryption configuration for the repository. This determines how the contents of your repository are encrypted at rest.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  /**
    * The image scanning configuration for the repository. This determines whether images are scanned for known vulnerabilities after being pushed to the repository.
    */
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.native
  
  /**
    * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.native
  
  /**
    * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app).
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateRepositoryRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
  
  @scala.inline
  implicit class CreateRepositoryRequestOps[Self <: CreateRepositoryRequest] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("encryptionConfiguration", js.undefined)
    
    @scala.inline
    def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = this.set("imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageScanningConfiguration: Self = this.set("imageScanningConfiguration", js.undefined)
    
    @scala.inline
    def setImageTagMutability(value: ImageTagMutability): Self = this.set("imageTagMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTagMutability: Self = this.set("imageTagMutability", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
