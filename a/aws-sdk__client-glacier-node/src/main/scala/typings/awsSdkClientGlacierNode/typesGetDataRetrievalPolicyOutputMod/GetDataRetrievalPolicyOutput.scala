package typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod.UnmarshalledDataRetrievalPolicy
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var Policy: js.UndefOr[UnmarshalledDataRetrievalPolicy] = js.undefined
}

object GetDataRetrievalPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Policy: UnmarshalledDataRetrievalPolicy = null): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
}

