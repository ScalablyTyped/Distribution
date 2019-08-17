package typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultAccessPolicyOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultAccessPolicyMod._UnmarshalledVaultAccessPolicy
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var policy: js.UndefOr[_UnmarshalledVaultAccessPolicy] = js.undefined
}

object GetVaultAccessPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, policy: _UnmarshalledVaultAccessPolicy = null): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
}

