package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDeliveryChannelRequest extends js.Object {
  
  /**
    * The configuration delivery channel object that delivers the configuration information to an Amazon S3 bucket and to an Amazon SNS topic.
    */
  var DeliveryChannel: typings.awsSdk.configserviceMod.DeliveryChannel = js.native
}
object PutDeliveryChannelRequest {
  
  @scala.inline
  def apply(DeliveryChannel: DeliveryChannel): PutDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannel = DeliveryChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDeliveryChannelRequest]
  }
  
  @scala.inline
  implicit class PutDeliveryChannelRequestOps[Self <: PutDeliveryChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setDeliveryChannel(value: DeliveryChannel): Self = this.set("DeliveryChannel", value.asInstanceOf[js.Any])
  }
}
