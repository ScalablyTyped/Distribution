package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmValidationSpecification extends StObject {
  
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
  implicit class AlgorithmValidationSpecificationMutableBuilder[Self <: AlgorithmValidationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationProfiles(value: AlgorithmValidationProfiles): Self = StObject.set(x, "ValidationProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationProfilesVarargs(value: AlgorithmValidationProfile*): Self = StObject.set(x, "ValidationProfiles", js.Array(value :_*))
    
    @scala.inline
    def setValidationRole(value: RoleArn): Self = StObject.set(x, "ValidationRole", value.asInstanceOf[js.Any])
  }
}
