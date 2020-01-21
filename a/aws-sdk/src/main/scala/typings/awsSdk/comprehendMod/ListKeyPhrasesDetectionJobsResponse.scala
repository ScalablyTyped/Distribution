package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListKeyPhrasesDetectionJobsResponse {
  @scala.inline
  def apply(
    KeyPhrasesDetectionJobPropertiesList: KeyPhrasesDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyPhrasesDetectionJobPropertiesList != null) __obj.updateDynamic("KeyPhrasesDetectionJobPropertiesList")(KeyPhrasesDetectionJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
}

