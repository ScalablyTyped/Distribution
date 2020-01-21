package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfileTimesResponse extends js.Object {
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * List of start times of the available profiles for the aggregation period in the specified time range.
    */
  var profileTimes: ProfileTimes = js.native
}

object ListProfileTimesResponse {
  @scala.inline
  def apply(profileTimes: ProfileTimes, nextToken: PaginationToken = null): ListProfileTimesResponse = {
    val __obj = js.Dynamic.literal(profileTimes = profileTimes.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileTimesResponse]
  }
}

