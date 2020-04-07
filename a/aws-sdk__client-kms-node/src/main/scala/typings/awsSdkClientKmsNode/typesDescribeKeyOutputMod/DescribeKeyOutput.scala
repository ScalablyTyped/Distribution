package typings.awsSdkClientKmsNode.typesDescribeKeyOutputMod

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Metadata associated with the key.</p>
    */
  var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.undefined
}

object DescribeKeyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyMetadata: UnmarshalledKeyMetadata = null): DescribeKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyOutput]
  }
}

