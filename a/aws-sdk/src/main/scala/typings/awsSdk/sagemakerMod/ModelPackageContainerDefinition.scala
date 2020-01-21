package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageContainerDefinition extends js.Object {
  /**
    * The DNS host name for the Docker container.
    */
  var ContainerHostname: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerHostname] = js.native
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var Image: typings.awsSdk.sagemakerMod.Image = js.native
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var ImageDigest: js.UndefOr[typings.awsSdk.sagemakerMod.ImageDigest] = js.native
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
  /**
    * The AWS Marketplace product ID of the model package.
    */
  var ProductId: js.UndefOr[typings.awsSdk.sagemakerMod.ProductId] = js.native
}

object ModelPackageContainerDefinition {
  @scala.inline
  def apply(
    Image: Image,
    ContainerHostname: ContainerHostname = null,
    ImageDigest: ImageDigest = null,
    ModelDataUrl: Url = null,
    ProductId: ProductId = null
  ): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    if (ContainerHostname != null) __obj.updateDynamic("ContainerHostname")(ContainerHostname.asInstanceOf[js.Any])
    if (ImageDigest != null) __obj.updateDynamic("ImageDigest")(ImageDigest.asInstanceOf[js.Any])
    if (ModelDataUrl != null) __obj.updateDynamic("ModelDataUrl")(ModelDataUrl.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
}

