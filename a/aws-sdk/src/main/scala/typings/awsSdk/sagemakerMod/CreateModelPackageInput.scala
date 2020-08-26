package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelPackageInput extends js.Object {
  /**
    * Whether to certify the model package for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * A description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: EntityName = js.native
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.SourceAlgorithmSpecification] = js.native
  /**
    * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}

object CreateModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: EntityName): CreateModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageInput]
  }
  @scala.inline
  implicit class CreateModelPackageInputOps[Self <: CreateModelPackageInput] (val x: Self) extends AnyVal {
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
    def setModelPackageName(value: EntityName): Self = this.set("ModelPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertifyForMarketplace(value: CertifyForMarketplace): Self = this.set("CertifyForMarketplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertifyForMarketplace: Self = this.set("CertifyForMarketplace", js.undefined)
    @scala.inline
    def setInferenceSpecification(value: InferenceSpecification): Self = this.set("InferenceSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceSpecification: Self = this.set("InferenceSpecification", js.undefined)
    @scala.inline
    def setModelPackageDescription(value: EntityDescription): Self = this.set("ModelPackageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelPackageDescription: Self = this.set("ModelPackageDescription", js.undefined)
    @scala.inline
    def setSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = this.set("SourceAlgorithmSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAlgorithmSpecification: Self = this.set("SourceAlgorithmSpecification", js.undefined)
    @scala.inline
    def setValidationSpecification(value: ModelPackageValidationSpecification): Self = this.set("ValidationSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationSpecification: Self = this.set("ValidationSpecification", js.undefined)
  }
  
}

