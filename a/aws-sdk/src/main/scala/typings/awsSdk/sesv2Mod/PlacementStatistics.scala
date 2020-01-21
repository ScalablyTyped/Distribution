package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementStatistics extends js.Object {
  /**
    * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
    */
  var DkimPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
    */
  var MissingPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
    */
  var SpfPercentage: js.UndefOr[Percentage] = js.native
}

object PlacementStatistics {
  @scala.inline
  def apply(
    DkimPercentage: Int | Double = null,
    InboxPercentage: Int | Double = null,
    MissingPercentage: Int | Double = null,
    SpamPercentage: Int | Double = null,
    SpfPercentage: Int | Double = null
  ): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    if (DkimPercentage != null) __obj.updateDynamic("DkimPercentage")(DkimPercentage.asInstanceOf[js.Any])
    if (InboxPercentage != null) __obj.updateDynamic("InboxPercentage")(InboxPercentage.asInstanceOf[js.Any])
    if (MissingPercentage != null) __obj.updateDynamic("MissingPercentage")(MissingPercentage.asInstanceOf[js.Any])
    if (SpamPercentage != null) __obj.updateDynamic("SpamPercentage")(SpamPercentage.asInstanceOf[js.Any])
    if (SpfPercentage != null) __obj.updateDynamic("SpfPercentage")(SpfPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementStatistics]
  }
}

