package typings.awsSdkClientKmsBrowser.typesCreateKeyOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Metadata associated with the CMK.</p>
    */
  var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.undefined
}

object CreateKeyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyMetadata: UnmarshalledKeyMetadata = null): CreateKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOutput]
  }
}

