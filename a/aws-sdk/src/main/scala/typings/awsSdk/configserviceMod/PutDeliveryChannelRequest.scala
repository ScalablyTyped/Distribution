package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDeliveryChannelRequest extends StObject {
  
  /**
    * The configuration delivery channel object that delivers the configuration information to an Amazon S3 bucket and to an Amazon SNS topic.
    */
  var DeliveryChannel: typings.awsSdk.configserviceMod.DeliveryChannel
}
object PutDeliveryChannelRequest {
  
  inline def apply(DeliveryChannel: DeliveryChannel): PutDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannel = DeliveryChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDeliveryChannelRequest]
  }
  
  extension [Self <: PutDeliveryChannelRequest](x: Self) {
    
    inline def setDeliveryChannel(value: DeliveryChannel): Self = StObject.set(x, "DeliveryChannel", value.asInstanceOf[js.Any])
  }
}
