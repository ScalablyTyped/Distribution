package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[String] = js.native
  /**
    * The size of the function's deployment package, in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.lambdaMod.DeadLetterConfig] = js.native
  /**
    * The function's description.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[EnvironmentResponse] = js.native
  /**
    * Connection settings for an Amazon EFS file system.
    */
  var FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.native
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NamespacedFunctionName] = js.native
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[typings.awsSdk.lambdaMod.Handler] = js.native
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.lambdaMod.KMSKeyArn] = js.native
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the last update that was performed on the function. This is first set to Successful after function creation completes.
    */
  var LastUpdateStatus: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatus] = js.native
  /**
    * The reason for the last update that was performed on the function.
    */
  var LastUpdateStatusReason: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatusReason] = js.native
  /**
    * The reason code for the last update that was performed on the function.
    */
  var LastUpdateStatusReasonCode: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatusReasonCode] = js.native
  /**
    * The function's  layers.
    */
  var Layers: js.UndefOr[LayersReferenceList] = js.native
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[FunctionArn] = js.native
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[typings.awsSdk.lambdaMod.MemorySize] = js.native
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.native
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[typings.awsSdk.lambdaMod.Runtime] = js.native
  /**
    * The current state of the function. When the state is Inactive, you can reactivate the function by invoking it.
    */
  var State: js.UndefOr[typings.awsSdk.lambdaMod.State] = js.native
  /**
    * The reason for the function's current state.
    */
  var StateReason: js.UndefOr[typings.awsSdk.lambdaMod.StateReason] = js.native
  /**
    * The reason code for the function's current state. When the code is Creating, you can't invoke or modify the function.
    */
  var StateReasonCode: js.UndefOr[typings.awsSdk.lambdaMod.StateReasonCode] = js.native
  /**
    * The amount of time in seconds that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[typings.awsSdk.lambdaMod.Timeout] = js.native
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[TracingConfigResponse] = js.native
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[typings.awsSdk.lambdaMod.Version] = js.native
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[VpcConfigResponse] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(
    CodeSha256: String = null,
    CodeSize: js.UndefOr[Long] = js.undefined,
    DeadLetterConfig: DeadLetterConfig = null,
    Description: Description = null,
    Environment: EnvironmentResponse = null,
    FileSystemConfigs: FileSystemConfigList = null,
    FunctionArn: NameSpacedFunctionArn = null,
    FunctionName: NamespacedFunctionName = null,
    Handler: Handler = null,
    KMSKeyArn: KMSKeyArn = null,
    LastModified: Timestamp = null,
    LastUpdateStatus: LastUpdateStatus = null,
    LastUpdateStatusReason: LastUpdateStatusReason = null,
    LastUpdateStatusReasonCode: LastUpdateStatusReasonCode = null,
    Layers: LayersReferenceList = null,
    MasterArn: FunctionArn = null,
    MemorySize: js.UndefOr[MemorySize] = js.undefined,
    RevisionId: String = null,
    Role: RoleArn = null,
    Runtime: Runtime = null,
    State: State = null,
    StateReason: StateReason = null,
    StateReasonCode: StateReasonCode = null,
    Timeout: js.UndefOr[Timeout] = js.undefined,
    TracingConfig: TracingConfigResponse = null,
    Version: Version = null,
    VpcConfig: VpcConfigResponse = null
  ): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256.asInstanceOf[js.Any])
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize.get.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (FileSystemConfigs != null) __obj.updateDynamic("FileSystemConfigs")(FileSystemConfigs.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (Handler != null) __obj.updateDynamic("Handler")(Handler.asInstanceOf[js.Any])
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastUpdateStatus != null) __obj.updateDynamic("LastUpdateStatus")(LastUpdateStatus.asInstanceOf[js.Any])
    if (LastUpdateStatusReason != null) __obj.updateDynamic("LastUpdateStatusReason")(LastUpdateStatusReason.asInstanceOf[js.Any])
    if (LastUpdateStatusReasonCode != null) __obj.updateDynamic("LastUpdateStatusReasonCode")(LastUpdateStatusReasonCode.asInstanceOf[js.Any])
    if (Layers != null) __obj.updateDynamic("Layers")(Layers.asInstanceOf[js.Any])
    if (MasterArn != null) __obj.updateDynamic("MasterArn")(MasterArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MemorySize)) __obj.updateDynamic("MemorySize")(MemorySize.get.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonCode != null) __obj.updateDynamic("StateReasonCode")(StateReasonCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout.get.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

