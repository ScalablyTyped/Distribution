package typings.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMultipartPartOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The SHA256 tree hash that Amazon Glacier computed for the uploaded part.</p>
    */
  var checksum: js.UndefOr[String] = js.undefined
}

object UploadMultipartPartOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, checksum: String = null): UploadMultipartPartOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMultipartPartOutput]
  }
}

