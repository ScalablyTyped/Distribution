package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingStatisticsResponse extends js.Object {
  /**
    * An array of objects, one for each group of findings that meet the filter criteria specified in the request.
    */
  var countsByGroup: js.UndefOr[listOfGroupCount] = js.native
}

object GetFindingStatisticsResponse {
  @scala.inline
  def apply(countsByGroup: listOfGroupCount = null): GetFindingStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (countsByGroup != null) __obj.updateDynamic("countsByGroup")(countsByGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingStatisticsResponse]
  }
}

