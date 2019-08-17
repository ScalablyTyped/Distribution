package typings.atAwsDashSdkClientDashGlacierDashNode.typesCompleteMultipartUploadOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The ID of the archive. This value is also included as part of the location.</p>
    */
  var archiveId: js.UndefOr[String] = js.undefined
  /**
    * <p>The checksum of the archive computed by Amazon Glacier.</p>
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * <p>The relative URI path of the newly added archive resource.</p>
    */
  var location: js.UndefOr[String] = js.undefined
}

object CompleteMultipartUploadOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    archiveId: String = null,
    checksum: String = null,
    location: String = null
  ): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (archiveId != null) __obj.updateDynamic("archiveId")(archiveId)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[CompleteMultipartUploadOutput]
  }
}

