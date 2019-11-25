package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreActivitiesResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreActivityResponseMod._ActivityResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ActivitiesResponse extends js.Object {
  /**
    * List of campaign activities
    */
  var Item: js.UndefOr[js.Array[_ActivityResponse] | Iterable[_ActivityResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _ActivitiesResponse {
  @scala.inline
  def apply(Item: js.Array[_ActivityResponse] | Iterable[_ActivityResponse] = null, NextToken: String = null): _ActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ActivitiesResponse]
  }
}

