package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageValidationSpecification extends js.Object {
  /**
    * An array of ModelPackageValidationProfile objects, each of which specifies a batch transform job that Amazon SageMaker runs to validate your model package.
    */
  var ValidationProfiles: ModelPackageValidationProfiles = js.native
  /**
    * The IAM roles to be used for the validation of the model package.
    */
  var ValidationRole: RoleArn = js.native
}

object ModelPackageValidationSpecification {
  @scala.inline
  def apply(ValidationProfiles: ModelPackageValidationProfiles, ValidationRole: RoleArn): ModelPackageValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles.asInstanceOf[js.Any], ValidationRole = ValidationRole.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelPackageValidationSpecification]
  }
}

