package typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod

import org.scalablytyped.runtime.StringDictionary
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
import typings.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig
import typings.awsSdkClientLambdaNode.typesEnvironmentMod.Environment
import typings.awsSdkClientLambdaNode.typesFunctionCodeMod.FunctionCode
import typings.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig
import typings.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Code: FunctionCode = js.native
  /**
    * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>. </p>
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig] = js.native
  /**
    * <p>A description of the function.</p>
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * <p>Environment variables that are accessible from function code during execution.</p>
    */
  var Environment: js.UndefOr[typings.awsSdkClientLambdaNode.typesEnvironmentMod.Environment] = js.native
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
  var TracingConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig] = js.native
  /**
    * <p>If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.</p>
    */
  var VpcConfig: js.UndefOr[typings.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig] = js.native
}

object CreateFunctionInput {
  @scala.inline
  def apply(
    Code: FunctionCode,
    FunctionName: String,
    Handler: String,
    Role: String,
    Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
  ): CreateFunctionInput = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionInput]
  }
  @scala.inline
  implicit class CreateFunctionInputOps[Self <: CreateFunctionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: FunctionCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionName(value: String): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: String): Self = this.set("Handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(
      value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = this.set("DeadLetterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("DeadLetterConfig", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setKMSKeyArn(value: String): Self = this.set("KMSKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKeyArn: Self = this.set("KMSKeyArn", js.undefined)
    @scala.inline
    def setMemorySize(value: Double): Self = this.set("MemorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemorySize: Self = this.set("MemorySize", js.undefined)
    @scala.inline
    def setPublish(value: Boolean): Self = this.set("Publish", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublish: Self = this.set("Publish", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    @scala.inline
    def setTracingConfig(value: TracingConfig): Self = this.set("TracingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingConfig: Self = this.set("TracingConfig", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

