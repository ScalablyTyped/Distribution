package typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateMultipartUploadOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The relative URI path of the multipart upload ID Amazon Glacier created.</p>
    */
  var location: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the multipart upload. This value is also included as part of the location.</p>
    */
  var uploadId: js.UndefOr[String] = js.native
}

object InitiateMultipartUploadOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
  @scala.inline
  implicit class InitiateMultipartUploadOutputOps[Self <: InitiateMultipartUploadOutput] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
  }
  
}

