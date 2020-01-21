package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
  /**
    * The identifier for the DB cluster snapshot to describe the attributes for.
    */
  var DBClusterSnapshotIdentifier: String = js.native
}

object DescribeDBClusterSnapshotAttributesMessage {
  @scala.inline
  def apply(DBClusterSnapshotIdentifier: String): DescribeDBClusterSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
  }
}

