package typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDifferenceMod.UnmarshalledDifference
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDifferencesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).</p>
    */
  var differences: js.UndefOr[js.Array[UnmarshalledDifference]] = js.undefined
}

object GetDifferencesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    differences: js.Array[UnmarshalledDifference] = null
  ): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (differences != null) __obj.updateDynamic("differences")(differences.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesOutput]
  }
}

