package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseEventsResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseEvents request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database events request.
    */
  var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.native
}

object GetRelationalDatabaseEventsResult {
  @scala.inline
  def apply(): GetRelationalDatabaseEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseEventsResultOps[Self <: GetRelationalDatabaseEventsResult] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setRelationalDatabaseEventsVarargs(value: RelationalDatabaseEvent*): Self = this.set("relationalDatabaseEvents", js.Array(value :_*))
    @scala.inline
    def setRelationalDatabaseEvents(value: RelationalDatabaseEventList): Self = this.set("relationalDatabaseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseEvents: Self = this.set("relationalDatabaseEvents", js.undefined)
  }
  
}

