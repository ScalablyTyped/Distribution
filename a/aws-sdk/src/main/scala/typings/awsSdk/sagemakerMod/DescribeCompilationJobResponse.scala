package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCompilationJobResponse extends js.Object {
  /**
    * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker detected that the job failed. 
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
    */
  var CompilationJobArn: typings.awsSdk.sagemakerMod.CompilationJobArn = js.native
  /**
    * The name of the model compilation job.
    */
  var CompilationJobName: EntityName = js.native
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsSdk.sagemakerMod.CompilationJobStatus = js.native
  /**
    * The time when the model compilation job started the CompilationJob instances.  You are billed for the time between this timestamp and the timestamp in the DescribeCompilationJobResponse$CompilationEndTime field. In Amazon CloudWatch Logs, the start time might be later than this time. That's because it takes time to download the compilation job, which depends on the size of the compilation job container. 
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time that the model compilation job was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  /**
    * If a model compilation job failed, the reason it failed. 
    */
  var FailureReason: typings.awsSdk.sagemakerMod.FailureReason = js.native
  /**
    * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: typings.awsSdk.sagemakerMod.InputConfig = js.native
  /**
    * The time that the status of the model compilation job was last modified.
    */
  var LastModifiedTime: typings.awsSdk.sagemakerMod.LastModifiedTime = js.native
  /**
    * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the compilation job.
    */
  var ModelArtifacts: typings.awsSdk.sagemakerMod.ModelArtifacts = js.native
  /**
    * Information about the output location for the compiled model and the target device that the model runs on.
    */
  var OutputConfig: typings.awsSdk.sagemakerMod.OutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies a limit to how long a model compilation job can run. When the job reaches the time limit, Amazon SageMaker ends the compilation job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition = js.native
}

object DescribeCompilationJobResponse {
  @scala.inline
  def apply(
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
    StoppingCondition: StoppingCondition,
    CompilationEndTime: Timestamp = null,
    CompilationStartTime: Timestamp = null
  ): DescribeCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FailureReason = FailureReason.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ModelArtifacts = ModelArtifacts.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    if (CompilationEndTime != null) __obj.updateDynamic("CompilationEndTime")(CompilationEndTime.asInstanceOf[js.Any])
    if (CompilationStartTime != null) __obj.updateDynamic("CompilationStartTime")(CompilationStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompilationJobResponse]
  }
}

