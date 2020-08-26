package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageTagMutabilityRequest extends js.Object {
  /**
    * The tag mutability setting for the repository. If MUTABLE is specified, image tags can be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: ImageTagMutability = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image tag mutability settings. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository in which to update the image tag mutability settings.
    */
  var repositoryName: RepositoryName = js.native
}

object PutImageTagMutabilityRequest {
  @scala.inline
  def apply(imageTagMutability: ImageTagMutability, repositoryName: RepositoryName): PutImageTagMutabilityRequest = {
    val __obj = js.Dynamic.literal(imageTagMutability = imageTagMutability.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageTagMutabilityRequest]
  }
  @scala.inline
  implicit class PutImageTagMutabilityRequestOps[Self <: PutImageTagMutabilityRequest] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}

