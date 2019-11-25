package typings.atAwsDashSdkClientDashLambdaDashNode.typesListVersionsByFunctionOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionConfigurationMod._UnmarshalledFunctionConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVersionsByFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A string, present if there are more function versions.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of Lambda function versions.</p>
    */
  var Versions: js.UndefOr[js.Array[_UnmarshalledFunctionConfiguration]] = js.undefined
}

object ListVersionsByFunctionOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextMarker: String = null,
    Versions: js.Array[_UnmarshalledFunctionConfiguration] = null
  ): ListVersionsByFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsByFunctionOutput]
  }
}

