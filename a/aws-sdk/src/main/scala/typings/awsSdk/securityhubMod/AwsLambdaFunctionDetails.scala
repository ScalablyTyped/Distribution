package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionDetails extends js.Object {
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
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
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
  def apply(
    Code: AwsLambdaFunctionCode = null,
    CodeSha256: NonEmptyString = null,
    DeadLetterConfig: AwsLambdaFunctionDeadLetterConfig = null,
    Environment: AwsLambdaFunctionEnvironment = null,
    FunctionName: NonEmptyString = null,
    Handler: NonEmptyString = null,
    KmsKeyArn: NonEmptyString = null,
    LastModified: NonEmptyString = null,
    Layers: AwsLambdaFunctionLayerList = null,
    MasterArn: NonEmptyString = null,
    MemorySize: Int | scala.Double = null,
    RevisionId: NonEmptyString = null,
    Role: NonEmptyString = null,
    Runtime: NonEmptyString = null,
    Timeout: Int | scala.Double = null,
    TracingConfig: AwsLambdaFunctionTracingConfig = null,
    Version: NonEmptyString = null,
    VpcConfig: AwsLambdaFunctionVpcConfig = null
  ): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (Handler != null) __obj.updateDynamic("Handler")(Handler.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Layers != null) __obj.updateDynamic("Layers")(Layers.asInstanceOf[js.Any])
    if (MasterArn != null) __obj.updateDynamic("MasterArn")(MasterArn.asInstanceOf[js.Any])
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
}

