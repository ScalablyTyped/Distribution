package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotsResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database snapshots request.
    */
  var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.native
}

object GetRelationalDatabaseSnapshotsResult {
  @scala.inline
  def apply(): GetRelationalDatabaseSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotsResultOps[Self <: GetRelationalDatabaseSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setRelationalDatabaseSnapshotsVarargs(value: RelationalDatabaseSnapshot*): Self = this.set("relationalDatabaseSnapshots", js.Array(value :_*))
    @scala.inline
    def setRelationalDatabaseSnapshots(value: RelationalDatabaseSnapshotList): Self = this.set("relationalDatabaseSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseSnapshots: Self = this.set("relationalDatabaseSnapshots", js.undefined)
  }
  
}

