package typings.awsSdkClientLambdaNode.typesGetFunctionOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typings.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.undefined
  /**
    * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.undefined
  /**
    * <p>The function's configuration.</p>
    */
  var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.undefined
  /**
    * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object GetFunctionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Code: UnmarshalledFunctionCodeLocation = null,
    Concurrency: UnmarshalledConcurrency = null,
    Configuration: UnmarshalledFunctionConfiguration = null,
    Tags: StringDictionary[String] = null
  ): GetFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Concurrency != null) __obj.updateDynamic("Concurrency")(Concurrency.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionOutput]
  }
}

