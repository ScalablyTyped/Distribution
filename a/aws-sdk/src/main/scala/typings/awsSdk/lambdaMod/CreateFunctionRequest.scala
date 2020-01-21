package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunctionRequest extends js.Object {
  /**
    * The code for the function.
    */
  var Code: FunctionCode = js.native
  /**
    * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead Letter Queues.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.lambdaMod.DeadLetterConfig] = js.native
  /**
    * A description of the function.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * Environment variables that are accessible from function code during execution.
    */
  var Environment: js.UndefOr[typings.awsSdk.lambdaMod.Environment] = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model.
    */
  var Handler: typings.awsSdk.lambdaMod.Handler = js.native
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.lambdaMod.KMSKeyArn] = js.native
  /**
    * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
    */
  var Layers: js.UndefOr[LayerList] = js.native
  /**
    * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
    */
  var MemorySize: js.UndefOr[typings.awsSdk.lambdaMod.MemorySize] = js.native
  /**
    * Set to true to publish the first version of the function during creation.
    */
  var Publish: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the function's execution role.
    */
  var Role: RoleArn = js.native
  /**
    * The identifier of the function's runtime.
    */
  var Runtime: typings.awsSdk.lambdaMod.Runtime = js.native
  /**
    * A list of tags to apply to the function.
    */
  var Tags: js.UndefOr[typings.awsSdk.lambdaMod.Tags] = js.native
  /**
    * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
    */
  var Timeout: js.UndefOr[typings.awsSdk.lambdaMod.Timeout] = js.native
  /**
    * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
    */
  var TracingConfig: js.UndefOr[typings.awsSdk.lambdaMod.TracingConfig] = js.native
  /**
    * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.lambdaMod.VpcConfig] = js.native
}

object CreateFunctionRequest {
  @scala.inline
  def apply(
    Code: FunctionCode,
    FunctionName: FunctionName,
    Handler: Handler,
    Role: RoleArn,
    Runtime: Runtime,
    DeadLetterConfig: DeadLetterConfig = null,
    Description: Description = null,
    Environment: Environment = null,
    KMSKeyArn: KMSKeyArn = null,
    Layers: LayerList = null,
    MemorySize: Int | Double = null,
    Publish: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: Tags = null,
    Timeout: Int | Double = null,
    TracingConfig: TracingConfig = null,
    VpcConfig: VpcConfig = null
  ): CreateFunctionRequest = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn.asInstanceOf[js.Any])
    if (Layers != null) __obj.updateDynamic("Layers")(Layers.asInstanceOf[js.Any])
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (!js.isUndefined(Publish)) __obj.updateDynamic("Publish")(Publish.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionRequest]
  }
}

