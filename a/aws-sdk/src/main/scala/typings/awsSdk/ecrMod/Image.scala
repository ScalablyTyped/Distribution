package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  /**
    * An object containing the image tag and image digest associated with an image.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.native
  
  /**
    * The image manifest associated with the image.
    */
  var imageManifest: js.UndefOr[ImageManifest] = js.native
  
  /**
    * The manifest media type of the image.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.native
  
  /**
    * The AWS account ID associated with the registry containing the image.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository associated with the image.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setImageId(value: ImageIdentifier): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    
    @scala.inline
    def setImageManifest(value: ImageManifest): Self = this.set("imageManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageManifest: Self = this.set("imageManifest", js.undefined)
    
    @scala.inline
    def setImageManifestMediaType(value: MediaType): Self = this.set("imageManifestMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageManifestMediaType: Self = this.set("imageManifestMediaType", js.undefined)
    
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
