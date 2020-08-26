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
  def apply(): Scte35SpliceInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte35SpliceInsert]
  }
  @scala.inline
  implicit class Scte35SpliceInsertOps[Self <: Scte35SpliceInsert] (val x: Self) extends AnyVal {
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
    def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = this.set("AdAvailOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdAvailOffset: Self = this.set("AdAvailOffset", js.undefined)
    @scala.inline
    def setNoRegionalBlackoutFlag(value: Scte35SpliceInsertNoRegionalBlackoutBehavior): Self = this.set("NoRegionalBlackoutFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRegionalBlackoutFlag: Self = this.set("NoRegionalBlackoutFlag", js.undefined)
    @scala.inline
    def setWebDeliveryAllowedFlag(value: Scte35SpliceInsertWebDeliveryAllowedBehavior): Self = this.set("WebDeliveryAllowedFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebDeliveryAllowedFlag: Self = this.set("WebDeliveryAllowedFlag", js.undefined)
  }
  
}

