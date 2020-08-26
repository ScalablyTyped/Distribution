package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the manual DB cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.native
  /**
    * The identifier of the manual DB cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DBClusterSnapshotAttributesResult {
  @scala.inline
  def apply(): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
  @scala.inline
  implicit class DBClusterSnapshotAttributesResultOps[Self <: DBClusterSnapshotAttributesResult] (val x: Self) extends AnyVal {
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
    def setDBClusterSnapshotAttributesVarargs(value: DBClusterSnapshotAttribute*): Self = this.set("DBClusterSnapshotAttributes", js.Array(value :_*))
    @scala.inline
    def setDBClusterSnapshotAttributes(value: DBClusterSnapshotAttributeList): Self = this.set("DBClusterSnapshotAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshotAttributes: Self = this.set("DBClusterSnapshotAttributes", js.undefined)
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = this.set("DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshotIdentifier: Self = this.set("DBClusterSnapshotIdentifier", js.undefined)
  }
  
}

