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
  def apply(
    InboxPercentage: Int | Double = null,
    InboxRawCount: Int | Double = null,
    IspName: IspName = null,
    SpamPercentage: Int | Double = null,
    SpamRawCount: Int | Double = null
  ): DomainIspPlacement = {
    val __obj = js.Dynamic.literal()
    if (InboxPercentage != null) __obj.updateDynamic("InboxPercentage")(InboxPercentage.asInstanceOf[js.Any])
    if (InboxRawCount != null) __obj.updateDynamic("InboxRawCount")(InboxRawCount.asInstanceOf[js.Any])
    if (IspName != null) __obj.updateDynamic("IspName")(IspName.asInstanceOf[js.Any])
    if (SpamPercentage != null) __obj.updateDynamic("SpamPercentage")(SpamPercentage.asInstanceOf[js.Any])
    if (SpamRawCount != null) __obj.updateDynamic("SpamRawCount")(SpamRawCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIspPlacement]
  }
}

