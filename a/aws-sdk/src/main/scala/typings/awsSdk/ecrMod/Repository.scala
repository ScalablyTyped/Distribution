package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    * The date and time, in JavaScript date format, when the repository was created.
    */
  var createdAt: js.UndefOr[CreationTimestamp] = js.native
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
    * The URI for the repository. You can use this URI for Docker push or pull operations.
    */
  var repositoryUri: js.UndefOr[Url] = js.native
}

object Repository {
  @scala.inline
  def apply(
    createdAt: CreationTimestamp = null,
    imageScanningConfiguration: ImageScanningConfiguration = null,
    imageTagMutability: ImageTagMutability = null,
    registryId: RegistryId = null,
    repositoryArn: Arn = null,
    repositoryName: RepositoryName = null,
    repositoryUri: Url = null
  ): Repository = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (imageScanningConfiguration != null) __obj.updateDynamic("imageScanningConfiguration")(imageScanningConfiguration.asInstanceOf[js.Any])
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryArn != null) __obj.updateDynamic("repositoryArn")(repositoryArn.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (repositoryUri != null) __obj.updateDynamic("repositoryUri")(repositoryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

