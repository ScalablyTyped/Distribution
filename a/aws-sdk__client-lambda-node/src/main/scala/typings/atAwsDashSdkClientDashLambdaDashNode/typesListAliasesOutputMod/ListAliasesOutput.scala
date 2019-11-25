package typings.atAwsDashSdkClientDashLambdaDashNode.typesListAliasesOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasConfigurationMod._UnmarshalledAliasConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of aliases.</p>
    */
  var Aliases: js.UndefOr[js.Array[_UnmarshalledAliasConfiguration]] = js.undefined
  /**
    * <p>A string, present if there are more aliases.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListAliasesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Aliases: js.Array[_UnmarshalledAliasConfiguration] = null,
    NextMarker: String = null
  ): ListAliasesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesOutput]
  }
}

