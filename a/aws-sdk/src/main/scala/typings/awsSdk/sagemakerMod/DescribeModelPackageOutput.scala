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
    ModelPackageStatusDetails: ModelPackageStatusDetails,
    CertifyForMarketplace: js.UndefOr[scala.Boolean] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ModelPackageDescription: EntityDescription = null,
    SourceAlgorithmSpecification: SourceAlgorithmSpecification = null,
    ValidationSpecification: ModelPackageValidationSpecification = null
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace.asInstanceOf[js.Any])
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification.asInstanceOf[js.Any])
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription.asInstanceOf[js.Any])
    if (SourceAlgorithmSpecification != null) __obj.updateDynamic("SourceAlgorithmSpecification")(SourceAlgorithmSpecification.asInstanceOf[js.Any])
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
}

