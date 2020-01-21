package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivitiesOutput extends js.Object {
  /**
    * The list of activities.
    */
  var activities: ActivityList = js.native
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
}

object ListActivitiesOutput {
  @scala.inline
  def apply(activities: ActivityList, nextToken: PageToken = null): ListActivitiesOutput = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivitiesOutput]
  }
}

