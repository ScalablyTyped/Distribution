package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmValidationProfile extends js.Object {
  
  /**
    * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ProfileName: EntityName = js.native
  
  /**
    * The TrainingJobDefinition object that describes the training job that Amazon SageMaker runs to validate your algorithm.
    */
  var TrainingJobDefinition: typings.awsSdk.sagemakerMod.TrainingJobDefinition = js.native
  
  /**
    * The TransformJobDefinition object that describes the transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var TransformJobDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJobDefinition] = js.native
}
object AlgorithmValidationProfile {
  
  @scala.inline
  def apply(ProfileName: EntityName, TrainingJobDefinition: TrainingJobDefinition): AlgorithmValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TrainingJobDefinition = TrainingJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmValidationProfile]
  }
  
  @scala.inline
  implicit class AlgorithmValidationProfileOps[Self <: AlgorithmValidationProfile] (val x: Self) extends AnyVal {
    
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
    def setProfileName(value: EntityName): Self = this.set("ProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinition(value: TrainingJobDefinition): Self = this.set("TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobDefinition(value: TransformJobDefinition): Self = this.set("TransformJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformJobDefinition: Self = this.set("TransformJobDefinition", js.undefined)
  }
}
