package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35SpliceInsert extends js.Object {
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.native
  /**
    * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.native
  /**
    * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.native
}

object Scte35SpliceInsert {
  @scala.inline
  def apply(
    AdAvailOffset: Int | Double = null,
    NoRegionalBlackoutFlag: Scte35SpliceInsertNoRegionalBlackoutBehavior = null,
    WebDeliveryAllowedFlag: Scte35SpliceInsertWebDeliveryAllowedBehavior = null
  ): Scte35SpliceInsert = {
    val __obj = js.Dynamic.literal()
    if (AdAvailOffset != null) __obj.updateDynamic("AdAvailOffset")(AdAvailOffset.asInstanceOf[js.Any])
    if (NoRegionalBlackoutFlag != null) __obj.updateDynamic("NoRegionalBlackoutFlag")(NoRegionalBlackoutFlag.asInstanceOf[js.Any])
    if (WebDeliveryAllowedFlag != null) __obj.updateDynamic("WebDeliveryAllowedFlag")(WebDeliveryAllowedFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35SpliceInsert]
  }
}

