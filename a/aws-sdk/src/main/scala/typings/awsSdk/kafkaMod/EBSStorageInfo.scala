package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBSStorageInfo extends js.Object {
  /**
    * 
    The size in GiB of the EBS volume for the data drive on each broker node.
    
    */
  var VolumeSize: js.UndefOr[integerMin1Max16384] = js.native
}

object EBSStorageInfo {
  @scala.inline
  def apply(VolumeSize: js.UndefOr[integerMin1Max16384] = js.undefined): EBSStorageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBSStorageInfo]
  }
}

