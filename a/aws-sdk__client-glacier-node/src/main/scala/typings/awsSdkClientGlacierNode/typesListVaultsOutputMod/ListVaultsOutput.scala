package typings.awsSdkClientGlacierNode.typesListVaultsOutputMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeMod.UnmarshalledDescribeVaultOutput
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVaultsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>List of vaults.</p>
    */
  var VaultList: js.UndefOr[js.Array[UnmarshalledDescribeVaultOutput]] = js.undefined
}

object ListVaultsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Marker: String = null,
    VaultList: js.Array[UnmarshalledDescribeVaultOutput] = null
  ): ListVaultsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (VaultList != null) __obj.updateDynamic("VaultList")(VaultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVaultsOutput]
  }
}

