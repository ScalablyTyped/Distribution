package typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteMultipartUploadOutput extends _OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The ID of the archive. This value is also included as part of the location.</p>
    */
  var archiveId: js.UndefOr[String] = js.native
  
  /**
    * <p>The checksum of the archive computed by Amazon Glacier.</p>
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * <p>The relative URI path of the newly added archive resource.</p>
    */
  var location: js.UndefOr[String] = js.native
}
object CompleteMultipartUploadOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadOutput]
  }
  
  @scala.inline
  implicit class CompleteMultipartUploadOutputOps[Self <: CompleteMultipartUploadOutput] (val x: Self) extends AnyVal {
    
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
    def setArchiveId(value: String): Self = this.set("archiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveId: Self = this.set("archiveId", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
