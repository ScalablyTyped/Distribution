package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlobOptions extends SetBlobPropertiesOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.native
  
  var parallelOperationThreadCount: js.UndefOr[Double] = js.native
  
  var speedSummary: js.UndefOr[SpeedSummary] = js.native
  
  var storeBlobContentMD5: js.UndefOr[Boolean] = js.native
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}
object UploadBlobOptions {
  
  @scala.inline
  def apply(): UploadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlobOptions]
  }
  
  @scala.inline
  implicit class UploadBlobOptionsOps[Self <: UploadBlobOptions] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: StorageMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setParallelOperationThreadCount(value: Double): Self = this.set("parallelOperationThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelOperationThreadCount: Self = this.set("parallelOperationThreadCount", js.undefined)
    
    @scala.inline
    def setSpeedSummary(value: SpeedSummary): Self = this.set("speedSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedSummary: Self = this.set("speedSummary", js.undefined)
    
    @scala.inline
    def setStoreBlobContentMD5(value: Boolean): Self = this.set("storeBlobContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreBlobContentMD5: Self = this.set("storeBlobContentMD5", js.undefined)
    
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = this.set("useTransactionalMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransactionalMD5: Self = this.set("useTransactionalMD5", js.undefined)
  }
}
