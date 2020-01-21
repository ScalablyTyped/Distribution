package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group. Constraints:   Must match the name of an existing DBClusterParameterGroup.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String = js.native
  /**
    * The DB cluster parameter group family name. A DB cluster parameter group can be associated with one and only one DB cluster parameter group family, and can be applied only to a DB cluster running a database engine and engine version compatible with that DB cluster parameter group family.
    */
  var DBParameterGroupFamily: String = js.native
  /**
    * The description for the DB cluster parameter group.
    */
  var Description: String = js.native
  /**
    * The tags to be assigned to the new DB cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterParameterGroupMessage {
  @scala.inline
  def apply(
    DBClusterParameterGroupName: String,
    DBParameterGroupFamily: String,
    Description: String,
    Tags: TagList = null
  ): CreateDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], DBParameterGroupFamily = DBParameterGroupFamily.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterParameterGroupMessage]
  }
}

