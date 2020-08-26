package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCopyGrantMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeSnapshotCopyGrant request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the SnapshotCopyGrantName parameter or the Marker parameter, but not both. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The list of SnapshotCopyGrant objects.
    */
  var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.native
}

object SnapshotCopyGrantMessage {
  @scala.inline
  def apply(): SnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCopyGrantMessage]
  }
  @scala.inline
  implicit class SnapshotCopyGrantMessageOps[Self <: SnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setSnapshotCopyGrantsVarargs(value: SnapshotCopyGrant*): Self = this.set("SnapshotCopyGrants", js.Array(value :_*))
    @scala.inline
    def setSnapshotCopyGrants(value: SnapshotCopyGrantList): Self = this.set("SnapshotCopyGrants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCopyGrants: Self = this.set("SnapshotCopyGrants", js.undefined)
  }
  
}

