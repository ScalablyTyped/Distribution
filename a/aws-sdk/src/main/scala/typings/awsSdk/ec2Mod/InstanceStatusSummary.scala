package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatusSummary extends js.Object {
  /**
    * The system instance health or application instance health.
    */
  var Details: js.UndefOr[InstanceStatusDetailsList] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[SummaryStatus] = js.native
}

object InstanceStatusSummary {
  @scala.inline
  def apply(Details: InstanceStatusDetailsList = null, Status: SummaryStatus = null): InstanceStatusSummary = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatusSummary]
  }
}

