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
  def apply(): PutImageTagMutabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageTagMutabilityResponse]
  }
  @scala.inline
  implicit class PutImageTagMutabilityResponseOps[Self <: PutImageTagMutabilityResponse] (val x: Self) extends AnyVal {
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
    def setImageTagMutability(value: ImageTagMutability): Self = this.set("imageTagMutability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTagMutability: Self = this.set("imageTagMutability", js.undefined)
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

