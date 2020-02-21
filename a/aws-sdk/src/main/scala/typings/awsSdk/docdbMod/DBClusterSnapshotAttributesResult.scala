package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.native
  /**
    * The identifier of the cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DBClusterSnapshotAttributesResult {
  @scala.inline
  def apply(
    DBClusterSnapshotAttributes: DBClusterSnapshotAttributeList = null,
    DBClusterSnapshotIdentifier: String = null
  ): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshotAttributes != null) __obj.updateDynamic("DBClusterSnapshotAttributes")(DBClusterSnapshotAttributes.asInstanceOf[js.Any])
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
}

