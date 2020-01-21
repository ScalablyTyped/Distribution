package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var EntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntitiesDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntitiesDetectionJobsResponse {
  @scala.inline
  def apply(
    EntitiesDetectionJobPropertiesList: EntitiesDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitiesDetectionJobPropertiesList != null) __obj.updateDynamic("EntitiesDetectionJobPropertiesList")(EntitiesDetectionJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
  }
}

