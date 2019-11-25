package typings.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateRandomOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateRandomOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var Plaintext: js.UndefOr[Uint8Array] = js.undefined
}

object GenerateRandomOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Plaintext: Uint8Array = null): GenerateRandomOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateRandomOutput]
  }
}

