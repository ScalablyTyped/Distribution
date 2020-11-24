package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTransfer extends js.Object {
  
  /**
    * The number of bytes transferred between a Snow device and Amazon S3.
    */
  var BytesTransferred: js.UndefOr[Long] = js.native
  
  /**
    * The number of objects transferred between a Snow device and Amazon S3.
    */
  var ObjectsTransferred: js.UndefOr[Long] = js.native
  
  /**
    * The total bytes of data for a transfer between a Snow device and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalBytes: js.UndefOr[Long] = js.native
  
  /**
    * The total number of objects for a transfer between a Snow device and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalObjects: js.UndefOr[Long] = js.native
}
object DataTransfer {
  
  @scala.inline
  def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  
  @scala.inline
  implicit class DataTransferOps[Self <: DataTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesTransferred(value: Long): Self = this.set("BytesTransferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesTransferred: Self = this.set("BytesTransferred", js.undefined)
    
    @scala.inline
    def setObjectsTransferred(value: Long): Self = this.set("ObjectsTransferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsTransferred: Self = this.set("ObjectsTransferred", js.undefined)
    
    @scala.inline
    def setTotalBytes(value: Long): Self = this.set("TotalBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytes: Self = this.set("TotalBytes", js.undefined)
    
    @scala.inline
    def setTotalObjects(value: Long): Self = this.set("TotalObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalObjects: Self = this.set("TotalObjects", js.undefined)
  }
}
