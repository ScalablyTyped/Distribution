package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIspPlacement extends js.Object {
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.native
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typings.awsSdk.pinpointemailMod.IspName] = js.native
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.native
}

object DomainIspPlacement {
  @scala.inline
  def apply(): DomainIspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIspPlacement]
  }
  @scala.inline
  implicit class DomainIspPlacementOps[Self <: DomainIspPlacement] (val x: Self) extends AnyVal {
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
    def setInboxPercentage(value: Percentage): Self = this.set("InboxPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboxPercentage: Self = this.set("InboxPercentage", js.undefined)
    @scala.inline
    def setInboxRawCount(value: Volume): Self = this.set("InboxRawCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboxRawCount: Self = this.set("InboxRawCount", js.undefined)
    @scala.inline
    def setIspName(value: IspName): Self = this.set("IspName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIspName: Self = this.set("IspName", js.undefined)
    @scala.inline
    def setSpamPercentage(value: Percentage): Self = this.set("SpamPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpamPercentage: Self = this.set("SpamPercentage", js.undefined)
    @scala.inline
    def setSpamRawCount(value: Volume): Self = this.set("SpamRawCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpamRawCount: Self = this.set("SpamRawCount", js.undefined)
  }
  
}

