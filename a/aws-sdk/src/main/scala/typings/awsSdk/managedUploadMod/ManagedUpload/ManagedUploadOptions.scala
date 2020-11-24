package typings.awsSdk.managedUploadMod.ManagedUpload

import typings.awsSdk.s3Mod.PutObjectRequest
import typings.awsSdk.s3Mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedUploadOptions extends js.Object {
  
  /**
    * Default: false
    * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
    */
  var leavePartsOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * A map of parameters to pass to the upload requests.
    * The "Body" parameter is required to be specified either on the service or in the params option.
    */
  var params: js.UndefOr[PutObjectRequest] = js.native
  
  /**
    * Default: 5 mb
    * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
    */
  var partSize: js.UndefOr[Double] = js.native
  
  /**
    * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
    * default: 4
    */
  var queueSize: js.UndefOr[Double] = js.native
  
  /**
    * An optional S3 service object to use for requests.
    * This object might have bound parameters used by the uploader.
    */
  var service: js.UndefOr[typings.awsSdk.s3Mod.^] = js.native
  
  /**
    * The tags to apply to the object.
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
object ManagedUploadOptions {
  
  @scala.inline
  def apply(): ManagedUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedUploadOptions]
  }
  
  @scala.inline
  implicit class ManagedUploadOptionsOps[Self <: ManagedUploadOptions] (val x: Self) extends AnyVal {
    
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
    def setLeavePartsOnError(value: Boolean): Self = this.set("leavePartsOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeavePartsOnError: Self = this.set("leavePartsOnError", js.undefined)
    
    @scala.inline
    def setParams(value: PutObjectRequest): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    
    @scala.inline
    def setQueueSize(value: Double): Self = this.set("queueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueSize: Self = this.set("queueSize", js.undefined)
    
    @scala.inline
    def setService(value: typings.awsSdk.s3Mod.^): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
