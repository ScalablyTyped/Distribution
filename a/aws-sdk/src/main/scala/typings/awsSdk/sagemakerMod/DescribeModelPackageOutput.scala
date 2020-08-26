package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelPackageOutput extends js.Object {
  /**
    * Whether the model package is certified for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * A timestamp specifying when the model package was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  /**
    * Details about inference jobs that can be run with models based on this model package.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn = js.native
  /**
    * A brief summary of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package being described.
    */
  var ModelPackageName: EntityName = js.native
  /**
    * The current status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.sagemakerMod.ModelPackageStatus = js.native
  /**
    * Details about the current status of the model package.
    */
  var ModelPackageStatusDetails: typings.awsSdk.sagemakerMod.ModelPackageStatusDetails = js.native
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.SourceAlgorithmSpecification] = js.native
  /**
    * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}

object DescribeModelPackageOutput {
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageStatusDetails: ModelPackageStatusDetails
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
  @scala.inline
  implicit class DescribeModelPackageOutputOps[Self <: DescribeModelPackageOutput] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelPackageArn(value: ModelPackageArn): Self = this.set("ModelPackageArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelPackageName(value: EntityName): Self = this.set("ModelPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelPackageStatus(value: ModelPackageStatus): Self = this.set("ModelPackageStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelPackageStatusDetails(value: ModelPackageStatusDetails): Self = this.set("ModelPackageStatusDetails", value.asInstanceOf[js.Any])
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

