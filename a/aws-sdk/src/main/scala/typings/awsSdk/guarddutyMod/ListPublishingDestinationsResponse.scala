package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublishingDestinationsResponse extends js.Object {
  /**
    * A Destinations obect that includes information about each publishing destination returned.
    */
  var Destinations: typings.awsSdk.guarddutyMod.Destinations = js.native
  /**
    * A token to use for paginating results returned in the repsonse. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListPublishingDestinationsResponse {
  @scala.inline
  def apply(Destinations: Destinations, NextToken: String = null): ListPublishingDestinationsResponse = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublishingDestinationsResponse]
  }
}

