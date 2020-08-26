package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerEBSVolumeInfo extends js.Object {
  /**
    * 
    The ID of the broker to update.
    
    */
  var KafkaBrokerNodeId: string = js.native
  /**
    * 
    Size of the EBS volume to update.
    
    */
  var VolumeSizeGB: integer = js.native
}

object BrokerEBSVolumeInfo {
  @scala.inline
  def apply(KafkaBrokerNodeId: string, VolumeSizeGB: integer): BrokerEBSVolumeInfo = {
    val __obj = js.Dynamic.literal(KafkaBrokerNodeId = KafkaBrokerNodeId.asInstanceOf[js.Any], VolumeSizeGB = VolumeSizeGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerEBSVolumeInfo]
  }
  @scala.inline
  implicit class BrokerEBSVolumeInfoOps[Self <: BrokerEBSVolumeInfo] (val x: Self) extends AnyVal {
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
    def setKafkaBrokerNodeId(value: string): Self = this.set("KafkaBrokerNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSizeGB(value: integer): Self = this.set("VolumeSizeGB", value.asInstanceOf[js.Any])
  }
  
}

