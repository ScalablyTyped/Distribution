package typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateMultipartUploadOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateMultipartUploadOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The relative URI path of the multipart upload ID Amazon Glacier created.</p>
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the multipart upload. This value is also included as part of the location.</p>
    */
  var uploadId: js.UndefOr[String] = js.undefined
}

object InitiateMultipartUploadOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, location: String = null, uploadId: String = null): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
}

