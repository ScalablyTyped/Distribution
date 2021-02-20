package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPackageValidationSpecification extends StObject {
  
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
  
  @scala.inline
  implicit class ModelPackageValidationSpecificationMutableBuilder[Self <: ModelPackageValidationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationProfiles(value: ModelPackageValidationProfiles): Self = StObject.set(x, "ValidationProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationProfilesVarargs(value: ModelPackageValidationProfile*): Self = StObject.set(x, "ValidationProfiles", js.Array(value :_*))
    
    @scala.inline
    def setValidationRole(value: RoleArn): Self = StObject.set(x, "ValidationRole", value.asInstanceOf[js.Any])
  }
}
