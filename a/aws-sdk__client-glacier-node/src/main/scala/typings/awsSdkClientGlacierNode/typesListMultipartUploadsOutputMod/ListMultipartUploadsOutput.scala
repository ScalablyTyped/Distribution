package typings.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadListElementMod.UnmarshalledUploadListElement
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * <p>A list of in-progress multipart uploads.</p>
    */
  var UploadsList: js.UndefOr[js.Array[UnmarshalledUploadListElement]] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  @scala.inline
  implicit class ListMultipartUploadsOutputOps[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setUploadsListVarargs(value: UnmarshalledUploadListElement*): Self = this.set("UploadsList", js.Array(value :_*))
    @scala.inline
    def setUploadsList(value: js.Array[UnmarshalledUploadListElement]): Self = this.set("UploadsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadsList: Self = this.set("UploadsList", js.undefined)
  }
  
}

