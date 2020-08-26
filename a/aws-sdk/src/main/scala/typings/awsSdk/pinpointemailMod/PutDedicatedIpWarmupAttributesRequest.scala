package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: typings.awsSdk.pinpointemailMod.Ip = js.native
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
}

object PutDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
  @scala.inline
  implicit class PutDedicatedIpWarmupAttributesRequestOps[Self <: PutDedicatedIpWarmupAttributesRequest] (val x: Self) extends AnyVal {
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
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarmupPercentage(value: Percentage100Wrapper): Self = this.set("WarmupPercentage", value.asInstanceOf[js.Any])
  }
  
}

