package typings.awsSdkClientGlacierNode.typesGetJobOutputOutputMod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobOutputOutput[StreamType] extends js.Object {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Indicates the range units accepted. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>. </p>
    */
  var acceptRanges: js.UndefOr[String] = js.native
  /**
    * <p>The description of an archive.</p>
    */
  var archiveDescription: js.UndefOr[String] = js.native
  /**
    * <p>The job data, either archive data or inventory data.</p>
    */
  var body: js.UndefOr[StreamType] = js.native
  /**
    * <p>The checksum of the data in the response. This header is returned only when retrieving the output for an archive retrieval job. Furthermore, this header appears only under the following conditions:</p> <ul> <li> <p>You get the entire range of the archive.</p> </li> <li> <p>You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the x-amz-sha256-tree-hash is returned as a response header.</p> </li> <li> <p>You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.</p> </li> </ul>
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * <p>The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.</p>
    */
  var contentRange: js.UndefOr[String] = js.native
  /**
    * <p>The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the Content-Type is application/json.</p>
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * <p>The HTTP response code for a job output request. The value depends on whether a range was specified in the request.</p>
    */
  var status: js.UndefOr[Double] = js.native
}

object GetJobOutputOutput {
  @scala.inline
  def apply[StreamType]($metadata: ResponseMetadata): GetJobOutputOutput[StreamType] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobOutputOutput[StreamType]]
  }
  @scala.inline
  implicit class GetJobOutputOutputOps[Self <: GetJobOutputOutput[_], StreamType] (val x: Self with GetJobOutputOutput[StreamType]) extends AnyVal {
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
    def setAcceptRanges(value: String): Self = this.set("acceptRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptRanges: Self = this.set("acceptRanges", js.undefined)
    @scala.inline
    def setArchiveDescription(value: String): Self = this.set("archiveDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveDescription: Self = this.set("archiveDescription", js.undefined)
    @scala.inline
    def setBody(value: StreamType): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    @scala.inline
    def setContentRange(value: String): Self = this.set("contentRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentRange: Self = this.set("contentRange", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

