package typings.atAwsDashSdkClientDashLambdaDashNode.typesGetFunctionOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreConcurrencyMod._UnmarshalledConcurrency
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionCodeLocationMod._UnmarshalledFunctionCodeLocation
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionConfigurationMod._UnmarshalledFunctionConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The function's code.</p>
    */
  var Code: js.UndefOr[_UnmarshalledFunctionCodeLocation] = js.undefined
  /**
    * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var Concurrency: js.UndefOr[_UnmarshalledConcurrency] = js.undefined
  /**
    * <p>The function's configuration.</p>
    */
  var Configuration: js.UndefOr[_UnmarshalledFunctionConfiguration] = js.undefined
  /**
    * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object GetFunctionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Code: _UnmarshalledFunctionCodeLocation = null,
    Concurrency: _UnmarshalledConcurrency = null,
    Configuration: _UnmarshalledFunctionConfiguration = null,
    Tags: StringDictionary[String] = null
  ): GetFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Concurrency != null) __obj.updateDynamic("Concurrency")(Concurrency)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetFunctionOutput]
  }
}

