package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the cluster parameter group. Constraints:   Must match the name of an existing DBClusterParameterGroup.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: String = js.native
  /**
    * The cluster parameter group family name.
    */
  var DBParameterGroupFamily: String = js.native
  /**
    * The description for the cluster parameter group.
    */
  var Description: String = js.native
  /**
    * The tags to be assigned to the cluster parameter group.
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

