package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repository extends StObject {
  
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
  implicit class RepositoryMutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: CreationTimestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    @scala.inline
    def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
    
    @scala.inline
    def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryArn(value: Arn): Self = StObject.set(x, "repositoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryArnUndefined: Self = StObject.set(x, "repositoryArn", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    @scala.inline
    def setRepositoryUri(value: Url): Self = StObject.set(x, "repositoryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUriUndefined: Self = StObject.set(x, "repositoryUri", js.undefined)
  }
}
