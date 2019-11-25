package typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyOutputMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreKeyMetadataMod._UnmarshalledKeyMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var KeyMetadata: js.UndefOr[_UnmarshalledKeyMetadata] = js.undefined
}

object CreateKeyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyMetadata: _UnmarshalledKeyMetadata = null): CreateKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOutput]
  }
}

