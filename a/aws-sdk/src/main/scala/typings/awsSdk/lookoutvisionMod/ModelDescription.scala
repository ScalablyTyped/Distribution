package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDescription extends StObject {
  
  /**
    * The unix timestamp for the date and time that the model was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the model.
    */
  var Description: js.UndefOr[ModelDescriptionMessage] = js.undefined
  
  /**
    * The unix timestamp for the date and time that the evaluation ended. 
    */
  var EvaluationEndTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The S3 location where Amazon Lookout for Vision saves the manifest file that was used to test the trained model and generate the performance scores.
    */
  var EvaluationManifest: js.UndefOr[OutputS3Object] = js.undefined
  
  /**
    * The S3 location where Amazon Lookout for Vision saves the performance metrics.
    */
  var EvaluationResult: js.UndefOr[OutputS3Object] = js.undefined
  
  /**
    * The identifer for the AWS Key Management Service (AWS KMS) key that was used to encrypt the model during training.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.lookoutvisionMod.KmsKeyId] = js.undefined
  
  /**
    * The maximum number of inference units Amazon Lookout for Vision uses to auto-scale the model. For more information, see StartModel.
    */
  var MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The minimum number of inference units used by the model. For more information, see StartModel 
    */
  var MinInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelArn] = js.undefined
  
  /**
    * The version of the model
    */
  var ModelVersion: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelVersion] = js.undefined
  
  /**
    * The S3 location where Amazon Lookout for Vision saves model training files.
    */
  var OutputConfig: js.UndefOr[typings.awsSdk.lookoutvisionMod.OutputConfig] = js.undefined
  
  /**
    * Performance metrics for the model. Created during training.
    */
  var Performance: js.UndefOr[ModelPerformance] = js.undefined
  
  /**
    * The status of the model.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * The status message for the model.
    */
  var StatusMessage: js.UndefOr[ModelStatusMessage] = js.undefined
}
object ModelDescription {
  
  inline def apply(): ModelDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDescription]
  }
  
  extension [Self <: ModelDescription](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDescription(value: ModelDescriptionMessage): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEvaluationEndTimestamp(value: js.Date): Self = StObject.set(x, "EvaluationEndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEvaluationEndTimestampUndefined: Self = StObject.set(x, "EvaluationEndTimestamp", js.undefined)
    
    inline def setEvaluationManifest(value: OutputS3Object): Self = StObject.set(x, "EvaluationManifest", value.asInstanceOf[js.Any])
    
    inline def setEvaluationManifestUndefined: Self = StObject.set(x, "EvaluationManifest", js.undefined)
    
    inline def setEvaluationResult(value: OutputS3Object): Self = StObject.set(x, "EvaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "EvaluationResult", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaxInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MaxInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxInferenceUnitsUndefined: Self = StObject.set(x, "MaxInferenceUnits", js.undefined)
    
    inline def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMinInferenceUnitsUndefined: Self = StObject.set(x, "MinInferenceUnits", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    inline def setPerformance(value: ModelPerformance): Self = StObject.set(x, "Performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "Performance", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ModelStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
