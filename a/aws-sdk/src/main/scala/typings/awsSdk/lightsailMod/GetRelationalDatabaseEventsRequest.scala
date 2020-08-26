package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseEventsRequest extends js.Object {
  /**
    * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2 hours, enter 120. Default: 60  The minimum is 1 and the maximum is 14 days (20160 minutes).
    */
  var durationInMinutes: js.UndefOr[integer] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetRelationalDatabaseEvents request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the database from which to get events.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseEventsRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseEventsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseEventsRequest]
  }
  @scala.inline
  implicit class GetRelationalDatabaseEventsRequestOps[Self <: GetRelationalDatabaseEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationInMinutes(value: integer): Self = this.set("durationInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInMinutes: Self = this.set("durationInMinutes", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

