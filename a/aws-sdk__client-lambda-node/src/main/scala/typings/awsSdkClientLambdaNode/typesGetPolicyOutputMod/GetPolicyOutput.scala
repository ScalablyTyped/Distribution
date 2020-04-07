package typings.awsSdkClientLambdaNode.typesGetPolicyOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The resource policy associated with the specified function. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents the latest updated revision of the function or alias.</p>
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}

object GetPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Policy: String = null, RevisionId: String = null): GetPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyOutput]
  }
}

