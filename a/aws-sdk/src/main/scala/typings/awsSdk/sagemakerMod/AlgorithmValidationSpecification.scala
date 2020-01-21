package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmValidationSpecification extends js.Object {
  /**
    * An array of AlgorithmValidationProfile objects, each of which specifies a training job and batch transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var ValidationProfiles: AlgorithmValidationProfiles = js.native
  /**
    * The IAM roles that Amazon SageMaker uses to run the training jobs.
    */
  var ValidationRole: RoleArn = js.native
}

object AlgorithmValidationSpecification {
  @scala.inline
  def apply(ValidationProfiles: AlgorithmValidationProfiles, ValidationRole: RoleArn): AlgorithmValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles.asInstanceOf[js.Any], ValidationRole = ValidationRole.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlgorithmValidationSpecification]
  }
}

