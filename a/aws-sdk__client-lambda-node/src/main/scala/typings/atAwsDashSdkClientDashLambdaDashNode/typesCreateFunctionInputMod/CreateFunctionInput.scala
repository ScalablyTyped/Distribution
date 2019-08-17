package typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionInputMod

import org.scalablytyped.runtime.StringDictionary
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
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionCodeMod._FunctionCode
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigMod._TracingConfig
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigMod._VpcConfig
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionInput extends _InputTypesUnion {
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
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The code for the function.</p>
    */
  var Code: _FunctionCode
  /**
    * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>. </p>
    */
  var DeadLetterConfig: js.UndefOr[_DeadLetterConfig] = js.undefined
  /**
    * <p>A description of the function.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>Environment variables that are accessible from function code during execution.</p>
    */
  var Environment: js.UndefOr[_Environment] = js.undefined
  /**
    * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
    */
  var FunctionName: String
  /**
    * <p>The name of the method within your code that Lambda calls to execute your function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.</p>
    */
  var Handler: String
  /**
    * <p>The ARN of the KMS key used to encrypt your function's environment variables. If not provided, AWS Lambda will use a default service key.</p>
    */
  var KMSKeyArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The amount of memory that your function has access to. Increasing the function's memory also increases it's CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.</p>
    */
  var MemorySize: js.UndefOr[Double] = js.undefined
  /**
    * <p>Set to true to publish the first version of the function during creation.</p>
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the function's <a href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">execution role</a>.</p>
    */
  var Role: String
  /**
    * <p>The runtime version for the function.</p>
    */
  var Runtime: nodejs | nodejs4DOT3 | nodejs6DOT10 | nodejs8DOT10 | java8 | python2DOT7 | python3DOT6 | dotnetcore1DOT0 | dotnetcore2DOT0 | dotnetcore2DOT1 | `nodejs4DOT3-edge` | go1DOTx | String
  /**
    * <p>The list of tags (key-value pairs) assigned to the new function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.</p>
    */
  var Timeout: js.UndefOr[Double] = js.undefined
  /**
    * <p>Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.</p>
    */
  var TracingConfig: js.UndefOr[_TracingConfig] = js.undefined
  /**
    * <p>If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.</p>
    */
  var VpcConfig: js.UndefOr[_VpcConfig] = js.undefined
}

object CreateFunctionInput {
  @scala.inline
  def apply(
    Code: _FunctionCode,
    FunctionName: String,
    Handler: String,
    Role: String,
    Runtime: nodejs | nodejs4DOT3 | nodejs6DOT10 | nodejs8DOT10 | java8 | python2DOT7 | python3DOT6 | dotnetcore1DOT0 | dotnetcore2DOT0 | dotnetcore2DOT1 | `nodejs4DOT3-edge` | go1DOTx | String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    DeadLetterConfig: _DeadLetterConfig = null,
    Description: String = null,
    Environment: _Environment = null,
    KMSKeyArn: String = null,
    MemorySize: Int | Double = null,
    Publish: js.UndefOr[Boolean] = js.undefined,
    Tags: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    Timeout: Int | Double = null,
    TracingConfig: _TracingConfig = null,
    VpcConfig: _VpcConfig = null
  ): CreateFunctionInput = {
    val __obj = js.Dynamic.literal(Code = Code, FunctionName = FunctionName, Handler = Handler, Role = Role, Runtime = Runtime.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn)
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (!js.isUndefined(Publish)) __obj.updateDynamic("Publish")(Publish)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[CreateFunctionInput]
  }
}

