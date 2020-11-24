package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repository extends js.Object {
  
  /**
    * The date and time, in JavaScript date format, when the repository was created.
    */
  var createdAt: js.UndefOr[CreationTimestamp] = js.native
  
  /**
    * The encryption configuration for the repository. This determines how the contents of your repository are encrypted at rest.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.native
  
  /**
    * The tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the arn:aws:ecr namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, arn:aws:ecr:region:012345678910:repository/test.
    */
  var repositoryArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  
  /**
    * The URI for the repository. You can use this URI for container image push and pull operations.
    */
  var repositoryUri: js.UndefOr[Url] = js.native
}
object Repository {
  
  @scala.inline
  def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  @scala.inline
  implicit class RepositoryOps[Self <: Repository] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: CreationTimestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
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
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    
    @scala.inline
    def setRepositoryArn(value: Arn): Self = this.set("repositoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryArn: Self = this.set("repositoryArn", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setRepositoryUri(value: Url): Self = this.set("repositoryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryUri: Self = this.set("repositoryUri", js.undefined)
  }
}
