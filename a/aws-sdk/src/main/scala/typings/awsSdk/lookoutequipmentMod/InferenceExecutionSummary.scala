package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceExecutionSummary extends StObject {
  
  /**
    *  
    */
  var CustomerResultObject: js.UndefOr[S3Object] = js.undefined
  
  /**
    * Indicates the time reference in the dataset at which the inference execution stopped. 
    */
  var DataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies configuration information for the input data for the inference scheduler, including delimiter, format, and dataset location. 
    */
  var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined
  
  /**
    *  Specifies configuration information for the output results from for the inference execution, including the output Amazon S3 location. 
    */
  var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined
  
  /**
    * Indicates the time reference in the dataset at which the inference execution began. 
    */
  var DataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the reason for failure when an inference execution has failed. 
    */
  var FailedReason: js.UndefOr[BoundedLengthString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution. 
    */
  var InferenceSchedulerArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerArn] = js.undefined
  
  /**
    * The name of the inference scheduler being used for the inference execution. 
    */
  var InferenceSchedulerName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the ML model used for the inference execution. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * The name of the ML model being used for the inference execution. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelName] = js.undefined
  
  /**
    * Indicates the start time at which the inference scheduler began the specific inference execution. 
    */
  var ScheduledStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the status of the inference execution. 
    */
  var Status: js.UndefOr[InferenceExecutionStatus] = js.undefined
}
object InferenceExecutionSummary {
  
  inline def apply(): InferenceExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceExecutionSummary]
  }
  
  extension [Self <: InferenceExecutionSummary](x: Self) {
    
    inline def setCustomerResultObject(value: S3Object): Self = StObject.set(x, "CustomerResultObject", value.asInstanceOf[js.Any])
    
    inline def setCustomerResultObjectUndefined: Self = StObject.set(x, "CustomerResultObject", js.undefined)
    
    inline def setDataEndTime(value: js.Date): Self = StObject.set(x, "DataEndTime", value.asInstanceOf[js.Any])
    
    inline def setDataEndTimeUndefined: Self = StObject.set(x, "DataEndTime", js.undefined)
    
    inline def setDataInputConfiguration(value: InferenceInputConfiguration): Self = StObject.set(x, "DataInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataInputConfigurationUndefined: Self = StObject.set(x, "DataInputConfiguration", js.undefined)
    
    inline def setDataOutputConfiguration(value: InferenceOutputConfiguration): Self = StObject.set(x, "DataOutputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataOutputConfigurationUndefined: Self = StObject.set(x, "DataOutputConfiguration", js.undefined)
    
    inline def setDataStartTime(value: js.Date): Self = StObject.set(x, "DataStartTime", value.asInstanceOf[js.Any])
    
    inline def setDataStartTimeUndefined: Self = StObject.set(x, "DataStartTime", js.undefined)
    
    inline def setFailedReason(value: BoundedLengthString): Self = StObject.set(x, "FailedReason", value.asInstanceOf[js.Any])
    
    inline def setFailedReasonUndefined: Self = StObject.set(x, "FailedReason", js.undefined)
    
    inline def setInferenceSchedulerArn(value: InferenceSchedulerArn): Self = StObject.set(x, "InferenceSchedulerArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerArnUndefined: Self = StObject.set(x, "InferenceSchedulerArn", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameUndefined: Self = StObject.set(x, "InferenceSchedulerName", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setScheduledStartTime(value: js.Date): Self = StObject.set(x, "ScheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "ScheduledStartTime", js.undefined)
    
    inline def setStatus(value: InferenceExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
