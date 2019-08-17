package typings.atAwsDashSdkClientDashGlacierDashNode.typesGetDataRetrievalPolicyOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDataRetrievalPolicyMod._UnmarshalledDataRetrievalPolicy
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataRetrievalPolicyOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the returned data retrieval policy in JSON format.</p>
    */
  var Policy: js.UndefOr[_UnmarshalledDataRetrievalPolicy] = js.undefined
}

object GetDataRetrievalPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Policy: _UnmarshalledDataRetrievalPolicy = null): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
}

