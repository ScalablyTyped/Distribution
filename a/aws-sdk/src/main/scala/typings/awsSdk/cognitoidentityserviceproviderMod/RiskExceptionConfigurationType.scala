package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskExceptionConfigurationType extends js.Object {
  /**
    * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a compact representation of an IP address and its associated routing prefix.
    */
  var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.native
  /**
    * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
    */
  var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.native
}

object RiskExceptionConfigurationType {
  @scala.inline
  def apply(
    BlockedIPRangeList: BlockedIPRangeListType = null,
    SkippedIPRangeList: SkippedIPRangeListType = null
  ): RiskExceptionConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (BlockedIPRangeList != null) __obj.updateDynamic("BlockedIPRangeList")(BlockedIPRangeList.asInstanceOf[js.Any])
    if (SkippedIPRangeList != null) __obj.updateDynamic("SkippedIPRangeList")(SkippedIPRangeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskExceptionConfigurationType]
  }
}

