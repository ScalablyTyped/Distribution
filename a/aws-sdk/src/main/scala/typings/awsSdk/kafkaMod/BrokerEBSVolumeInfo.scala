package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerEBSVolumeInfo extends StObject {
  
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
  implicit class BrokerEBSVolumeInfoMutableBuilder[Self <: BrokerEBSVolumeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKafkaBrokerNodeId(value: string): Self = StObject.set(x, "KafkaBrokerNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeGB(value: integer): Self = StObject.set(x, "VolumeSizeGB", value.asInstanceOf[js.Any])
  }
}
