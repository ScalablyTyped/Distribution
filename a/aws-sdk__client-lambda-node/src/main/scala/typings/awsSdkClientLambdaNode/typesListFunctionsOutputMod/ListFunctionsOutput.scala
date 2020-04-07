package typings.awsSdkClientLambdaNode.typesListFunctionsOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFunctionsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of Lambda functions.</p>
    */
  var Functions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.undefined
  /**
    * <p>A string, present if there are more functions.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListFunctionsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Functions: js.Array[UnmarshalledFunctionConfiguration] = null,
    NextMarker: String = null
  ): ListFunctionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Functions != null) __obj.updateDynamic("Functions")(Functions.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionsOutput]
  }
}

