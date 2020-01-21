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
  def apply(
    InboxRawCount: Int | Double = null,
    ProjectedInbox: Int | Double = null,
    ProjectedSpam: Int | Double = null,
    SpamRawCount: Int | Double = null
  ): VolumeStatistics = {
    val __obj = js.Dynamic.literal()
    if (InboxRawCount != null) __obj.updateDynamic("InboxRawCount")(InboxRawCount.asInstanceOf[js.Any])
    if (ProjectedInbox != null) __obj.updateDynamic("ProjectedInbox")(ProjectedInbox.asInstanceOf[js.Any])
    if (ProjectedSpam != null) __obj.updateDynamic("ProjectedSpam")(ProjectedSpam.asInstanceOf[js.Any])
    if (SpamRawCount != null) __obj.updateDynamic("SpamRawCount")(SpamRawCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatistics]
  }
}

