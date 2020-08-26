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
  var Image: ContainerImage = js.native
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
  def apply(Image: ContainerImage): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
  @scala.inline
  implicit class ModelPackageContainerDefinitionOps[Self <: ModelPackageContainerDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: ContainerImage): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerHostname(value: ContainerHostname): Self = this.set("ContainerHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerHostname: Self = this.set("ContainerHostname", js.undefined)
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = this.set("ImageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("ImageDigest", js.undefined)
    @scala.inline
    def setModelDataUrl(value: Url): Self = this.set("ModelDataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelDataUrl: Self = this.set("ModelDataUrl", js.undefined)
    @scala.inline
    def setProductId(value: ProductId): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
  }
  
}

