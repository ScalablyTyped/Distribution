package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBandwidthRateLimitInput extends js.Object {
  /**
    * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: Upload | Download | All 
    */
  var BandwidthType: typings.awsSdk.storagegatewayMod.BandwidthType = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DeleteBandwidthRateLimitInput {
  @scala.inline
  def apply(BandwidthType: BandwidthType, GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(BandwidthType = BandwidthType.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
  }
}

