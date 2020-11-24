package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateLayerUploadResponse extends js.Object {
  
  /**
    * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
    */
  var partSize: js.UndefOr[PartSize] = js.native
  
  /**
    * The upload ID for the layer upload. This parameter is passed to further UploadLayerPart and CompleteLayerUpload operations.
    */
  var uploadId: js.UndefOr[UploadId] = js.native
}
object InitiateLayerUploadResponse {
  
  @scala.inline
  def apply(): InitiateLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateLayerUploadResponse]
  }
  
  @scala.inline
  implicit class InitiateLayerUploadResponseOps[Self <: InitiateLayerUploadResponse] (val x: Self) extends AnyVal {
    
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
    def setPartSize(value: PartSize): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    
    @scala.inline
    def setUploadId(value: UploadId): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
  }
}
