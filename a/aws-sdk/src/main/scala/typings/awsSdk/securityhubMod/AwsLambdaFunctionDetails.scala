package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionDetails extends StObject {
  
  /**
    * An AwsLambdaFunctionCode object.
    */
  var Code: js.UndefOr[AwsLambdaFunctionCode] = js.native
  
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig] = js.native
  
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[AwsLambdaFunctionEnvironment] = js.native
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KmsKeyArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the function was last updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The function's layers.
    */
  var Layers: js.UndefOr[AwsLambdaFunctionLayerList] = js.native
  
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[Integer] = js.native
  
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[Integer] = js.native
  
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.native
  
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.native
}
object AwsLambdaFunctionDetails {
  
  @scala.inline
  def apply(): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionDetailsMutableBuilder[Self <: AwsLambdaFunctionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: AwsLambdaFunctionCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSha256(value: NonEmptyString): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: AwsLambdaFunctionDeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setEnvironment(value: AwsLambdaFunctionEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NonEmptyString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    @scala.inline
    def setHandler(value: NonEmptyString): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: NonEmptyString): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    @scala.inline
    def setLastModified(value: NonEmptyString): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setLayers(value: AwsLambdaFunctionLayerList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: AwsLambdaFunctionLayer*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
    @scala.inline
    def setMasterArn(value: NonEmptyString): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
    
    @scala.inline
    def setMemorySize(value: Integer): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    @scala.inline
    def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setRole(value: NonEmptyString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setRuntime(value: NonEmptyString): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    @scala.inline
    def setTimeout(value: Integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setTracingConfig(value: AwsLambdaFunctionTracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: AwsLambdaFunctionVpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
