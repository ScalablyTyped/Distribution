package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublishingDestinationsResponse extends js.Object {
  /**
    * A Destinations object that includes information about each publishing destination returned.
    */
  var Destinations: typings.awsSdk.guarddutyMod.Destinations = js.native
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListPublishingDestinationsResponse {
  @scala.inline
  def apply(Destinations: Destinations): ListPublishingDestinationsResponse = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublishingDestinationsResponse]
  }
  @scala.inline
  implicit class ListPublishingDestinationsResponseOps[Self <: ListPublishingDestinationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationsVarargs(value: Destination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: Destinations): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

