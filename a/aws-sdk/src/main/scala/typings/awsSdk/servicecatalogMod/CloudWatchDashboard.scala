package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDashboard extends js.Object {
  /**
    * The name of the CloudWatch dashboard.
    */
  var Name: js.UndefOr[CloudWatchDashboardName] = js.native
}

object CloudWatchDashboard {
  @scala.inline
  def apply(Name: CloudWatchDashboardName = null): CloudWatchDashboard = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDashboard]
  }
}

