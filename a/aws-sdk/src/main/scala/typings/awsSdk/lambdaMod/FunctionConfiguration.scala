package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  @scala.inline
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCodeSha256(value: String): Self = this.set("CodeSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSha256: Self = this.set("CodeSha256", js.undefined)
    
    @scala.inline
    def setCodeSize(value: Long): Self = this.set("CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSize: Self = this.set("CodeSize", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = this.set("DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: EnvironmentResponse): Self = this.set("Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    
    @scala.inline
    def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = this.set("FileSystemConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFileSystemConfigs(value: FileSystemConfigList): Self = this.set("FileSystemConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemConfigs: Self = this.set("FileSystemConfigs", js.undefined)
    
    @scala.inline
    def setFunctionArn(value: NameSpacedFunctionArn): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionArn: Self = this.set("FunctionArn", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NamespacedFunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("FunctionName", js.undefined)
    
    @scala.inline
    def setHandler(value: Handler): Self = this.set("Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("Handler", js.undefined)
    
    @scala.inline
    def setKMSKeyArn(value: KMSKeyArn): Self = this.set("KMSKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSKeyArn: Self = this.set("KMSKeyArn", js.undefined)
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    
    @scala.inline
    def setLastUpdateStatus(value: LastUpdateStatus): Self = this.set("LastUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateStatus: Self = this.set("LastUpdateStatus", js.undefined)
    
    @scala.inline
    def setLastUpdateStatusReason(value: LastUpdateStatusReason): Self = this.set("LastUpdateStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateStatusReason: Self = this.set("LastUpdateStatusReason", js.undefined)
    
    @scala.inline
    def setLastUpdateStatusReasonCode(value: LastUpdateStatusReasonCode): Self = this.set("LastUpdateStatusReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateStatusReasonCode: Self = this.set("LastUpdateStatusReasonCode", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("Layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: LayersReferenceList): Self = this.set("Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("Layers", js.undefined)
    
    @scala.inline
    def setMasterArn(value: FunctionArn): Self = this.set("MasterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterArn: Self = this.set("MasterArn", js.undefined)
    
    @scala.inline
    def setMemorySize(value: MemorySize): Self = this.set("MemorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySize: Self = this.set("MemorySize", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    
    @scala.inline
    def setRole(value: RoleArn): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setRuntime(value: Runtime): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("Runtime", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    
    @scala.inline
    def setStateReasonCode(value: StateReasonCode): Self = this.set("StateReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReasonCode: Self = this.set("StateReasonCode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    
    @scala.inline
    def setTracingConfig(value: TracingConfigResponse): Self = this.set("TracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracingConfig: Self = this.set("TracingConfig", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfigResponse): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
