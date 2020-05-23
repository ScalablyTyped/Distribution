package typings.awsSdkClientLambdaNode.typesCreateFunctionOutputMod

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
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typings.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typings.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The SHA256 hash of the function's deployment package.</p>
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  /**
    * <p>The size of the function's deployment package in bytes.</p>
    */
  var CodeSize: js.UndefOr[Double] = js.undefined
  /**
    * <p>The function's dead letter queue.</p>
    */
  var DeadLetterConfig: js.UndefOr[UnmarshalledDeadLetterConfig] = js.undefined
  /**
    * <p>The function's description.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>The function's environment variables.</p>
    */
  var Environment: js.UndefOr[UnmarshalledEnvironmentResponse] = js.undefined
  /**
    * <p>The function's Amazon Resource Name.</p>
    */
  var FunctionArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the function.</p>
    */
  var FunctionName: js.UndefOr[String] = js.undefined
  /**
    * <p>The function Lambda calls to begin executing your function.</p>
    */
  var Handler: js.UndefOr[String] = js.undefined
  /**
    * <p>The KMS key used to encrypt the function's environment variables. Only returned if you've configured a customer managed CMK.</p>
    */
  var KMSKeyArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ssTZD).</p>
    */
  var LastModified: js.UndefOr[String] = js.undefined
  /**
    * <p>The ARN of the master function.</p>
    */
  var MasterArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The memory allocated to the function</p>
    */
  var MemorySize: js.UndefOr[Double] = js.undefined
  /**
    * <p>Represents the latest updated revision of the function or alias.</p>
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * <p>The function's execution role.</p>
    */
  var Role: js.UndefOr[String] = js.undefined
  /**
    * <p>The runtime environment for the Lambda function.</p>
    */
  var Runtime: js.UndefOr[
    nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
  ] = js.undefined
  /**
    * <p>The amount of time that Lambda allows a function to run before terminating it.</p>
    */
  var Timeout: js.UndefOr[Double] = js.undefined
  /**
    * <p>The function's AWS X-Ray tracing configuration.</p>
    */
  var TracingConfig: js.UndefOr[UnmarshalledTracingConfigResponse] = js.undefined
  /**
    * <p>The version of the Lambda function.</p>
    */
  var Version: js.UndefOr[String] = js.undefined
  /**
    * <p>The function's networking configuration.</p>
    */
  var VpcConfig: js.UndefOr[UnmarshalledVpcConfigResponse] = js.undefined
}

object CreateFunctionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CodeSha256: String = null,
    CodeSize: js.UndefOr[Double] = js.undefined,
    DeadLetterConfig: UnmarshalledDeadLetterConfig = null,
    Description: String = null,
    Environment: UnmarshalledEnvironmentResponse = null,
    FunctionArn: String = null,
    FunctionName: String = null,
    Handler: String = null,
    KMSKeyArn: String = null,
    LastModified: String = null,
    MasterArn: String = null,
    MemorySize: js.UndefOr[Double] = js.undefined,
    RevisionId: String = null,
    Role: String = null,
    Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String = null,
    Timeout: js.UndefOr[Double] = js.undefined,
    TracingConfig: UnmarshalledTracingConfigResponse = null,
    Version: String = null,
    VpcConfig: UnmarshalledVpcConfigResponse = null
  ): CreateFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256.asInstanceOf[js.Any])
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize.get.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (Handler != null) __obj.updateDynamic("Handler")(Handler.asInstanceOf[js.Any])
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (MasterArn != null) __obj.updateDynamic("MasterArn")(MasterArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MemorySize)) __obj.updateDynamic("MemorySize")(MemorySize.get.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout.get.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionOutput]
  }
}

