package typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesVaultAccessPolicyMod.UnmarshalledVaultAccessPolicy
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultAccessPolicyOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the returned vault access policy as a JSON string.</p>
    */
  var policy: js.UndefOr[UnmarshalledVaultAccessPolicy] = js.undefined
}

object GetVaultAccessPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, policy: UnmarshalledVaultAccessPolicy = null): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
}

