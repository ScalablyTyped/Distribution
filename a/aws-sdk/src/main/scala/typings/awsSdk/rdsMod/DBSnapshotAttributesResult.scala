package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the manual DB snapshot.
    */
  var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.native
  /**
    * The identifier of the manual DB snapshot that the attributes apply to.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DBSnapshotAttributesResult {
  @scala.inline
  def apply(DBSnapshotAttributes: DBSnapshotAttributeList = null, DBSnapshotIdentifier: String = null): DBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshotAttributes != null) __obj.updateDynamic("DBSnapshotAttributes")(DBSnapshotAttributes.asInstanceOf[js.Any])
    if (DBSnapshotIdentifier != null) __obj.updateDynamic("DBSnapshotIdentifier")(DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSnapshotAttributesResult]
  }
}

