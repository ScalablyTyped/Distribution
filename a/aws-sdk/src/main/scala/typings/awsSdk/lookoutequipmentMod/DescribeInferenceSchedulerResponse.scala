package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceSchedulerResponse extends StObject {
  
  /**
    * Specifies the time at which the inference scheduler was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if you select an offset delay time of five minutes, inference will not begin on the data until the first data measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when uploading new data.
    */
  var DataDelayOffsetInMinutes: js.UndefOr[typings.awsSdk.lookoutequipmentMod.DataDelayOffsetInMinutes] = js.undefined
  
  /**
    *  Specifies configuration information for the input data for the inference scheduler, including delimiter, format, and dataset location. 
    */
  var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined
  
  /**
    *  Specifies information for the output results for the inference scheduler, including the output S3 location. 
    */
  var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined
  
  /**
    * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes. 
    */
  var DataUploadFrequency: js.UndefOr[typings.awsSdk.lookoutequipmentMod.DataUploadFrequency] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the inference scheduler being described. 
    */
  var InferenceSchedulerArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerArn] = js.undefined
  
  /**
    * The name of the inference scheduler being described. 
    */
  var InferenceSchedulerName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerName] = js.undefined
  
  /**
    * Indicates whether the latest execution for the inference scheduler was Anomalous (anomalous events found) or Normal (no anomalous events found).
    */
  var LatestInferenceResult: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LatestInferenceResult] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * The name of the ML model of the inference scheduler being described. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelName] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler being described. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Provides the identifier of the KMS key used to encrypt inference scheduler data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * Indicates the status of the inference scheduler. 
    */
  var Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
  
  /**
    * Specifies the time at which the inference scheduler was last updated, if it was. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeInferenceSchedulerResponse {
  
  inline def apply(): DescribeInferenceSchedulerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInferenceSchedulerResponse]
  }
  
  extension [Self <: DescribeInferenceSchedulerResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataDelayOffsetInMinutes(value: DataDelayOffsetInMinutes): Self = StObject.set(x, "DataDelayOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDataDelayOffsetInMinutesUndefined: Self = StObject.set(x, "DataDelayOffsetInMinutes", js.undefined)
    
    inline def setDataInputConfiguration(value: InferenceInputConfiguration): Self = StObject.set(x, "DataInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataInputConfigurationUndefined: Self = StObject.set(x, "DataInputConfiguration", js.undefined)
    
    inline def setDataOutputConfiguration(value: InferenceOutputConfiguration): Self = StObject.set(x, "DataOutputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataOutputConfigurationUndefined: Self = StObject.set(x, "DataOutputConfiguration", js.undefined)
    
    inline def setDataUploadFrequency(value: DataUploadFrequency): Self = StObject.set(x, "DataUploadFrequency", value.asInstanceOf[js.Any])
    
    inline def setDataUploadFrequencyUndefined: Self = StObject.set(x, "DataUploadFrequency", js.undefined)
    
    inline def setInferenceSchedulerArn(value: InferenceSchedulerArn): Self = StObject.set(x, "InferenceSchedulerArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerArnUndefined: Self = StObject.set(x, "InferenceSchedulerArn", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameUndefined: Self = StObject.set(x, "InferenceSchedulerName", js.undefined)
    
    inline def setLatestInferenceResult(value: LatestInferenceResult): Self = StObject.set(x, "LatestInferenceResult", value.asInstanceOf[js.Any])
    
    inline def setLatestInferenceResultUndefined: Self = StObject.set(x, "LatestInferenceResult", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setServerSideKmsKeyId(value: KmsKeyArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setStatus(value: InferenceSchedulerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
