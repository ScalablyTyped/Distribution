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
  @scala.inline
  implicit class AlgorithmValidationSpecificationOps[Self <: AlgorithmValidationSpecification] (val x: Self) extends AnyVal {
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
    def setValidationProfilesVarargs(value: AlgorithmValidationProfile*): Self = this.set("ValidationProfiles", js.Array(value :_*))
    @scala.inline
    def setValidationProfiles(value: AlgorithmValidationProfiles): Self = this.set("ValidationProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationRole(value: RoleArn): Self = this.set("ValidationRole", value.asInstanceOf[js.Any])
  }
  
}

