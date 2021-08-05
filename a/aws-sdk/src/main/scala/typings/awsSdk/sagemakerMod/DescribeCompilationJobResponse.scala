package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCompilationJobResponse extends StObject {
  
  /**
    * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker detected that the job failed. 
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
    */
  var CompilationJobArn: typings.awsSdk.sagemakerMod.CompilationJobArn
  
  /**
    * The name of the model compilation job.
    */
  var CompilationJobName: EntityName
  
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsSdk.sagemakerMod.CompilationJobStatus
  
  /**
    * The time when the model compilation job started the CompilationJob instances.  You are billed for the time between this timestamp and the timestamp in the DescribeCompilationJobResponse$CompilationEndTime field. In Amazon CloudWatch Logs, the start time might be later than this time. That's because it takes time to download the compilation job, which depends on the size of the compilation job container. 
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time that the model compilation job was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime
  
  /**
    * If a model compilation job failed, the reason it failed. 
    */
  var FailureReason: typings.awsSdk.sagemakerMod.FailureReason
  
  /**
    * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: typings.awsSdk.sagemakerMod.InputConfig
  
  /**
    * The time that the status of the model compilation job was last modified.
    */
  var LastModifiedTime: typings.awsSdk.sagemakerMod.LastModifiedTime
  
  /**
    * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the compilation job.
    */
  var ModelArtifacts: typings.awsSdk.sagemakerMod.ModelArtifacts
  
  /**
    * Information about the output location for the compiled model and the target device that the model runs on.
    */
  var OutputConfig: typings.awsSdk.sagemakerMod.OutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * Specifies a limit to how long a model compilation job can run. When the job reaches the time limit, Amazon SageMaker ends the compilation job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition
}
object DescribeCompilationJobResponse {
  
  inline def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: CreationTime,
    FailureReason: FailureReason,
    InputConfig: InputConfig,
    LastModifiedTime: LastModifiedTime,
    ModelArtifacts: ModelArtifacts,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): DescribeCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FailureReason = FailureReason.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ModelArtifacts = ModelArtifacts.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompilationJobResponse]
  }
  
  extension [Self <: DescribeCompilationJobResponse](x: Self) {
    
    inline def setCompilationEndTime(value: Timestamp): Self = StObject.set(x, "CompilationEndTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationEndTimeUndefined: Self = StObject.set(x, "CompilationEndTime", js.undefined)
    
    inline def setCompilationJobArn(value: CompilationJobArn): Self = StObject.set(x, "CompilationJobArn", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobStatus(value: CompilationJobStatus): Self = StObject.set(x, "CompilationJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTime(value: Timestamp): Self = StObject.set(x, "CompilationStartTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTimeUndefined: Self = StObject.set(x, "CompilationStartTime", js.undefined)
    
    inline def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModelArtifacts(value: ModelArtifacts): Self = StObject.set(x, "ModelArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
  }
}
