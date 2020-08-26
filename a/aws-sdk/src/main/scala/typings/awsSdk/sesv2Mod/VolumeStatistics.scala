package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatistics extends js.Object {
  /**
    * The total number of emails that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.native
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
    */
  var ProjectedInbox: js.UndefOr[Volume] = js.native
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk mail folders.
    */
  var ProjectedSpam: js.UndefOr[Volume] = js.native
  /**
    * The total number of emails that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.native
}

object VolumeStatistics {
  @scala.inline
  def apply(): VolumeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatistics]
  }
  @scala.inline
  implicit class VolumeStatisticsOps[Self <: VolumeStatistics] (val x: Self) extends AnyVal {
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
    def setInboxRawCount(value: Volume): Self = this.set("InboxRawCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboxRawCount: Self = this.set("InboxRawCount", js.undefined)
    @scala.inline
    def setProjectedInbox(value: Volume): Self = this.set("ProjectedInbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectedInbox: Self = this.set("ProjectedInbox", js.undefined)
    @scala.inline
    def setProjectedSpam(value: Volume): Self = this.set("ProjectedSpam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectedSpam: Self = this.set("ProjectedSpam", js.undefined)
    @scala.inline
    def setSpamRawCount(value: Volume): Self = this.set("SpamRawCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpamRawCount: Self = this.set("SpamRawCount", js.undefined)
  }
  
}

