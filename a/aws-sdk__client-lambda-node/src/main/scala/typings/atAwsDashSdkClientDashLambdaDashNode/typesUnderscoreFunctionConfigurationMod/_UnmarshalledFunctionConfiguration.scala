package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionConfigurationMod

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
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreDeadLetterConfigMod._UnmarshalledDeadLetterConfig
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentResponseMod._UnmarshalledEnvironmentResponse
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigResponseMod._UnmarshalledTracingConfigResponse
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigResponseMod._UnmarshalledVpcConfigResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledFunctionConfiguration extends _FunctionConfiguration {
  /**
    * <p>The function's dead letter queue.</p>
    */
  @JSName("DeadLetterConfig")
  var DeadLetterConfig__UnmarshalledFunctionConfiguration: js.UndefOr[_UnmarshalledDeadLetterConfig] = js.undefined
  /**
    * <p>The function's environment variables.</p>
    */
  @JSName("Environment")
  var Environment__UnmarshalledFunctionConfiguration: js.UndefOr[_UnmarshalledEnvironmentResponse] = js.undefined
  /**
    * <p>The function's AWS X-Ray tracing configuration.</p>
    */
  @JSName("TracingConfig")
  var TracingConfig__UnmarshalledFunctionConfiguration: js.UndefOr[_UnmarshalledTracingConfigResponse] = js.undefined
  /**
    * <p>The function's networking configuration.</p>
    */
  @JSName("VpcConfig")
  var VpcConfig__UnmarshalledFunctionConfiguration: js.UndefOr[_UnmarshalledVpcConfigResponse] = js.undefined
}

object _UnmarshalledFunctionConfiguration {
  @scala.inline
  def apply(
    CodeSha256: String = null,
    CodeSize: Int | Double = null,
    DeadLetterConfig: _UnmarshalledDeadLetterConfig = null,
    Description: String = null,
    Environment: _UnmarshalledEnvironmentResponse = null,
    FunctionArn: String = null,
    FunctionName: String = null,
    Handler: String = null,
    KMSKeyArn: String = null,
    LastModified: String = null,
    MasterArn: String = null,
    MemorySize: Int | Double = null,
    RevisionId: String = null,
    Role: String = null,
    Runtime: nodejs | nodejs4DOT3 | nodejs6DOT10 | nodejs8DOT10 | java8 | python2DOT7 | python3DOT6 | dotnetcore1DOT0 | dotnetcore2DOT0 | dotnetcore2DOT1 | `nodejs4DOT3-edge` | go1DOTx | String = null,
    Timeout: Int | Double = null,
    TracingConfig: _UnmarshalledTracingConfigResponse = null,
    Version: String = null,
    VpcConfig: _UnmarshalledVpcConfigResponse = null
  ): _UnmarshalledFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256.asInstanceOf[js.Any])
    if (CodeSize != null) __obj.updateDynamic("CodeSize")(CodeSize.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (Handler != null) __obj.updateDynamic("Handler")(Handler.asInstanceOf[js.Any])
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (MasterArn != null) __obj.updateDynamic("MasterArn")(MasterArn.asInstanceOf[js.Any])
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledFunctionConfiguration]
  }
}

