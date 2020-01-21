package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DedicatedIp extends js.Object {
  /**
    * An IP address that is reserved for use by your Amazon Pinpoint account.
    */
  var Ip: typings.awsSdk.pinpointemailMod.Ip = js.native
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[typings.awsSdk.pinpointemailMod.PoolName] = js.native
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: typings.awsSdk.pinpointemailMod.WarmupStatus = js.native
}

object DedicatedIp {
  @scala.inline
  def apply(
    Ip: Ip,
    WarmupPercentage: Percentage100Wrapper,
    WarmupStatus: WarmupStatus,
    PoolName: PoolName = null
  ): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any], WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    if (PoolName != null) __obj.updateDynamic("PoolName")(PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIp]
  }
}

