package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivitiesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[typings.awsSdk.workdocsMod.UserActivities] = js.native
}

object DescribeActivitiesResponse {
  @scala.inline
  def apply(Marker: MarkerType = null, UserActivities: UserActivities = null): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (UserActivities != null) __obj.updateDynamic("UserActivities")(UserActivities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
}

