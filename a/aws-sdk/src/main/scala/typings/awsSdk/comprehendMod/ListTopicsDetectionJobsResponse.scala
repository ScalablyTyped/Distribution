package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicsDetectionJobsResponse extends js.Object {
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list containing the properties of each job that is returned.
    */
  var TopicsDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.TopicsDetectionJobPropertiesList] = js.native
}

object ListTopicsDetectionJobsResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    TopicsDetectionJobPropertiesList: TopicsDetectionJobPropertiesList = null
  ): ListTopicsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TopicsDetectionJobPropertiesList != null) __obj.updateDynamic("TopicsDetectionJobPropertiesList")(TopicsDetectionJobPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
  }
}

