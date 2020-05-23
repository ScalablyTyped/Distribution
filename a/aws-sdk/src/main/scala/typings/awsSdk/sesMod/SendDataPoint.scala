package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDataPoint extends js.Object {
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.native
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.native
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.native
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.native
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sesMod.Timestamp] = js.native
}

object SendDataPoint {
  @scala.inline
  def apply(
    Bounces: js.UndefOr[Counter] = js.undefined,
    Complaints: js.UndefOr[Counter] = js.undefined,
    DeliveryAttempts: js.UndefOr[Counter] = js.undefined,
    Rejects: js.UndefOr[Counter] = js.undefined,
    Timestamp: Timestamp = null
  ): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bounces)) __obj.updateDynamic("Bounces")(Bounces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Complaints)) __obj.updateDynamic("Complaints")(Complaints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DeliveryAttempts)) __obj.updateDynamic("DeliveryAttempts")(DeliveryAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Rejects)) __obj.updateDynamic("Rejects")(Rejects.get.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDataPoint]
  }
}

