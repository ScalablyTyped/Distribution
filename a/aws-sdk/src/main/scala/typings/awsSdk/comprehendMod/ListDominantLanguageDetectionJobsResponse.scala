package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDominantLanguageDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var DominantLanguageDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDominantLanguageDetectionJobsResponse {
  @scala.inline
  def apply(
    DominantLanguageDetectionJobPropertiesList: DominantLanguageDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListDominantLanguageDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (DominantLanguageDetectionJobPropertiesList != null) __obj.updateDynamic("DominantLanguageDetectionJobPropertiesList")(DominantLanguageDetectionJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
  }
}

