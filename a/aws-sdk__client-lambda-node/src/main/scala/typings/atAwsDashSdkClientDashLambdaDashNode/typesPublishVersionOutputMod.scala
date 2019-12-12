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
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreDeadLetterConfigMod._UnmarshalledDeadLetterConfig
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentResponseMod._UnmarshalledEnvironmentResponse
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigResponseMod._UnmarshalledTracingConfigResponse
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigResponseMod._UnmarshalledVpcConfigResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/PublishVersionOutput", JSImport.Namespace)
@js.native
object typesPublishVersionOutputMod extends js.Object {
  @js.native
  trait PublishVersionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The SHA256 hash of the function's deployment package.</p>
      */
    var CodeSha256: js.UndefOr[String] = js.native
    /**
      * <p>The size of the function's deployment package in bytes.</p>
      */
    var CodeSize: js.UndefOr[Double] = js.native
    /**
      * <p>The function's dead letter queue.</p>
      */
    var DeadLetterConfig: js.UndefOr[_UnmarshalledDeadLetterConfig] = js.native
    /**
      * <p>The function's description.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>The function's environment variables.</p>
      */
    var Environment: js.UndefOr[_UnmarshalledEnvironmentResponse] = js.native
    /**
      * <p>The function's Amazon Resource Name.</p>
      */
    var FunctionArn: js.UndefOr[String] = js.native
    /**
      * <p>The name of the function.</p>
      */
    var FunctionName: js.UndefOr[String] = js.native
    /**
      * <p>The function Lambda calls to begin executing your function.</p>
      */
    var Handler: js.UndefOr[String] = js.native
    /**
      * <p>The KMS key used to encrypt the function's environment variables. Only returned if you've configured a customer managed CMK.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.native
    /**
      * <p>The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ssTZD).</p>
      */
    var LastModified: js.UndefOr[String] = js.native
    /**
      * <p>The ARN of the master function.</p>
      */
    var MasterArn: js.UndefOr[String] = js.native
    /**
      * <p>The memory allocated to the function</p>
      */
    var MemorySize: js.UndefOr[Double] = js.native
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.native
    /**
      * <p>The function's execution role.</p>
      */
    var Role: js.UndefOr[String] = js.native
    /**
      * <p>The runtime environment for the Lambda function.</p>
      */
    var Runtime: js.UndefOr[
        nodejs | nodejs4DOT3 | nodejs6DOT10 | nodejs8DOT10 | java8 | python2DOT7 | python3DOT6 | dotnetcore1DOT0 | dotnetcore2DOT0 | dotnetcore2DOT1 | `nodejs4DOT3-edge` | go1DOTx | String
      ] = js.native
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it.</p>
      */
    var Timeout: js.UndefOr[Double] = js.native
    /**
      * <p>The function's AWS X-Ray tracing configuration.</p>
      */
    var TracingConfig: js.UndefOr[_UnmarshalledTracingConfigResponse] = js.native
    /**
      * <p>The version of the Lambda function.</p>
      */
    var Version: js.UndefOr[String] = js.native
    /**
      * <p>The function's networking configuration.</p>
      */
    var VpcConfig: js.UndefOr[_UnmarshalledVpcConfigResponse] = js.native
  }
  
}

