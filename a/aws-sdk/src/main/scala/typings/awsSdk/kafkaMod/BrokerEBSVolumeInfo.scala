package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerEBSVolumeInfo extends StObject {
  
  /**
    * 
    The ID of the broker to update.
    
    */
  var KafkaBrokerNodeId: string
  
  /**
    * EBS volume provisioned throughput information.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.kafkaMod.ProvisionedThroughput] = js.undefined
  
  /**
    * 
    Size of the EBS volume to update.
    
    */
  var VolumeSizeGB: js.UndefOr[integer] = js.undefined
}
object BrokerEBSVolumeInfo {
  
  inline def apply(KafkaBrokerNodeId: string): BrokerEBSVolumeInfo = {
    val __obj = js.Dynamic.literal(KafkaBrokerNodeId = KafkaBrokerNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerEBSVolumeInfo]
  }
  
  extension [Self <: BrokerEBSVolumeInfo](x: Self) {
    
    inline def setKafkaBrokerNodeId(value: string): Self = StObject.set(x, "KafkaBrokerNodeId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setVolumeSizeGB(value: integer): Self = StObject.set(x, "VolumeSizeGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeGBUndefined: Self = StObject.set(x, "VolumeSizeGB", js.undefined)
  }
}
