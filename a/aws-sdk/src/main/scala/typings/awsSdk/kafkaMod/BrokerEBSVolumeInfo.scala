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
}

