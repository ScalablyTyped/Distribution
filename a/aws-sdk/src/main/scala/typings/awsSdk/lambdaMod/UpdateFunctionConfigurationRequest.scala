package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionConfigurationRequest extends StObject {
  
  /**
    * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead Letter Queues.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.lambdaMod.DeadLetterConfig] = js.undefined
  
  /**
    * A description of the function.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * Environment variables that are accessible from function code during execution.
    */
  var Environment: js.UndefOr[typings.awsSdk.lambdaMod.Environment] = js.undefined
  
  /**
    * Connection settings for an Amazon EFS file system.
    */
  var FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
  
  /**
    * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model.
    */
  var Handler: js.UndefOr[typings.awsSdk.lambdaMod.Handler] = js.undefined
  
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.lambdaMod.KMSKeyArn] = js.undefined
  
  /**
    * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
    */
  var Layers: js.UndefOr[LayerList] = js.undefined
  
  /**
    * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
    */
  var MemorySize: js.UndefOr[typings.awsSdk.lambdaMod.MemorySize] = js.undefined
  
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The identifier of the function's runtime.
    */
  var Runtime: js.UndefOr[typings.awsSdk.lambdaMod.Runtime] = js.undefined
  
  /**
    * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
    */
  var Timeout: js.UndefOr[typings.awsSdk.lambdaMod.Timeout] = js.undefined
  
  /**
    * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
    */
  var TracingConfig: js.UndefOr[typings.awsSdk.lambdaMod.TracingConfig] = js.undefined
  
  /**
    * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.lambdaMod.VpcConfig] = js.undefined
}
object UpdateFunctionConfigurationRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName): UpdateFunctionConfigurationRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateFunctionConfigurationRequestMutableBuilder[Self <: UpdateFunctionConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setFileSystemConfigs(value: FileSystemConfigList): Self = StObject.set(x, "FileSystemConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemConfigsUndefined: Self = StObject.set(x, "FileSystemConfigs", js.undefined)
    
    @scala.inline
    def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = StObject.set(x, "FileSystemConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: Handler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    @scala.inline
    def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    @scala.inline
    def setLayers(value: LayerList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: LayerVersionArn*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
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
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setTracingConfig(value: TracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
