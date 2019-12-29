package typings.atAwsDashSdkClientDashLambdaDashNode

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.`nodejs4Dot3-edge`
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore1Dot0
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2Dot0
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2Dot1
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.go1Dotx
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.java8
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs4Dot3
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs6Dot10
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs8Dot10
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python2Dot7
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python3Dot6
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

@JSImport("@aws-sdk/client-lambda-node/types/CreateFunctionInput", JSImport.Namespace)
@js.native
object typesCreateFunctionInputMod extends js.Object {
  @js.native
  trait CreateFunctionInput extends _InputTypesUnion {
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
      * <p>The code for the function.</p>
      */
    var Code: _FunctionCode = js.native
    /**
      * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>. </p>
      */
    var DeadLetterConfig: js.UndefOr[_DeadLetterConfig] = js.native
    /**
      * <p>A description of the function.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>Environment variables that are accessible from function code during execution.</p>
      */
    var Environment: js.UndefOr[_Environment] = js.native
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String = js.native
    /**
      * <p>The name of the method within your code that Lambda calls to execute your function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.</p>
      */
    var Handler: String = js.native
    /**
      * <p>The ARN of the KMS key used to encrypt your function's environment variables. If not provided, AWS Lambda will use a default service key.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.native
    /**
      * <p>The amount of memory that your function has access to. Increasing the function's memory also increases it's CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.</p>
      */
    var MemorySize: js.UndefOr[Double] = js.native
    /**
      * <p>Set to true to publish the first version of the function during creation.</p>
      */
    var Publish: js.UndefOr[Boolean] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the function's <a href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">execution role</a>.</p>
      */
    var Role: String = js.native
    /**
      * <p>The runtime version for the function.</p>
      */
    var Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String = js.native
    /**
      * <p>The list of tags (key-value pairs) assigned to the new function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.</p>
      */
    var Timeout: js.UndefOr[Double] = js.native
    /**
      * <p>Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.</p>
      */
    var TracingConfig: js.UndefOr[_TracingConfig] = js.native
    /**
      * <p>If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.</p>
      */
    var VpcConfig: js.UndefOr[_VpcConfig] = js.native
  }
  
}

