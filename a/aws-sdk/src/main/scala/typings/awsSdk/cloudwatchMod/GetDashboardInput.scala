package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardInput extends js.Object {
  /**
    * The name of the dashboard to be described.
    */
  var DashboardName: typings.awsSdk.cloudwatchMod.DashboardName = js.native
}

object GetDashboardInput {
  @scala.inline
  def apply(DashboardName: DashboardName): GetDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardName = DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardInput]
  }
}

