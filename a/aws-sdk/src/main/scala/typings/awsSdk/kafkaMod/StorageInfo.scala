package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageInfo extends js.Object {
  /**
    * 
    EBS volume information.
    
    */
  var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.native
}

object StorageInfo {
  @scala.inline
  def apply(): StorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageInfo]
  }
  @scala.inline
  implicit class StorageInfoOps[Self <: StorageInfo] (val x: Self) extends AnyVal {
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
    def setEbsStorageInfo(value: EBSStorageInfo): Self = this.set("EbsStorageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsStorageInfo: Self = this.set("EbsStorageInfo", js.undefined)
  }
  
}

