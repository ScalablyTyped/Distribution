package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the cluster parameter group. Constraints:   Must be the name of an existing cluster parameter group.   You can't delete a default cluster parameter group.   Cannot be associated with any clusters.  
    */
  var DBClusterParameterGroupName: String = js.native
}

object DeleteDBClusterParameterGroupMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String): DeleteDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterParameterGroupMessage]
  }
}

