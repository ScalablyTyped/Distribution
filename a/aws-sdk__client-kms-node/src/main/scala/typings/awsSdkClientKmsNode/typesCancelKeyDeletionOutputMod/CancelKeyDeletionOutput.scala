package typings.awsSdkClientKmsNode.typesCancelKeyDeletionOutputMod

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelKeyDeletionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The unique identifier of the master key for which deletion is canceled.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}

object CancelKeyDeletionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyId: String = null): CancelKeyDeletionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelKeyDeletionOutput]
  }
}

