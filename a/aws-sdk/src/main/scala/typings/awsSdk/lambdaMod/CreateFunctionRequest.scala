package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFunctionRequest extends StObject {
  
  /**
    * The code for the function.
    */
  var Code: FunctionCode
  
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
  var Handler: typings.awsSdk.lambdaMod.Handler
  
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
    * Set to true to publish the first version of the function during creation.
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the function's execution role.
    */
  var Role: RoleArn
  
  /**
    * The identifier of the function's runtime.
    */
  var Runtime: typings.awsSdk.lambdaMod.Runtime
  
  /**
    * A list of tags to apply to the function.
    */
  var Tags: js.UndefOr[typings.awsSdk.lambdaMod.Tags] = js.undefined
  
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
object CreateFunctionRequest {
  
  inline def apply(Code: FunctionCode, FunctionName: FunctionName, Handler: Handler, Role: RoleArn, Runtime: Runtime): CreateFunctionRequest = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionRequest]
  }
  
  extension [Self <: CreateFunctionRequest](x: Self) {
    
    inline def setCode(value: FunctionCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setFileSystemConfigs(value: FileSystemConfigList): Self = StObject.set(x, "FileSystemConfigs", value.asInstanceOf[js.Any])
    
    inline def setFileSystemConfigsUndefined: Self = StObject.set(x, "FileSystemConfigs", js.undefined)
    
    inline def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = StObject.set(x, "FileSystemConfigs", js.Array(value :_*))
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    inline def setLayers(value: LayerList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: LayerVersionArn*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
    inline def setMemorySize(value: MemorySize): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "Publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "Publish", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTracingConfig(value: TracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
