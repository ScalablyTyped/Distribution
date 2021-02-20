package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectVersionRequest extends StObject {
  
  /**
    * The Amazon S3 location to store the results of training.
    */
  var OutputConfig: typings.awsSdk.rekognitionMod.OutputConfig = js.native
  
  /**
    * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
    */
  var ProjectArn: typings.awsSdk.rekognitionMod.ProjectArn = js.native
  
  /**
    * The dataset to use for testing.
    */
  var TestingData: typings.awsSdk.rekognitionMod.TestingData = js.native
  
  /**
    * The dataset to use for training. 
    */
  var TrainingData: typings.awsSdk.rekognitionMod.TrainingData = js.native
  
  /**
    * A name for the version of the model. This value must be unique.
    */
  var VersionName: typings.awsSdk.rekognitionMod.VersionName = js.native
}
object CreateProjectVersionRequest {
  
  @scala.inline
  def apply(
    OutputConfig: OutputConfig,
    ProjectArn: ProjectArn,
    TestingData: TestingData,
    TrainingData: TrainingData,
    VersionName: VersionName
  ): CreateProjectVersionRequest = {
    val __obj = js.Dynamic.literal(OutputConfig = OutputConfig.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any], TestingData = TestingData.asInstanceOf[js.Any], TrainingData = TrainingData.asInstanceOf[js.Any], VersionName = VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectVersionRequest]
  }
  
  @scala.inline
  implicit class CreateProjectVersionRequestMutableBuilder[Self <: CreateProjectVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestingData(value: TestingData): Self = StObject.set(x, "TestingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingData(value: TrainingData): Self = StObject.set(x, "TrainingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
  }
}
