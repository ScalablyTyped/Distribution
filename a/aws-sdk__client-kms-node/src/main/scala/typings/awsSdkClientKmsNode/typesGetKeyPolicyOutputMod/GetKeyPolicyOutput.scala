package typings.awsSdkClientKmsNode.typesGetKeyPolicyOutputMod

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPolicyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A key policy document in JSON format.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object GetKeyPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Policy: String = null): GetKeyPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPolicyOutput]
  }
}

