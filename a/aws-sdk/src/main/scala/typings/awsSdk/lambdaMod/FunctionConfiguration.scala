package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfiguration extends StObject {
  
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the function's deployment package, in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.lambdaMod.DeadLetterConfig] = js.undefined
  
  /**
    * The function's description.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[EnvironmentResponse] = js.undefined
  
  /**
    * Connection settings for an Amazon EFS file system.
    */
  var FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined
  
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined
  
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[typings.awsSdk.lambdaMod.Handler] = js.undefined
  
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.lambdaMod.KMSKeyArn] = js.undefined
  
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the last update that was performed on the function. This is first set to Successful after function creation completes.
    */
  var LastUpdateStatus: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatus] = js.undefined
  
  /**
    * The reason for the last update that was performed on the function.
    */
  var LastUpdateStatusReason: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatusReason] = js.undefined
  
  /**
    * The reason code for the last update that was performed on the function.
    */
  var LastUpdateStatusReasonCode: js.UndefOr[typings.awsSdk.lambdaMod.LastUpdateStatusReasonCode] = js.undefined
  
  /**
    * The function's  layers.
    */
  var Layers: js.UndefOr[LayersReferenceList] = js.undefined
  
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[FunctionArn] = js.undefined
  
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[typings.awsSdk.lambdaMod.MemorySize] = js.undefined
  
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[typings.awsSdk.lambdaMod.Runtime] = js.undefined
  
  /**
    * The current state of the function. When the state is Inactive, you can reactivate the function by invoking it.
    */
  var State: js.UndefOr[typings.awsSdk.lambdaMod.State] = js.undefined
  
  /**
    * The reason for the function's current state.
    */
  var StateReason: js.UndefOr[typings.awsSdk.lambdaMod.StateReason] = js.undefined
  
  /**
    * The reason code for the function's current state. When the code is Creating, you can't invoke or modify the function.
    */
  var StateReasonCode: js.UndefOr[typings.awsSdk.lambdaMod.StateReasonCode] = js.undefined
  
  /**
    * The amount of time in seconds that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[typings.awsSdk.lambdaMod.Timeout] = js.undefined
  
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined
  
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[typings.awsSdk.lambdaMod.Version] = js.undefined
  
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
}
object FunctionConfiguration {
  
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  @scala.inline
  implicit class FunctionConfigurationMutableBuilder[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    @scala.inline
    def setCodeSize(value: Long): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: EnvironmentResponse): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setFileSystemConfigs(value: FileSystemConfigList): Self = StObject.set(x, "FileSystemConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemConfigsUndefined: Self = StObject.set(x, "FileSystemConfigs", js.undefined)
    
    @scala.inline
    def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = StObject.set(x, "FileSystemConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFunctionArn(value: NameSpacedFunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    @scala.inline
    def setHandler(value: Handler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    @scala.inline
    def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setLastUpdateStatus(value: LastUpdateStatus): Self = StObject.set(x, "LastUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateStatusReason(value: LastUpdateStatusReason): Self = StObject.set(x, "LastUpdateStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateStatusReasonCode(value: LastUpdateStatusReasonCode): Self = StObject.set(x, "LastUpdateStatusReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateStatusReasonCodeUndefined: Self = StObject.set(x, "LastUpdateStatusReasonCode", js.undefined)
    
    @scala.inline
    def setLastUpdateStatusReasonUndefined: Self = StObject.set(x, "LastUpdateStatusReason", js.undefined)
    
    @scala.inline
    def setLastUpdateStatusUndefined: Self = StObject.set(x, "LastUpdateStatus", js.undefined)
    
    @scala.inline
    def setLayers(value: LayersReferenceList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
    @scala.inline
    def setMasterArn(value: FunctionArn): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
    
    @scala.inline
    def setMemorySize(value: MemorySize): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setRole(value: RoleArn): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setRuntime(value: Runtime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCode(value: StateReasonCode): Self = StObject.set(x, "StateReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCodeUndefined: Self = StObject.set(x, "StateReasonCode", js.undefined)
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setTracingConfig(value: TracingConfigResponse): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfigResponse): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
