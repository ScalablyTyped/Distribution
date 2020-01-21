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
  def apply(EbsStorageInfo: EBSStorageInfo = null): StorageInfo = {
    val __obj = js.Dynamic.literal()
    if (EbsStorageInfo != null) __obj.updateDynamic("EbsStorageInfo")(EbsStorageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageInfo]
  }
}

