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
    DkimPercentage: js.UndefOr[Percentage] = js.undefined,
    InboxPercentage: js.UndefOr[Percentage] = js.undefined,
    MissingPercentage: js.UndefOr[Percentage] = js.undefined,
    SpamPercentage: js.UndefOr[Percentage] = js.undefined,
    SpfPercentage: js.UndefOr[Percentage] = js.undefined
  ): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DkimPercentage)) __obj.updateDynamic("DkimPercentage")(DkimPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InboxPercentage)) __obj.updateDynamic("InboxPercentage")(InboxPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MissingPercentage)) __obj.updateDynamic("MissingPercentage")(MissingPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SpamPercentage)) __obj.updateDynamic("SpamPercentage")(SpamPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SpfPercentage)) __obj.updateDynamic("SpfPercentage")(SpfPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementStatistics]
  }
}

