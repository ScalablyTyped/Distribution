package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSubnetGroupMessage extends js.Object {
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: String = js.native
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String = js.native
  /**
    * The EC2 Subnet IDs for the DB subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
  /**
    * The tags to be assigned to the new DB subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBSubnetGroupMessage {
  @scala.inline
  def apply(
    DBSubnetGroupDescription: String,
    DBSubnetGroupName: String,
    SubnetIds: SubnetIdentifierList,
    Tags: TagList = null
  ): CreateDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupDescription = DBSubnetGroupDescription.asInstanceOf[js.Any], DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSubnetGroupMessage]
  }
}

