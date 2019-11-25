package typings.atAwsDashSdkClientDashGlacierDashNode.typesListMultipartUploadsOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreUploadListElementMod._UnmarshalledUploadListElement
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of in-progress multipart uploads.</p>
    */
  var UploadsList: js.UndefOr[js.Array[_UnmarshalledUploadListElement]] = js.undefined
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Marker: String = null,
    UploadsList: js.Array[_UnmarshalledUploadListElement] = null
  ): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (UploadsList != null) __obj.updateDynamic("UploadsList")(UploadsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
}

