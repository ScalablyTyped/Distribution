package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmValidationProfile extends StObject {
  
  /**
    * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ProfileName: EntityName
  
  /**
    * The TrainingJobDefinition object that describes the training job that Amazon SageMaker runs to validate your algorithm.
    */
  var TrainingJobDefinition: typings.awsSdk.sagemakerMod.TrainingJobDefinition
  
  /**
    * The TransformJobDefinition object that describes the transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var TransformJobDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobDefinition] = js.undefined
}
object AlgorithmValidationProfile {
  
  @scala.inline
  def apply(ProfileName: EntityName, TrainingJobDefinition: TrainingJobDefinition): AlgorithmValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TrainingJobDefinition = TrainingJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmValidationProfile]
  }
  
  @scala.inline
  implicit class AlgorithmValidationProfileMutableBuilder[Self <: AlgorithmValidationProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileName(value: EntityName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinition(value: TrainingJobDefinition): Self = StObject.set(x, "TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobDefinition(value: TransformJobDefinition): Self = StObject.set(x, "TransformJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobDefinitionUndefined: Self = StObject.set(x, "TransformJobDefinition", js.undefined)
  }
}
