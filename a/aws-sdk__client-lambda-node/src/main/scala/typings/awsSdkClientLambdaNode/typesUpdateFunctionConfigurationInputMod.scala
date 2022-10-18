package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig
import typings.awsSdkClientLambdaNode.typesEnvironmentMod.Environment
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig
import typings.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateFunctionConfigurationInputMod {
  
  trait UpdateFunctionConfigurationInput
    extends StObject
       with _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.</p>
      */
    var DeadLetterConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig] = js.undefined
    
    /**
      * <p>A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as you see fit.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The parent object that contains your environment's configuration settings.</p>
      */
    var Environment: js.UndefOr[typings.awsSdkClientLambdaNode.typesEnvironmentMod.Environment] = js.undefined
    
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String
    
    /**
      * <p>The function that Lambda calls to begin executing your function. For Node.js, it is the <code>module-name.export</code> value in your function. </p>
      */
    var Handler: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For example, a database operation might need less memory compared to an image processing function. The default value is 128 MB. The value must be a multiple of 64 MB.</p>
      */
    var MemorySize: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An optional value you can use to ensure you are updating the latest update of the function version or alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.</p>
      */
    var Role: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The runtime version for the function.</p>
      */
    var Runtime: js.UndefOr[
        nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ] = js.undefined
    
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.</p>
      */
    var Timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.</p>
      */
    var TracingConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig] = js.undefined
    
    /**
      * <p>Specify security groups and subnets in a VPC to which your Lambda function needs access.</p>
      */
    var VpcConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig] = js.undefined
  }
  object UpdateFunctionConfigurationInput {
    
    inline def apply(FunctionName: String): UpdateFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateFunctionConfigurationInput]
    }
    
    extension [Self <: UpdateFunctionConfigurationInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
      
      inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
      
      inline def setKMSKeyArn(value: String): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
      
      inline def setMemorySize(value: Double): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
      
      inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
      
      inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
      
      inline def setRuntime(
        value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
      
      inline def setTracingConfig(value: TracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
      
      inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
      
      inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
    }
  }
}
