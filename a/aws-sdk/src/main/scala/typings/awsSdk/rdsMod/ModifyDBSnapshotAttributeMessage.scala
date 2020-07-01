package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotAttributeMessage extends js.Object {
  /**
    * The name of the DB snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to restore.  To view the list of attributes available to modify, use the DescribeDBSnapshotAttributes API action. 
    */
  var AttributeName: String = js.native
  /**
    * The identifier for the DB snapshot to modify the attributes for.
    */
  var DBSnapshotIdentifier: String = js.native
  /**
    * A list of DB snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account IDs, or all to make the manual DB snapshot restorable by any AWS account. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.native
  /**
    * A list of DB snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account identifiers, or all to remove authorization for any AWS account to copy or restore the DB snapshot. If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore the manual DB snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.native
}

object ModifyDBSnapshotAttributeMessage {
  @scala.inline
  def apply(
    AttributeName: String,
    DBSnapshotIdentifier: String,
    ValuesToAdd: AttributeValueList = null,
    ValuesToRemove: AttributeValueList = null
  ): ModifyDBSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    if (ValuesToAdd != null) __obj.updateDynamic("ValuesToAdd")(ValuesToAdd.asInstanceOf[js.Any])
    if (ValuesToRemove != null) __obj.updateDynamic("ValuesToRemove")(ValuesToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotAttributeMessage]
  }
}

