package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.`nodejs4DOT3-edge`
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore1DOT0
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2DOT0
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2DOT1
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.go1DOTx
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.java8
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs4DOT3
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs6DOT10
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs8DOT10
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python2DOT7
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python3DOT6
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreDeadLetterConfigMod._DeadLetterConfig
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentMod._Environment
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigMod._TracingConfig
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigMod._VpcConfig
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/UpdateFunctionConfigurationInput", JSImport.Namespace)
@js.native
object typesUpdateFunctionConfigurationInputMod extends js.Object {
  @js.native
  trait UpdateFunctionConfigurationInput extends _InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.</p>
      */
    var DeadLetterConfig: js.UndefOr[_DeadLetterConfig] = js.native
    /**
      * <p>A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as you see fit.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>The parent object that contains your environment's configuration settings.</p>
      */
    var Environment: js.UndefOr[_Environment] = js.native
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String = js.native
    /**
      * <p>The function that Lambda calls to begin executing your function. For Node.js, it is the <code>module-name.export</code> value in your function. </p>
      */
    var Handler: js.UndefOr[String] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.native
    /**
      * <p>The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For example, a database operation might need less memory compared to an image processing function. The default value is 128 MB. The value must be a multiple of 64 MB.</p>
      */
    var MemorySize: js.UndefOr[Double] = js.native
    /**
      * <p>An optional value you can use to ensure you are updating the latest update of the function version or alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>.</p>
      */
    var RevisionId: js.UndefOr[String] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.</p>
      */
    var Role: js.UndefOr[String] = js.native
    /**
      * <p>The runtime version for the function.</p>
      */
    var Runtime: js.UndefOr[
        nodejs | nodejs4DOT3 | nodejs6DOT10 | nodejs8DOT10 | java8 | python2DOT7 | python3DOT6 | dotnetcore1DOT0 | dotnetcore2DOT0 | dotnetcore2DOT1 | `nodejs4DOT3-edge` | go1DOTx | String
      ] = js.native
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.</p>
      */
    var Timeout: js.UndefOr[Double] = js.native
    /**
      * <p>Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.</p>
      */
    var TracingConfig: js.UndefOr[_TracingConfig] = js.native
    /**
      * <p>Specify security groups and subnets in a VPC to which your Lambda function needs access.</p>
      */
    var VpcConfig: js.UndefOr[_VpcConfig] = js.native
  }
  
}

